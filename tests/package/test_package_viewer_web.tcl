#!/usr/bin/env tclsh8.5


package require odfi::tool
package require odfi::dev::hw::package


##########################################
## CSV ###################################
#filename.package.txt oder .csv
#original:
#set csvFile [file dirname [file normalize [info script]]]/hmc_4_link_ballout.csv

#test:
#give csvFile via command line
#set filename "[lindex $argv 0]

## Curent Directory
set directories [file dirname [file normalize [info script]]]

#set directories ""
#set filelist ""
#set filelist [glob -directory [lindex $directories 0] *.package.csv]
#set filelist [glob -directory $directories *.package.csv]
#set filename [lindex $filelist 0]
set csvFile "~/modules-manager/install/dev-hw/tests/package/test.package.csv"
#set csvFile $filename
## Create Foot print 
odfi::dev::hw::package::Footprint fprint
fprint name [file tail $csvFile]

## Read
set f [open $csvFile]
fprint readCSV [read $f]
close $f

##Create svg
set svg [::new odfi::dev::hw::package::SVGOutput #auto ::footprint]

##Create testoutput to be an availableProducer
set test [::new odfi::dev::hw::package::TestOutput #auto ::footprint]

##Find availableProducers:
##To add a Producer type an object must be initialized and it must be a subclass of ::odfi::dev::hw::package::BaseOutputGenerator
set objects [itcl::find objects]
set producers ""
set prod ""
foreach obj $objects {
  if {[$obj info inherit] == "::odfi::dev::hw::package::BaseOutputGenerator"} {
      set prod $obj
      lappend producers [$obj info class]
   }
}
#Avoid Multiple producers of the same kind:
set producers [lsort -unique $producers]
puts "available Producers: $producers"
##Create BaseOutputGenerator for different producers
#set producers [::new odfi::dev::hw::package::BaseOutputGenerator #auto ::footprint]

#### Show Statistics
########################

#puts "Size: [footprint width]x[footprint height]"
#puts -nonewline "Available files (must end in package.csv): "
#puts $filelist
#puts -nonewline "Directories:  "
#puts $directories


## Start Web Viewer
########################

## Create Application
set app [::new odfi::dev::hw::package::www::PackageWebapp #auto]
$app currentPackage ::footprint
$app availablePackages ""
$app directories $directories
$app producer $prod
$app availableProducers $producers

## Create and start server

set server [new odfi::ewww::webdata::WebdataServer my_server 8888]
$server deploy $app
$server start

vwait forever
