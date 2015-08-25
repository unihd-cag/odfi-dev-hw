package provide odfi::dev::hw::h2dl 1.0.0
package require odfi::closures 2.1.0
package require odfi::list 2.0.0

source [file dirname [info script]]/h2dl-1.0.0-ast.tm
source [file dirname [info script]]/h2dl-1.0.0-sim.tm

namespace eval h2dl {


    

    ##proc if {test body} {
     #   puts "In if Test"
    #}

    #proc <= {val} {
#
#    }

    ##########################
    ## Phases 
    #############################
    itcl::class Phases {

        public method phaseLog message {

            odfi::log::info "\[Phase:Elaborate\] $message" -realm $this

        }

        public method elaborate args {

        }


    }


    ##########################
    ## Common
    ##########################
    itcl::class Info {

        odfi::common::classField public description ""

       # odfi::common::classField public parent ""

    }

    itcl::class Named {

        odfi::common::classField public name ""

        constructor cname {
            set name $cname
        }
    }

    ##########################
    ## Logic Modelisation
    ##########################
    itcl::class LogicContainer {
        inherit Info Phases

        #odfi::common::classField public content {}

        #### Content 
        ###################

       # public method addContent obj {

       #     $obj parent $this 

        #    lappend content $obj

       # }

      #  public method eachContent closure {
        #    odfi::list::each $content $closure 1
       # }

        ## Logic factories 
        ########################

        ## Register
        public method reg {name {closure ""}} {

            set reg  [::new [namespace current]::Register $this.$name $name $closure]

            addChild $reg

            return $reg 

        }

        ## Construct a Synchronous block
        public method synchronous {triggerSignal closure} {
            set sblock [::new [namespace parent]::SynchronousBlock $this.sync_on_$triggerSignal $triggerSignal $closure]

            #puts "Add sync [$this info class] -> [$this info inherit] // [$this isa ASTNode]"
            $this addChild $sblock
           # puts "Done sync:"

            return $sblock
        }

        ## Control structures 
        ###############
        public method if {test body args} {

           
            set ifnode [::new [namespace parent]::If $this.if#auto $test $body $args]

            
            $this addChild $ifnode
           # puts "Done sync:"

            return $ifnode

        }

        ## Expression
        #########################

        set expressions {}

        public method incr signal {

            lappend expressions [list <= [list + $signal 1] $signal]

        }

        #### Phases 
        ####################

        ## Propagate to content
        public method elaborate args {

            $this eachChild {
                ::if {[$it isa [namespace parent]::Phases]} {
                    $it elaborate
                }
                
            }

        }

    }

    ### SynchronousBlock
    ###############
    itcl::class SynchronousBlock {
        inherit LogicContainer ASTNode

        odfi::common::classField public trigger {}

        constructor {ctrigger closure} {
            set trigger $ctrigger

            puts "In sync: $this"
            set currentNode $this

            odfi::closures::doClosure $closure

            puts "After closure size of Sync block: [childCount]"
            eachASTChild {
                puts "-- $it"
            }

        }


        #### Phases 
        ####################

        ## Resolve trigger
        public method elaborate args {

           phaseLog "Resolving trigger"

           ## Look in content 
           eachChild {
            ::if {[$it isa [namespace parent]::Signal] && [$it name]==$trigger} {
                phaseLog "Found Signal in content for trigger"
            }
           }

           ## Look in parent
           set p [lindex [parents] 0]
           ::if {$p!=""} {
                $p eachChild {
                ::if {[$it isa [namespace parent]::Signal] && [$it name]==$trigger} {
                    phaseLog "Found Signal $it in parent for trigger"
                    set trigger $it
                } else {
                  # phaseLog "Signal in parent not usable for trigger"
                }
               }
           }
           
        }

    }


    ##########################
    ## Logic Structures
    ## @group
    ##########################

    ## Represents a Signal
    ## This is an AST value so that this signal can be assigned
    itcl::class Signal {
        inherit Named Info Phases ASTValue

        ## Size in {MSB LSB} format
        odfi::common::classField public size 0




    }
    itcl::class SizedSignal {
        inherit Signal

    }

    ##########################
    ## Control Structures
    ## @group
    ##########################

    itcl::class If {
        inherit ASTNode

        constructor {cTest body args} {

            if {[llength $args]==1} {
                set args [lindex $args 0]
            }

            ## First Child is the If part
            ########
            set ifNode [::new [namespace parent]::ASTBranchNode $this.ifNode]
            addChild $ifNode

            ## Add Expression left of the if node
            $ifNode addChild [[namespace parent]::buildAST $cTest]

            ## Add Group Node for the if body 
            
            set ifBodyNode [::new [namespace parent]::ASTGroup $this.if.body]
            $ifNode addChild $ifBodyNode
            set currentNode $ifBodyNode

            ## Execute body
            odfi::closures::doClosure $body 1
            set currentNode ""

            ## Remaining 

            ## Else If 
            ################
            #puts "Args: $args"
            set i 0
            foreach elseifIndex [lsearch -exact -all $args elseif] {

                set condition [lindex $args [expr $elseifIndex+1]]
                set body      [lindex $args [expr $elseifIndex+2]]

                ## Create and IF with body for this elseif
                set elseifNode [::new [namespace parent]::ASTBranchNode $this.elseif$i $condition $body]

                addChild $elseifNode

                ## Add else if condition
                $elseifNode addChild [[namespace parent]::buildAST $condition]

                set elseifBodyNode [::new [namespace parent]::ASTGroup $this.elseif.body]
                $elseifNode addChild $elseifBodyNode
                set currentNode $elseifBodyNode

                ## Execute body
                odfi::closures::doClosure $body 1
                set currentNode ""
               
                incr i

            }
            ## Else 
            ################
            set elseIndex [lsearch -exact $args else]
            if {$elseIndex!=-1} {

                set body      [lindex $args [expr $elseIndex+1]]

                 ## Add Group Node for the if body 
                set elseNode [::new [namespace parent]::ASTGroup $this.else]

                addChild $elseNode
                set currentNode $elseNode

                ## Execute body
                odfi::closures::doClosure $body 1
                set currentNode ""

            }

        }
    }

    ##########################
    ## Module / Hierarchy
    ##########################

    proc module {name closure} {
        return [::new [namespace current]::Module $name $name $closure]
    }

    itcl::class Module {
        inherit ASTNode Named LogicContainer


        ## Inputs 
       # odfi::common::classField public inputs {}

        ## Outputs
        #odfi::common::classField public outputs {}

        constructor {cname closure} {Named::constructor $cname} {

            odfi::closures::doClosure $closure

            ## End of content -> elaborate
            elaborate

        }

        #### Inputs 
        ##################

        public method input {name {closure ""}} {

            set newInput [::new [namespace parent]::Input $this.$name $name $closure]



            :addChild $newInput

            ## Set Variable in uplevel for later Hierarchy usage
            uplevel "set $name $newInput" 

            return $newInput
        }

        ## @return the inputs registered in this module
        public method inputs args {

            set res {}
            eachASTChild {
                ::if {[$it isa [namespace parent]::Input]} {
                 lappend res $it
                }
            }
            return $res 

        }

        #### Outputs 
        ###################

        public method output {name {closure ""}} {

            set newOutput [::new [namespace parent]::Output $this.$name $name $closure]

            :addChild $newOutput

            ## Set Variable in uplevel for later Hierarchy usage
            uplevel "set $name $newOutput" 

            return $newOutput
        }

        ## @return the outputs registered in this module
        public method outputs args {

            set res {}
            eachASTChild {

                #set clName 
                #puts "Outpus on [$it name] [namespace parent]"
                ::if {[$it isa [namespace parent]::Output]} {
                 lappend res $it
                }
            }
            return $res 

        }

        public method eachOutput closure {
            #foreach it [outputs] {
#
            #}
            odfi::list::each [$this outputs] $closure 1
        }

        public method toString args {
            return [name]
        }

    }

    itcl::class Input {
        inherit SizedSignal

        constructor {cname closure} {Named::constructor $cname} {

            odfi::closures::doClosure $closure
        }
    }

    itcl::class Output {
        inherit SizedSignal

        constructor {cname closure} {Named::constructor $cname} {

            odfi::closures::doClosure $closure
        }
    }

   



    ##########################
    ## Synchronous // Reg
    ##########################

    itcl::class ClockedGate {
        inherit Phases Operand

        ## Add 
    }

    itcl::class Register {
        inherit ClockedGate


        public method <= expression {

        }
    }


   


}

namespace eval h2dl::verilog {

    variable module_template {

module <% $module name %> (
    <% 
    set ins {}
    foreach in [$module inputs] { lappend ins "input [$in name]"}
    join $ins ,\n
    #odfi::list::transform [$module inputs] { ::puts "Inside $it" ; + "input [$it name]" } -concat ,
    %>

    <% 
    set outs {}
    foreach out [$module outputs] {
        lappend outs "output [$in name]"
    }
    ::puts "Length of $ins: [llength $ins]"
    join $ins ,\n
    #odfi::list::transform [$module inputs] { ::puts "Inside $it" ; + "input [$it name]" } -concat ,
    %>

)


endmodule

}

    proc emit module {


        set m $module
        set res [odfi::closures::embeddedTclFromStringToString $h2dl::verilog::module_template]



    }


}
