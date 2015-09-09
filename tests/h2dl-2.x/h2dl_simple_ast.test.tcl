package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim1 2.0.0

odfi::dev::hw::h2dl::module tb_top {

    :register test
    :register test_alt
    :register test1
    :register test2
    :register test3

    ## Test 1 
    $test_alt   sim:setValue 0
    $test       sim:setValue 0
    $test1      sim:setValue 0
    $test2      sim:setValue 1
    $test3      sim:setValue 0

    set andNode [$test = $test1 & ( $test2 & $test3 )]
    $test_alt = ( $test1 &  $test2 ) & $test3
    

    ##
    $andNode sim:updateValue
    puts "Test (expected 0): [[$test sim:getValue] getValue]"

    ##
    puts "----------- Start test 2"
    $test1 sim:setValue 1
    $test2 sim:setValue 1
    $test3 sim:setValue 1
    #$andNode sim:updateValue
    puts "Test (expected 1): [[$test sim:getValue] getValue]"
    puts "Test Alt (expected 1): [[$test_alt sim:getValue] getValue]"


    ### Negation Test 
    ####################
    :register test_neg 
    $test_neg sim:setValue 0

    [$test_neg = ! $test] sim:updateValue
    puts "Negated test (expected 0): [[$test_neg sim:getValue] getValue]"
}
