

package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim1 2.0.0


odfi::dev::hw::h2dl::module tb_top {

    ## Clocks
    ##############

    :register ck1 {
        :sim:probe
    }
  
    :sim:at 0 {
        $ck1 <= 0
        
    }

    :sim:every 10 {
        $ck1 <= ! $ck1
    }
   




    :sim:at 300 {
        :stop now
    }

    ## Chain 
    ###############
    set size 6
    ::repeat $size {
        :register sr_$i {
            :sim:probe
        }
        :sim:at 0 {
            [odfi::closures::value sr_$i ] <= 0
        }
       
    }
    :register sr2 {
        :width set $size
        :sim:probe
    }
    :sim:at 0 {
        $sr2 <= 0
    }
   
    :posedge $ck1 {

        $sr_0 <= ! $sr_5

        $sr2 < 0 < 5 ! $sr2

        ::repeat 5 {
            $sr2 < [expr $i+1] < $i $sr2
        }
        #$sr2  < 1 <- 0 $sr2 + 1

        #::repeat 5 {
        #    set n1 sr_[expr $i+1]
        #    set n2 sr_$i
        #    $$n1 <= $$n2
        #}

        $sr_1 <= $sr_0
        $sr_2 <= $sr_1
        $sr_3 <= $sr_2
        $sr_4 <= $sr_3
        $sr_5 <= $sr_4

    }

}


#puts "[::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign info methods]"

#set assign [::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign new]
#
#$assign sim:updateValue

#exit 0
set sim [odfi::dev::hw::h2dl::sim1::Simulator new]
$sim run $tb_top test.vcd

