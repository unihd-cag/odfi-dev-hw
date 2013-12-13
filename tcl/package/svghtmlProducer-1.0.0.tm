package provide odfi::dev::hw::package::producer::svgHTML  1.0.0
package require odfi::dev::hw::package  1.0.0
#package require odfi::dev::hw::package::producer::svg      1.0.0

namespace eval odfi::dev::hw::package::producer::svgHTML  {

    ############################
    ## SVG HTML Producer 
    ## - Creates an SVG using SVG Producer 
    ## - Creates an HTML viewer file an embedd the SVG inside
    #############################
    itcl::class SvgHTMLProducer {
        inherit ::odfi::dev::hw::package::BaseOutputGenerator


        ## Create HTML To Given String
        public method produceToString args {

           return ""


        }

        ## Create HTML Viewer To Given File
        public method produceToFile file {

            ## Create String 
            set res [produceToString]

            ## Write to file 
            odfi::files::writeToFile $file $res
        }   

    }

}
