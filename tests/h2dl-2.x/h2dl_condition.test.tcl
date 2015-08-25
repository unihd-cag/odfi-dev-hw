package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::verilog 2.0.0

odfi::dev::hw::h2dl::module Test {
    
    :input clk
    :input start
    :output ack {
        :register
    }
    :posedge $clk {
        
        puts "Inside current: [[current object] info class] <- [[[current object] info class] info superclasses]"

        set ::ma [:match $start {
            :if 1 {

                $ack <= 1

            }
            :else {
                $ack <= 0
            }

            puts "Inside: [:info class] -> [[:children] size]"
        }]
        


    }


    
}

puts "Match size: [$ma info class] [[$ma children] size] "

puts "[$Test verilog:produce]"

puts "Match size: [$ma info class] [[$ma children] size] -> [$ma currentShading get] "
