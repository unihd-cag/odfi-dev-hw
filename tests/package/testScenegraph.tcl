#!/usr/bin/env tclsh

# Load library
package require odfi::scenegraph::svg

## Create an SVG object which is the top Group entry point for the SVG implementation
set svg [::new odfi::scenegraph::svg::SVG "::svg" {

    ## Add 4 rectangles
    ##########
    #::repeat 6 {

        ## addRect is provided by the SVG Group implementation
        ## It creates a Node, which is a SVGNode, allowing sizing and definition of some common svg attributes (like color, stroke etc...)
        addRect {

            width  20
            height 20
            color "red"

        }
	addRect {

            width  20
            height 20
            color "blue"

        }
	addRect {

            width  20
            height 20
            color "green"

        }
	addRect {

            width  20
            height 20
            #color "red"

        }
    #}


    ## Call the layout function called flowgrid, with columns constraint.    r b          ->     b r
    ## It will position our rectangles in two rows of two columns            g w		   w g
    layout "flowGrid" {
	columns 2
    }
    layout "mirrorY" {
   
    }
}]

puts [$svg toString]