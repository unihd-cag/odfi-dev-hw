
## Package General informations
######################
data /package/current {

    implementation {

        switch -exact -- [$application currentPackage] {
            "" {
                json {
                    - result : "none"
                }
            }
            default {

                set package [$application currentPackage]
                json {
                    - result : "[$package name]"
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

        if {![odfi::common::isClass [$application currentPackage] odfi::dev::hw::package::Package]} {
            error "Could not Find Any Selected package to produce a view"
        } else {

            set svgOut [::new odfi::dev::hw::package::SVGOutput #auto [$application currentPackage]]

            ## Do we have any rules 
            if {[regexp {rules=(.+)} $request(query) -> rules]} {

                set rules [::ncgi::decode $rules]
                puts "Using rules: $rules"
                $svgOut defineParameters $rules

            }

            return [list "application/svg" [$svgOut produceToString]]
        }

    }

   # set dataSource [::new odfi::dev::hw::package::SVGOutput #auto [$application currentPackage]]
}


