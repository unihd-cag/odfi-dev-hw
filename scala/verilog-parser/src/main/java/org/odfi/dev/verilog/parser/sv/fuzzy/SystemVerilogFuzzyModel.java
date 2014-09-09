/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.fuzzy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.odfi.dev.verilog.parser.LanguageBasedModel;
import org.odfi.dev.verilog.parser.sv.preproc.SystemVerilogPreprocessorLexer;
import org.odfi.dev.verilog.parser.sv.preproc.SystemVerilogPreprocessorParser;


/**
 * @author rleys
 *
 */
public class SystemVerilogFuzzyModel extends
		LanguageBasedModel<SystemVerilogFuzzyParser, SystemVerilogFuzzyLexer> {

	
	private String moduleName = null;
	
	private List<String> instanciationList = null;
	
	/**
	 * Constructor from stream
	 * @param input
	 */
	public SystemVerilogFuzzyModel(InputStream input) {
		super(input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor from stream
	 * @param input
	 */
	public SystemVerilogFuzzyModel(String input) {
		super(new ByteArrayInputStream(input.getBytes()));
		// TODO Auto-generated constructor stub
	}
	

	
	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#createPreprocessLexer()
	 */
	@Override
	protected Lexer createPreprocessLexer() throws IOException {
		return new SystemVerilogPreprocessorLexer(new ANTLRInputStream(inputStream));
	}

	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#createPreprocessParser()
	 */
	@Override
	protected Parser createPreprocessParser() throws IOException {
		return new SystemVerilogPreprocessorParser(new TokenRewriteStream(this.preprocessLexer));
	}
	
	
	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#createLexer()
	 */
	@Override
	protected SystemVerilogFuzzyLexer createLexer() throws IOException {
		// TODO Auto-generated method stub
		return new SystemVerilogFuzzyLexer(preprocessParser!=null? new ANTLRStringStream(this.preprocessParser.getTokenStream().toString()):new ANTLRInputStream(inputStream));
	}

	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#createParser()
	 */
	@Override
	protected SystemVerilogFuzzyParser createParser() {
		// TODO Auto-generated method stub
		return new SystemVerilogFuzzyParser(new CommonTokenStream(this.lexer));
	}

	/** 
	 * Does nothing!
	 * @see org.odfi.dev.verilog.parser.LanguageBasedModel#parse()
	 */
	@Override
	public void doParse() {
		
		//-- Module Name
		try {
			this.moduleName = this.parser.module_name();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#doPreParse()
	 */
	@Override
	protected void doPreParse() {
		try {
			
			//System.out.println("Filtered: "+((SystemVerilogPreprocessorParser)this.preprocessParser).getTokenStream());
			
			
			((SystemVerilogPreprocessorParser)this.preprocessParser).preprocess();
			
			//System.out.println("Filtered: "+((SystemVerilogPreprocessorParser)this.preprocessParser).getTokenStream());
			
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * @return the moduleName
	 */
	public String getModuleName() {
		if (moduleName==null) {
			try {
				this.moduleName = this.parser.module_name();
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return moduleName;
	}

	/**
	 * @return the instanciationList
	 */
	public List<String> getInstanciationList() {
		if (this.instanciationList==null) {
			try {
				this.instanciationList = this.parser.module_instanciations_types();
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instanciationList;
	}

	
	
	
}
