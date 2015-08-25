package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::verilog 2.0.0

## test language creation
#####################
namespace eval odfi::dev::hw::h2dl {
    
    
    odfi::language::Language2 define HW {
        
        :+type Named {
            
            :+var name
            
        }
        
        :+type IO {
            :+type Named
            +var size 1
        }
        
        :module name {
            
            +mixin verilog <- odfi::dev::hw::h2dl::verilog::VerilogGen
            
            :input name {
               :+type Named            
            }
            
            :output : IO name {
               :+type IO              
            }
            
            :IO.inout name {
                
            }
            
        }
         
        
    }
    
    HW produceNX
    
    
    odfi::language::Language2 define TESTBENCH {
        
        :testbench name {
            +type Module
            +var  test
        }
        
    }
    
    
    
}


## Use Language
####################
puts "Test: [lsearch -all -inline -glob [lsort [nx::Class info instances]] *odfi::dev::hw::h2dl*]"


set m [odfi::dev::hw::h2dl::module Test {
    
    :input clk
    
    :output stop
    
    :inout bus
    
}]

puts "Created Module: $m -> [$m info class]"
$m eachChild {
    
    puts "-> Module Child [$it info class] of type [[$it info class] info superclasses *]"
}

$m verilog:produce
