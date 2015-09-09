## The AST Package provides the core tree syntax modelisation
package provide odfi::dev::hw::h2dl::sim2 2.0.0
package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim::vcd 2.0.0


namespace eval  odfi::dev::hw::h2dl::sim2 {


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

        :variable -accessor public scheduleList {}

        ## Start/Stop control 
        :variable stop false

        :public method init args {
            
            set :immediateSchedule [odfi::flist::MutableList new]
            #set :scheduleList      [odfi::flist::MutableList new]

            next
        }
        :public method stop args {
            set :stop true
        }

        :public method scheduleNow node {
            ${:immediateSchedule} += $node
        }

        :public method scheduleClosure {at closure} {

            set cl [odfi::richstream::embeddedTclFromStringToString $closure]

            #puts "Scheduling cl $cl"
            ## Create an Immediate Node 
            set node [ImmediateSchedulable new -nextTime $at]
            $node public object method run {simulator time} "
                :apply {
                    $cl 
                }
            "

            :schedule $node
            return 

            set closure [lindex $args end]
            set args [lrange $args 0 end-1]

            set node [SimulationAlwaysActive new]

            puts "SChedule: [$node disable get]"
            #puts "Closure to schedule $args"
            $node object method interact args "
                puts \"inside closure schedule host node with $args\"
               
                :apply {
                    $closure 
                }

                puts \"DONE\"
            " 

            :scheduleNow $node
            #${:immediateSchedule} += $node

        }

        ## Schedules a node to be run 
        ## Look for a node that has a higher time than ours. If not found, add first 
        :public method schedule node {

            set targetTime [$node nextTime get]
            if {$targetTime==-1} {
                return
            }

            set index 0
            set done false 
            foreach scheduled ${:scheduleList} {

                set scheduledTime [$scheduled nextTime get]
                if {$scheduledTime>$targetTime} {
                    set  :scheduleList [linsert ${:scheduleList} $index $node]
                    #puts "Scheduled at $index"
                    set done true
                    break
                }

                incr index 

            }

            if {!$done} {
                #set  :scheduleList [linsert ${:scheduleList} 0 $node]
                lappend :scheduleList $node
                #puts "Scheduled [$node info class] at 0"
                
            }

            #puts "done scheduling"

            #${:scheduleList} foreach {
             #   
#
            #}
        }

