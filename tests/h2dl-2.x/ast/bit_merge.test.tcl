package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim1 2.0.0


odfi::dev::hw::h2dl::module tb_top {

    :register shift_register {
        :width set 4 
    }


    $shift_register   sim:setValue 0

    puts "Test (expected 0): [[$shift_register sim:getValue] getHexValue]"

    [[$shift_register] bit 2] sim:setUpdateValue 1
    $shift_register sim:mergeValues

    puts "Test (expected 4): [[$shift_register sim:getValue] getHexValue]"

    [[$shift_register] bit 0] sim:setUpdateValue 1
    $shift_register sim:mergeValues

    puts "Test (expected 5): [[$shift_register sim:getValue] getHexValue]"


    [[$shift_register] bit 2] sim:setUpdateValue 0
    $shift_register sim:mergeValues

    puts "Test (expected 1): [[$shift_register sim:getValue] getHexValue]"
}
