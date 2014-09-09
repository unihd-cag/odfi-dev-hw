/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.model;

import java.util.HashMap;

/**
 * @author rleys
 *
 */
public class ModuleInstance {

	/**
	 * Type of module
	 */
	private String type = null;
	
	/**
	 * Name of module Instance
	 */
	private String name = null;
	
	/**
	 * Map storing parameters values for this instance
	 */
	private HashMap<Parameter,SVExpression> parameterValues = new HashMap<Parameter,SVExpression>();

	/**
	 * @param type
	 * @param name
	 */
	public ModuleInstance(String type, String name) {
		this(name);
		this.type = type;
	}
	
	public ModuleInstance(String name) {
		super();
		this.name = name;
	}
	
	public void setParameterValue(Parameter parameter,SVExpression value) {
		this.parameterValues.put(parameter, value);
	}

	/**
	 * Returns the value of a parameter or null
	 * @param parameter
	 * @return
	 */
	public SVExpression getParameterValue(Parameter parameter) {
		return this.parameterValues.get(parameter);
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	

}
