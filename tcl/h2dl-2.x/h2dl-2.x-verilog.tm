package provide odfi::dev::hw::h2dl::verilog 2.0.0
package require odfi::dev::hw::h2dl 2.0.0

package require odfi::richstream 3.0.0


namespace eval odfi::dev::hw::h2dl::verilog {

    nx::Trait create VerilogTag {

    }

    nx::Class create VerilogGen {

        :variable outputFolder "."

        :public method outputFolder f {
            set :outputFolder [file normalize $f] 
            file mkdir $f
        }

        :public method produce args {

            ## Tag All Verilog supported stuff
            ###########
            odfi::dev::hw::h2dl::Module mixins add VerilogTag
            odfi::dev::hw::h2dl::Posedge mixins add VerilogTag
            odfi::dev::hw::h2dl::Register mixins add VerilogTag
            
            odfi::dev::hw::h2dl::Match mixins add VerilogTag

            ## Start Producing
            #######################
            odfi::log::info "Start Producing verilog to ${:outputFolder} on object [:info class] ->  ${:name}"

            ## List of created files 
            set filesList {}

            set res [:shade odfi::dev::hw::h2dl::verilog::VerilogTag reduce2 {

                if {[::odfi::common::isClass $node ::odfi::dev::hw::h2dl::Module]} {

                    odfi::log::info "Producing verilog for Module [$node info class], with Model Name [$node getModelInstanceName]"  

                    ## Write Out Module Definition
                    ####################

                    ## Prepare file and stream 
                    set targetFile ${:outputFolder}/[$node getModelInstanceName].v
                    lappend filesList $targetFile

                    set out [::new odfi::richstream::RichStream #auto]
                    set instanceOut [::new odfi::richstream::RichStream #auto]


                    #### Begin Module 
                    $out << "module [$node getModelInstanceName] ("

                    $instanceOut << "[$node getModelInstanceName] [$node name get] ("

                    #### IO 
                    set ios {}
                    set instanceConnections {}
                    [[$node noShade children] filter { return [odfi::common::isClass $it ::odfi::dev::hw::h2dl::IO] }] foreach {
                        child => 

                         
                            if {[$child info class]=="::odfi::dev::hw::h2dl::Input"} {
                                lappend ios "    input [$child type get] [$child name get]"
                            } elseif {[$child info class]=="::odfi::dev::hw::h2dl::Output"} {
                                lappend ios "    output [$child type get] [$child name get]"
                            }

                            ## Find Connection 
                            set conn [[$child shade ::odfi::dev::hw::h2dl::Connection children] at 0]
                            if {$conn==""} {
                                lappend  instanceConnections ".[$child name get]([join [$child connect get]])"
                            } else {
                                lappend  instanceConnections ".[$child name get]([$conn name get])"
                            }
                            #if {[odfi::common::isClass $child ::odfi::dev::hw::h2dl::IO]} {
                                ## Instantiation
                                #puts "In connection for [$child name get]([$child info object slots]) "
                                
                            #}
                            
                    }
                    $out << "[join $ios ,\n]);"
                    $out << ""
                    $out << ""

                    $instanceOut << "[join $instanceConnections ,\n]"
                    

                    #### End Module
                    $out <<  [join $args]
                    $out << "endmodule;"

                    $instanceOut << ");"

                    #### Write to file
                    $out toFile $targetFile

                    ## Return Instantiation Model 
                    #####################
       
                    # Return 
                    return [$instanceOut toString]


                }

               

            }]

            ## Write F File out 
            ##########################
            odfi::files::writeToFile ${:outputFolder}/netlist.f [join $filesList \n]


            return $res

            
            
            #odfi::dev::hw::h2dl::Input mixins add VerilogTag
            #odfi::dev::hw::h2dl::Output mixins add VerilogTag
            puts "In Verilog Producer on [:info class] ${:name}"

            set res [:shade odfi::dev::hw::h2dl::verilog::VerilogTag reduce2 {

                puts "in reduce function for [$node info class] "

                ## Produce tabbing using tree depth
                #set tabs [string map {- "\t"} [join [lrepeat [$node getTreeDepth] "\t"] "" ]]
                #set tabs [join [lrepeat [$node getTreeDepth] \t] "" ]
                set tabs [join [lrepeat [$node getTreeDepth] "    " ] "" ]
                #::puts "TABS: sepby${tabs}tab"
                
                switch -exact -- [$node info class] {

                    ::odfi::dev::hw::h2dl::Module {
                        
                        puts "Reducing node: [$node info class] -> ${:name}"
                        puts "Results so far: $args"

                        # Create Stream 
                        set out [::new odfi::richstream::RichStream #auto]

                        #### Begin Module 
                        $out << "module ${:name} ("

                        #### IO 
                        set ios {}
                        [$node noShade children] foreach {
                            child => 

                                if {[$child info class]=="::odfi::dev::hw::h2dl::Input"} {
                                    lappend ios "    input wire [$child name get]"
                                } elseif {[$child info class]=="::odfi::dev::hw::h2dl::Output"} {
                                    lappend ios "    output wire [$child name get]"
                                }
                        }
                        $out << "[join $ios ,\n]);"
                        $out << ""
                        $out << ""

                        #### End Module
                        $out <<  $args
                        $out << "endmodule;"

                        # Return 
                        return [list [$out toString]]

                    }
                    ::odfi::dev::hw::h2dl::Posedge {

                        ## Create Stream 
                        set out [::new odfi::richstream::RichStream #auto]
                        puts "Reducing posedge [$node info class] -> [$node getTreeDepth], tabs '${tabs}'"
                        $out << "${tabs}always @(posedge [[$node signal get] name get])"
                        $out << "${tabs}begin"
                        $out << $args
                        $out << "${tabs}end"

                        ## Return 
                        return [$out toString]

                    }
                    ::odfi::dev::hw::h2dl::Input {

                        puts "Reducing input [$node info class]"
                        return "input wire [$node cget -name]"
                    }
                    ::odfi::dev::hw::h2dl::Register {
                        return "register [$node cget -name];"
                    }
                    ::odfi::dev::hw::h2dl::Output {

                    }
                    ::odfi::dev::hw::h2dl::Match {

                        ## Create Stream 
                        puts "Reducing Match [$node info class]"
                        set out [::new odfi::richstream::RichStream #auto]

                        $out << "${tabs}// Reduced from Match"
                        [$node noShade children] foreach {
                            child => 

                                if {[$child info class]=="::odfi::dev::hw::h2dl::If"} {

                                    $out << "${tabs}if ([[$node signal get] name get] == [[$child] value get]) begin"
                                    $out << "${tabs}end"

                                } elseif {[$child info class]=="::odfi::dev::hw::h2dl::Else"} {

                                    $out << "${tabs}else begin"
                                    $out << "${tabs}end"

                                }
                        }
                        #puts "Reducing posedge [$node info class]"
                        #$out << "if () begin"
                    
                        #$out << "end"

                        ## Return 
                        return [$out toString]

                    }
                    default {}
                }

                
            }]

            #puts "After reduce is $res of size [llength $res]"
            #return [lindex $res 0]
            #return [join $res \n]
            return $res

        }

    }



}
