/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.model;

/**
 * @author rtek
 *
 */
public class ModulePort implements Comparable<ModulePort>,Cloneable {

	/**
	 * An Extra Field to have group names assigned to I/Os and have them logically put together
	 */
	public ModulePortGroup group = null;
	
	
	public enum DIRECTION { input,output,inout };
	
	public enum TYPE {wire,reg};
	
	private DIRECTION direction = DIRECTION.input;
	
	private TYPE type = TYPE.wire;
	
	private SVExpression size = null;
	
	private String name = null;
	
	
	
	/**
	 * 
	 */
	public ModulePort() {
		super();
	}



	/**
	 * @return the direction
	 */
	public DIRECTION getDirection() {
		return direction;
	}



	/**
	 * @param direction the direction to set
	 */
	public void setDirection(DIRECTION direction) {
		this.direction = direction;
	}



	/**
	 * @return the type
	 */
	public TYPE getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(TYPE type) {
		this.type = type;
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



	
	
	/**
	 * @return the size
	 */
	public SVExpression getSize() {
		return size;
	}



	/**
	 * @param size the size to set
	 */
	public void setSize(SVExpression size) {
		this.size = size;
	}



	/**
	 * @return the group
	 */
	public ModulePortGroup getGroup() {
		return group;
	}



	/**
	 * @param group the group to set
	 */
	public void setGroup(ModulePortGroup group) {
		this.group = group;
	}


	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}

	/**
	 * Returns a I/O port declaration string
	 * @return
	 */
	public String toDeclarationString() {
		
		StringBuilder result = new StringBuilder();
		
		
		result.append(this.getDirection().toString()+"    ");
		result.append(this.getType().toString()+" ");
		if (this.getSize()!=null) {
			result.append("["+this.getSize().getExpression()+":0]"+"    ");
		}
		result.append(this.getName());
		
		return result.toString();
		
	}
	
	/**
	 * Returns a I/O port declaration string
	 * @return
	 */
	public String toWireDeclarationString() {
		
		StringBuilder result = new StringBuilder();

		result.append("wire ");
		if (this.getSize()!=null) {
			result.append("["+this.getSize().getExpression()+":0]"+"    ");
		}
		result.append(this.getName());
		
		return result.toString();
		
	}

	/**
	 * Reverts the port direction( I will be O and O will be I)
	 * inout definitions are not reversed
	 * @return This object, to allow chaining of calls (like clone().revertDirection())
	 */
	public ModulePort revertDirection() {
		
		if (this.getDirection()==DIRECTION.input) {
			this.setDirection(DIRECTION.output);
		} else if (this.getDirection()==DIRECTION.output) {
			this.setDirection(DIRECTION.input);
		}
		
		return this;
	}
	
	@Override
	public int compareTo(ModulePort o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public ModulePort clone() throws CloneNotSupportedException {
		
		ModulePort clone = new ModulePort();
		clone.setName(this.getName());
		clone.setDirection(this.getDirection());
		if (this.getSize()!=null)
			clone.setSize(this.getSize());
		if (this.getGroup()!=null)
			clone.setGroup(new ModulePortGroup(this.getGroup().getName()));
			
		return clone;
	}
	
	
	

}
