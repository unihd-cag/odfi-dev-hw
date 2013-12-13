#!/usr/bin/env tclsh8.5


package require odfi::tool
package require odfi::dev::hw::package


##########################################
## CSV ###################################

#original:
#set csvFile [file dirname [file normalize [info script]]]/hmc_4_link_ballout.csv

#test:
set csvFile [file dirname [file normalize [info script]]]/test.csv

## Create Foot print 
odfi::dev::hw::package::Footprint footprint

## Read
set f [open $csvFile]
footprint readCSV [read $f]
close $f

#### Show Statistics
########################

puts "Size: [footprint width]x[footprint height]"

#### Try to generate SVG
########################
set svgOutFile ${csvFile}.svg

odfi::dev::hw::package::SVGOutput svgOut  ::footprint


svgOut defineParameters {

    .*VSS.*,color  blue

    .*VDD,color    red
    .*VDDM,color   firebrick
    .*VT.*,color   darkred

}

svgOut produceToFile $svgOutFile
