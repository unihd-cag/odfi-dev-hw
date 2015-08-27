## The AST Package provides the core tree syntax modelisation
package provide odfi::dev::hw::h2dl::sim1 2.0.0
package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim::vcd 2.0.0


namespace eval  odfi::dev::hw::h2dl::sim1 {


    variable currentSimulator -1

    #####################################
    ## Simulator to drive the simulation process 
    #####################################
    nx::Object create Simulator  {

        :object variable -accessor public currentSimulator -1

    }
    nx::Class create Simulator {

        ## Resolution in PS
        :property -accessor public {resolution 10}

        ## Next time step 
        :variable -accessor public nextTime 0
        :variable -accessor public currentTime 0

        ## Immediate schedule
        :variable -accessor public immediateSchedule {}

        ## Start/Stop control 
        :variable stop false

        :public method init args {
            
            set :immediateSchedule [odfi::flist::MutableList new]

            next
        }
        :public method stop args {
            set :stop true
        }

        :public method scheduleNow node {
            ${:immediateSchedule} += $node
        }

        :public method scheduleClosureNow args {

            set closure [lindex $args end]
            set args [lrange $args 0 end-1]

            set node [SimulationAlwaysActive new]

            #puts "Closure to schedule $args"
            $node object method interact args "
                puts \"inside closure schedule host node\"
                odfi::closures::applyLambda  { $closure  } $args
            " 

            :scheduleNow $node
            #${:immediateSchedule} += $node

        }

        :public method run {baseNode targetFile}  {

            set odfi::dev::hw::h2dl::sim1::currentSimulator [current object]

            odfi::log::info "Running Simulator on node [$baseNode toString]"

            ## Prepare VCD File 
            #####################
            set vcd [::odfi::dev::hw::h2dl::sim::vcd::VCDDump new -targetFile $targetFile]


            ## Look for the signals to dump 
            ##############
            odfi::log::info "Looking for signals to dumps "
            $baseNode walkDepthFirstPreorder {

                if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationDumpable]} {
                    $vcd registerDumpSignal $node
                }
                return true
            }

            ## Prepare VCD 
            #######################
            $vcd writeHeader
            
            #$vcd close 
            #return 0

            ## Loop as long as not stop function has been found, or nextTime > currentTime
            ########################
            set nextTime 0
            set :stop false 
            while {!${:stop}} {

                ## Set currentTime to nextTime
                set :currentTime ${nextTime}

                ## Limit the max time 
                if {${:currentTime}>10000} {
                    break
                }

                #odfi::log::info "Iteration time ${:currentTime}"

                $vcd time ${:currentTime}

                ## Walk the tree in depth first order
                ## On Simulation Active nodes:
                ##  - Ignore if not active 
                ##  - record next active time if declared active
                set processNodeClosure {
                    
                    #if {${:currentTime}>80} {
                    #    :stop
                   # }

                    ## Global Stop 
                    if {${:stop}} {
                       return false
                    }

                    ## Normal Processing 
                    set continue false

                    if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationActive]} {

                        set continue false

                        ## Check active heuristic 
                        set active [$node isActive ${:currentTime}]
                        if {$active} {

                            odfi::log::info "(TIME: ${:currentTime}) node [$node info class] is active"
                            
                            $node lastActiveTime ${:currentTime}


                            ## Simulation Value Update : Update and don't go further in tree
                            #################################
                            if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationValueUpdater]} {

                                $node sim:updateValue
                                #if {[catch {$node sim:updateValue} res]} {
#
                                 #   ::puts "Error on updateValue $res"
                               # } 

                                
                            } else {
                                set continue true
                            }