        :public method run {baseNode targetFile}  {

            set odfi::dev::hw::h2dl::sim2::currentSimulator [current object]

            odfi::log::info "Running Simulator on node [$baseNode toString]"

            ## Prepare VCD File 
            #####################
            set vcd [::odfi::dev::hw::h2dl::sim::vcd::VCDDump new -targetFile $targetFile]


            ## Look for the signals to dump 
            ############################################
            odfi::log::info "Looking for signals to dumps "
            $baseNode walkBreadthFirst {

                if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim2::SimulationDumpable]} {
                    $vcd registerDumpSignal $node
                }
                return true
            }

            ## Prepare VCD 
            #######################
            $vcd writeHeader
            
            #$vcd close 
            #return 0

            ## Time Preparation
            ##########
            set :currentTime 0


            ## Run Principle
            ##   1. Go in base level children, and ask Simulation Nodes for scheduling
            ##   2. Further Scheduling should happen automatically as nodes register themselves
            ################
            [$baseNode shade odfi::dev::hw::h2dl::sim2::Schedulable children] foreach {
                puts "Found schedulable"
                $it schedule [current object] ${:currentTime}
            }
            puts "Running [llength ${:scheduleList}]"

            ## Main Scheduling Thread 
            ################
            while {!${:stop} && [llength ${:scheduleList}]>0} {

               

                #puts "Running node"
                ## Take 
                set node [lindex ${:scheduleList} 0]
                set :scheduleList [lreplace ${:scheduleList} 0 0]

                 puts "(TIME: ${:currentTime}) [$node info class]"

                ## Increment time if necessary
                set nodeTime [$node nextTime get]
                if {${:currentTime}<$nodeTime} {
                    set :currentTime $nodeTime
                    $vcd time ${:currentTime}
                } 

                ## Run 
                $node run [current object] ${:currentTime}

                ## Schedule 
                #$node schedule [current object] ${:currentTime}

            

            }



            return 0

        }

    }


    #########################
    ## Language Definition for Simulation language 
    #################################


    odfi::language::Language2 define SIM {

        +type Schedulable {

            +var nextTime 0 

            +method run {simulator currentTime} {
                next
                #[:shade odfi::dev::hw::h2dl::sim2::Schedulable children] foreach {
                    #puts "---> Found schedulable [$it info class]"
                 #   $it schedule $simulator ${:currentTime}
                #}
            }

            +method schedule {simulator currentTime} {
                next
            }
        }

        +type ImmediateSchedulable : Schedulable {
            
            +method schedule {simulator currentTime} {
                #next
                set :nextTime $currentTime
                $simulator schedule [current object]
                
            }

        }



        ## IncTime is a list of times
        ## The next time, will always be the current one on the list
        :every : ::odfi::dev::hw::h2dl::Logic  incTime  {

            ## The index of the incTime to use
            +var currentIncTime 0

            ## Time of first activation
            +var first 0

            +exportTo ::odfi::dev::hw::h2dl::Module sim
            +mixin    Schedulable

            +method schedule {simulator currentTime} {
                
                if {${:first}>0} {
                    set targetTime ${:first}
                    set :first 0
                } else {
                    set targetTime [expr $currentTime + ${:incTime}]
                }

                #puts "Scheduling every at $targetTime "
                set :nextTime $targetTime

                $simulator schedule [current object]
                #set targetTime [${:first}!= 0 ? ${:first} : ]

            }

            +method run {simulator currentTime} {
                #puts "Running Every at $currentTime"

                [:shade odfi::dev::hw::h2dl::sim2::Schedulable children] foreach {
                    #puts "---> Found schedulable [$it info class]"
                    $it schedule $simulator ${:currentTime}
                }

                ## Reschedule 
                :schedule $simulator $currentTime
            }
            
        }

        :at : ::odfi::dev::hw::h2dl::Logic  absoluteTime {

             +mixin   Schedulable
             +exportTo ::odfi::dev::hw::h2dl::Module sim

             +method schedule {simulator currentTime} {
                
                #puts "Scheduling every at $targetTime "
                set :nextTime ${:absoluteTime}

                $simulator schedule [current object]
                #set targetTime [${:first}!= 0 ? ${:first} : ]

            }

            +method run {simulator currentTime} {
                #puts "Running Every at $currentTime"

                [:shade odfi::dev::hw::h2dl::sim2::Schedulable children] foreach {
                    #puts "---> Found schedulable [$it info class]"
                    $it schedule $simulator ${:currentTime}
                }

            }

            ## Stop Node 
            :stop  when {

                +mixin  ImmediateSchedulable
                
                +method run {simulator currentTime} {

                    puts "*********************************** STOP"
                    $simulator stop

                    
                }
                
            }


        }




    }
    SIM produceNX


    ####################################################################################
    ## Value Probing and set 
    #####################################################################################


    ## SimValue is just a holder node to store simulation values 
    nx::Class create SimulationValue -superclass odfi::flextree::FlexNode {

        :mixins add ::odfi::dev::hw::h2dl::sim::vcd::VCDDumpValue
        
        :property value:required

        :property {forcedValue 0}
        :property {useForcedValue false}

        :method init args {

            #:value valuecmd TEST
            :registerEventPoint valueChanged
            next 
        }

        ## If in forced mode, don't update (has been during set forced)
        :public method setValue val  {

            if {!${:useForcedValue}} {
                set :value $val 
                :callValueChanged $val
            }
            
        }

        :public method getValue args {
            if {${:useForcedValue}} {
                return ${:forcedValue}
            } else {
                return ${:value}
            }
            
        }

        :public method getHexValue args {

            set v [:getValue]

            return "[format %x $v]"
            
        }

        :public method setForcedValue val {
            set :forcedValue $val
            :setValue $val
            set :useForcedValue true
        }

        :public method unForceValue args {
            set :useForcedValue false
        }
    }

    ## Language element for elements containing values to be dumpable
    ## This is a Type marker
    nx::Class create SimulationDumpable {


    }

    ::odfi::dev::hw::h2dl::Signal public method sim:probe args {
        [current object] object mixins add ::odfi::dev::hw::h2dl::sim2::SimulationDumpable
    }

    #############################
    ## Simulation Value Interface support 
    ###########################################

    set targetClasses {::odfi::dev::hw::h2dl::Register ::odfi::dev::hw::h2dl::Bit ::odfi::dev::hw::h2dl::IO ::odfi::dev::hw::h2dl::ast::ASTNode}
    nx::Class create SimulationValueSupport {

        ## Adds a value node to the target. Calls set sim value if none present
        :public method sim:addValue  {value } {

            if {[[:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue children] size]==0} {
                return [:sim:setValue $value ]
            } else {
                set valueNodes [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $value]
                :addChild $valueNodes

                return $valueNodes

            }

            
        }

        :public method sim:setUpdateValue  {value {-now false} {-forced false} } {

            ## Get update value 
            set v [:sim:getUpdateValue]
            $v setValue $value
         }

         ## Utility Method to set a value on a signal node 
         ##  1. Update existing value node, or add a new one
         ##  @param -now if set to true, updates all the value nodes to make sure non blocking assignments are overriden
         :public method sim:setValue  {value {-now false} {-forced false} } {

            next 
            
            #puts "in parent set Value"
            ## Take all value nodes, or just the last one 
            set valueNodes [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue children]


            ## If no value, create one 
            ## Otherwise update, all or just the last one 
            if {[$valueNodes size]==0} {

                set valueNodes [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $value]
                :addChild $valueNodes

                return $valueNodes

            } else {

                 set toReturn [$valueNodes at 0]
                if {!$now} {
                   
                    set valueNodes [$valueNodes at end]
                    
                } else {
                    
                    set valueNodes [$valueNodes asTCLList]
                    
                }

                ## Update 
                foreach node $valueNodes {
                    if {$forced} {
                        $node setForcedValue $value
                    } else {
                        $node setValue $value
                    }
                    
                }

                return $toReturn
            
            }  

         }


        :public method sim:unForceValues args {
            set valueNodes [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue children]
            $valueNodes foreach {
                #puts "node: [$it info lookup methods]"
                $it unForceValue
            }
         }

        ## Merges the right most value with the left most: Take right most value, delete all but first, set value
        :public method sim:mergeValues args {

            
            set firstValue [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue  child 0] 
            set lastValue  [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue  child end] 

            #puts "merging values of [:info class] $firstValue $lastValue "

            if {$firstValue!=$lastValue} {
                
                ## Only do something if more than one value 

                :sim:setValue [$lastValue getValue] -now true -force true

                
                [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue children] foreachFrom 1 {
                    $it detach 
                    $it destroy
                }

            } 
        }

         ## Return the actual value, means the left most node
         ## If no Value available, returns an empty string
         :public method sim:getValue args {

            set v [next]
            if {$v!="" && [$v isClass ::odfi::dev::hw::h2dl::sim2::SimulationValue]} {
                return $v
            }
            set valueNodes [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue children]
            if {[$valueNodes size] > 0} {
                return [$valueNodes at 0]
            } else {
                return ""
            }

            next

         }

         :public method sim:updateValue args {
            return [:sim:getValue]
         }

         ## Return the value to use for update, which is the right most one
         ## If only one value available, create a new one
         :public method sim:getUpdateValue args {

            set firstValue [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue  child 0] 
            set lastValue  [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue  child end] 
            if {$firstValue!=$lastValue} {
                return $lastValue
            } elseif {$firstValue=="" && $lastValue==""} {

                return [:sim:setValue 0]

            } else {
                return [:sim:addValue [$firstValue getValue]]

            }


         }

        :public method sim:onValueUpdate listenClosure {


            set listenClosure [odfi::richstream::embeddedTclFromStringToString $listenClosure]
            set code [odfi::richstream::embeddedTclFromStringToString {

                #puts "CHILD ADDED, DUMP SIGNAL [:name get]"
                
                ## Get Child and filter if it is a value 
                ##  - If it is the first and only value, listen on the value, and run code 
                ##  - If not , do nothing

                set child [:child end]
                if {[::odfi::common::isClass $child ::odfi::dev::hw::h2dl::sim2::SimulationValue]} {

                    set lastValueChild [:shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child end]

                    ## Go listen on value otherwise ignore
                    if {$child == $lastValueChild} {

                        ## Listen on value 
                        ##################
                        $child onValueChanged {

                            <% return $listenClosure %>
                        }

                        ## Execute closure 
                        ####################
                        $child callValueChanged
                        #%%listenClosure%%


                    }
                    

                    ## get VCD Scope from parent list
                    
                }

            }]

            ## Insert Listen Closure inside current node 
            #puts "Listen Closure is now: $code"
            :onChildAdded $code

            ## If there is already a left most value, listen onto this one already
            set actualValue [:sim:getValue]
            if {$actualValue!=""} {
                $actualValue onValueChanged $listenClosure
            }
         }


    }
    foreach targetClass $targetClasses {


        $targetClass mixins add SimulationValueSupport


     }
     ## EOF value update support

    ######################################################
    ## Bit Value Update Support 
    ##  - Idea: Overwrite the getValue and Update Value methods to read/change bits from parent value
    ######################################################
    ::odfi::dev::hw::h2dl::Bit public method sim:getValue args {
        

        #puts "In Bit get value"
        ## Value Must be present in parents  which is the main value holder 
        set parentValue [:parent sim:getValue]

        if {$parentValue==""} {
            error "Get Bit value at index ${:index} of parent [:parent name get], no value"
        }
        #puts "In Bit getValue: $parentValue"

        ## Create new bit value 
        set bitValue [expr ([$parentValue getValue] >> ${:index}) & 0x1]

        ## Return 
        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $bitValue]

        ## Set value 
        #:sim:setValue $bitValue
        #return [:sim:getValue]

     }

     ::odfi::dev::hw::h2dl::Bit public method sim:setValue {value {-now false} {-forced false} } {

         

        #puts "Setting value $value on Bit"
        #return next

        ## Value Must be present in parents  which is the main value holder 
        set currentValue [:parent sim:getValue]
        set parent [:parent]

        ## Update from to 
        set fromBitRange 0
        set toBitRange   ${:index}
        set newvalue  $value
 

        ## Bit Range is 
        ##   - fromBitRange or 0 
        ##   - toBitRange or size or left value
        set fromBitRange [expr ${fromBitRange}>  0  ? ${fromBitRange} : 0]
        set toBitRange   [expr ${toBitRange}  >= 0  ? ${toBitRange}   : [expr [$parent width get] -1]]

        ## Prepare Value from bit ranges: Extract and replace to correct targetPosition
        set extractedValue $newvalue
        #puts "----- value from operator is $extractedValue , extracting from ${fromBitRange} to ${toBitRange}"
        
        #set extractedValue [expr ($extractedValue >> $fromBitRange) & ~(1<< (${toBitRange}+1))]
      
       # puts "----- after extraction $extractedValue"

        # If no actual value, no need to extract and all
        set targetFinalValue $extractedValue
        if {$currentValue!=""} {
           set targetFinalValue [$currentValue getValue]
            
        } 

        if {$value==0} {
            set targetFinalValue [expr [$currentValue getValue] & ~( 1 << ${toBitRange})]
        } else {
            set targetFinalValue [expr [$currentValue getValue] | ( 1 << ${toBitRange} )]
        }
        #set targetFinalValue [expr  $targetFinalValue | ($targetFinalValue & ~( $extractedValue << ${toBitRange} ) | ($extractedValue << ${toBitRange}) ) ]

        #if {$fromBitRange == 0} {
        #    set targetFinalValue $extractedValue
        #} else {
        #    set targetFinalValue [expr  $targetFinalValue | ($targetFinalValue & ~( $extractedValue << ${toBitRange} ) | ($extractedValue << ${toBitRange}) ) ]
        #}

        #puts "Res: $targetFinalValue"

        $currentValue setValue $targetFinalValue

        #$parentValue setValue [expr  [$parentValue getValue] | ([$parentValue getValue] & ( $newvalue << ${fromIndex} ) | ($newvalue << ${fromIndex}) ) ]


        #:sim:setValue [expr  [$parentValue getValue] | ([$parentValue getValue] & ( $newvalue << ${fromIndex} ) | ($newvalue << ${fromIndex}) ) ]

     }


    ######################################################
    ## AST Blocking Update support
    ######################################################

    
    ## Blocking Update is schedulable, and immediate schedule
    ## Schedule Run is meant to Perform the update 
    ################################# 
    odfi::dev::hw::h2dl::ast::ASTBlockingAssign mixins add ImmediateSchedulable
    odfi::dev::hw::h2dl::ast::ASTBlockingAssign public method run {simulator currentTime} {

        #puts "Performing NB Update on [:child 0]"
        set targetAssignee [:child 0]
        set expression     [:child 1]

        #[$targetAssignee name get]
        #puts "Blocking Updating Value for [$targetAssignee info class] "

        ## Get Expression Value 
        #set newValue [$expression sim:getUpdateValue]
        set newValue [$expression sim:updateValue]

        #puts "Blocking Updating Value for [$targetAssignee info class] [$targetAssignee name get] -> [$newValue getValue]"

        $targetAssignee sim:setValue [$newValue getValue]
        #$targetAssignee sim:mergeValues

        return 

    }


    ## Add Support for immediate value update to = 
    ##########
    nx::Class create BlockingUpdateSimSupport {

        odfi::dev::hw::h2dl::ValueHolder mixins add BlockingUpdateSimSupport

        ## Let normal work, and look for updatable values on the expression side 
        :public method = args {


            set astNode [next]

            return $astNode

            set expressionNode [$astNode child end]
            set leftSide [$astNode child 0]

            ## Value Update, do it event based 
            ######################
            ${expressionNode} shade ::odfi::dev::hw::h2dl::Register walkBreadthFirst {

                set reg $node           

                ## If Assignee is same as on the right, don't listen to avoid loops
                if {$reg!=$leftSide} {

                    #puts "Listening on [$reg name get]"
                    $reg sim:onValueUpdate {


                        set assignNode      <% return $astNode %>
                        set expression       [$assignNode child 1]
                        set signalNode      [$assignNode child 0]
                        set value [current object]

                        #puts "Updated   [$signalNode name get]"

                        ## Update value
                        set resValueNode [$expression sim:updateValue]
                        if {$resValueNode!=""} {
                             set resValue [$resValueNode getValue]

                            ## Assign
                            #puts " %%%%%%%%%%%%%%%%%%%%%%%%%% Updating [$signalNode name get]" 
                            $signalNode sim:setValue $resValue -now true 
                        }
                       

                    }
                }
                

            }

            return $astNode


        }
    }

    ######################################################
    ## AST Non Blocking Update support
    ######################################################

    
    ## Non  Blocking Update is schedulable, and immediate schedule
    ## Schedule Run is meant to Perform the update of the values on the right side of the expressions 
    ################################# 
    odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign mixins add ImmediateSchedulable
    odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign public method run {simulator currentTime} {

        ## Procedure 
        ##  1. update the value using existing one on the right side
        ##  2. Set value to the assignee at the end of the phase
        set targetAssignee [:child 0]
        set expression     [:child 1]

        #[$targetAssignee name get]
        #puts "ASTNonBlockingAssign Updating Value for [$targetAssignee info class] and expression [$expression info class] "

        ## Get Expression Value 
        #set newValue [$expression sim:getUpdateValue]
        set newValue [$expression sim:updateValue]

        #puts "----> $newValue"
        $simulator scheduleClosure $currentTime {
            set target <% return $targetAssignee %> 
            #puts "Merging Non blocking value on [$target info class]"
            <% return $targetAssignee %> sim:setValue <% return [$newValue getValue] %> 
        }



    }

    ## Posedge Support 
    ############################
    odfi::dev::hw::h2dl::Posedge mixins add Schedulable
    odfi::dev::hw::h2dl::Posedge public method run {simulator currentTime} {
        puts "Posedge is running"

        [:shade odfi::dev::hw::h2dl::sim2::Schedulable children] foreach {
                    #puts "---> Found schedulable [$it info class]"
                    $it schedule $simulator ${:currentTime}
        }
        #next
    }
    odfi::dev::hw::h2dl::Posedge public method +build args {


        puts "********* BUILDING Posedge with simulation interface: [[:signal get] info class]  ****************"



        ## Lookout for Signal changing its value
        set signal [:signal get]
        :addChild $signal
        $signal sim:onValueUpdate {

            if {[:getValue]==1} {
                set signal [:parent]
                set posedge [[$signal parents get] find { odfi::common::isClass $it odfi::dev::hw::h2dl::Posedge} ]
                puts "********* Activating Posedge for immediate schedule : [$posedge info class] ****************"
                $posedge nextTime set 0
                ${odfi::dev::hw::h2dl::sim2::currentSimulator} schedule $posedge
            }

            

        }

        return 

    }

    #########################################
    ## AST Logic Updates 
    ##  - Basic Rule: Read values using geValue, write using getUpdateValue
    ###########################################

    proc valueUpdaterBuilder {forClass updaterBody} {

        nx::Class create ${forClass}SimValueUpdater {
            upvar updaterBody updaterBody
            :public method updateValue args $updaterBody

        }

        $forClass domain-mixins add ${forClass}SimValueUpdater -prefix sim
    }

    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTConstant {
        return [:sim:getValue]
    }
    ::odfi::dev::hw::h2dl::ast::ASTConstant method init args {
        next 
        :sim:setValue ${:constant}
    }
    
    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTNegate {

        

        set valueSource [:child 0]

        ## Get Value 
        #################
        set value [$valueSource sim:getValue]

        ## Create New Value 
        #########################
        if {[$valueSource width get]==1} {
            set negated [expr !int([$value getValue])]
        } else {
            set negated [expr ~int([$value getValue])]
        }

        ## Store 
        ##################
        #:sim:setUpdateValue $negated

        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $negated]
        
       
    }


     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTAdd {

        #puts "In ADD Update "

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]
        #catch {$left sim:updateValue}
        #catch {$right sim:updateValue}


        ## Value Objects
        set valLeft  [$left  sim:getValue]
        set valRight [$right sim:updateValue]

        puts "Left is [$left info class] -> $valLeft"

        ## Get real values or 0 if no available
        set vl [expr {$valLeft == ""} ? 0 : [$valLeft getValue]]
        set vr [expr {$valRight == ""} ? 0 : [$valRight getValue]]


        puts "-- in add $valLeft $valRight"
        set resVal [expr $vl + $vr]

        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $resVal]



        ## Value Objects
        set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]
        set valRight [$right shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]

        ## Get real values or 0 if no available
        set vl [expr {$valLeft == ""} ? 0 : [$valLeft getValue]]
        set vr [expr {$valRight == ""} ? 0 : [$valRight getValue]]


        puts "-- in add $valLeft $valRight"
        set resVal [expr $vl + $vr]

        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $resVal]

     }

     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTAnd {

        #

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]

        #puts "In ADD Update $left ([$left info class]), $right ([$right info class])"

        ## Left and Right could be operators
        if {[odfi::common::isClass $left ::odfi::dev::hw::h2dl::ast::ASTOperator]} {
            set valLeft [$left sim:updateValue]
        } else {
            set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]
        }
        if {[odfi::common::isClass $right ::odfi::dev::hw::h2dl::ast::ASTOperator]} {
            set valRight [$right sim:updateValue]
        } else {
            #puts "------ fetchign val right from simulation value node: [$right shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0] "
            set valRight  [$right shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]
        }

        #catch {$left sim:updateValue}
        #catch {$right sim:updateValue}

        ## Value left 
        #puts "--> Values ($valLeft) <-> ($valRight)"

        #set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]
        #set valRight [$right shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]

        if {$valLeft == "" || $valRight == ""} {
            return ""
        }

        set resVal [expr [$valLeft getValue] & [$valRight getValue]]

        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $resVal]

     }

     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTBitOr {

        #puts "In ADD Update "

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]
        catch {$left sim:updateValue}
        catch {$right sim:updateValue}

        ## Value left 

        set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]
        set valRight [$right shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]

        if {$valLeft == "" || $valRight == ""} {
            return ""
        }

        set resVal [expr [$valLeft getValue] | [$valRight getValue]]

        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $resVal]

     }


     valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTCompare {

        ## Left and right values 
        set left [:child 0]
        set right [:child 1]
        catch {$left sim:updateValue}
        catch {$right sim:updateValue}

        ## Value left 

        set valLeft  [$left shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]
        set valRight [$right shade ::odfi::dev::hw::h2dl::sim2::SimulationValue child 0]

        if {$valLeft == "" || $valRight == ""} {
            return 0
        }

        set resVal [expr [$valLeft getValue] == [$valRight getValue]]

        return [::odfi::dev::hw::h2dl::sim2::SimulationValue new -value $resVal]

     }

     ###############################################
     ## Reset Stuff 
     ###############################################
     ::odfi::dev::hw::h2dl::Reset +builder {

        puts "(SIM) Building Reset Handler son $expr [$expr info class] -> ${:currentShading} -> [[$expr children] size]"

        :object variable -accessor public +sim_active false

        ## Idea: 
        ##   1. Listen to all changeable values in expression to update expression result when needed
        ##   2. Use the Forced Value interface to forced value during reset time

        set signal [:parent]


        ${:expr} shade ::odfi::dev::hw::h2dl::Register walkBreadthFirst {

            set reg $node 

            #puts "(SIM1) Listening on [$reg name get] for reset value"
          


            $reg sim:onValueUpdate {

                set resetExpression <% return $expr %>
                set resetNode       [$resetExpression   parent]
                set signalNode      [$resetNode         parent]
                set value [current object]

                

                ## 1. Update Simulation Value of Expression Node 
                ## 2. if 1/true, set signalNode value to 0
                set updateNow [$resetNode isAsync ? true : false]
                set resValue [[$resetExpression sim:updateValue] getValue]

                #puts "(SIM1) Value in reset expression was updated. Reset expression is: $resetExpression ([$resetExpression info class]), returned value: $resValue"

                if {$resValue} {
                    $signalNode sim:setValue 0 -now $updateNow -forced true
                    #$signalNode sim:setForcedValue 0 -now $updateNow
                    #$resetNode +sim_active set true

                     #puts "(SIM1) Forcing value of SR2 to 0"
                } else {
                    #$resetNode +sim_active set false
                    $signalNode sim:unForceValues

                    #puts "(SIM1) UnForcing value of SR2 to 0"
                }


            }

        }

     }



}
