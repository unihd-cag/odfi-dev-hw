
package require odfi::ewww::webdata 1.0.0

namespace eval odfi::dev::hw::package::www {

    set webappBase [file dirname [file normalize [info script]]]

    ################################################################################
    ## Classes
    ################################################################################
    odfi::common::resetNamespaceClasses [namespace current]

    ##################
    ## Creates an Embedded Webserver on a port, and registers handlers for viewing
    ###################
    itcl::class PackageWebapp {
        inherit odfi::ewww::webdata::WebdataApplication

        ## The currently selected package 
        odfi::common::classField protected currentPackage ""

	## Available packages
	odfi::common::classField protected availablePackages ""

	##The Directories
	odfi::common::classField protected directories ""

	##Load Rules for current Package
	odfi::common::classField protected rules ""

	## current producer
	odfi::common::classField protected producer ""

	##availableProducers
	odfi::common::classField protected availableProducers ""

        constructor args {odfi::ewww::webdata::WebdataApplication::constructor "package" {}} {

            ## Init 
            ####################
            set applicationFolder $odfi::dev::hw::package::www::webappBase
            set application $this
            
            ###############
            ## Views
            ###############

            #### /index 
            view / {

                tview "index.html"


            }

            ##################
            ## Datas 
            ##################
            source $odfi::dev::hw::package::www::webappBase/datas.tcl

        }

    }


}
