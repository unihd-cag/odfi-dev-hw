## This package provides some Utilities to work around netlist definitions for Designs
package provide odfi::dev::hw::netlist     1.0.0


package require odfi::closures 2.0.0


namespace eval odfi::dev::hw::netlist {

    odfi::common::resetNamespaceClasses [namespace current]

    ###############################
    ## Class Definition 
    ####################################
    itcl::class FFile {

        odfi::common::classField public  incdirs {}
        odfi::common::classField public  defines {}
        odfi::common::classField public  sources {}
        odfi::common::classField public  fFiles {}


        ## Sources 
        ########################

        public method addSource path {

            lappend sources $path
        }

        public method eachSource closure {
            odfi::list::each $sources {
                odfi::closures::doClosure $closure 1
            }
        }

        public method getSources args {
            return $sources
        }

        ## F Files 
        ###############
        public method addFfile path {

            lappend fFiles $path
        }

        public method eachFFile closure {
            odfi::list::each $fFiles {
                odfi::closures::doClosure $closure 1
            }
        }

        ## Incdirs 
        ###################

        public method addIncdir path {

            lappend incdirs $path
        }

        public method eachIncdir closure {
            odfi::list::each $incdirs {
                odfi::closures::doClosure $closure 1
            }
        }

        public method statistics args {

            set sort true

            puts "--------- F Files ----------------"
            puts "----------------------------------"
            puts ""

            foreach fFile $fFiles {

                puts "$fFile"

            }

            puts ""
            puts "--------- Defines ----------------"
            puts "----------------------------------"
            puts ""

            foreach define $defines {

                puts "$define"

            }


            puts ""
            puts "--------- Include Directories ----"
            puts "----------------------------------"
            puts ""


            foreach incdir $incdirs {

                puts "$incdir"

            }


            puts ""
            puts "--------- Sources ----------------"
            puts "----------------------------------"
            puts ""

            set sourceFiles $sources
            if {$sort} {
                odfi::common::logInfo "Following Source Files are sorted by name"
                puts ""

                set sourceFiles [lsort $sourceFiles]

            }
            foreach sourceFile $sources {

                puts "$sourceFile"

            }

        }
        
    }



    ## Parses an FFile using and create an object from the resulting list 
    proc createFFile firstFfile {

        ## Prepare 
        set fFile [::new [namespace current]::FFile #auto]


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

            # Remove retrieved element from list
            set filesToParse [lreplace $filesToParse 0 0]
            #puts "List of files $filesToParse"

           
            # Add to results 
            $fFile addFfile $ffile


            # Line parsing
            ##################
            set currentLine 0
            while {[gets $fchan line] >= 0} {

                #set line [string trim $line]
                set line [odfi::common::resolveEnvVariable [string trim $line]]
                #puts "Parsing line: $line"

                ## Remove Comments from line 
                set line [string trim [regsub {#.*} $line ""]]

                #puts "Parsing line after comment: $line"


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
                        $fFile addSource $line
                    }

                    "-f *" {

                        set fFilePath           [odfi::common::resolveEnvVariable [regsub -- {-f\s*(.+)} $line {\1}]]

                         ## Verify File existence
                        if {![file exists $fFilePath]} {
                            error "F File $fFilePath was referenced from $ffile but it does not exist"
                        }

                       # puts "Spotted F File: $fFilePath"

                        lappend filesToParse    $fFilePath
                        lappend fFiles          $fFilePath
                        


                    }

                    "*.f" {
                        odfi::common::logWarn "Found F File $line without -f, in file $ffile at line $currentLine "
                    }


                    +incdir+* {
                        lappend incdirs [regsub -- {\+incdir\+(.+)} $line {\1}]
                        $fFile addIncdir [regsub -- {\+incdir\+(.+)} $line {\1}]
                    }
                    "-incdir *" {
                        lappend incdirs [regsub -- {-incdir\s*(.+)} $line {\1}]
                        $fFile addIncdir [regsub -- {-incdir\s*(.+)} $line {\1}]
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

                incr currentLine
            }
            ## EOF Current F File line loop

            close $fchan
        }
        ## EOF all ffiles

        return $fFile

    }

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

                set line [odfi::common::resolveEnvVariable [string trim $line]]
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
