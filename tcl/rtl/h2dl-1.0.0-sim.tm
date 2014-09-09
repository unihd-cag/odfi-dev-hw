

namespace eval h2dl::sim {


    proc value node {

        

        if {[$node isa ::h2dl::ASTAdd]} {

            set res [expr [value [$node child 0]]+[value [$node child 1]]]
            return $res

        } elseif {[$node isa ::h2dl::ASTMultiply]} {

            set res [expr [value [$node child 0]]*[value [$node child 1]]]
            return $res

        } elseif {[$node isa ::h2dl::ASTCompare]} {

            #puts "Compare  [$node child 0] with [$node child 1]"
            set res [expr [value [$node child 0]] == [value [$node child 1]]]
            return $res

        } elseif {[$node isa ::h2dl::ASTConstant]} {
            
            return [$node constant]

        } elseif {[$node isa ::h2dl::ASTValue]} {
            
            return [$node currentValue]
        }


    }
    proc calculateValues node {

        if {[$node isa ::h2dl::ASTNonBlockingAssign]} {
            
            [$node child 0] availableValue [value [$node child 1]]

        } elseif {[$node isa ::h2dl::If]} {

            ## If -> Do the if elseif test
            ## First Child is the if match condition
            set conditionRes [value [$node child 0]]
            #puts "If $node result: $conditionRes"
            ::if {$conditionRes} {

                ## Go on sub body 
                calculateValues [$node child 1]

                return true

            } else {

                ## Try all Else ifs
                set matched false 
                $node eachASTChild {
                    ::if {[$it isa ::h2dl::If]} {

                        ## Just Update cycle and look at result
                        set res [calculateValues $it]
                        if {$res} {
                            set matched true
                            break
                        }
                    }
                }

                ## If not matched do else 
                if {!$matched} {

                    set elseNode [lsearch -glob -inline [$node children] "*else"]

                    #puts "Trying to fallback on else -> $elseNode"

                    if {$elseNode!=""} {
                        calculateValues $elseNode
                    }

                }
                return $matched

            }

            return 

        }

        ## Default, call doCycle on content
        $node eachASTChild {

            #puts "-- (SIM) switching to $it"
            calculateValues $it
        }

    }


    proc updateValues node {

        ## Update Value based on expressions
        ###############
        if {[$node isa ::h2dl::ASTNonBlockingAssign]} {
            
            [$node child 0] currentValue [[$node child 0] availableValue]

        } 

        ## Default, call doCycle on content
        $node eachASTChild {

            #puts "-- (SIM) switching to $it"
           # if {$it!=""} {
                 updateValues $it
            #}
           
        }

    }
  

    ## Calculate the values, update the 
    proc doCycle node {


        ## Calculate values
        ##############
        calculateValues $node
        #puts "(SIM) On $node"

        updateValues $node

        return true
    }

}


namespace eval h2dl::trace {

    namespace import ::odfi::log::logInfo

