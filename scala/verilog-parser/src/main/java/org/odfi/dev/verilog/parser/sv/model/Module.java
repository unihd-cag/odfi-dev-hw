/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.odfi.dev.verilog.parser.parsing.AbstractParsingResultModel;
import org.odfi.dev.verilog.parser.sv.model.ModulePort.DIRECTION;

import com.idyria.osi.tea.string.StringsCommonComponentsSorter;

/**
 * @author rtek
 *
 */
public class Module extends AbstractParsingResultModel {

	
	/**
	 * The name of the module
	 */
	private String name = null;
	
	/**
	 * The I/O ports of the module
	 */
	private TreeSet<ModulePort> ports = new TreeSet<ModulePort>();
	
	/**
	 * The modules that are instantiated by this module
	 */
	private LinkedList<ModuleInstance> moduleInstances = new LinkedList<ModuleInstance>();
	
	
	private LinkedList<Parameter> parameters = new LinkedList<Parameter>();
	
	/**
	 * Marker to avoid grouping more than once
	 */
	private boolean portsGrouped  = false;
	
	/**
	 * 
	 */
	public Module() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param name
	 */
	public Module(String name) {
		super();
		this.name = name;
	}



	/**
	 * Set group parameter of ModulePorts from this Module, base on name patterns
	 */
	public synchronized void groupPortsUsingName() {
		
		if (this.portsGrouped)
			return;
		
		//-- Find common strings in ports that already have the same group instance
		HashMap<ModulePortGroup,LinkedList<ModulePort>> groupsToBeNamed = new HashMap<ModulePortGroup,LinkedList<ModulePort>>();
		
		//-- Only group ports that are not already
		LinkedList<ModulePort> portsTobeSorted = new LinkedList<ModulePort>();
		for (ModulePort port:this.ports) {
			
			//-- No group, try to group
			if (port.getGroup()==null) {
				portsTobeSorted.add(port);
			} else if (port.getGroup().getName().length()==0) {
				
				//-- Grouped aber not named
				if (groupsToBeNamed.get(port.getGroup())==null) {
					groupsToBeNamed.put(port.getGroup(), new LinkedList<ModulePort>());
				}
				groupsToBeNamed.get(port.getGroup()).add(port);
			}
		}
		
		//-- Find a name for unnamed groups
		for (ModulePortGroup group:groupsToBeNamed.keySet()) {
			
			
			//-- Find Common string in the ports
			StringsCommonComponentsSorter<ModulePort> sorter = new StringsCommonComponentsSorter<ModulePort>(groupsToBeNamed.get(group));
			sorter.setCommonStringFilter("(.*)_$","$1");
			sorter.sort();
			sorter.merge();
			
			//-- If at least one, then use the first one as group name
			Set<String> components = sorter.getCommonComponents();
			if (components.size()>0) {
				group.setName(components.toArray(new String[components.size()])[0]);
			}
			
		}
		
		
		//-- Use Common Component finder to get all groups
		StringsCommonComponentsSorter<ModulePort> sorter = new StringsCommonComponentsSorter<ModulePort>(portsTobeSorted);
		sorter.setCommonStringFilter("(.*)_$","$1");
		sorter.sort();
		sorter.merge();
		
		//-- Foreach All groups and set appartenance
		for (String group:sorter.getCommonComponents()) {
			
			//-- Create Group and set
			ModulePortGroup portgroup = new ModulePortGroup(group);
			
			for (ModulePort port:sorter.getObjectsForComponent(group)) {
				port.setGroup(portgroup);
			}
			
		}
		
		
		this.portsGrouped = true;
		
	}
	
	
	/**
	 * Assigns all I/Os a group if they don't have one
	 */
	public void resolvePortGroups() {
		
	}

	/**
	 * Returns the first found clock port in this module
	 * The method is to search for the first input port whose name is ending with clk
	 * @return
	 */
	public ModulePort getClockPort() {
		
		for (ModulePort port : this.ports) {
			if (port.getDirection() == DIRECTION.input && port.getName().endsWith("clk")) {
				return port;
			}
		}
		
		return null;
		
	}
	
