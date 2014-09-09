/**
 * 
 */
package org.odfi.dev.verilog.parser.parsing;

import org.antlr.runtime.tree.CommonTree;

/**
 * Gathers informations from parsing for a specific node, like line/character positioning
 * This is useful for tools (like eclipse plugins) needing such informations to perform syntax highlighting for example
 * 
 * @author rleys
 *
 */
public class SourceInformations {

	protected int line = -1;
	protected int columnStart = -1;
	protected int columnEnd = -1;
	
	
	/**
	 * Init from CommonTree token
	 */
	public SourceInformations(CommonTree treeToken) {
		
		this.line = treeToken.getLine();
		this.columnStart = treeToken.getCharPositionInLine();
		if (treeToken.getText()!=null) {
			this.columnEnd = this.columnStart+treeToken.getText().length();
		}
		
	}

	
	public int length() {
		return this.getColumnEnd()-this.getColumnStart();
	}

	public int getLine() {
		return line;
	}


	public int getColumnStart() {
		return columnStart;
	}


	public int getColumnEnd() {
		return columnEnd;
	}
	
	
	

}
