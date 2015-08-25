
package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::verilog 2.0.0


puts "Test: [lsearch -all -inline -glob [lsort [nx::Class info instances]] *odfi::dev::hw::h2dl*]"
## Language Definition For Module Definitions
############
namespace eval mytest {

    odfi::language::Language2 define MY {

       

        :Counter : ::odfi::dev::hw::h2dl::Module {name} {
            +var size 8

            ## Export to parent will add a builder to the parent type
            +exportToParent

            +builder {

                :input start {

                }
                :output value {
                    :size set ${:size}
                }

            }
            
        }

    }

    MY produceNX

    ## Wrapper to produce language in a more friendly way
    ::odfi::dev::hw::h2dl::ModuleDefinition {LFSR {width 8}} {




    }


}

## Language Usage for Instantiation
###################

odfi::dev::hw::h2dl::module top {

    puts "Inside C"
    :mytest:counter first -size 16  {
        puts "Actual Size: ${:size}"
    }

    :mytest:counter second -size 24  {
        puts "Actual Size: ${:size}"
    }

}


