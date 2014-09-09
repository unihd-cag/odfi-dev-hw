/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.model;

import java.util.HashMap;

/**
 * 
 * Represents a Port Group, with its name and properties
 * 
 * @author rleys
 *
 */
public class ModulePortGroup implements Comparable<ModulePortGroup> {

	/**
	 * The name of the group
	 */
	protected String name = "";
	
	/**
	 * Parameters to value Map
	 */
	protected HashMap<String,String> parameters = new HashMap<String,String>();
	
	
	/**
	 * 
	 */
	public ModulePortGroup() {
	}

	/**
	 * @param name
	 */
	public ModulePortGroup(String name) {
		super();
		this.name = name;
	}


	/**
	 * Set the value of a parameter
	 * @param parameter
	 * @param value
	 */
	public void addParameter(String parameter,String value) {
		this.parameters.put(parameter, value);
	}

	/**
	 * Get the value of the given parameter
	 * @param parameter
	 * @return The value or null if the parameter doesn't exists
	 */
	public String getParameter(String parameter) {
		if (!this.parameters.containsKey(parameter))
			return null;
		return this.parameters.get(parameter);
	}
	
	/**
	 * @return the name . If unamed group, returns 0 length string
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String res = this.getName();
		for (String param : this.parameters.keySet()) {
			res += ","+param+"["+this.parameters.get(param)+"]";
		}
		return res;
	}

	@Override
	public int compareTo(ModulePortGroup o) {
		return this.getName().compareTo(o.getName());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected ModulePortGroup clone() throws CloneNotSupportedException {
		
		ModulePortGroup group = new ModulePortGroup(this.getName());
		group.parameters = this.parameters;
		
		
		return group;
	}

	
	
	
	
	
}
