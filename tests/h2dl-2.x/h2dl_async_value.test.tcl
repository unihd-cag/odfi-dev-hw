

package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::sim1 2.0.0


odfi::dev::hw::h2dl::module tb_top {

    ## Clocks
    ##############

    :register clk {
        :sim:probe
        :sim:initial {
            $clk = 0
        }
    }


    :sim:every 10 {
        $clk = ! $clk
    }
   
    :sim:at 150 {
        :stop now
    }

    ## Exhange two values to check correctness 
    ###############
    :register v1 {
        :sim:probe
        :sim:initial {
            $v1 = 0
        }
    }
    :register v2 {
        :sim:probe
        :sim:value 0
    }

    :posedge $clk {
        $v2 <= $v1
        $v1 <= ! $v2
    }
    

}


#puts "[::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign info methods]"

#set assign [::odfi::dev::hw::h2dl::ast::ASTNonBlockingAssign new]
#
#$assign sim:updateValue

#exit 0
set sim [odfi::dev::hw::h2dl::sim1::Simulator new]
$sim run $tb_top test.vcd

