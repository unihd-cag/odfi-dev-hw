#!/usr/bin/env tclsh8.5

package require odfi::dev::hw::package

proc package {name closure} {	
  set $name [::new odfi::dev::hw::package::Package "#auto" $closure]
}

package "p1" {
  pin "a" {
    location 3
    addAttribute "input" 1
    addAttribute "output" 2
  }
  pin "b" {
    location 5
    addAttribute "group" "add"
    addAttribute "output" 0
  }
  info
}