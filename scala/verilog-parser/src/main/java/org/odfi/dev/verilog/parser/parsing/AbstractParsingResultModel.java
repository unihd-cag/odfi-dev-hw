/**
 * 
 */
package org.odfi.dev.verilog.parser.parsing;

import org.antlr.runtime.tree.CommonTree;

/**
 * A base class for model objects that are creating using parser.
 * This class stores some default objects like sourec information and so on
 * @author rleys
 *
 */
public abstract class AbstractParsingResultModel {

	protected SourceInformations parserSourceInformations = null;
	
	/**
	 * 
	 */
	public AbstractParsingResultModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Derive Source informations from the provided Tree Token
	 * @param treeToken
	 */
	public void setParserSourceInformations(CommonTree treeToken) {
		this.parserSourceInformations = new SourceInformations(treeToken);
	}
	
	/**
	 * Returns the SourceInformations derived from parser during processing
	 * @return
	 */
	public SourceInformations getParserSourceInformations() {
		return parserSourceInformations;
	}
	
	
	

}