    ## Returns all the paths out of this Node first parents
    ## @return { {pathelt pathelt} {path ..}}
    proc trace node {

        puts "Node $node has parents: [$node parents]"

        ## Ignore all outputs Operators 
        ###
        set starts {}
        foreach parent [$node parents] {
            ##if {!([$parent isa ::h2dl::LeftOut] && [$parent isLeft $node])} {
            ##    lappend starts [list $parent [$node getDepthFrom $parent]]
            ##}
            lappend starts [list $parent [$node getDepthFrom $parent]]
        }

        ## Sort starts parents by longest first
        set starts [lsort -decreasing -integer -index 1 $starts]
        set starts [odfi::list::transform $starts { lindex $it 0}]
        ::odfi::log::info "Start points: $starts"

       
        ## Loop 
        ############
        set paths {}
        while {[llength $starts]>0} {

            ## Take start
            set start [lindex $starts 0]
            set starts [lrange $starts 1 end]

            ## Init path 
            set currentPath $start 
            
            ## Take last one in path 
            set lastInPath [lindex $currentPath end]

            ## If There is a start point starting at this current element, remove it from start points
            set lastInPathInStartPoints [lsearch -exact $starts $lastInPath]
            if {$lastInPathInStartPoints!=-1} {
                set starts [lreplace $starts $lastInPathInStartPoints $lastInPathInStartPoints]
            }

            ## Special Current NOde handlings 
            #####################
            if {[$lastInPath isa ::h2dl::ASTBranchNode]} {

                ## Branch - Add left (which is condition to current path) 

                ## Check we are not coming from this left 
                #if {[llength $currentPath]<=1 || ([lindex $currentPath end-1]!=[$lastInPath child 0])} {
                    #lappend currentPath [$lastInPath child 0]
                #}

            }

            ## If we are on a left out, add the right node on the path because it is the ouput
            if {[$lastInPath isa ::h2dl::LeftOut]} {
                lappend currentPath [$lastInPath child 1]
            }

            ## Parent 
            ##############

            ## If No parent -> end 
            if {[$lastInPath parents]==""} {
                lappend paths $currentPath
                continue
            } else {

                ## Analyse parents to continue tracing 
                foreach parent [$lastInPath parents] {

                    puts "Parent of $lastInPath -> $parent"

                    if {[$parent isa ::h2dl::LeftOut]} {
                        
                       
                        #lappend starts [concat  $currentPath $parent]

                        ## Trace the parent because it is part of the output 
                        #puts "Need to trace from : [lindex [$parent parents] 0]"
                        foreach tracedPath [trace [lindex [$parent parents] 0]] {
                            ## If parent is an assign, next target is its left child as output   
                            lappend paths [concat $tracedPath $currentPath [$parent child 0]]
                        }

                        


                        ## Next parent is the left one 
                        #lappend starts [concat $currentPath [$parent child 0]]


                    } elseif {[$parent isa ::h2dl::Operand]} {

                        ## Normal operand - Continue 
                        lappend starts [concat  $currentPath $parent]

                    } elseif {[$parent isa ::h2dl::ASTBranchNode]} {

                        ## Branch - Continue
                        lappend starts [concat  $currentPath $parent]

                    } elseif {[$parent isa ::h2dl::ASTGroup]} {

                        ## Group - Continue
                        ## Group -> replace itself with parent
                        #set currentPath [lreplace $currentPath  end end]
                        lappend starts [concat  $currentPath $parent]

                    } else {
                        ## Stop 
                        puts "-- Stop"

                        ## Remove all groups 
                        set cleanPath {}
                        foreach pc $currentPath {
                            if {![$pc isa ::h2dl::ASTGroup]} {
                                lappend cleanPath $pc
                            }
                        }

                        lappend paths $currentPath
                    }

                }

                ## Normal operand -> keep on going
            }

            ## If Branch , reverse the path and continue

        }

        #set paths [lreverse $paths]

        ## Merge the common paths 
        #########################
        set mergedPaths {}
        set i 0
        foreach path $paths {

            set toppath [lrange $path 1 end]

            set merged false
            foreach nextPath [lrange $paths $i end] {

                ## Try to find in next path, all the elements of toppath
                set matched true
                foreach pComponent $toppath {
                    if {[lsearch -exact $nextPath $pComponent]==-1} {
                        set matched false 
                        break
                    }
                }

                ## If matched, we can merge 
                
                if {$matched} {
                    set mergedPath {}
                    lappend mergedPath [lrange $nextPath 0 [lsearch -exact $nextPath [lindex $toppath 0]]]
                    lappend mergedPath $toppath
                    lappend mergedPaths $mergedPath
                    set merged true 
                    break
                } 

            }

            ## If not merged, keep
            if {!$merged} {
                lappend mergedPaths $path
            }

            incr i
        }

        puts "Resulting paths:"
        foreach p $paths {
            puts "-- $p"
        }

        puts "Resulting merged paths:"
        foreach mp $mergedPaths {
            puts "-- $mp"
        }
        return $paths

    }

}

namespace eval h2dl::info {


    proc printAST node {

        ## Get Depth 
        set depth [$node getDepth]
        set indent ""
        ::repeat $depth {set indent "$indent----"}

        ## print 
        puts "$indent$node"

        ## Children
        $node eachASTChild {

            printAST $it
        }

    }

}
