## This Package provided utility for Electronic Devices packages, like viewer etc...
package provide odfi::dev::hw::package  1.0.0
package require odfi::common
package require odfi::files
package require odfi::scenegraph::svg

namespace eval odfi::dev::hw::package {

    ########################
    ## Base Package Definition
    #########################
    itcl::class Package {

        ## Name of the package 
        odfi::common::classField public name "unnamed"

        ## List with pairs: {rowColumn pinObject}
        ## row and columns are here ABC.. in y and 0123.. in x
        public variable pinsArray {}

        ## Number of columns
        odfi::common::classField public width 0
        #public variable width 0

        ## Number of Rows
        odfi::common::classField public height 0
        #public variable height 0

        constructor args {

            ## Default 
            name "$this"
    	    if { "$args" != ""} {
    	     odfi::closures::doClosure [join $args]
    	    }
        }

        ## Add a pin definition, and updates size of array
        public method addPinDefinition {name closure} {

            

            ## Create Pin
            set pin [::new [namespace parent]::PackagePin #auto $name $closure]

	    set position [$pin getPos]

            ## Add/Replace
            set pinsArray [odfi::list::arrayReplace $pinsArray $position $pin]

            #puts "Adding Pin $name at $position (x:[$pin getX] ,y:[$pin getY])"

            ## Update Size
            if {[$pin getX]>$width} {
                set width [$pin getX]
            }

            if {[$pin getY]>$height} {
                set height [$pin getY]
            }

        }

	public method pin {name closure} {
	    addPinDefinition $name $closure
	}

        ## @return the internal pin arrays map
        public method getPinsArray  args {
            return $pinsArray
        }



        ## Read Some Pin Definitions from an input list containing {position name} pairs
        #
        public method readInputList args {

            foreach {position name} $args  {

                #addPinDefinition $position $name
		pin $name {
		  location $position
		}
            }


        }

	public method info {} {
	  foreach {pos pin} $pinsArray {
	      $pin info
	  }
	}

        ## Read Some pin Definitions based on a CSV file, with columns beeing numbers and Lines letter
        public method readCSV csvContent {

            ## Split to lines 
            set lines [split $csvContent "\n"]

            ## Ignore First line, because we don't really need the columns definitions (they are always 1,2,3....)
            set lines [lrange $lines 1 end]
            foreach line $lines {

                ## Split to , 
                set definitions [split $line ,] 

                ## 1st column is the letter line location
                set lineLocation [lindex $definitions 0]

                ## Remaining are pins definitions 
                ## Empty pin content means a non existent pin
                set count 1

		#TODO: use method pin
                foreach pinDefinition [lrange $definitions 1 end] {

                    #if {$pinDefinition==""} {
                    #    continue
                    #}

                    ## Add pin definition if name is defined
                    addPinDefinition "${lineLocation}$count" $pinDefinition

                    ## increment column
                    incr count
                }
            }
        }

        

    }

    ########################
    ## Footprint Class
    #########################
    itcl::class Footprint {
        inherit Package

    }


    ######################
    ## Object for Package Pin
    ##############################
    itcl::class PackagePin {

        ## Name of Pin
        odfi::common::classField public name ""

        ## Textual Position
        public variable position

        public variable x  0

        public variable y  0

        public variable row  A

        public variable column  0

	public variable attributes {}

        ## If this is a non existent pin
        odfi::common::classField public nonExistent false

        constructor {cName  {closure {}}} {

            ## Init
            #############
            set name     [string trim $cName]
            #set position [string trim $cPosition]

            ## Non existent ? 
            if {$name==""} {
                nonExistent true
                name "NE"
            }

            odfi::closures::doClosure $closure
	    set position [string trim $position]

            ## Analyse position
            ## Format: AAAAA0000000  Letters giving the row, and numbers giving the column
            #########################
            set format {([A-Za-z]+)([0-9]+)}
            regexp $format $position -> row column

            
            #### Row Y position :
            ####  A new letter is added after the end of following allow letters list:
            #####   - Every new letter gives a +list length offset
            #####   - Increment x position by the offset of last letter in list
            set allowedRowChars {A B C D E F G H J K L M N P Q R T U V W X Y}

           # puts "** Analysing $row"

            ## Offset = number of chars in definition -1 (ignore last) * number of allowed characters until new character is added
            set y [expr ([string length $row]-1)*[llength $allowedRowChars]]

           # puts "** First round y: $y"

            set lastChar [string index $row end]
            incr y [expr [lsearch -exact $allowedRowChars $lastChar] -1]

            #puts "** Incremented by [lsearch -exact $allowedRowChars $lastChar]"

            ###########

            #### Column X position : This is just a number
            set x $column

        }


	public method location {loc} {
	    set position $loc
	}

	public method getPos {} {
	    return $position
	}

	public method info {} {
	    puts "name: $name"
	    puts "location: $position"
	    puts "attributes: $attributes"
	}

	public method addAttribute {name value} {
	  lappend attributes "$name,$value"
	}

        ## @return Integer position in X direction
        public method getX args {
            return $x
        }

        ## @return Integer position in Y direction
        public method getY args {
            return $y
        }

        ## @return Textual position in Y direction (A B C etc...)
        public method getRow args {
            return $row
        }

        ## @return Textual position in Y direction (0 1 2 etc...)
        public method getColumn args {
            return $column
        }

    }




    ########################
    ## Viewer Outputs
    ##########################
    itcl::class BaseOutputGenerator {

	public variable name ""

        ## The Footprint for which we are generating
        public variable footPrint 

	## The available views
	public variable availableViews "topview bottomview"

        ## This maps holds generic string based named parameters to configure the output
        public variable parametersMap

	## The subclasses of this class. They represent the available Producers
	#public variable subclasses

        constructor cFootprint {

            ## Init
            ###########
            set footPrint $cFootprint

            ## Defaults
            #######################
            array set parametersMap {
            }

	    #TODO Get possible producer
	    #set subclasses [itcl::find classes "::odfi::dev::hw::package::SVGOutput"] 
	    #puts "subclasses: $subclasses"

	    set objects [itcl::find objects]

	    #set subclasses ""

	   # foreach obj $objects {
		#if {[$obj info inherit] == "::odfi::dev::hw::package::BaseOutputGenerator"} {
		#  lappend subclasses [$obj info class]
		#}
	   # }
	    #puts "subclasses: $subclasses"
        }

        ## Global Parameters Generic Functions
        ###########################

	## Define available Views
	public method setViews views {
	    set availableViews $views
	}

	## Get available Views
	public method getViews {} {
	    return $availableViews
	}

	public method getName {} {
	    return $name
	}
	#public method getSubclasses {} {
	#    return $subclasses
	#}
        ## Define parameters by passing a map like syntax list
        public method defineParameters entries {
            
            foreach {entry value} $entries {
                
               # puts "Defining: $entry <-> $value"
                
                array set parametersMap [list $entry $value]
                           
            } 
            
        }
        
        ## Return the value of the parameter for a name matching one pattern
        public method getParameterForName {name param {default ""}} {
            
            foreach {entryPattern value} [array get parametersMap] {
                
               # puts "Testing entry: $entryPattern against $name,$param"
                
               if {[regexp $entryPattern "$name,$param"]==1} {
                   
                   return $value
                   
               }      
            }
            
            return $default
            
            
        }

        ## Return the value of the parameter for a name matching one pattern
        ## The provided closure is execeuted on found valued, with $value as implicit variable containinf the value
        public method getParameterForNameAnd {name param closure} {
            
            foreach {entryPattern value} [array get parametersMap] {
                
               # puts "Testing entry: $entryPattern against $name,$param"
                
               if {[regexp $entryPattern "$name,$param"]==1} {
                   
                   #uplevel "set value $value"
                   #odfi::closures::doClosure $closure 1
              
                   
               }      
            }
              
            
        }
        
        ## Return the value of a parameter for a pattern registered in the map
        public method getParameterForPattern {pattern param {default ""}} {
                  
            foreach {entryPattern value} [array get parametersMap] {
                           
               if {$entryPattern == "$pattern,$param"} {
                   
                   return $value
                   
               }      
           }
            
           return $default
            
        }
        
        ## Return the result of a search in the array for all the entries having the provided param  as parameter
        public method getPatternsParameter param {
            
            set res {}
            foreach {entry value} [array get parametersMap "*,$param"] {
                
                #puts "Found entry with parameter $param: $entry <-> $value"
                
                lappend res [lindex [split $entry ,] 0] $value
                
            }
            
            return $res
        }

        ## Global parameters useful functions that could be used by all kind of output generators
        ##################################

        ## Returns the Color for a specified bump name, or return the default color if none found
        public method getColorForPin {pin defaultColor} {
                  
            return [getParameterForName [$pin name] color $defaultColor]   
        }

        

    }


    #########################
    ## Test Output to test available Producers
    #########################
    itcl::class TestOutput {
	inherit BaseOutputGenerator

	constructor cFootprint {BaseOutputGenerator::constructor $cFootprint} {

        }
	public method produceToString args {
	     set view [odfi::list::arrayGetDefault $args "-view" ""]
	     return "TestOutPut - View: $view"
	}
    }


    #########################
    ## SVG Output 
    #########################
    itcl::class SVGOutput {
        inherit BaseOutputGenerator

	public variable name "SVGOutput"

	public variable availableViews "topview bottomview aa"
        odfi::common::classField protected pinSize 20

        odfi::common::classField protected gridSpacing 5

        constructor cFootprint {BaseOutputGenerator::constructor $cFootprint} {

        }

        ## Returns an ID to use in use element for instanciating shape
        public method getShapeForPin pin {
                     
            return [getParameterForName [$pin name] shape $defaultShape]   
            
        }

	public method getName {} {
	    return $name
	}
	public method getViews {} {
	    return $availableViews
	}
        ## Create SVG To Given String
        public method produceToString args {

	    set view [odfi::list::arrayGetDefault $args "-view" ""]

	    ##TODO - VIEWS

            ## Create SVG
            ###################
            set producer $this
            puts "producer is $producer"
            set svg [::new odfi::scenegraph::svg::SVG "#auto" {

                ## Init
                ## Set Width and height based on pinSize and gridSpacing
                ################
                #width  [expr [$footPrint width]*$pinSize+(([$footPrint width]-1)*$gridSpacing)]
                #height [expr [$footPrint height]*$pinSize+(([$footPrint height]-1)*$gridSpacing)]

                ## Header with column names
                ################

                ## Add a first dummy column on first list for the line names
                text "" {

                }

                ## Columns numbering
                ::repeat [$footPrint width] {
                    text [expr $i+1] {
                        #width  $pinSize
                        #height $pinSize
                    }
                }

                ## Add a rounded rectangle for all the pins 
                ## Every width count, add the line name 
                ########################
		#TODO addGroup pins {
		  set count 0 
		  foreach {location pin} [$footPrint getPinsArray] {

		      if {[expr $count%[$footPrint width]]==0} {

			  text [$pin getRow]
		      }

		      addRect {

			  width   $pinSize
			  height  $pinSize
			  rounded 5
			  title [$pin name]

			  ## Parameters specific to name based patterns
			  ##################

			  ## Color 
			  #puts "Inside rect with $producer"
			  color   [$producer getColorForPin $pin white]

			  ## Non Existent/Non Connected are not to be seen
			  if {[$pin nonExistent]} {
			      opacity 0.0
			  }
			  #border  [$producer getBorderForPin $pin white]
			  #[$producer getParameterForNameAnd [$pin name] color {
			  #    color $value
			  #}]
			
			  
		      }

		      incr count


		  }
		#}
                ## Layout as Grid (width+1 columns because of line text column)
                layout "flowGrid" [list \
                    columns [expr [$footPrint width]+1] \
                    spacing $gridSpacing \

                ]

        		 #change layout according to view
        		 if {$view == "bottomview"} {
        		     layout "mirrorY" {
           
        		     }
        		     
        		  }


            }]



            ## Return String
            ########################
            set str [$svg toString]

    
            return $str


        }

        ## Create SVG To Given File
        public method produceToFile file {

            ## Create String 
            set res [produceToString]

            ## Write to file 
            odfi::files::writeToFile $file $res
        }   

        ## \brief Returns the data for this reports for the given view type
        public method view viewType {
            return [produceToString]
        }

        ## \brief Returns the content type returned by the report for the given viewType
        public method viewContentType viewType {
            return "application/svg"
        }

    }

}

## Load Extra Default packages 
#################
source [file dirname [info script]]/svghtmlProducer-1.0.0.tm
source [file dirname [info script]]/webapp-1.0.0/PackageWebapp.tm
