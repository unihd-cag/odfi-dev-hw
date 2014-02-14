
if {[catch {set dir} res]} {
    set dir [file dirname [file normalize [info script]]]
}

package ifneeded odfi::dev::hw::rtl         1.0.0 [list source [file join $dir rtl rtl-1.0.0.tm]]
package ifneeded odfi::dev::hw::h2dl        1.0.0 [list source [file join $dir rtl h2dl-1.0.0.tm]]
package ifneeded odfi::dev::hw::netlist     1.0.0 [list source [file join $dir netlist netlist-1.0.0.tm]]
package ifneeded odfi::dev::hw::package     1.0.0 [list source [file join $dir package package-1.0.0.tm]]
