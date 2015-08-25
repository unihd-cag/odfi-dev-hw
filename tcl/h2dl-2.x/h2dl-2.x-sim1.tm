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

                odfi::log::info "Iteration time ${:currentTime}"

                $vcd time ${:currentTime}

                ## Walk the tree in depth first order
                ## On Simulation Active nodes:
                ##  - Ignore if not active 
                ##  - record next active time if declared active
                set processNodeClosure {
                    

                    ## Global Stop 
                    if {${:stop}} {
                       return false
                    }

                    ## Normal Processing 
                    set continue false

                    if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationActive]} {

                        set continue false

                        ## Check active heuristic 
                        if {[$node isActive ${:currentTime}]} {

                            odfi::log::info "(TIME: ${:currentTime}) node [$node info class] is active"
                            $node lastActiveTime ${:currentTime}


                            ## Simulation Value Update : Update and don't go further in tree
                            #################################
                            if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationValueUpdater]} {

                                $node sim:updateValue 

                                
                            } else {
                                set continue true
                            }

                            ## Call Interact 
                            #######################
                            $node interact

                            
                        } 


                        ## Update next time for node, only if not disabled
                        if {![$node disable get] || [$node isActive ${:currentTime}]} {
                            set nextTimeForcompoent  [$node nextActiveTime]
                            set nextTime [expr ($nextTimeForcompoent>0) && ($nextTimeForcompoent < $nextTime || $nextTime==${:currentTime} ) ? $nextTimeForcompoent : $nextTime]
                        } else {
                            set continue false
                        }
                        
                        #odfi::log::info "Set next time to ${nextTime}"

                        

        


                    } else {
                         set continue true
                    }


                    ## Process all Immediate schedules
                    ###########
                    # odfi::log::info "---- Event Schedules --------"
                    # ${:immediateSchedule} popAll {

                    #     node =>

                    #     ## update active time and value 
                    #     $node lastActiveTime ${:currentTime}
                    #     if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::sim1::SimulationValueUpdater]} {

                    #         $node sim:updateValue 

                                
                    #     }   

                    #     ## Request next time 
                    #     set nextTimeForcompoent  [$node nextActiveTime]
                    #     set nextTime [expr ($nextTimeForcompoent>0) && ($nextTimeForcompoent < $nextTime || $nextTime==${:currentTime} ) ? $nextTimeForcompoent : $nextTime]

                    #     ## Stop 
                    #     if {${:stop}} {
                    #         break
                    #     }
                    # }
                    # odfi::log::info "---- EOF Event Schedules --------"


                    return $continue
                }

                ## Run on Top 
                $baseNode walkDepthFirstPreorder $processNodeClosure

                ## Run Immediate Stuff
                odfi::log::info "---- Event Schedules --------"
                ${:immediateSchedule} popAll {

                    node =>
                        $node walkDepthFirstPreorder $processNodeClosure

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
                odfi::log::info "---- EOF Event Schedules --------"

                odfi::log::info "Set next time to ${nextTime} with current ${:currentTime} (immediate left: [${:immediateSchedule} size])"

                ## Stop condition 
                if {${nextTime}<=${:currentTime}} {
                    :stop
                }
            }
            ## EOF TIME LOOP

        }

    }


   

    #################################
    ## base Traits used by Simulation Package 
    ## used for simulator run, or integration with main H2Dl Language 
    ################################
    nx::Class create SimulationActive {
        
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
            if {[::odfi::common::isClass $child ::odfi::dev::hw::h2dl::sim1::SimulationValue]} {

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


        next 
    }

     #########################
    ## Language Definition for Simulation language 
    #################################


    odfi::language::Language2 define SIM {

        :every : ::odfi::dev::hw::h2dl::Logic  incTime  {

            +exportTo ::odfi::dev::hw::h2dl::Module sim
            +mixin   SimulationActive

            +method nextActiveTime args {
                return [expr ${:incTime}+${:lastActiveTime}]
            }

            +method isActive time {
                #puts "Checking isActive at time $time agains [:nextActiveTime] "
                if {$time == [expr ${:incTime}+${:lastActiveTime}]} {
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


    }
    SIM produceNX

    ## This Trait is added to the nodes that can update a value 
    ## Ex: <= or = 
    nx::Class create SimulationValueUpdater -superclass  SimulationAlwaysActive {

        ::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign mixins add SimulationValueUpdater

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




    ## Update Non blocking assignment
    ###################################


    valueUpdaterBuilder ::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign {

        set targetAssignee [:child 0]
        set expression     [:child 1]
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
                $currentValue setValue [$newValue getValue]
            } else {

                ## Make sure newvalue is also orphan before adding, to avoid weird stuff
                $newValue detach
                $targetAssignee addChild $newValue

            }

            

        }

        ## Debug: 
        ## Current value 
        set currentValue [$targetAssignee shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
        puts "Current value of node  [$targetAssignee name get] [$currentValue getValue]"

        

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

        #puts "Updating Negate base value: $value ([$value info class]), for parent of type [$valueSource info class] ([[$value parent] info class])"
        #[$value parents] foreach {
        #    puts "--> Parent of SimulationValue: [$it info class]"
        #}

        $value setValue [expr ![$value getValue]]

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


}
