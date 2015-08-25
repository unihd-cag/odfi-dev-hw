
package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::verilog 2.0.0


puts "Test: [lsearch -all -inline -glob [lsort [nx::Class info instances]] *odfi::dev::hw::h2dl*]"
## Language Definition For Module Definitions
############
namespace eval mytest {


    ## Wrapper to produce language in a more friendly way
    ::odfi::dev::hw::h2dl::ModuleDefinition LFSR {width 8} {

        ##+builder $closure
        :input clk


    }


}

## Language Usage for Instantiation
###################
puts "LFSR Parameters: [::mytest::LFSR info slots]"
puts "LFSR Parameters: [::odfi::dev::hw::h2dl::Module info lookup methods]"

#::mytest::lfsr top -width 32 {
#    puts "LFSR width: ${:width}"
#}  


::odfi::dev::hw::h2dl::module top {

    :mytest:LFSR l1 -width 85 {
        puts "LFSR width: ${:width}"
    }

}