	/**
	 * Returns all the found clock ports in this module
	 * The method is to search for the input ports whose name is ending with clk
	 * @return empty list if no ports are found
	 */
	public Collection<ModulePort> getClockPorts() {
		
		List<ModulePort> ports = new LinkedList<ModulePort>();
		for (ModulePort port : this.ports) {
			if (port.getDirection() == DIRECTION.input && port.getName().endsWith("clk")) {
				ports.add(port);
			}
		}
		
		return ports;
		
	}
	
	/**
	 * Returns the first found reset port in this module
	 * The method is to search for the first input port whose name is ending with res_n or res
	 * @return
	 */
	public ModulePort getResetPort() {
		
		for (ModulePort port : this.ports) {
			if (port.getDirection() == DIRECTION.input && (port.getName().endsWith("res")|port.getName().endsWith("res_n"))) {
				return port;
			}
		}
		
		return null;
		
	}
	
	/**
	 * Returns all the found clock ports in this module
	 * The method is to search for the input ports whose name is ending with clk
	 * @return empty list if no ports are found
	 */
	public Collection<ModulePort> getResetPorts() {
		
		List<ModulePort> ports = new LinkedList<ModulePort>();
		for (ModulePort port : this.ports) {
			if (port.getDirection() == DIRECTION.input && (port.getName().endsWith("res")|port.getName().endsWith("res_n"))) {
				ports.add(port);
			}
		}
		
		return ports;
		
	}
	
	/**
	 * Adds a new port
	 * @param port
	 */
	public void addPort(ModulePort port) {
		this.ports.add(port);
	}
	
	public TreeSet<ModulePort> getPorts() {
		return ports;
	}
	
	
	/**
	 * Returns a map with ports grouped together
	 * This method doesn't proceed to any grouping, it justs puts the objects together
	 * The group "" represents the "no group" group
	 * @return
	 */
	public TreeMap<ModulePortGroup,LinkedList<ModulePort>> getPortsGrouped() {
		
		//-- Ensure we have grouped
		this.groupPortsUsingName();
		
		// The default generic group to have everybody sorted
		ModulePortGroup defaultGroup = new ModulePortGroup();
		TreeMap<ModulePortGroup, LinkedList<ModulePort>> portsInGroups = new TreeMap<ModulePortGroup, LinkedList<ModulePort>>();
		for (ModulePort port : this.getPorts()) {
			
			//-- Get list
			LinkedList<ModulePort> ports = portsInGroups.get(port.getGroup()==null?defaultGroup:port.getGroup());
			if (ports==null) {
				ports = new LinkedList<ModulePort>();
				portsInGroups.put(port.getGroup()==null?defaultGroup:port.getGroup(),ports);
			}
			
			//-- Add
			ports.add(port);
			
		}
		
		return portsInGroups;
	}
	
	/**
	 * Get all the ports relative to a group
	 * @param group If null, get all the default group
	 * @return
	 */
	public LinkedList<ModulePort> getPortsForGroup(ModulePortGroup group) {
		//-- FIXME If null is provided, get all the non grouped ports
		//return this.getPortsGrouped().get(group);
		
		//-- Result
		LinkedList<ModulePort> res = new LinkedList<ModulePort>();
		
		//-- Find all ports that belong to a group with provided name
		for (ModulePort port : this.ports) {
			if (port.getGroup()!=null && port.getGroup().getName().equals(group.getName()))
				res.add(port);
		}
		
		return res;
	}
	
