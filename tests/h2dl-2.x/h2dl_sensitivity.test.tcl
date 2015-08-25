

package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::verilog 2.0.0

## test language creation
#####################



## Use Language
####################
puts "Test: [lsearch -all -inline -glob [lsort [nx::Class info instances]] *odfi::dev::hw::h2dl*]"


set m [odfi::dev::hw::h2dl::module Test {
    
    :input clk
    
    :output stop
    
    :inout bus

    :register test 

    :register test2 {
        :width set 32
        :size 31:2
    }

    :posedge $clk {
        
    }

    puts "Register test: $test"
    
}]

puts "Created Module: $m -> [$m info class] of type [[$m info class] info superclasses *]"
puts "Module properties: [$m info lookup slots] "
puts "Module name: [$m name get] "
$m eachChild {
    
    puts "-> Module Child [$it info class] of type [[$it info class] info superclasses *]"
}

puts "[$m verilog:produce]"
