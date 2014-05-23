# DML #

*The Device Modeling Language (DML) is a language to describe models for Allegro Sigrity tools. Since the language is not very convinient you can create DML code through the **DMLOutput producer** using the [odfi_package_footprint tool](Package.md "odfi_package_footprint tool"). Before reading this you should check out how to use this tool and how to create a part file with attributes using tcl code because this is required to create DML code.*

##Attributes ##

To generate a valid DML code you have to use some attributes in the tcl code creating the part file you want to use to create the code:

* Output/Input

	You have to specifiy wether a pin is an input or output pin. This is done by creating and using the attribute <code>input</code> or <code>output</code> with no parameters.
Only if it is a power or ground pin these attributes are not required. Instead you have to create and use the <code>power</code> attribute. Also the name of the pin has to contain <code>GND/VSS</code> or <code>VDD/VCC</code> accordingly.
	Examples:

	<code>pin { EN @8 } \

        {

                attr::input

        }

	<code>pin { GND @13 } \

        {

                attr::power

        }

	You can also use none of the above and define your own signl model by using the <code>signal_model</code> attribute. This model has to be an IOCell stored in a library (see Cadence Documentation). It has to be an IOCell DML code saved in your home folder (<code>C:\Documents and Settings\pcb_\*\*</code>). For a more detailed description see below.

* DiffPairs 

	If two pins make up a differential pair you have to use the following rules:

	1. The positive pin has to end in <code>_p</code>, the negative one in <code>_n</code>

	2. Both pins have to have the attribute <code>differential</code> with the parameter
being the name of the other pin

	3. If you want you can specifiy the differential delay in nanoseconds by using the <code>differential_delay</code> attribute

	Example:

	<code>pin { Q0_p @15 } \

        {
                attr::output

                attr::differential Q0_n

                attr::differential_delay 2

        }

        pin { Q0_n @16 } \

        {

                attr::output

                attr::differential Q0_p

        }

* Buffer Delay

	If you want you can specify a buffer delay in seconds using the <code>buffer_delay_rise</code> and <code>buffer_delay_fall</code> attributes. You have to use either none or both of them.
	
	Example:

	<code>pin { Q0_p @15 } \

        {

                attr::output

                attr::differential Q0_n

                attr::buffer_delay_fall 1.37573e-09

                attr::buffer_delay_rise 1.37573e-09

        }

##Creating and saving the code##

After creating the \*.part or \*part.tcl file you use the <code>odfi_package_footprint</code> tool. Select the <code>DMLOutput</code> Producer and save the created code in a windows environment *(as NAME.dml in your home folder (<code>C:\Documents and Settings\pcb_\*\*</code>) where NAME is the **part name**)*.

To validate the code you can use the <code>Model Integrity</code> tool (<code>C:\Cadence\SPB_16.6\tools\pcb\bin\modelintegrity</code>)

To use the code you first have to create a \*.ndx file containing the following line:

<code>PackagedDevice PARTNAME PARTNAME.dml -</code>

and also save it in the home folder. This way the *Design Entry CIS* tool can recognize the DML model.

##Using the Code##
Start the *Design Entry CIS* tool (<code>C:\Cadence\SPB_16.6\tools\capture\Capture</code>).
After placing parts you can assign your DML model to them. Before doing that it is recommented to annotate (right click on the project and click "Annotate"). Then rightclick on the part and select SI Analysis - Assign SI Model. Your \*.ndx file should appear in the Si Library section and you should see your \*.dml in the Model section. Select it and select the part on the left and press "Assign Model". This will assign the \*.dml model to the part.

##Creating an IOCell##
To use your own signal model you have to create an IOCell named after this signal model.

Example (For full list of parameters see the Cadence Help):

