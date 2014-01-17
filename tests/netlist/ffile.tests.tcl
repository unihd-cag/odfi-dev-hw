#!/usr/bin/env tclsh

package require odfi::dev::hw::netlist 
package require odfi::tests

## Parse FFIle 
set f [odfi::dev::hw::netlist::createFFile [file dirname [info script]]/test.f]


## Check
################

## Check verilog files
odfi::tests::expect "Sources list"  "a.v b.v c.v" [join [$f getSources]] 

