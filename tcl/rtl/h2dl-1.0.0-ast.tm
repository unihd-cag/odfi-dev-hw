

namespace eval h2dl {

    proc astOperatorToNode operator {

        if {$operator!= "*"  && [odfi::common::isClass $operator [namespace current]::ASTNode]} {
            #puts "$operator is a class"
            return $operator
        } else {

            switch -regexp -- $operator {
                {\+} {
                   return [::new [namespace current]::ASTAdd #auto]   
                }
                {\*} {
                   return [::new [namespace current]::ASTMultiply #auto]    
                }
                {==} {
                   return [::new [namespace current]::ASTCompare #auto]    
                }

                {[0-9]+} {
                    return [::new [namespace current]::ASTConstant #auto $operator]    
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
        set args [odfi::closures::subst $args]

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

            ## Size must be 3
            if {[llength $currentExpression]!=3} {
                error "Expression $currentExpression must be of format: operand operator operand . 
                An operand may be a subexpression. 
                Maybe a parenthesis is unbalanced"
            }

            ## Process 
            ###########
            set left [lindex $currentExpression 0]
            set operator [lindex $currentExpression 1]
            set right [lindex $currentExpression 2]

            ## Build operator AST
            set operatorNode [astOperatorToNode $operator]
            lappend res $operatorNode

            ## Left 
            if {[llength $left] > 1 } {

                lappend expressions [list $operatorNode $left]

            } else {

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


    itcl::class ASTNode {

        common type {BRANCH CONCAT ADD AND OR XOR}

        common currentNode ""

         

        odfi::common::classField public astChildren {}

        ## Parent : "" means no parent, otherwise it is a list
        odfi::common::classField public parents ""


        protected method storeToCurrentASTNode node {
            if {$currentNode!=""} {
                $currentNode addChild $node
            }
        }
          
        ## Parent
        #################

        public method addParent node {
            lappend parents $node
        }


        ## Leaves management
        ############################

        ## @return The depth of this node
        public method getDepthFrom parent {
            switch -exact -- $parent {
                "" {
                    return 0  
                }
                default {
                    set current $parent
                    set depth 1
                    while {[llength [$current parents]]>0} {
                        ::incr depth
                        set current [lindex [$current parents] 0]
                    }
                    return $depth
                }
            }
        }

        public method eachASTChild closure {

            odfi::list::each $astChildren {
                if {$it != "" && [$it isa [namespace parent]::ASTNode]} {
                    odfi::closures::doClosure $closure 1
                }
            }
        }

        public method eachChild closure {

            odfi::list::each $astChildren $closure 1
        }

        public method child index {
            return [lindex $astChildren $index]
        }

        public method children args {
            return $astChildren
        }

        public method childCount args {
            return [llength $astChildren]
        }

        ## Add the node as child of this, and adds itself to the possible parents
        public method addChild astNode {
            $astNode addParent $this
            lappend astChildren $astNode
        }


        public method toString args {
            return [info class]
        }

        ## Child positions
        ################

        ## @return true if the provided node is the first child
        public method isLeft node {
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
    itcl::class ASTGroup {
        inherit ASTNode
      
    

    }

    #############################
    ## Branching AST 
    ################################
    itcl::class ASTBranchNode {
        inherit ASTNode
      
        constructor args {
           
        }

        public method toString args {
            return "branch"
        }

    }
    #############################
    ## Operands AST 
    ################################
    itcl::class Operand {
        inherit ASTNode

        odfi::common::classField public operator ""
   

        odfi::common::classField public inputs {}

        odfi::common::classField public outputs {}

        odfi::common::classField public ports {}

        

        public method toString args {
            return $operator
        }

    }

    itcl::class LeftOut {
    }

    ##
    itcl::class ASTNonBlockingAssign {
        inherit Operand LeftOut 


        constructor args {
            operator "<="
        }
    }

    ##
    itcl::class ASTAdd {
        inherit Operand 


        constructor args {
            operator "+"
        }
    }

    ##
    itcl::class ASTMultiply {
        inherit Operand 


        constructor args {
            operator "*"
        }
    }

    ##
    itcl::class ASTCompare {
        inherit Operand 


        constructor args {
            operator "=="
        }
    }

    ##############
    ## Value: For nodes that can provide a value or be updated
    ##############
    itcl::class ASTValue {
        inherit ASTNode

        odfi::common::classField public currentValue 0

        odfi::common::classField public availableValue 0


        ## Building functions
        #################

        ## Defered value update
        ## @ast @leaf Value target 
        ## @ast @left Value result
        public method <= args {

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

        public method toString args {
           # puts "To string on $this : [$this info class] -> [namespace current]"
            return [$this name]
        }

    }

    ## Constant 
    ##############
    itcl::class ASTConstant {
        inherit ASTNode

        odfi::common::classField public constant 0

        constructor cConstant {
            set constant $cConstant
        }

        public method toString args {
            return "$constant"
        }
    }


}



package require odfi::scenegraph::svg

namespace eval h2dl::ast::svg {

    proc toNode node {

        set g [odfi::scenegraph::svg::group {

            addCircle {
                radius 1
                title [$node info class]
                color "green"
                text [$node toString] {
                    font-size 32
                }
                layout "center"

            }

            ## Children 
            ::if {[$node childCount]>0} {
                group {
                    $node eachASTChild {
                        #puts "Converting AST node"
                        add [::h2dl::ast::svg::toNode $it]
                    }

                    layout "row"
                }
            }

            ## Layout all in column 
            layout "column" {
                align-width true
            }

        }]

        return $g

        

    }


    ## Produce an SVG node for a node 
    proc toSVG node {

        
        set svg [odfi::scenegraph::svg::svg {

            ## Create Top Circle
            addCircle {
                title [$node info class]
                radius 0
                color "green"
                text [$node toString] {
                    font-size 32
                }

                layout "center"
            }

            ## Children 
            group {
                $node eachASTChild {
                   # puts "Converting AST node"
                    add [::h2dl::ast::svg::toNode $it]
                }

                layout "row"
            }
            
            ## Layout all in column 
            layout "column" {
                align-width true
            }
            

        }]

        return $svg


    }



}
