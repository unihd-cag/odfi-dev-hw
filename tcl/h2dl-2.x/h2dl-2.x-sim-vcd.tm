package provide odfi::dev::hw::h2dl::sim::vcd 2.0.0
package require  odfi::dev::hw::h2dl 2.0.0

namespace eval  odfi::dev::hw::h2dl::sim::vcd {


    ##############################
    ## Main VCD Dump File interface
    ##############################
    nx::Class create VCDDump -superclasses odfi::flextree::FlexNode {

        :property -accessor public targetFile

        :variable out 

        :variable scopes 

        :method init args {

            ## Init RichStream out 
            set :out [::new odfi::richstream::RichStream #auto]
            ${:out} streamToFile ${:targetFile}

            set :scopes {}

            next
        }

        ## Finish output 
        :public method close args {

            ${:out} close

        }

        ## Register a signal node to be in the dump file 
        ## Register the node here, and generate and object with name, signal type, identifier and so on
        :public method registerDumpSignal signal {

            

            ## Create target scope for signal 
            set hierarchyParents [$signal shade ::odfi::dev::hw::h2dl::Module getPrimaryParents]

            odfi::log::info "Register signal to dump [$signal name get], [$signal getPrimaryTreeDepth] , [$hierarchyParents size]"

            set scopeString [$hierarchyParents > map { return [$it name get] } mkString "."]

            odfi::log::info "Scope: $scopeString"

            ## Find/Create scope representation 
            set scopeLoc [lsearch -index 0 -exact ${:scopes} $scopeString]
            if {$scopeLoc==-1} {
                set scope [VCDScope new -name $scopeString]
                :addChild $scope
                lappend :scopes [list $scopeString $scope]
            } else {
                set scope [lindex [lindex ${:scopes} $scopeLoc] 1]
            }
            

            ## Add signal to scope
            $scope addSignal $signal

        }

        ####################
        ## Type 
        #####################

        ## Returns: {typeName shortType}
        :public method getTypeInfo signal {

            if {[odfi::common::isClass $signal odfi::dev::hw::h2dl::Register]} {
                return [list "reg" "b"]
            }  elseif {[odfi::common::isClass $signal odfi::dev::hw::h2dl::Analog]} {
                return [list "real" "r"]
            } else {
                return [list "wire" "b"]
            }

        }


        ######################
        ## Headers
        #######################
        :public method writeHeader args {

            odfi::log::info "Writing VCD File Header"

            ${:out} << "\$date"
            ${:out} << "[clock format [clock milliseconds]]"
            ${:out} << "\$end"

            ${:out} << "\$version"
            ${:out} << "H2DL 2.x Simulator Test"
            ${:out} << "\$end"

            ${:out} << "\$timescale 1ps \$end"
            

            ## Scopes 
            ###############
            set initVals {}
            foreach ns ${:scopes} {

                set name [lindex $ns 0]
                set scope [lindex $ns 1]

                ${:out} << "\$scope module $name \$end"

                foreach {signal id} [$scope signals get] {


                    set size [$signal width get] 
                    #set size 1

                    ## Type 
                    set typeInfo  [:getTypeInfo $signal]
                    
                    ## Value 
                    set val x 
                    #set currentValue [$signal shade ::odfi::dev::hw::h2dl::sim1::SimulationValue child 0]
                    set currentValue [$signal shade odfi::dev::hw::h2dl::sim::vcd::VCDDumpValue child 0]

                    set valString [:getValueString $signal $id $currentValue]
                    
                    if {$currentValue!=""} {
                        set val [$currentValue getValue]
                    }

                    ${:out} << "\$var [lindex $typeInfo 0] $size [string map {\\ {}} $id] [$signal name get] \$end"
                    #lappend initVals $id [lindex $typeInfo 1][join [lrepeat $size $val] ""]
                    lappend initVals $valString

                }

                ${:out} << "\$upscope \$end"    
            }

            ## EOF Defs 
            ${:out} << "\$enddefinitions \$end"   

            ## Init vals 
            ${:out} << "\$dumpvars"   
            #foreach {id val} $initVals {
            #    ${:out} << "$val [string map {\\ {}} $id] "   
#

            #}
            foreach str $initVals {
                ${:out} << "$str"
            }

            ${:out} << "\$end"   

        }

        #######################
        ## Dumping 
        #######################

        ## Set new time
        :public method time t {
            ${:out} << "#$t"  
        }
        :public  method getValueString {signal id value} {

            ## 
            set size        [$signal width get] 
            set typeInfo    [:getTypeInfo $signal]

            ## Limit precision  of value 
            if {$value ==""} {
                set finalVal "x"
                ::repeat $size {
                    #puts "Value of [$signal name get] bit $i -> [expr ( $value >> $i ) & 0x1] from $value"
                    set finalVal "x"
                }
                return "[lindex $typeInfo 1]$finalVal [string map {\\ {}} $id]"
            } else {
                set value [$value getValue]
            }
            
            
            
            if {[lindex $typeInfo 1]=="r"} {

                return "[lindex $typeInfo 1]$value [string map {\\ {}} $id] "

            } else {

                ## Convert value to bits and pad left to size
                set finalVal ""
                ::repeat $size {
                    #puts "Value of [$signal name get] bit $i -> [expr ( $value >> $i ) & 0x1] from $value"
                    set finalVal "[expr ( $value >> $i ) & 0x1]$finalVal"
                }
                return "b$finalVal [string map {\\ {}} $id] "


            }

        }

        :public method value {signal id value} {

            ${:out} << [:getValueString $signal $id $value]
            return
            ## Limit precision of value 
            
            set typeInfo    [:getTypeInfo $signal]
            set size        [$signal width get] 
            if {[lindex $typeInfo 1]=="r"} {

                ${:out} << "[lindex $typeInfo 1]$value [string map {\\ {}} $id] "

            } else {

                ## Convert value to bits and pad left to size
                set finalVal ""
                ::repeat $size {
                    #puts "Value of [$signal name get] bit $i -> [expr ( $value >> $i ) & 0x1] from $value"
                    set finalVal "[expr ( $value >> $i ) & 0x1]$finalVal"
                }
                ${:out} << "b$finalVal [string map {\\ {}} $id] "


            }
        }

    }


    nx::Class create VCDScope -superclasses odfi::flextree::FlexNode {

        :property -accessor public name:required

        ## FORMAT: SIGNAL ID SIGNAL ID
        :variable -accessor public signals 

        ## Code from 33 to 126 in decimal
        :variable currentIdentifierCode
        :variable currentBaseIdentifier ""

        :method init args {

            ## Init current identifier
            set :signals {} 
            set :currentIdentifierCode 33
            set :currentBaseIdentifier ""
            next 
        }

        :public method getSignalIdentifier signal {

            set signalDumpIndex [lsearch ${:signals} $signal]
            if {$signalDumpIndex==-1} {
                error "No Signal Identifier for signal $signal, not registered under this scope"
            }
            set signalId [lindex ${:signals} [expr $signalDumpIndex+1]]

            #puts "Found for $signal -> $signalId"
            
            return $signalId
        }

        :public method addSignal signal {

            ## 42 is " char, so we need to extra escape that
            #if {${:currentIdentifierCode}>=60 && ${:currentIdentifierCode} <= 71 }
            #    set id [subst "${:currentBaseIdentifier}[expr ${:currentIdentifierCode}-60"]
            if {${:currentIdentifierCode}==34} {
                #incr :currentIdentifierCode
                set id [subst "${:currentBaseIdentifier}\\\\[format %c ${:currentIdentifierCode}]"]
            } else {
                set id [subst "${:currentBaseIdentifier}[format %c ${:currentIdentifierCode}]"]
            }
            

            lappend :signals $signal $id
            :addChild $signal

            odfi::log::info "Added signal [$signal name get] with id $id"

            ## Increment 
            incr :currentIdentifierCode
            #set :currentIdentifierCode [expr ${:currentIdentifierCode} + 01]
            #if {${:currentIdentifierCode}>176}

            ## Monitor value change on signal 
            $signal sim:onValueUpdate {

                #puts "Value updated on: [:info class] -> [:getValue]"

                set signal [:parent]
                set scope [[$signal parents get] find { odfi::common::isClass $it ::odfi::dev::hw::h2dl::sim::vcd::VCDScope} ]
                set signalId [$scope getSignalIdentifier $signal]
                [$scope parent] value $signal $signalId [current object]
            }


            return 
            

        }
    }

    ## Virtual Interface for any object to be a VCDDumpValue for a particular node 
    ## The Dump Value is added to the target node, which is registered as dumpable
    ## It must provide a get/setValue and a valueChanged event point
    nx::Class create VCDDumpValue  {

        #:property value:required

        

        #:method init args {

            #:value valuecmd TEST
        #    :registerEventPoint valueChanged
        #    next 
        #}

        #:public method setValue val  {
        #    set :value $val 
            #:callValueChanged $val
       # }

        #:public method getValue args {
        #    return ${:value}
        #}

    }


}
