/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.model;

/**
 * Represents
 * @author rleys
 *
 */
public class Parameter implements Comparable<Parameter> {

	/**
	 * Name of the parameter
	 */
	protected String name = null;
	
	protected SVExpression value = null;

	/**
	 * @param name
	 * @param value
	 */
	public Parameter(String name, SVExpression value) {
		super();
		this.name = name;
		this.value = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the value
	 */
	public SVExpression getValue() {
		return value;
	}
	
	

	/**
	 * @param value the value to set
	 */
	public void setValue(SVExpression value) {
		this.value = value;
	}

	@Override
	public int compareTo(Parameter o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	

}
