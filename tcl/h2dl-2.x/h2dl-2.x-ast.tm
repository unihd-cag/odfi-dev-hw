## The AST Package provides the core tree syntax modelisation
package provide odfi::dev::hw::h2dl::ast 2.0.0
package require odfi::attributes 1.0.0
package require odfi::flextree 1.0.0

namespace eval odfi::dev::hw::h2dl::ast {

    proc astOperatorToNode operator {

        if {$operator!= "*"  && [odfi::common::isClass $operator odfi::flextree::FlexNode]} {
            #puts "$operator is a class"
            return $operator
        } else {

            switch -regexp -- $operator {
                {\+} {
                   return [[namespace current]::ASTAdd new -operator +]   
                }
                {\*} {
                   return [::new [namespace current]::ASTMultiply #auto]    
                }
                {==} {
                   return [::new [namespace current]::ASTCompare #auto]    
                }

                {[0-9]+} {
                    return [[namespace current]::ASTConstant new -constant $operator]    
                }

                {!} {
                    return [[namespace current]::ASTNegate new -operator !]    
                }
                default {
                    error "Unsupported ast node: $operator cannot be converted to a representation"
                }
            }

        }
        
    }

    ## Transform an expression to an AST
    proc buildAST {args} {

        if {[llength $args]==1} {
            set args [lindex $args 0]
        }

        if {[odfi::common::isClass $args [namespace current]::ASTNode]} {
            return $args
        }

        ## Resolve non resolvable $variables 
        #set args [odfi::closures::subst $args]

        #set expr {}
        #foreach i $args {
        #    switch -exact -- $i {
        #        ( {
         #        set expr "$expr {"    
        #        }
        #       ) {
         #        #lappend expr   
         ##       }
          #      default {
         #           lappend expr $i
         #       }
          #  }
       # }
       set expr [regsub -all {\)} $args "}"]
       set expr [regsub -all {\(} $expr "\{"]
        puts "Trans Expression is $expr ([llength $expr]) (before: $args)"
        #([llength $expr])

        ## Stacks
        set expressions [list [list "" $expr]]
        set res {}

        ## Process 
        #####
        while {[llength $expressions]>0} {

            ## Get current 
            set currentExpression [lindex [lindex $expressions 0] 1]
            set resultParent [lindex [lindex $expressions 0] 0]

            ## Checks 
            #############
            #puts "Expression ($currentExpression) Size: [llength $currentExpression]"

            ## Size must be 3 or 
            #if {[llength $currentExpression]<3} {
            #    error "Expression $currentExpression must be of format: operand operator operand . 
            #    An operand may be a subexpression. 
            #    Maybe a parenthesis is unbalanced"
            #}

            ## Process depending on size 
            ##################################

            ## Size 1, only one node, return it if it's a node, or convert it to a node, otherwise error 
            ## Size 2, Format: operator operand 
            ## Size 3, Format: operand  operator  operand
            ## Otherwise, error 
            switch -exact -- [llength $currentExpression] {
                1 {
                   set returnNode [lindex $currentExpression 0]
                   if {[odfi::common::isClass $returnNode ::odfi::flextree::FlexNode]} {
                        #odfi::log::error "Expression $currentExpression has not understandable format"
                        return $returnNode
                   } else {

                        ## Convert to constant
                        return [astOperatorToNode $returnNode]
                   }
                }
                2 {
                    
                    set left ""
                    set operator [lindex $currentExpression 0]
                    set right [lindex $currentExpression 1]

                    odfi::log::info "Format Operator ($operator) Operand ($right) for $currentExpression"
                }
                3 {
                    odfi::log::info "Format Operand Operator Operand "
                    set left [lindex $currentExpression 0]
                    set operator [lindex $currentExpression 1]
                    set right [lindex $currentExpression 2]
                }
                default {
                    odfi::log::error "Expression $currentExpression has not understandable format"
                }
            }

  

            ## Process 
            ###########
            #set left [lindex $currentExpression 0]
            #set operator [lindex $currentExpression 1]
            #set right [lindex $currentExpression 2]

            ## Build operator AST
            set operatorNode [astOperatorToNode $operator]
            lappend res $operatorNode

            ## Left 
            if {$left!="" && [llength $left]>1 } {

                lappend expressions [list $operatorNode $left]

            } elseif {$left!=""} {

                set leftNode [astOperatorToNode $left]
                $operatorNode addChild $leftNode
            }

            ## Right 
            if {[llength $right]>1} {

                lappend expressions [list $operatorNode $right]

            } else {
                set rightNode [astOperatorToNode $right]
                $operatorNode addChild $rightNode
            }

            ## Finish expression
            #########

            ## Add to parent if necessary
            if {$resultParent!=""} {
                $resultParent addChild $operatorNode
            }

            ## Remove from list 
            set expressions [lrange $expressions 1 end]

        }
        

        return [lindex $res 0]

    } 


    ## Base Nodes Definition
    ##########################


    ## The AST Node is the basic Node Definition
    nx::Class create ASTNode -superclass odfi::flextree::FlexNode {

        


        :public method toString args {
            return [info class]
        }

        ## Child positions
        ################

        ## @return true if the provided node is the first child
        :public method isLeft node {
            if {[child 0]==$node} {
                return true
            } else {
                return false
            }
        }

    }


    #############################
    ## Container AST 
    ################################
    nx::Class create ASTGroup -superclass ASTNode {
      
    

    }

    #############################
    ## Branching AST 
    ################################
    nx::Class create ASTBranchNode -superclass ASTNode {
       

        :public method toString args {
            return "branch"
        }

    }
    #############################
    ## Operands AST 
    ################################
    nx::Class create ASTOperand -superclass ASTNode {

         variable -accessor public operator ""

        

        :public method toString args {
            return $operator
        }

    }

    ## Utility to fast create operands 
    proc createASTOperand {name symbol} {

    }

    createASTOperand NonBlockingAssign <=
    createASTOperand Add +
    createASTOperand Multiply *
    createASTOperand Compare ==

    #################################################
    ## Simple Logical and Mathematical Operators 
    ##################################################
    nx::Class create ASTOperator -superclass ASTNode {

        :property -accessor public {operator "UNDEFINED"}

        

        :public method toString args {
            return $operator
        }

    }

    nx::Class create ASTNegate -superclasses ASTOperator {

    }

    nx::Class create ASTAdd -superclass ASTOperator {
      
    }



    ##############
    ## Value: For nodes that can provide a value or be updated
    ##############
    nx::Class create ASTValue -superclass ASTNode {
   
        :property -accessor public {currentValue 0}
        :property -accessor public {availableValue 0}
       


        ## Building functions
        #################

        ## Defered value update
        ## @ast @leaf Value target 
        ## @ast @left Value result
        :public method <= args {

            set astNode [::new [namespace parent]::ASTNonBlockingAssign $this.assignnb.#auto]

            #puts "Non blocking assign on AST Value: $args"

            ## Left : target
            $astNode addChild $this

            ## Right: Created expression
            $astNode addChild [[namespace parent]::buildAST [split $args]]

            ## Try to stack value to a parent 
            storeToCurrentASTNode $astNode
            

            return $astNode
        }

        :public method toString args {
           # puts "To string on $this : [$this info class] -> [namespace current]"
            return [$this name]
        }

    }

    nx::Class create ASTNonBlockingAssign -superclasses ASTOperator {

        :method init args {
            set :operator "<="
            next
        }
    }

    ## Constant 
    ##############
    nx::Class create ASTConstant -superclass ASTNode {
      

        :property -accessor public constant:required



        :public method toString args {
            return "$constant"
        }
    }


    ##########################
    ## Control Structures
    ## @group
    ##########################

    nx::Class create  If -superclass ASTNode {
        

        :method init {cTest body args} {

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

}




