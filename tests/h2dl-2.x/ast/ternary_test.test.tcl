package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim1 2.0.0

odfi::dev::hw::h2dl::module tb_top {

    :register shift_register {
        :width set 4 
    }

    :register input {
        :width set 4 
    }

    :register load {

    }

    $input            sim:setValue 0x55
    $shift_register   sim:setValue 0
    $load   sim:setValue 0


    puts "Bit 0: [$shift_register bit 0] [$shift_register bit 0]"

    ## ASsign AST 
    set operators {}
    ::repeat 8 {

        if {$i==0} {
            lappend operators [[$shift_register bit $i] <= $load ? [$input bit $i] : 0]
        } else {
            lappend operators [[$shift_register bit $i] <= $load ? [$input bit $i] : [$shift_register bit [expr $i-1]]]
        }
        
    }

    ## Try load 
    $load sim:setValue 1

    foreach o $operators {
        puts "In O: $o"
        $o sim:updateValue
    }

    #::repeat 8 {
        #$shift_register child 
    #}
    foreach o $operators {
        puts "In O merge: $o"
        #$o sim:mergeValues
        #[$o child 0] sim:mergeValues
    }
    $shift_register sim:mergeValues


    #puts "Test (expected 0x55): [[[$shift_register child 1] sim:getValue] getValue]"
    puts "Test (expected 0x55): [[$shift_register sim:getValue] getHexValue]"

    

    ## Try load 
    $load sim:setValue 0

    foreach o $operators {
        puts "In O: $o"
        $o sim:updateValue
    }
    $shift_register sim:mergeValues
    
    puts "Test (expected 0xaa): [[$shift_register sim:getValue] getHexValue]"
    
}
