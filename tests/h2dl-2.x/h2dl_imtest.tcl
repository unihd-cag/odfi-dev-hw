

set charCode 33
set charCodeOct [format %o $charCode]
set C 101
puts "Char: [format %c $charCode]"

package require odfi::dev::hw::h2dl 2.0.0
package require odfi::dev::hw::h2dl::verilog 2.0.0
package require odfi::dev::hw::h2dl::sim1 2.0.0
package require odfi::scenegraph::svg 2.0.0

#######################################
########## Simulator Base #############
#######################################



## Create a simple module to simulate
################
odfi::dev::hw::h2dl::module tb_top {


    ## create regs
    ::repeat 2 {
        :register ff$i 
    }

    ## Clock
    :register clock {
        :sim:probe
    }
    :register clock2 {
        :sim:probe
    }
    :analog child1 {
        :sim:probe
    }
    :analog child2 {
        :sim:probe
    }

    puts "Clock reg: $clock"


    


    ## Normal Counter 
    #######################
    :register counter {
        :width set 16
        :sim:probe
    }

    :register counter2 {
        :width set 16
        :sim:probe
    }


    :posedge $clock2 {

        $counter2 <= $counter2 + 1
    }


    ## Clock Gen 
    :sim:every 1000 {
        $clock <= ! $clock
    }
    :sim:every 500 {
        $clock2 <= ! $clock2
        $counter <= $counter + 1
    }

    ## Stop after 20000
    #:sim:at 20000 {
     #   :sim:run {
      #      $simulator stop
       # }
    #}

    ## Init 
    ################
    :sim:at 0 {
        $clock <= 0
        $clock2 <= 0
        $counter <= 0
        $counter2 <= 0
        
    }

    :sim:at 800 {
        $child1 <= 25.0
        $child2 <= 15.0
    }

    :sim:at 2500 {
       
       :stop now {

       }

    }

    ## Ripple 2
    ###################

    :register ripple2 {
        :sim:probe 
        :width set 8
    }
    :sim:at 0 {
        $ripple2 <= 0
    }
        
    :sim:at 500 {
        $ripple2 <= 1
    }

    #:posedge $ripple2 1

    ## Ripple counter 
    #########
    ::repeat 10 {
        :register ripple$i {
            :sim:probe
        }
        :sim:at 0 {
            #set vn ripple$i
            [odfi::closures::value ripple$i ] <= 0
        }

        if {$i>0} {
            :posedge [odfi::closures::value ripple[expr $i-1]] {
                [odfi::closures::value ripple$i] <= 1
            }
        }
        
    }

    :sim:at 350 {
        $ripple0 <= 1
    }

}

#exit 0



## Run Verilog Out 
####################



exit 0

## Run sim
#################
puts "************ SIM ****************"
$tb_top  object mixins add odfi::flextree::utils::StdoutPrinter
#$tb_top printAll

set sim [odfi::dev::hw::h2dl::sim1::Simulator new]
$sim run $tb_top test.vcd