	/**
	 * Find all ports that belong to a group with provided name
	 * @param group The group Name
	 * @return
	 */
	public LinkedList<ModulePort> getPortsForGroup(String group) {
		
		//-- Result
		LinkedList<ModulePort> res = new LinkedList<ModulePort>();
		
		//-- Find all ports that belong to a group with provided name
		for (ModulePort port : this.ports) {
			if (port.getGroup()!=null && port.getGroup().getName().equals(group))
				res.add(port);
		}
		
		return res;
	}

	
	/**
	 * Get All the defined groups
	 * @return The defined groups list, or an empty list if none are defined
	 */
	public LinkedList<ModulePortGroup> getPortsGroups() {
		
		//-- Ensure we have grouped
		this.groupPortsUsingName();
		
		//-- Prepare results
		LinkedList<ModulePortGroup> groups = new LinkedList<ModulePortGroup>();
		for (ModulePort port : this.ports) {
			if (port.getGroup()!=null && !groups.contains(port.getGroup()))
				groups.add(port.getGroup());
		}
		
		return groups;
	}
	

	public void setPorts(TreeSet<ModulePort> ports) {
		this.ports = ports;
	}
	
	/**
	 * Returns a port defined by given name
	 * @param name
	 * @return The Port model or null if not found
	 */
	public ModulePort getPort(String name) {
		
		for (ModulePort port:this.ports) {
			if (port.getName().equals(name))
				return port;
		}
		
		return null;
	}
	
	/**
	 * Says if there is a port with provided name
	 * @param name The name
	 * @return true or false if found/not found
	 */
	public boolean hasPort(String name) {
		
		for (ModulePort port:this.ports) {
			if (port.getName().equals(name))
				return true;
		}
		
		return false;
	}
	
	public boolean hasGroup(String groupName) {
		
		//-- Result
		
		
		//-- Find all ports that belong to a group with provided name
		for (ModulePort port : this.ports) {
			if (port.getGroup()!=null && port.getGroup().getName().equals(groupName))
				return true;
		}
		
		return false;
		
		
	}

	/**
	 * @return the name
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

	public void addModuleInstance(ModuleInstance instance) {
		this.getModuleInstances().add(instance);
	}
	
	/**
	 * @return the moduleInstances
	 */
	public LinkedList<ModuleInstance> getModuleInstances() {
		return  moduleInstances;
	}

	/**
	 * Add a parameter object instance to the list of parameters of this module 
	 * @param parameter
	 */
	public void addParameter(Parameter parameter) {
		this.parameters.add(parameter);
	}

	/**
	 * @return the parameters
	 */
	public LinkedList<Parameter> getParameters() {
		return parameters;
	}
	
	/**
	 * 
	 * @param name Name of searched Parameter
	 * @return Parameter or null if not found
	 */
	public Parameter getParameter(String name) {
		
		//-- Search for parameter
		for (Parameter parameter : this.parameters) {
			if (parameter.getName().equals(name))
				return parameter;
		}
		
		return null;
	}
	
	/**
	 * Returns a string representing verilog syntax for the parameters declaration:
	 * #(param = val,param=val ...)
	 * @return
	 */
	public String toParametersDeclarationString() {
		
		//-- Start
		String result = "";
		if (this.getParameters().size()>0)
			result +="#(";
		
		//-- Params
		for (int i=0;i<this.getParameters().size();i++) {
			Parameter param = this.getParameters().get(i);
			result += "parameter "+param.getName()+"="+param.getValue()+(i==this.getParameters().size()-1?"":",") ;
		}
		
		//-- End
		if (this.getParameters().size()>0)
			result +=")";
		
		return result;
	}
	
	/**
	 * Returns a string representing verilog syntax for the parameters instance:
	 * #(.param(param),.param(param),.param(param) ...)
	 * This method propagates per default
	 * @return
	 */
	public String toParametersInstanceString() {
		
		return this.toParametersInstanceString(true);
	}
	
