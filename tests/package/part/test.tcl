#!/usr/bin/env tclsh8.5

package require odfi::dev::hw::package 1.0.0


# Attribute function Implementation
#################
# proc output args {
# 	
# 	uplevel 1 addAttribute "output" 1
# 
# }
# 
# proc input args {
#         
#         uplevel 1 addAttribute "output" 1
# 
# }
# 
# proc differential args {
#         
#         uplevel 1 addAttribute "output" 1
# 
# }
# 
# proc group args {
#         
#         uplevel 1 addAttribute "output" $args
# 
# }
# 
# proc reference_voltage args {
#         
#         uplevel 1 addAttribute "reference_voltage" 1
# 
# }
# 
# proc termination_voltage args {
#         
#         uplevel 1 addAttribute "termination_voltage" 1
# 
# }
# 
# proc power args {
#         
#         uplevel 1 addAttribute "power" 1
# 
# }

# User attribute definition
##############
#odfi::dev::hw::package::attributeFunction ::output
#odfi::dev::hw::package::attributeFunction ::differential
#odfi::dev::hw::package::attributeFunction ::input
#odfi::dev::hw::package::attributeFunction ::group
#odfi::dev::hw::package::attributeFunction ::reference_voltage
#odfi::dev::hw::package::attributeFunction ::termination_voltage
#odfi::dev::hw::package::attributeFunction ::power

#test:
###########

odfi::dev::hw::package::part micrel_sy8932u {
        #package qfn33_16
        
        pin { Q0_p @15 } \
        {
                output
                differential
                group out0
        }
        pin { Q0_n @16 } \
        {
                output
                differential
                group out0
        }
        pin { Q1_p @1 } \
        {
                output
                differential
                group out1
        }
        pin { Q1_n @2 } \
        {
                output
                differential
                group out1
        }
        pin { Q2_p @3 } \
        {
                output
                differential
                group out2
        }
        pin { Q2_n @4 } \
        {
                output
                differential
                group out2
        }
        pin { Q3_p @5 } \
        {
                output
                differential
                group out3
        }
        pin { Q3_n @6 } \
        {
                output
                differential
                group out3
        }
        pin { EN @8 } \
        {
                input
        }
        pin { IN_p @9 } \
        {
                input
                differential
                group in0
        }
        pin { IN_n @12 } \
        {
                input
                differential
                group in0
        }
        pin { VREF_AC @10 } \
        {
                output
                reference_voltage
        }
        pin { VT @11 } \
        {
                input
                termination_voltage
        }
        pin { GND @13 } \
        {
                power
        }
        foreach pinloc { 7 14 } \
        {
                pin VCC \
                {
                        location $pinloc
                        power
                }
        }
        
        #interchangeable { out0, out1, out2, out3}
        packageInfo
}




