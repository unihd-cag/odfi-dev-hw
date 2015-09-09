package provide odfi::dev::hw::h2dl 2.0.0

package require odfi::language 1.0.0
package require odfi::nx::domainmixin
package require odfi::dev::hw::h2dl::verilog 2.0.0
package require odfi::dev::hw::h2dl::ast  2.0.0

namespace eval odfi::dev::hw::h2dl {
    
        

    ## Logic Defines Logic Container
    odfi::language::Language2 define LOGIC {

        :logic {

            ## Branching
            ##################

            ## IF
            #:if condition body {
#
 #           }

            ## test
            :match signal {
                :if value body  {

                }
                :else body {

                }
            }

        }

    }
    LOGIC produceNX


    odfi::language::Language2 define CONNECTING {

        #:connection : HW.Named name {
        #    
        #}

    }
    CONNECTING produceNX


    odfi::language::Language2 define HW {
        
        :+type Named {
            
            :+var name false
            :+var description ""

            +method toString args {
                return "[:info class].${:name}"
            }
            
            ## Return only parents with Module hierarchy
            +method formatHierarchyString separator {

                set parents [:shade odfi::dev::hw::h2dl::Module getPrimaryParents]
                return [[$parents map { return [$it name get]}] mkString $separator]

            }

        }
        +type Signal {
            +type Named
            +var  width  1
            +var  offset 0
            +var  type   digital
            +method size args {
                puts "Defining size as $args"
            }

            :bit index {
                +unique index
            }
        }
        
        :+type IO {
            :+type Signal
            +var type "wire"
            +var connect ""



            +method register args {
                set :type "register"
            }
            +method electrical args {
                set :type "electrical"
            }

            ## Connection 
            :connection : Named signal {
                +builder {

                    #puts "Buildign IO connections with ${:signal} "

                    ## Options:
                    ##   - Target signal already has a connection, then take the name 
                    ##   - Target Signal and source Signal have the same parent, just use target signal name 
                    ##   - Target Signal and source Signal don't have the same parent, use the target's parent name prefixed to signal name to make signal look hierarchical
                    ## Checks: 
                    ##   - Check source and target signals are not the same direction

                    ## Set name 
                    #puts "Signal is: ${:signal} [${:signal} info class] "
                    if {[odfi::common::isClass ${:signal} ::odfi::dev::hw::h2dl::IO] || [${:signal} isClass ::odfi::dev::hw::h2dl::Signal]} {
                        set baseSignal [:parent]

                        #puts "using signal "
                        ## If parent from signal and base signal is same, just take the name of the signal
                        ## Otherwise, append the name of the target signal's parent
                        if {[[$baseSignal parent] getPrimaryTreeDepth] == [[${:signal} parent] getPrimaryTreeDepth]} {
                            
                            set :name [[${:signal} parent] name get]_[$signal name get]
                        } else {
                            set :name [$signal name get]
                            #set :name [[${:signal} parent] name get]_[$signal name get]

                            
                        }

                        ## Add target signal 
                        :addChild ${:signal}

                    } else {
                        # Use as string 
                        set :name ${:signal}
                    }
                    ## Check Signal 
                    #if {[[:parent]}
                }
            }


            ## Push IO 
            ##############
            
            ## For now, just push up to parent
            +method pushUp args {

                set sourceParent [:parent]
                set source [current object]
                set targetParent [$sourceParent parent]
                set resultSignal ""
                if {$targetParent!=""} {

                    $targetParent apply {
                        set resultSignal [:input [$sourceParent name get]_[$source name get] {

                        }]
                    }

                    ## Make connection 
                    $source connection $resultSignal

                }
            }

            ## For now, just push up to parent
            +method pushThrough count {

                set sourceParent [:parent]
                set source [current object]
                set targetParent [$sourceParent parent]
                set resultSignal ""
                set currentCount 0
                set currentName [$sourceParent name get]_[$source name get]
                while {$currentCount<$count && $targetParent!=""} {
                    
                    set currentName [$sourceParent name get]_[$source name get]

                    ## Add to target parent 
                    $targetParent apply {
                        set resultSignal [:input $currentName {

                        }]
                    }

                    ## Make connection 
                    $source connection $resultSignal

                    ## Go to next 
                    set targetParent    [$targetParent parent]
                    set source          [$resultSignal]
                    set sourceParent    [$resultSignal parent]
                    incr currentCount

                    
                    #puts "Push current name $currentName"

                }
            }
        }
        
        :module : Named name {
            
            +mixin verilog <- odfi::dev::hw::h2dl::verilog::VerilogGen
            +expose name
            +exportTo         ::odfi::dev::hw::h2dl::Module
            +exportToPublic

            +method getModelInstanceName args {
                return ${:name}
            }

            ## Submodules 
            #:submodule : Module 

            ## IO and signals 
            :input : IO name {
               +expose name  
               +exposeToObject name            
            }
            
            :output : IO name { 
               +expose  name
               +exposeToObject name                 
            }
            
            :IO.inout name {
                +expose  name
                +exposeToObject name  
            }

            :register : Signal name {
                +expose name

                :reset expr {
                    +var type "async"
                    +method sync args {
                        set :type "sync"
                    }
                    +method async args {
                        set :type "async"
                    }
                    +method isSync args {
                        if {${:type}=="sync"} {
                            return true 
                        } 
                        return false
                    }
                    +method isAsync args {
                        if {${:type}=="async"} {
                            return true 
                        } 
                        return false
                    }
                    +builder {

                        puts "Building reset with expression ${:expr}"
                        set expr [::odfi::dev::hw::h2dl::ast::buildAST ${:expr}]
                        set :expr $expr

                        :addChild $expr

                        next 
                        return
                        ## FIXME: Idea: Go on all modifiable values on the expression, and add a listener
                        $expr shade ::odfi::dev::hw::h2dl::Register walkDepthFirst {

                            set reg $node 

                            puts "Listening on [$reg name get] for reset value"
                            $reg onChildAdded {

                                set c [:child end]

                            }

                        }
                    }
                }
            }

            :wire : Signal name {
                +expose name
            }

            :posedge : LOGIC.Logic signal {
                #+type Logic
            }

            ## Analog names 
            :analog : Signal name {
                +expose name
            }
            
        }
         
        
    }
    HW produceNX
   


