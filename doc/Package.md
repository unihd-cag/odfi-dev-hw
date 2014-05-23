# Package Tool 


## Getting Started: TCL Script



## Getting Started: TCL Script with Text list


1. On the command line, load the package tool: 

	> source /home/rleys/git/odfi/modules-manager/setup.linux.bash

2. Create a TCL script with a part definition, and file extension: .part or .part.tcl, and configuration code. Here is an example:

	~~~~~~~~~~~~~~~~~
	part PART_NAME {
		
		## Load the List of pins+location (Choose one method)
		#############

		## Option1: From File
		readInputList /path/to/file

		# If the file is located in a location relative to this TCL file
		readInputList $partFileDir/file

		## Option2 : From a list
		readInputList {
			NAME POSITION
			NAME POSITION
		}

		## Refine Configuration
		##################

		## Configure pins using search
		configurePins REGEXP {

			## This Code is run on the matching pins definition 

			## For example, add a power attribute
			attr::power
		}



	}

	~~~~~~~~~~~~~~~~~

3. Produce an SVG for example (select the SVG producer upon tool request):

	> odfi_package --file myfile.part --producer SVG > myfile.svg


### Real Example

1. Here is the code of an example, the file is called: tcl-with-pinslist.part

	<includefile path="../examples/package/gettingstarted/tcl-with-pinslist.part"/>

2. A rule file to change the color of the GND pin is called: tcl-with-pinslist.part.rules

	<includefile path="../examples/package/gettingstarted/tcl-with-pinslist.part.rules"/>

3. To Produce the SVG (the rules file is detected by the tool):

	> odfi_package --file tcl-with-pinslist.part --producer SVG --rules > tcl-with-pinslist.svg




*This Tool takes an input file with a list of PIN names and Package Position, and can produce a SVG picture, along with an HTML viewer.
An embedded web viewer can be started to view in a browser easily*

## Starting the tool ##

In modules-manager/install/dev-hw/bin: 

> <code>./odfi_package</code>

To show the available commands:

> <code>./odfi_package --help</code>


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
