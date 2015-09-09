

package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim2 2.0.0


#set simV [::odfi::dev::hw::h2dl::sim1::]



odfi::dev::hw::h2dl::module tb_top {

    ## Clocks
    ##############

    :register ck1 {
        :sim:probe
    }
    
    :register reset {
        :sim:probe
    }

    :sim:at 0 {
        $ck1   = 0
        $reset = 0
        
    }

    :sim:every 10 {
        $ck1 = ! $ck1
    }
   

    set base 25
    :sim:at $base {
        #$reset = 1
    }
    :sim:at [expr $base+20] {
        #$reset = 0
    }

    :sim:at 250 {
        :stop now
    }

    ## Chain 
    ###############
    set size 4
    :register sr {
        :width set 4
        :sim:probe
        :reset "$reset == 1" {

        }
        :sim:setValue 0x55
    }
   
    :posedge $ck1 {

        ::repeat $size {
            if {$i == 0} {
                [$sr bit $i] <=  0
            } else {
                [$sr bit $i] <= [$sr bit [expr $i-1]]
            }
        }
        
        #$sr2 <= $sr2 + 1 
        #$sr2 < 0 < 5 ! $sr2

        #::repeat 5 {
        #    $sr2 < [expr $i+1] < $i $sr2
        #}

    }

}


#puts "[::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign info methods]"

#set assign [::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign new]
#
#$assign sim:updateValue

#exit 0
set sim [odfi::dev::hw::h2dl::sim2::Simulator new]
$sim run $tb_top test_reset.vcd