    namespace eval fsm {

        odfi::language::Language2 define FSM {

            :fsm name {

                :input name default {
                    +expose
                }
                :output name {
                    +expose
                }

                :state name {
                    +var initial false
                    +var values
                    +method value {output value} {
                        lappend :values $output $value
                    }
                    :transition to {
                        :condition input value {

                        } 
                    }
                }
            }

        }
        FSM produceNX
    }
    
    
    odfi::language::Language2 define TESTBENCH {
        
        :testbench name {
            +type Module
            +var  test
        }
        
    }




    ## Wrapper for better module definition
    ## args: {PARAMETER VALUE}* CLOSURE
    ## Last element of args will be the closure
    ## The Closure will be used as builder
    proc ModuleDefinition {name args} {

        set closure [lindex $args end]
        set args [lrange $args 0 end-1]

        #puts "Module Def with args: $args"

        #odfi::language::Language2 default {
#
        #    :$name : ::odfi::dev::hw::h2dl::Module name {
#
         #       +builder $closure
#
       #     }
        #}:+exportToParent

        ## Args will be used as parameters to customise the Model Instance Name
        ##############
        set argsNames {}
        foreach arg $args {
           lappend argsNames "[lindex $arg 0]\${:[lindex $arg 0]}" 
        }
        set argsNames [join $argsNames _]

        set instanceNameMethod "
            +method getModelInstanceName args {
                return \[lindex \[split \[:info class\] :\] end\]_$argsNames
            }
        "

       # puts "Model Definition $name with model instance name : $instanceNameMethod and cl $closure"

        set code "
           odfi::language::Language2 default {

            :$name : ::odfi::dev::hw::h2dl::Module name $args {

                #puts \"Inside module def with args \${args}\"
                :$instanceNameMethod
                :+exportToParent
                :+expose name
                +builder {
                    #puts \"Building \[:info class\]\"
                    $closure
                }


            }
        }
        "

        #puts "Created MDef with $code "
        uplevel $code
        #uplevel [list odfi::language::Language2 default [list \
        #    :$name : ::odfi::dev::hw::h2dl::Module name $args [list \
        #    :+builder $closure ; \
        #     ] \
         #   ]]


    }
     

    ##################################
    ## Value Expressions
    ##################################
    nx::Class create ValueHolder  {
        Register mixins add ValueHolder
        Analog mixins add ValueHolder
        Bit    mixins add ValueHolder


        :public method <= args {

            #puts "Expression for Updating [:name get] $args"
            
            ## Create Node for this update 
            set astNode [::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign new]

            ## Create Expression node 
            set expressionNode [::odfi::dev::hw::h2dl::ast::buildAST $args]
            $expressionNode  object mixins add odfi::flextree::utils::StdoutPrinter

#puts "NB expression: [$expressionNode info class]"

            ## Left: Target Register 
            ## Right: Expression
            $astNode addChild [current object]
            $astNode addChild $expressionNode

            #puts "Res: $expressionNode"
            #$expressionNode printAll

            #puts "Calling context: [uplevel 1 :info class]"
            ## Add Update to where it was called 
            uplevel :addChild $astNode

            #:addChild $expressionNode

            return $astNode


        }

        ## NB Assign Format: reg < 0 < 1 expr , updates bit 0 or reg using bit 1 of expression
        :public method < {intoBit keywork fromBit args} {

            ## Create Node for this update 
            set astNode [::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign new -fromBitRange $fromBit -toBitRange $intoBit]

            ## Create Expression node 
            set expressionNode [::odfi::dev::hw::h2dl::ast::buildAST $args]
            $expressionNode  object mixins add odfi::flextree::utils::StdoutPrinter

            ## Left: Target Register 
            ## Right: Expression
            $astNode addChild [current object]
            $astNode addChild $expressionNode


            ## Add Update to where it was called 
            uplevel :addChild $astNode

            return $astNode

        }   

        :public method = args {

            #puts "Expression for Updating [:name get] $args"
            
            ## Create Node for this update 
            set astNode [::odfi::dev::hw::h2dl::ast::ASTBlockingAssign new]

            #:eachChild {
            #    puts "Child for clk before expr: [$it info class]"
            #}

            ## Create Expression node 
            set expressionNode [::odfi::dev::hw::h2dl::ast::buildAST $args]
            $expressionNode  object mixins add odfi::flextree::utils::StdoutPrinter

            #:eachChild {
            #    puts "Child for clk after expr: [$it info class]"
            #}

            ## Left: Target Register 
            ## Right: Expressio
            set  leftSide     [current object]
            $astNode addChild $leftSide
            $astNode addChild $expressionNode

            #:eachChild {
            #    puts "Child for clk after added to AST expr: [$it info class]"
            #}

            #puts "Res: $expressionNode"
            #$expressionNode printAll

            ## Add Update to where it was called 
            #puts "Calling context: [uplevel 2 :info class]"
            uplevel 2 [list :addChild $astNode]

            #:eachChild {
            #    puts "Child for clk after added to uplevel: [$it info class]"
            #}

            return $astNode

            

            #:addChild $expressionNode

            ## Return node 
            return $astNode

        }
    }

    
}


