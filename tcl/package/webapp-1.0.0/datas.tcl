proc urlDecode {url} {

	regsub -all {\+} $url { } url

	regsub -all {%([0-9a-hA-H][0-9a-hA-H])} $url {[format %c 0x\1]} url

	return [subst $url]

}


## Package General informations
######################
data /package/current {

 implementation {

      set pack [$application currentPackage]  
      switch -exact -- $pack {
            "" {
                json {
                    - result : "no package selected" //none
                }
            }
            default {

                set package $pack
                json {
                    - result : "[$package name]"
                }

            }
        }
    }

}

#get views for producer selected
data /package/views {

 implementation {

    if {[regexp {producer=([^&]+)&?} $request(query) -> prod]} {

        set prod [::ncgi::decode $prod]
        set obj [itcl::find objects -class $prod]
        set prod [lindex $obj 0]
        $application producer $prod
    }

    set prod [$application producer]

    set res "[$prod getViews]"

    json {
       - result : "$res"
    }

  }
}

#get available packages
data /package/available {

 implementation {

      set av [$application availablePackages]  
      switch -exact -- $av {
            "" {
                json {
                    - result : "No Packages available!"
                }
            }
            default {
		set res ""
		foreach package $av {
		  append res " "
		  append res $package
		}
               
                json {
                    - result : "$res"
                }

            }
        }
    }

}

#get rules to a package
data /package/rules {
  implementation {
      set pack [$application currentPackage]
      
      #get the directory:
      set p $pack

      set f [file tail $p]
      set lenF [string length $f]
      set lenD [string length $p]
      set end [expr $lenD - $lenF]
      set dir [string range $p 0 [expr $end - 1]]

      set filename $dir
      set filename [split $filename "~"]
      set filename [lindex $filename end]
      set filename "~$filename"
      set pName [$pack name]

      set pName [split $pName "."]

      set pName [lindex $pName 0]
      append filename $pName
      append filename ".package.rules"

      if {[file exists $filename]} {
	set fp [open $filename r]
	set file_data [read $fp]
	close $fp
      } else {
	set file_data "No Rules saved for this package"
      }

 
      switch -exact -- $filename {
	"" {
	  json {
		      - result : "[::ncgi::decode $file_data]"
		  }
	}
	default {
	  json {
                    - result : "[::ncgi::decode $file_data]"
                }
	}
      }
      
  }
}

#get directories that have been added
data /package/directories {

 implementation {

      set dirs [$application directories]  
      switch -exact -- $av {
            "" {
                json {
                    - result : "no directories selected!" //none
                }
            }
            default {
                set res ""
                foreach dir $dirs {
                    append res " "
                    append res $dir
            }
               
            json {
                    - result : "$res"
                }

            }
        }
    }

}

#get available producers
data /package/availableProducers {

    implementation {

      set prods [$application availableProducers]  
      switch -exact -- $prods {
            "" {
                json {
                    - result : "no producers available!" //none
                }
            }
            default {
                set res ""
                foreach prod $prods {
                    append res " "
                    append res "$prod"
                }
                    
                json {
                    - result : "$res"
                }

            }
        }
    }

}

package require ncgi

## Producer produce
########################
data /producer/produce {

    set implementation {

    set pack [$application currentPackage]

        if {![odfi::common::isClass $pack odfi::dev::hw::package::Part]} {
            error "Could not Find Any Selected package to produce a view"
        } else {

            set out ""
            set view ""

            ## Which producer is selected?
            if {[regexp {producer=([^&]+)&?} $request(query) -> producer]} {
            set producer [::ncgi::decode $producer]
            #set producer [split $producer "&"]
            #set producer [lindex $producer 0]
            set out [::new $producer #auto $pack]
        }
        ## Do we have any rules 
        if {[regexp {rulesArea=([^&]+)&?} $request(query) -> rules]} {

            set rules [::ncgi::decode $rules]
            #TODO: Check if rules = saved rules
            puts "Using rules: $rules"
            $out defineParameters $rules
            $application producer $out
        }
        ##Get selected view
        if {[regexp {packageview=([^&]+)&?} $request(query) -> packageview]} {

            set view $packageview
            puts "Showing view: $view"
        }
        $application producer $out

            return [list "application/svg" [$out produceToString -view $view]]
        }

    }

   # set dataSource [::new odfi::dev::hw::package::SVGOutput #auto [$application currentPackage]]
}

data /producer/saveRules {
  set implementation {

  set pack [$application currentPackage]

  #get the directory
  set p $pack  

  set f [file tail $p]
  set lenF [string length $f]
  set lenD [string length $p]
  set end [expr $lenD - $lenF]
  set dir [string range $p 0 [expr $end - 1]]


    array set request $requestArray
    if {[regexp {rulesArea=(.+)} $request(query) -> rules]} {
        set rules [::ncgi::decode $rules]
                    
        #construct filename:
        set filename $dir
        set filename [split $filename "~"]
        set filename [lindex $filename end]
        set filename "~$filename"
        set pName [$pack name]

        set pName [split $pName "."]

        set pName [lindex $pName 0]
        append filename $pName
        append filename ".package.rules"
                    
        puts "saving Rules as $filename"

        # open the file for writing
        set fileId [open $filename "w"]

        #write
        puts -nonewline $fileId $rules
        close $fileId

    }

  }

  return [list "text/plain" ""]
}