<code>
("testiocell.dml"

	(IbisIOCell

	  ("TestOutput"

	    (Technology "CMOS")

	    (Model

	     (ModelType "Output")

	     (Polarity "Non-Inverting")

	     (Enable "Active-High")

	     (C_comp (typical 8p) (minimum 3p) (maximum 10p))

	     )

	    (Ramp

	     (Rise

	      (minimum (dV 3) (dt 1.2n))

	      (typical (dV 3) (dt 0.9n))

	      (maximum (dV 3) (dt 0.48n))

	      )
	     (Fall
	      (minimum (dV 3) (dt 1.2n))
	      (typical (dV 3) (dt 0.9n))
	      (maximum (dV 3) (dt 0.48n))
	      )
	     )

	    ; No input thresholds for an output model.
	    (LogicThresholds
	     (Output (High (typical 4.5)) (Low (typical 0.1)))
	     )

	    (DelayMeasurementFixture
	     (C 0p) (R 500) (V 5)
	     (Threshold (minimum 2.5) (maximum 2.5) (typical 2.5)))
	    (PullDown
	     (ReferenceVoltage (minimum 0) (typical 0) (maximum 0))
	     (VICurve "-5.0 -110.0ma -110.0ma -110.0ma
		      -4.0 -105.0ma -105.0ma -105.0ma
		      -3.0 -103.0ma -103.0ma -103.0ma
		      -2.0 -92ma -92ma -92ma
		      -1.0 -35ma -35ma -35ma
		       0.0 0ma 0ma 0ma
		       0.5 35ma 35ma 35ma
		       1.0 57ma 57ma 57ma
		       1.5 76ma 76ma 76ma
		       2.0 92ma 92ma 92ma
		       2.5 100ma 100ma 100ma
		       3.0 103ma 103ma 103ma
		       3.5 105ma 105ma 105ma
		       4.0 108ma 108ma 108ma
		       4.5 109ma 109ma 109ma
		       5.0 110ma 110ma 110ma
		      10.0 115ma 115ma 115ma
	      ")
	     )
	    (PullUp
	     (ReferenceVoltage (minimum 5) (typical 5) (maximum 5))
	     (VICurve "10 -57ma -57ma -57ma
		       5 -55ma -55ma -55ma
		       4.5 -54ma -54ma -54ma
		       4.0 -53ma -53ma -53ma
		       3.5 -51ma -51ma -51ma
		       3.0 -48ma -48ma -48ma
		       2.5 -43ma -43ma -43ma
		       2.0 -37ma -37ma -37ma
		       1.5 -30ma -30ma -30ma
		       1.0 -22ma -22ma -22ma
		       0.5 -13ma -13ma -13ma
		       0.0 0ma 0ma 0ma
		      -1.0 22ma 22ma 22ma
		      -2.0 37ma 37ma 37ma
		      -3.0 46ma 46ma 46ma
		      -4.0 53ma 53ma 53ma
		      -5.0 55ma 55ma 55ma
	      ")
	     )
	    (GroundClamp
	     (ReferenceVoltage (minimum 0) (typical 0) (maximum 0))
	     (VICurve  "0.0 0 0 0
		      -0.1  0 0 0
		      -0.4 -0.1ma -0.1ma -0.1ma
		      -0.5 -0.5ma -0.5ma -0.5ma
		      -0.6 -1.2ma -1.2ma -1.2ma
		      -0.7 -2.4ma -2.4ma -2.4ma
		      -0.8 -6ma -6ma -6ma
		      -0.9 -13ma -13ma -13ma
		      -1.0 -25ma -25ma -25ma
		      -5.0 -293ma -293ma -293ma
	      ")
	     )
	    (PowerClamp
	     (ReferenceVoltage (minimum 5) (typical 5) (maximum 5))
	     (VICurve  "0.0 0ma 0ma 0ma
		      -0.1  0   0   0
		      -0.4 0.1ma 0.1ma 0.1ma
		      -0.5 0.6ma 0.6ma 0.6ma
		      -0.6 1.2ma 1.2ma 1.2ma
		      -0.7 2.4ma 2.4ma 2.4ma
		      -0.8 8ma 8ma 8ma
		      -0.9 13ma 13ma 13ma
		      -1.0 25ma 25ma 25ma
		      -5.0 293ma 293ma 293ma
	      ")
	     )
    ) ) )
</code>

Here the signal model would be "TestOutput"

Save the file in your home folder. In order to use the signal model you also have to use the following line in an \*.ndx file in your home folder:

<code>IbisIOCell	SIGNALMODELNAME	FILENAME.dml -</code>

In our example this would be:

<code>IbisIOCell	TestOutput	testiocell.dml -</code>

You may change the IbisIOCell depending on the type of IOCell (e.g. IbisOutput, see Cadence Help for more info)

Then the signal model referenced by the <code>signal_model</code> attribute should be recognized. If that isn't the case it is useful to open the Library Management of Cadence to see if the IOCell is recognized and/or to create a new Library for the IOCell. To open it open <code>Allegro PCB SI</code>, click on: Analyze - Model Browser. Then see if your file/IOCell is shown in the "DML Models" tab.