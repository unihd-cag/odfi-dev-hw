/**
 * 
 */
package org.odfi.dev.verilog.parser.sv.full;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.odfi.dev.verilog.parser.LanguageBasedModel;
import org.odfi.dev.verilog.parser.sv.model.Module;
import org.odfi.dev.verilog.parser.sv.model.Verilog;
import org.odfi.dev.verilog.parser.sv.preproc.SystemVerilogPreprocessorLexer;
import org.odfi.dev.verilog.parser.sv.preproc.SystemVerilogPreprocessorParser;


/**
 * @author rleys
 *
 */
public class SystemVerilogModel extends
		LanguageBasedModel<SystemVerilogFullParser, SystemVerilogFullLexer> {

	private	Module module = null;

	
	/**
	 * @param input
	 */
	public SystemVerilogModel(InputStream input) {
		super(input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor from stream
	 * @param input
	 */
	public SystemVerilogModel(String input) {
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
	protected SystemVerilogFullLexer createLexer() throws IOException {
		// TODO Auto-generated method stub
//		return new SystemVerilogFullLexer(new ANTLRInputStream(inputStream));
		
		return new SystemVerilogFullLexer(preprocessParser!=null? new ANTLRStringStream(this.preprocessParser.getTokenStream().toString()):new ANTLRInputStream(inputStream));
	}

	
	
	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#createParser()
	 */
	@Override
	protected SystemVerilogFullParser createParser() {
		// TODO Auto-generated method stub
		return new SystemVerilogFullParser(new CommonTokenStream(lexer));
	}

	/* (non-Javadoc)
	 * @see uni.hd.cag.languages.LanguageBasedModel#parse()
	 */
	@Override
	public void doParse() {
		
		try {
		
			//-- Parse
			CommonTree ct = (CommonTree) super.parser.verilog().getTree();
			
			//-- Tree Parse
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(ct);
			SystemVerilogTree treeparser = new SystemVerilogTree(nodes, null);
			
			//-- Gather
			//-------------
			
			//-- If a module is already provided, parse only a module over it
			if (this.module!=null) {
				
				treeparser.verilog_module(this.module);
				
			} else {
				
				//-- Parse verilog, and gather module
				Verilog v = treeparser.verilog();
				this.module = v.getModules().size()>0?v.getModules().get(0):null;
			}
			
			
			
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
			
//			System.out.println("Filtered: "+((SystemVerilogPreprocessorParser)this.preprocessParser).getTokenStream());
			
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
	}

	
	
	
}
