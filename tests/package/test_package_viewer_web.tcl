#!/usr/bin/env tclsh8.5


package require odfi::tool
package require odfi::dev::hw::package


##########################################
## CSV ###################################

set csvFile [file dirname [file normalize [info script]]]/hmc_4_link_ballout.csv

## Create Foot print 
odfi::dev::hw::package::Footprint footprint
footprint name [file tail $csvFile]

## Read
set f [open $csvFile]
footprint readCSV [read $f]
close $f

#### Show Statistics
########################

puts "Size: [footprint width]x[footprint height]"

## Start Web Viewer
########################

## Create Application
set app [::new odfi::dev::hw::package::www::PackageWebapp #auto]
$app currentPackage ::footprint

## Create and start server

set server [new odfi::ewww::webdata::WebdataServer my_server 8888]
$server deploy $app
$server start

vwait forever
