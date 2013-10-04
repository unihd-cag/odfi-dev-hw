## This package provides some Utilities to work around netlist definitions for Designs
package provide odfi::implementation::edid::netlist     1.0.0



namespace eval edid::netlist {


    # Parses the given f file and returns a list containing all the sources, indcirs and defines referenced
    # The method parses recursively given f files
    proc parseFNetlist firstFfile {

        ## Recursive list
        set filesToParse {}
        lappend filesToParse $firstFfile

        ## Data prepare
        set incdirs {}
        set defines {}
        set sources {}
        set fFiles {}

        ## Sources must match this:

        #puts "Init list of files $filesToParse"
        while {[llength $filesToParse]>0} {

            ## Open File
            set ffile [odfi::common::resolveEnvVariable [lindex $filesToParse 0]]
            set fchan [open $ffile]

            # Remove gotten element from list
            set filesToParse [lreplace $filesToParse 0 0]
            #puts "List of files $filesToParse"

            # Line parsing
            ##################
            while {[gets $fchan line] >= 0} {

                set line [string trim $line]
                #puts "Parsing line: $line"


                ## Use Switch
                ###################
                switch -glob -- $line {

                    "#*" {

                    }

                    *.v    -
                    *.sv   -
                    *.vhd  -
                    *.vhdl -
                    sources {
                        lappend sources $line
                    }

                    "-f *" {

                        set fFilePath           [regsub -- {-f\s*(.+)} $line {\1}]

                       # puts "Spotted F File: $fFilePath"

                        lappend filesToParse    $fFilePath
                        lappend fFiles          $fFilePath
                    }


                    +incdir+* {
                        lappend incdirs [regsub -- {\+incdir\+(.+)} $line {\1}]
                    }
                    "-incdir *" {
                        lappend incdirs [regsub -- {-incdir\s*(.+)} $line {\1}]
                    }
                    +define+* {
                        lappend defines [regsub -- {\+define\+(.+)} $line {\1}]
                    }
                    "-define *" {
                        lappend defines [regsub -- {-define\s*(.+)} $line {\1}]
                    }
                    default {

                        #puts "Unmatched: /$line/"
                    }
                }
            }
            ## EOF Current F File

            close $fchan
        }


        ## Gather results
        #######################

        return [list sources $sources incdirs $incdirs defines $defines fFiles $fFiles]
    }



}
