#!/usr/bin/env tclsh8.5

package require odfi::dev::hw::package

proc package {name closure} {	
  set $name [::new odfi::dev::hw::package::Package "#auto" $closure]
}

set loc 5

set l {{"A1" "a"} {"B1" "b"} {"C1" "c"}}

package "p1" {
  pin "a" {
      location 3
      addAttribute "input" 1
      addAttribute "output" 2
    }

    
    #This works
    pin "b" {
      location $::loc
      addAttribute "group" "add"
      addAttribute "output" 0
   }
    info
    #readInputList $::l
}


set csvFile "~/modules-manager/install/dev-hw/tests/package/test.package.csv"

## Create Foot print 
odfi::dev::hw::package::Package footprint
footprint name [file tail $csvFile]



#this doesn't work
footprint readInputList $l