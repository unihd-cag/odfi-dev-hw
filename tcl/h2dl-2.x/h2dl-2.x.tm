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
            
            :+var name
            :+var description false

            +method toString args {
                return "[:info class].${:name}"
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

            :connection : Named name {

            }
        }
        
        :module : Named name {
            
            +mixin verilog <- odfi::dev::hw::h2dl::verilog::VerilogGen
            +expose name

            +method getModelInstanceName args {
                return ${:name}
            }

            :input : IO name {
               +expose name              
            }
            
            :output : IO name { 
               +expose  name          
            }
            
            :IO.inout name {
                +expose  name   
            }

            :register : Signal name {
                +expose name
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

        #puts "Model Definition $name with model instance name : $instanceNameMethod"

        set code "
           odfi::language::Language2 default {

            :$name : ::odfi::dev::hw::h2dl::Module name $args {

                #puts \"Inside module def with args \${args}\"
                :$instanceNameMethod
                :+exportToParent
                :+expose name
                +builder {
                    $closure
                }


            }
        }
        "
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

        :public method <= args {

            #puts "Expression for Updating [:name get] $args"
            
            ## Create Node for this update 
            set astNode [::new ::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign new]

            ## Create Expression node 
            set expressionNode [::odfi::dev::hw::h2dl::ast::buildAST $args]
            $expressionNode  object mixins add odfi::flextree::utils::StdoutPrinter

            ## Left: Target Register 
            ## Right: Expression
            $astNode addChild [current object]
            $astNode addChild $expressionNode

            #puts "Res: $expressionNode"
            #$expressionNode printAll

            ## Add Update to where it was called 
            uplevel :addChild $astNode

            #:addChild $expressionNode


        }
    }

    
}


