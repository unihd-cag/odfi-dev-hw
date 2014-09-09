/**
 * 
 */
package org.odfi.dev.verilog.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.Lexer;
import org.antlr.runtime.Parser;

/**
 * @author rleys
 * 
 */
public abstract class LanguageBasedModel<P extends Parser, L extends Lexer> {

	protected Lexer preprocessLexer = null;
	
	protected Parser preprocessParser = null;
	
	protected P parser = null;

	protected L lexer = null;

	protected InputStream inputStream = null;

	/**
	 * 
	 */
	public LanguageBasedModel(InputStream input) {
		this();

		this.setInputStream(input);

		// Create Preparser+lexer
		//-------------------------------
		try {
			this.preprocessLexer = this.createPreprocessLexer();
			this.preprocessParser = this.createPreprocessParser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Create parser and lexer
		// ---------------------------
		try {
			this.lexer = this.createLexer();
			this.parser = this.createParser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private LanguageBasedModel() {

	}
	
	

	/**
	 * @param inputStream the inputStream to set
	 */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	protected abstract L createLexer() throws IOException;

	protected abstract P createParser();

	protected Lexer createPreprocessLexer() throws IOException {
		return null;
	}
	
	protected Parser createPreprocessParser() throws IOException {
		return null;
	}
	
	
	/**
	 * Do parse the input parser and lexer are already created. 
	 * Calls the @see #doParse() method
	 */
	public final void parse() {
		
		//-- Call do preparse if necessary
		if (this.preprocessLexer!=null && this.preprocessParser!=null) {
			this.doPreParse();
			
			// Create parser and lexer
			// ---------------------------
			try {
				this.lexer = this.createLexer();
				this.parser = this.createParser();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//-- Call Do parse
		this.doParse();
		
	}

	/**
	 * Do parse the input parser and lexer are already created. Just execute the
	 * action you want
	 */
	protected abstract void doParse();
	
	/**
	 * Preparse action called by parse if preprocessor Lexer+Parser are defined
	 * Does nothing per default
	 */
	protected void doPreParse() {
		
	}
	
	/**
	 * @return the parser
	 */
	public P getParser() {
		return parser;
	}

	
	
}
