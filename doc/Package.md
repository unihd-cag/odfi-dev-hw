# Package Tool #

*This Tool takes an input file with a list of PIN names and Package Position, and can produce a SVG picture, along with an HTML viewer.
An embedded web viewer can be started to view in a browser easily*

## Starting the tool ##

In modules-manager/install/dev-hw/bin: 

><code>./odfi_package_footprint</code>

To show the available commands:

><code>./odfi_package_footprint --help</code>

## Using the tool ##

### Input ###

#### Type ####

The tool takes PIN names and position to form a package. They can be provided either in a list, a CSV or in a Tcl Script format. The input is parsed using ODFI embedded TCL parser, so the input can contain some TCL code:

* List format:

	Each Line of the input file defines one PIN POSITION pair, like this:

	<code>       ...

        CLK A1

        GPIO0 B2

        ...

        
	</code>
	The Order of the definitions is irrelevant, the tool sorts everything correctly

* CSV file Format (files with *.csv extension):

	First Line: Columns separated by ',' , ex: ,1,2,3,4

	Next Lines: Line name , values of pins ... , ex: A , VDD, VSS, ...   

* Tcl Script Format (files with *.part or \*.part.tcl extension):

		odfi::dev::hw::package::part partname {

		pin {PINNAME @POSITION} {

		attr:attributefunction

		}

		} 
	
	to add an attribute with an attributefunction use either addAttribute NAME VALUE
or define your own attributefunction with odfi::dev::hw::package::attributeFunction ::attr::NAME

	Example script (You can either specify the location with "@LOCATION" as an argument or with "location LOCATION" in the script. A Location is in the format : AAAAA0000000  Letters giving the row, and numbers giving the column):
		
		tcl
		#!/usr/bin/env tclsh8.5

		package require odfi::dev::hw::package 1.0.0

		#Define own attributes:
		odfi::dev::hw::package::attributeFunction ::attr::output
		odfi::dev::hw::package::attributeFunction ::attr::differential
		odfi::dev::hw::package::attributeFunction ::attr::input
		odfi::dev::hw::package::attributeFunction ::attr::group
		odfi::dev::hw::package::attributeFunction ::attr::reference_voltage
		odfi::dev::hw::package::attributeFunction ::attr::termination_voltage
		odfi::dev::hw::package::attributeFunction ::attr::power

		#Create part:
		odfi::dev::hw::package::part part123 {
        		pin { Q0_p @15 } {
                	attr::output
                	attr::differential
                	attr::group out0
        		}
        		pin { Q0_n @16 } {
		attr::output
		attr::differential
		attr::group out0
		}
        
		foreach pinloc { 7 14 } \
		{
		pin VCC \
		{
		location $pinloc
		attr::power
		}
		}
		}

#### Usage ####
To use an input you can use one of the following methods:

		odfi_package_footprint < /path/to/input_definition/file

		wonderful_pin_list_output_tool | odfi_package_footprint

or simply type by hand after starting the tool (copy paste will work, Press CTRL + D to produce the End of File character)

You can also use the file functionality to use a file as input by using the `--file` argument (see below).

### Functionalities ###

The tool comes with the following functions (arguments):

* Files:
	call `./odfi_package_footprint --file FILENAME` to use the file FILENAME as input. If not specified you will have to choose between available producers to produce the output.
if you already know which producer to use in advance call `./odfi_package_footprint --file FILENAME --producer PRODUCER`

	if you want to see the rules saved for a file simply add `--rules` to the arguments

	the rules have to be saved as a simple text file. It has to have the same name as the file and has to end with: *.package.rules

* Web:
	call `./odfi_package_footprint` with the argument `--web` to start the *Package Viewer Web Application*

	open <http://127.0.0.1:8888/package/view> in your web browser to open it

* Producers:
	call `./odfi_package_footprint` with the argument `--producers` to see wich producers are available to produce the output
