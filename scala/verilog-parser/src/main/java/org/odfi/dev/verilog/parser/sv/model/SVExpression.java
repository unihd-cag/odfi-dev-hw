/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.model;

import java.util.LinkedList;

/**
 * @author rleys
 *
 */
public class SVExpression {

	/**
	 * The base expression string
	 */
	protected String expression = null;
	
	/**
	 * All the parameters found in the expression
	 */
	protected LinkedList<Parameter> parameters = new LinkedList<Parameter>();
	
	/**
	 * 
	 */
	public SVExpression() {

	}

	/**
	 * @param expression
	 */
	public SVExpression(String expression) {
		super();
		this.expression = expression;
	}

	/**
	 * @return the expression
	 */
	public String getExpression() {
		return expression;
	}
	

	/**
	 * @param expression the expression to set
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}

	/**
	 * Adds a parameter to the found list
	 * @param name
	 */
	public void addParameter(Parameter parameter) {
		if (parameter !=null && !this.parameters.contains(parameter)) {
			this.parameters.add(parameter);
		}
	}

	/**
	 * @return the parameters
	 */
	public LinkedList<Parameter> getParameters() {
		return parameters;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.expression!=null) {
			return this.expression;
		}
		return super.toString();
	}
	
	public int toInt() {
		if (this.expression!=null) {
			return Integer.parseInt(this.expression)+1;
		}
		return 0;
	}
	
}