                            ## Call Interact 
                            #######################
                            #puts "Node methods: [$node info  lookup methods]"
                            if {[lsearch -exact [$node info lookup methods] "interact"]!=-1} {
                                $node interact
                            }
                            if {[lsearch -exact [$node info lookup methods] "sim:interact"]!=-1} {
                                $node  sim:interact
                            }
                            
                        } 


                        ## Update next time for node, only if not disabled
                        if {![$node disable get] || $active} {
                            set nextTimeForcompoent  [$node nextActiveTime]
                            if {$nextTime==${:currentTime}} {
                                set nextTime $nextTimeForcompoent
                            } elseif {($nextTimeForcompoent>0) && ($nextTimeForcompoent>${:currentTime}) && ($nextTimeForcompoent < $nextTime)} {
                                set nextTime $nextTimeForcompoent
                            }
                            #set nextTime [expr ($nextTimeForcompoent>0) && ($nextTimeForcompoent < $nextTime || ($nextTime==${:currentTime} && $nextTimeForcompoent!=${:currentTime})  ) ? $nextTimeForcompoent : $nextTime]

                            #odfi::log::info "Set next time to ${nextTime}"

                        } else {
                            set continue false
                        }
                        
                        

                        

        


                    } else {
                         set continue true
                    }


            


                    return $continue
                }

                ## Run on Top 
                $baseNode walkDepthFirst $processNodeClosure

                ## Run Immediate Stuff
                #odfi::log::info "---- Event Schedules --------"
                ${:immediateSchedule} popAll {

                    node =>
                        $node walkDepthFirst $processNodeClosure

                    ## update active time and value 
                    #$node lastActiveTime ${:currentTime}
                    #if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationValueUpdater]} {

                     #   $node sim:updateValue 

                            
                    #}   

                    ## Request next time 
                    #set nextTimeForcompoent  [$node nextActiveTime]
                    #set nextTime [expr ($nextTimeForcompoent>0) && ($nextTimeForcompoent < $nextTime || $nextTime==${:currentTime} ) ? $nextTimeForcompoent : $nextTime]

                    ## Stop 
                    #if {${:stop}} {
                    #    break
                    #}
                }
                #odfi::log::info "---- EOF Event Schedules --------"

                #odfi::log::info "Set next time to ${nextTime} with current ${:currentTime} (immediate left: [${:immediateSchedule} size])"

                ## Stop condition 
                if {${nextTime}<=${:currentTime}} {
                    :stop
                }
            }
            ## EOF TIME LOOP

            puts "--EOF SIM"

        }

    }


   

    #################################
    ## base Traits used by Simulation Package 
    ## used for simulator run, or integration with main H2Dl Language 
    ################################
    nx::Class create SimulationActive -superclasses odfi::flextree::FlexNode {
        
        #Every mixins add SimulationActive
        #At    mixins add SimulationActive

        :variable lastActiveTime 0

        :variable -accessor public disable false

        :method init args {
            next 
        }

        #:public method isActive time  {
        #    return false 
        #}

        #:public method nextActiveTime args {
         #   next
         #   return 0
        #}
        :public method lastActiveTime t {
            set :lastActiveTime $t
        }

        :public method interact args {
            next
        }

    }

    nx::Class create SimulationAlwaysActive -superclasses  SimulationActive {

        :method init args {
            next 
        }

        :public method isActive time {
            return true
        }

        :public method nextActiveTime args {
            return -1
        }

    }

    ####################
    ## Some Nodes must not go through during simulation, because they activate themselves
    #####################
    nx::Class create SimulationNeverActive -superclass  SimulationActive {


        :public method isActive time {
            
            set :disabled true
            return false
        }

        :public method nextActiveTime args {
            return -1
        }

    }

    nx::Class create SimulationActiveOnRequest -superclass  SimulationActive {

        :property -accessor public {__activate false}

        :public method isActive time {
            if {${:__activate}==true} {
                set :disabled false 
                set :__activate false 
                return true 
            } else {
                set :disabled true
                return false
            }
            
        }

        :public method nextActiveTime args {
            return -1
        }

    }

    odfi::dev::hw::h2dl::Posedge mixins add SimulationActiveOnRequest
    odfi::dev::hw::h2dl::Posedge public method +build args {

        puts "********* BUILDING Posedge with simulation interface:  ****************"

        ## Lookout for Signal changing its value
        set signal [:signal get]
        :addChild $signal

        $signal onChildAdded {

            ## Need to get this again, because it is an asynchronous call
            set signal [current object]
            set child [:child end]
            set valueChild [$signal shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]

            if {[::odfi::common::isClass $child ::odfi::dev::hw::h2dl::sim1::SimulationValue]} {

                #puts "Added Simulation Value $child , with main value: $valueChild"

                ## If there is a first value child, and this is a new one, just ignore its
                if {$valueChild!="" && $valueChild!=$child} {

                } else {


                    ## Check 
                    set value [$child getValue]
                    if {$value==1} {

                         puts "********* Activating Posedge for immediate schedule  ****************"
                         set posedge [[$signal parents get] find { odfi::common::isClass $it odfi::dev::hw::h2dl::Posedge} ]
                         $posedge __activate set true
                         ${odfi::dev::hw::h2dl::sim1::currentSimulator} scheduleNow $posedge
                         #$__caller __activate set true

                    }

                    ## Value Changed, Monitor value as well
                    $child onValueChanged {

                        set signal [:parent]

                        ## Check 
                        set value [:getValue]
                        if {$value==1} {

                             
                             set posedge [[$signal parents get] find { odfi::common::isClass $it odfi::dev::hw::h2dl::Posedge} ]
                             puts "********* Activating Posedge for immediate schedule : [$posedge info class] ****************"
                             $posedge __activate set true
                             ${odfi::dev::hw::h2dl::sim1::currentSimulator} scheduleNow $posedge
                             #$__caller __activate set true

                        }
                    }

                }
                
            }

        }


        next 
    }

     #########################
    ## Language Definition for Simulation language 
    #################################


    odfi::language::Language2 define SIM {

        ## IncTime is a list of times
        ## The next time, will always be the current one on the list
        :every : ::odfi::dev::hw::h2dl::Logic  incTime  {

            ## The index of the incTime to use
            +var currentIncTime 0

            ## Time of first activation
            +var first 0

            +exportTo ::odfi::dev::hw::h2dl::Module sim
            +mixin   SimulationActive

            +builder {
                set :currentIncTime 0
            }
            +method nextActiveTime args {

                if {${:first}>0} {
                    return   [expr ${:first}+${:lastActiveTime}]
                } else {
                    return [expr [lindex ${:incTime} ${:currentIncTime}]+${:lastActiveTime}]
                }

                
            }

            ## Active -> Switch to next time
            +method isActive time {

                #puts "Checking isActive at time $time against [:nextActiveTime] with first: ${:first}"

                ## Consume first time or normal times
                if {${:first}>0 && $time == [expr ${:first}+${:lastActiveTime}]} {
                    
                    set :first 0
                    return true 

                } elseif {${:first}<=0 && $time == [expr [lindex ${:incTime} ${:currentIncTime}]+${:lastActiveTime}]} {
                    
                    set :currentIncTime [expr (${:currentIncTime}+1)%[llength ${:incTime}]]
                    return true 
                
                } else {
                    return false
                }
            }
        }

        :at : ::odfi::dev::hw::h2dl::Logic  absoluteTime {

             +mixin   SimulationActive
             +exportTo ::odfi::dev::hw::h2dl::Module sim


             +method isActive time {
                if {$time == ${:absoluteTime}} {
                    set :disable true
                    return true 

                } else {
                    return false
                }
             }

            +method nextActiveTime args {
                return ${:absoluteTime}
            }

            ## Stop Node 
            :stop  when {

                +mixin  ::odfi::dev::hw::h2dl::sim1::SimulationAlwaysActive
                
                +method interact args {

                    puts "*********************************** STOP"
                    ${odfi::dev::hw::h2dl::sim1::currentSimulator} stop

                    next
                }
                
            }
        }

        ## Init is an alias for at 0 
        :initial {
            +exportTo ::odfi::dev::hw::h2dl::Signal sim

            +builder {
                set at [[:parent] addChild [odfi::dev::hw::h2dl::sim1::At new -absoluteTime 0]]
                :detach 
                $at addChild [current object]
            }
        }

        ## Set a value to a node 
        :value val {
            +exportTo ::odfi::dev::hw::h2dl::Signal sim

            +builder {
                set v [odfi::dev::hw::h2dl::sim1::SimulationValue new -value ${:val}]
                [:parent] addChild $v
            }
        }


    }
    SIM produceNX

    ## This Trait is added to the nodes that can update a value 
    ## Ex: <= or = 
    nx::Class create SimulationValueUpdater -superclass  SimulationAlwaysActive {

        ::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign mixins add SimulationValueUpdater
        ::odfi::dev::hw::h2dl::ast::ASTBlockingAssign mixins add SimulationValueUpdater

    }

    ## SimValue is just a holder node to store simulation values 
    nx::Class create SimulationValue -superclass odfi::flextree::FlexNode {

        :mixins add ::odfi::dev::hw::h2dl::sim::vcd::VCDDumpValue
        
        :property value:required

        

        :method init args {

            #:value valuecmd TEST
            :registerEventPoint valueChanged
            next 
        }

        :public method setValue val  {
            set :value $val 
            :callValueChanged $val
        }

        :public method getValue args {
            return ${:value}
        }
    }

    ## Language element for elements containing values to be dumpable
    ## This is a Type marker
    nx::Class create SimulationDumpable {


    }

    ::odfi::dev::hw::h2dl::Signal public method sim:probe args {
        [current object] object mixins add ::odfi::dev::hw::h2dl::sim1::SimulationDumpable
    }


    #######################################
    ## Value Updating Interface to AST package 
    ###############################################


    proc valueUpdaterBuilder {forClass updaterBody} {

        nx::Class create ${forClass}SimValueUpdater {
            upvar updaterBody updaterBody
            :public method updateValue args $updaterBody

        }

        $forClass domain-mixins add ${forClass}SimValueUpdater -prefix sim
    }

    ## Merge values right to left for node
    proc mergeValues node {

        set allValues [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue children]
        if {[$allValues size]>1} {
            set first [$allValues at 0]
            $allValues foreach {
                #$first setV
            }
        }
    }




    ## Update Non blocking assignment
    ###################################


    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign {



        set targetAssignee [:child 0]
        set expression     [:child 1]

        puts "NB Updating Value for [$targetAssignee name get]"

        ## Try to reduce to newValue / currentValue
        set newValue "" 
        set currentValue ""

        ## Cases for expression: 
        ##  - An AST Operator: Calculate value and assign 
        ##  - A FlexNode, look for value
        if {[::odfi::common::isClass $expression ::odfi::dev::hw::h2dl::ast::ASTOperator] || [::odfi::common::isClass $expression ::odfi::dev::hw::h2dl::ast::ASTConstant]} {


            #puts "nb Updating value for Nont blocking assignment to $targetAssignee, with main operator [$expression info class]"

            ## New value 
            set newValue [$expression sim:updateValue]
            #puts "nb new value: $newValue"

            ## If new value is empty, or not a SimulationValue, assume the operator already updated the value 
            if {$newValue!="" || [::odfi::common::isClass $newValue ::odfi::dev::hw::h2dl::sim1::SimulationValue]} {

                ## Current value: add or  update 
                set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
                if {$currentValue!=""} {
                    #$currentValue detach
                    #$currentValue delete object
                    #$currentValue setValue [$newValue getValue]
                
                } else {

                    ## Make sure newvalue is also orphan before adding, to avoid weird stuff
                    #$newValue detach
                    #$targetAssignee addChild $newValue

                }

                

            } else {
                error "After Updating Expressions value, nothing was returned: $newValue"
            }

            ## Debug: 
            ## Current value 
            #set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
            #puts "Current value of node  [$targetAssignee name get] [$currentValue getValue]"

        } elseif {[::odfi::common::isClass $expression ::odfi::flextree::FlexNode]} {

            ## Look for value 
            set newValue [$expression shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
            if {$newValue==""} {
                
                error "AST Non Blocking update, cannot fetch value from flexnode $expression , maybe not initialised"
            
            } else {

                ## Update left side value or add one
                set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child end]
                if {$currentValue!=""} {
                    #$currentValue setValue [$expressionValue getValue]
                } else {
                    #set newValue [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value [$expressionValue getValue]]
                    #$targetAssignee addChild $newValue
                }

            }

        } else {
            error "AST Non Blocking update, expression is $expression , cannot start anything with that"
        }


        ## Perform Update 
        ##  -> If no value, add the newValue 
        ##  -> If a value, just update 
        ###########

        ## Bit Range is 
        ##   - fromBitRange or 0 
        ##   - toBitRange or size or left value
        set fromBitRange [expr ${:fromBitRange}>  0  ? ${:fromBitRange} : 0]
        set toBitRange   [expr ${:toBitRange}  >= 0  ? ${:toBitRange}   : [$targetAssignee width get]]

        ## Prepare Value from bit ranges: Extract and replace to correct targetPosition
        set extractedValue [$newValue getValue]
        #puts "----- value from operator is $extractedValue , extracting from ${:fromBitRange} to ${:toBitRange}"
        if {${:fromBitRange}>=0} {
            set extractedValue [expr ($extractedValue >> $fromBitRange) & 0x1]
        }
        #puts "----- after extraction $extractedValue"

        set targetFinalValue $extractedValue
        if {$currentValue!=""} {
            set targetFinalValue [$currentValue getValue]
        }
        #puts "----- merging $targetFinalValue with $extractedValue"
        ## Replace: Merge extractedValue and targetFinal, otherwise targetFinal is just the extractedValue
        if {${:toBitRange}>=0} {
             
            set targetFinalValue [expr  $targetFinalValue | ($targetFinalValue & ( $extractedValue << ${:toBitRange} ) | ($extractedValue << ${:toBitRange}) ) ]

        } else {

            set targetFinalValue $extractedValue
        }
       #puts "----- Remaining $targetFinalValue "

        ## Non Blocking: Always add value as an extra node 
        ## There might already be an extra node 
        set firstValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue  child 0] 
        set lastValue  [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue  child end] 
        puts "Values: $firstValue  , $lastValue <- $targetFinalValue"
        if {$firstValue != $lastValue} {
            $lastValue setValue $targetFinalValue
        } else {
            set newValueToAdd [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value $targetFinalValue ]
            $targetAssignee addChild $newValueToAdd
        }
        

        #if {$currentValue!=""} {
        #    $currentValue setValue $targetFinalValue
        #} else {
        #    $newValue detach
        #    $newValue setValue $targetFinalValue
        #    $targetAssignee addChild $newValue
        #}

        

    }

    ## Non blocking assignments must be updated at the end of a node's processing
    ::odfi::dev::hw::h2dl::Posedge public method sim:interact args {

        #puts "In posedge interact, schedule an action"
        
        ${odfi::dev::hw::h2dl::sim1::currentSimulator} scheduleClosureNow [list node [current object]] {

            #puts "--> Inside posedge action: $node [[$node children] size] ******************************************************************************"

            ## Go through all non blocking assign nodes, and merge values
            $node shade ::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign walkDepthFirst {
           
                
               

                    #set left [$node noShade child 0]

                    #puts "Updating NB assign $node -> [$node info class] -> [$left name get]"

                    ## This method merges all the values on the left side to the first available value 
                    set left [$node noShade child 0]
                    set values   [$left shade ::odfi::dev::hw::h2dl::sim1::SimulationValue children]
                    if {[$values size] >1 } {
                        set firstVal [$values at 0]
                        ::repeat [expr [$values size]-1] {
                            set val [$values at [expr $i+1]]
                            $firstVal setValue [$val getValue]
                            $val detach
                        }
                    }

              
                
                
                #$node mergeLeft
            }

            #puts " EOF posedge action*********************************************************************************************************************"
        }
    }


    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTBlockingAssign {



        set targetAssignee [:child 0]
        set expression     [:child 1]

        #puts "Blocking Updating Value for [$targetAssignee name get]"

        ## Try to reduce to newValue / currentValue
        set newValue "" 
        set currentValue ""

        ## Cases for expression: 
        ##  - An AST Operator: Calculate value and assign 
        ##  - A FlexNode, look for value
        if {[::odfi::common::isClass $expression ::odfi::dev::hw::h2dl::ast::ASTOperator] || [::odfi::common::isClass $expression ::odfi::dev::hw::h2dl::ast::ASTConstant]} {


            #puts "nb Updating value for Nont blocking assignment to $targetAssignee, with main operator [$expression info class]"

            ## New value 
            set newValue [$expression sim:updateValue]
            #puts "nb new value: $newValue"

            ## If new value is empty, or not a SimulationValue, assume the operator already updated the value 
            if {$newValue!="" || [::odfi::common::isClass $newValue ::odfi::dev::hw::h2dl::sim1::SimulationValue]} {

                ## Current value: add or  update 
                set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
                if {$currentValue!=""} {
                    #$currentValue detach
                    #$currentValue delete object
                    #$currentValue setValue [$newValue getValue]
                
                } else {

                    ## Make sure newvalue is also orphan before adding, to avoid weird stuff
                    #$newValue detach
                    #$targetAssignee addChild $newValue

                }

                

            } else {
                odfi::log::warning  "After Updating Expressions value, nothing was returned: $newValue"
                return 
            }

            ## Debug: 
            ## Current value 
            #set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
            #puts "Current value of node  [$targetAssignee name get] [$currentValue getValue]"

        } elseif {[::odfi::common::isClass $expression ::odfi::flextree::FlexNode]} {

            ## Look for value 
            set newValue [$expression shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
            if {$newValue==""} {
                
                odfi::log::warning "AST Blocking update, cannot fetch value from flexnode $expression , maybe not initialised"
                return
            } else {

                ## Update left side value or add one
                set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child end]
                if {$currentValue!=""} {
                    #$currentValue setValue [$expressionValue getValue]
                } else {
                    #set newValue [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value [$expressionValue getValue]]
                    #$targetAssignee addChild $newValue
                }

            }

        } else {
            error "AST Non Blocking update, expression is $expression , cannot start anything with that"
        }


        ## Perform Update 
        ##  -> If no value, add the newValue 
        ##  -> If a value, just update 
        ###########

        ## Prepare Value from bit ranges: Extract and replace to correct targetPosition
        set extractedValue [$newValue getValue]
        #puts "----- value from operator is $extractedValue , extracting from ${:fromBitRange} to ${:toBitRange}"
        if {${:fromBitRange}>=0} {
            set extractedValue [expr $extractedValue >> ${:fromBitRange} & 0x1]
        }
        #puts "----- after extraction $extractedValue"

        set targetFinalValue $extractedValue
        if {$currentValue!=""} {
            set targetFinalValue [$currentValue getValue]
        }
        #puts "----- merging $targetFinalValue with $extractedValue"
        ## Replace: Merge extractedValue and targetFinal, otherwise targetFinal is just the extractedValue
        if {${:toBitRange}>=0} {
             
            set targetFinalValue [expr  $targetFinalValue | ($targetFinalValue & ( $extractedValue << ${:toBitRange} ) | ($extractedValue << ${:toBitRange}) ) ]

        } else {

            set targetFinalValue $extractedValue
        }
       #puts "----- Remaining $targetFinalValue "

       #puts "Placing value to target: $currentValue"
        if {$currentValue!=""} {
            $currentValue setValue $targetFinalValue
        } else {


            $newValue detach
            $targetAssignee addChild $newValue
            $newValue setValue $targetFinalValue
            
            
        }

        

    }



    ## Constant
    ###################################
    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTConstant {

        set valueNode [:shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
        if {$valueNode!=""} {
            return $valueNode
        } else {
            set valueNode [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value ${:constant}]
            :addChild $valueNode
            return $valueNode
        }
        
    }


    ## Mathematical update
    ###################################
    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTNegate {

        

        set valueSource [:child 0]

        ## Get Value 
        #################
        set value [$valueSource shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
        if {$value==""} {
            odfi::log::error "Cannot Negate non existent value of node $valueSource ([$valueSource info class]). Make sure an initial value was set before starting"
        }

        if {[$valueSource width get]==1} {
            set negated [expr !int([$value getValue])]
        } else {
            set negated [expr ~int([$value getValue])]
        }

       # set negated [expr ~int([$value getValue])]
        #puts "Negated from [$value getValue] to $negated ([format %b $negated]) "

        ## Return new Value 
        set newValue [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value $negated]

        return $newValue

        #puts "Updating Negate base value: $value ([$value info class]), for parent of type [$valueSource info class] ([[$value parent] info class])"
        #[$value parents] foreach {
        #    puts "--> Parent of SimulationValue: [$it info class]"
        #}

        set negated [expr ~int([$value getValue])]
        puts "Negated from [$value getValue] to $negated"
        $value setValue $negated

        # puts "Done Updating Negate base value: $value"
        ## Return 
        return ""
        
       
    }


     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTAdd {

        #puts "In ADD Update "

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]
        catch {$left sim:updateValue}
        catch {$right sim:updateValue}

        ## Value left 
        set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
        set valRight [$right shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]

        set resVal [expr [$valLeft getValue] + [$valRight getValue]]

        return [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value $resVal]

     }

     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTAnd {

        #puts "In ADD Update "

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]
        catch {$left sim:updateValue}
        catch {$right sim:updateValue}

        ## Value left 

        set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
        set valRight [$right shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]

        if {$valLeft == "" || $valRight == ""} {
            return ""
        }

        set resVal [expr [$valLeft getValue] & [$valRight getValue]]

        return [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value $resVal]

     }

     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTBitOr {

        #puts "In ADD Update "

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]
        catch {$left sim:updateValue}
        catch {$right sim:updateValue}

        ## Value left 

        set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
        set valRight [$right shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]

        if {$valLeft == "" || $valRight == ""} {
            return ""
        }

        set resVal [expr [$valLeft getValue] | [$valRight getValue]]

        return [::odfi::dev::hw::h2dl::sim1::SimulationValue new -value $resVal]

     }


}