	/**
	 * Returns a string representing verilog syntax for the parameters instance:
	 * #(.param(param),.param(param),.param(param) ...)
	 * @param propagate true: The instance value is the name of parameter to allow propagation, false: It is the expression value
	 * @return
	 */
	public String toParametersInstanceString(boolean propagate) {
		
		//-- Start
		String result = "";
		if (this.getParameters().size()>0)
			result +="#(";
		
		//-- Params
		for (int i=0;i<this.getParameters().size();i++) {
			Parameter param = this.getParameters().get(i);
			String val = propagate? param.getName() : param.getValue().toString();
			result += "."+param.getName()+"("+val+")"+(i==this.getParameters().size()-1?"":",") ;
		}
		
		//-- End
		if (this.getParameters().size()>0)
			result +=")";
		
		return result;
	}
	
	/**
	 * Returns a string representing verilog syntax for the parameters declaration:
	 * #(param = val,param=val ...)
	 * but only limited to the provided group
	 * @return
	 */
	public String toGroupParametersDeclarationString(ModulePortGroup group) {
		
		//-- Collect all the parameters
		TreeSet<Parameter> parameters = new TreeSet<Parameter>();
		for (ModulePort port :this.getPortsForGroup(group)) {
			
			if (port.getSize()!=null && port.getSize().getParameters().size()>0) {
				parameters.addAll(port.getSize().getParameters());
			}
		}
		
		// Create
		//----------------
		//-- Start
		String result = "";
		if (parameters.size()>0)
			result +="#(";
		
		//-- Params
		Iterator<Parameter> it = parameters.iterator();
		while (it.hasNext()) {
			Parameter param = it.next();
			result += "parameter "+param.getName()+"="+param.getValue()+""+(it.hasNext()?",":"") ;
		}
		
		//-- End
		if (parameters.size()>0)
			result +=")";
		
		return result;
		
	}
	
	/**
	 * Returns a string representing verilog syntax for the parameters declaration:
	 * #(param = val,param=val ...)
	 * but only limited to the provided group
	 * @return
	 */
	public String toGroupParametersInstanceString(ModulePortGroup group) {
		
		//-- Collect all the parameters
		TreeSet<Parameter> parameters = new TreeSet<Parameter>();
		for (ModulePort port :this.getPortsForGroup(group)) {
			
			if (port.getSize()!=null && port.getSize().getParameters().size()>0) {
				parameters.addAll(port.getSize().getParameters());
			}
		}
		
		// Create
		//----------------
		//-- Start
		String result = "";
		if (parameters.size()>0)
			result +="#(";
		
		//-- Params
		Iterator<Parameter> it = parameters.iterator();
		while (it.hasNext()) {
			Parameter param = it.next();
			result += "."+param.getName()+"("+param.getName()+")"+(it.hasNext()?",":"") ;
		}
		
		//-- End
		if (parameters.size()>0)
			result +=")";
		
		return result;
		
	}
	
	/**
	 * 
	 * @return true if the provided group has any parameters, false otherwise
	 */
	public boolean groupHasParameters(ModulePortGroup group) {
		
		//-- Collect all the parameters
		LinkedList<Parameter> parameters = new LinkedList<Parameter>();
		for (ModulePort port :this.getPortsForGroup(group)) {
			
			if (port.getSize()!=null && port.getSize().getParameters().size()>0) {
				parameters.addAll(port.getSize().getParameters());
			}
		}
		
		//-- Return boolean depending on collected set size
		return parameters.size()>0? true : false;
	}
	
	/**
	 * 
	 * @return true if the provided group has any parameters, false otherwise
	 */
	public boolean hasParameters() {
		
		//-- Return boolean depending on collected set size
		return this.getParameters().size()>0? true : false;
	}

	/**
	 * Verifies all the parameters declared in I/Os, and add them to main parameters if they are not present
	 */
	public void resolveParameters() {
		
		for (ModulePort port : this.getPorts()) {
			if (port.getSize()!=null)
			for (Parameter parameter : port.getSize().getParameters()) {
				if (this.getParameter(parameter.getName())==null) {
					this.addParameter(parameter);
				}
			}
			
		}
		
	}



	@Override
	public String toString() {
		if (this.name!=null && this.name.length()>0) {
			return this.name;
		}
		return super.toString();
	}
	
	
	
}
