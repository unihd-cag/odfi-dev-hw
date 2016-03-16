package provide odfi::dev::hw::rtl 1.0.0
package require odfi::common
package require odfi::list

## A Few utilities for RTL interaction.
## To be used where/if needed
namespace eval odfi::dev::hw::rtl {


    odfi::common::resetNamespaceClasses [namespace current]




    ########################################################
    ## IO Group Class
    ## Parsed in RTL using: /// \defgroup group.name.with.prefixes
    ########################################################
    itcl::class Group {

        ## This is the part of the group Name that is after the last detected '.' character
        public variable name ""

        ## This is the part of the group name until the last detected '.'
        public variable prefix ""

        constructor groupName {

            ## Split at '.'
            set splitted [split $groupName "."]

            ## Name is last list element
            set name [lindex $splitted end]

            ## Prefix is all until last
            set prefix [join [lrange $splitted 0 end-1] "."]

        }

        ## \brief Returns the name prefix.long.prefix.name) part of the group name
        public method getName args  {
            return $name
        }

        ## \brief Returns the prefix (prefix.long.prefix.name) part of the group name
        public method getPrefix args {
            return $prefix
        }

    }

    ########################################################
    ## IO Pin Class
    ###################################################################
    itcl::class IOPin {

        public variable name

        public variable group ""

        ## A hint
        public variable hint ""

        ## \brief Size, calculated or set manually
        public variable size 1

        public variable direction "input"
        public variable type "wire"

        constructor pinName {
            set name $pinName
        }

        public method getName args {
            return $name

        }

        public method setGroup groupObject {
            set group $groupObject
        }

        public method getGroup args {
            return $group
        }

        public method hasGroup args {
            if {$group==""} {
                return false;
            } else {
                return true;
            }
        }

        ## \brief Manually set the size (bus width) of the pin
        public method setSize fSize {
            set size $fSize
        }

        ## \brief Returns the size (bus width) of the pin
        public method getSize args {
            return $size
        }

        public method setType t {
            set type $t 
        }
        public method getType args {
            return $type
        }

        public method setDirection t {
            set direction $t 
        }
        public method isInput args {
            if {$direction=="input"} {
                return true 
            } else {
                return false
            }
        }
        public method isInputOutput args {
            if {$direction=="inout"} {
                return true 
            } else {
                return false
            }
        }


    }


    ## \brief This method evaluates TCL embedded in comments for the given flow phase
    # To embbed TCL, comments must have this format:
    # //tcl//phaseName// script
    # Only single line comments are allowed
    proc evalTCLComments {rtlFile phaseName} {

        ## Read RTL
        set rtl [read [open $rtlFile "r"]]

        ## Prepare extract regexp
        #######################
        set commentRegexp "^\\s*//tcl//$phaseName//(.+)$"

        ## Iterately Execute regexp to extract IO PIN Names
        set startIndex 0
        while {1} {

            ## Execute
            set result [regexp -line -indices -start $startIndex -- $commentRegexp $rtl matched tcl]

            ## If indices is empty -> no match
            if {$result==0} {
                break
            }

            ## Reconstruct
            ###################
            set matchedString [string range $rtl [lindex $matched 0] [lindex $matched 1]]
            set tcl [string range $rtl [lindex $tcl 0] [lindex $tcl 1]]

            eval $tcl


            ## Iterate from end of this match
            ################
            set startIndex [lindex $matched 1]



        }

    }

    ## This method extracts all the input/output/inout from a verilog module, and returns a list of #IOPin objects
    ## This method also executes TCL placed in comments after the pin definition like:
    ## input wire myPin, //tcl// puts "Pin name: [$pin getName]"
    ## FIXME \addToGroup not implemented
    ## @return A list of #IOPin classes, which are per default sorted in the "unassigned" group
    proc extractIOFromFile {rtlFile } {

        ## Read RTL
        set rtlChan [open $rtlFile "r"]
        #set rtl [read $rtlChan]

        ## Result
       set ios {}

        ## Work variables
        set defaultGroup [::new [namespace current]::Group "#auto" "unassigned.unassigned"]
        set currentGroup $defaultGroup

        ## Prepare IO extract regexp
        ############################################################################################

        ### Doxygen simple regexp
        set doxyregexp {\s*///\s*(?:\\)?([@\}a-zA-Z]+)\s*(.*)?}
        set doxygenLine {^\s*(///\s*.*)}

        #set ioRegexp {\s*(?:input|output|inout)\s+wire\s+([\w]+)\s*,?\s*(//.*)?}
        set ioRegexp {\s*(input|output|inout)\s+(wire|reg)\s+(\[.+:.+\]\s+)?([\w]+)\s*,?\s*(//.*)?}



        ## Iterately Execute regexp to extract IO PIN Names
        ############################################################################################
        set startIndex 0
        set stop 0
        while { [gets $rtlChan line] >= 0 } {


            set extraMatch ""
            set pin ""

            ## Parse single doxygen comment line
            ###################
            if {[regexp  -indices -- $doxygenLine $line matched doxygen]==1} {



                #set matchedString [string range $rtl [lindex $matched 0] [lindex $matched 1]]

                set extraMatch [string range $line [lindex $doxygen 0] [lindex $doxygen 1]]

                #puts "Doxygen line:$extraMatch "

                set startIndex [lindex $matched 1]

            } elseif {[regexp  -indices -- $ioRegexp $line matched direction type sizeString name extra]==1} {

                set matchedString [string range $line [lindex $matched 0] [lindex $matched 1]]


                ## -> I/O Pin
                #####################

                #### Reconstruct
                #######################
                set name [string range $line [lindex $name 0] [lindex $name 1]]
                set extraMatch [string range $line [lindex $extra 0] [lindex $extra 1]]
                set direction [string range $line [lindex $direction 0] [lindex $direction 1]]
                set type [string range $line [lindex $type 0] [lindex $type 1]]
                set sizeString [string trim [string range $line [lindex $sizeString 0] [lindex $sizeString 1]]]


                #puts "Creating Pin with name $name"

                #### Create Array for pin and save
                ############################
                set pin [::new [namespace current]::IOPin "#auto" $name]
                $pin setDirection $direction 
                $pin setType $type

                if {$sizeString!=""} {
                    #puts "Size strign: $sizeString"
                    regexp {\[(.+):(.+)\]} $sizeString -> msb lsb
                    if {[string is integer $msb] && [string is integer $lsb] } {
                        $pin setSize [expr $msb-$lsb+1]
                    }
                }

                if {$currentGroup!=""} {

                    #puts "Assigning Group: $currentGroup"
                    $pin setGroup $currentGroup
                }

                ## Save
                lappend ios $pin


                set startIndex [lindex $matched 1]

            } else {

                #puts "End"

                #break
            }

            ## If Extra match is defined, it might be doxygen stuff, so parse it too
            if {$extraMatch!=""} {

                #puts "parsing extra: $extraMatch for pin $pin"

                ## Parse Doxygen
                #################
                if {[regexp $doxyregexp $extraMatch matched command content]==1} {


                    set content [string trim $content]

                   # puts "parsed doxygen: $command"

                    if {[string match -nocase "*@\}*" $command]} {

                        ## -> EOF Group
                        ###############
                        set currentGroup $defaultGroup


                    } elseif {[string match -nocase "defgroup" $command]} {

                        ## -> Group
                        #################

                        #### Reconstruct
                        #######################
                        set name $content

                        #### Create object
                        ######################
                        set currentGroup [::new [namespace current]::Group "#auto" $name]


                    } elseif {[string match -nocase "addtogroup" $command]} {

                        set groupName $content


                        ## -> Add pin to group if existing
                        #################
                        if {$pin!=""} {

                           # puts "Add pin [$pin cget -name] to group: /$groupName/"

                            ## Search for Groups
                            $pin setGroup [::new [namespace current]::Group "#auto" $content]
                        }

                        #### Reconstruct
                        #######################
                        #set name $content

                        #puts "Group: $name"

                        #### Create object
                        ######################
                        #set currentGroup rtl::[Group "#auto" $name]



                    }


                }


            }




        }

        return $ios


    }

    ## \brief Parses the IO of provided file using #extractIOFromFile, then group them using group name string
    # @return an array like list with { groupName {pins}} format
    proc extractGroupedIOFromFile rtlFile {

        set ios [[namespace current]::extractIOFromFile $rtlFile]

        set grouped_ios [odfi::list::groupBy $ios {
            if {[[$it getGroup] getPrefix] == "" } {
                [$it getGroup] getName
            } else {
                join [list [[$it getGroup] getPrefix] [[$it getGroup] getName]] .
            }
        }]

        return $grouped_ios

    }

    ## \brief Parses the IO of provided file using #extractIOFromFile, then group them using group prefix string
    # @return an array like list with { groupPrefix {pins}} format
    proc extractGroupPrefixedIOFromFile rtlFile {

        set ios [[namespace current]::extractIOFromFile $rtlFile]

        set grouped_ios [odfi::list::groupBy $ios {
            if {[[$it getGroup] getPrefix] == ""} {
                [$it getGroup] getName
            } else {
                [$it getGroup] getPrefix
            }
        }]

        return $grouped_ios

    }



}






