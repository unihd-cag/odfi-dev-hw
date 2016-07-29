// $ANTLR 3.5.2 E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g 2014-11-08 10:38:56

package org.odfi.dev.verilog.parser.sv.preproc;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class SystemVerilogPreprocessorParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENTAR_LONG", "COMMENTAR_SHORT", 
		"CONTENT", "NEWLINE", "PREP_DEFAULT_NETTYPE", "PREP_ELSE", "PREP_ENDIF", 
		"PREP_IFDEF", "PREP_IFNDEF", "PREP_INCLUDE", "WORD", "WS", "'\"'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int COMMENTAR_LONG=4;
	public static final int COMMENTAR_SHORT=5;
	public static final int CONTENT=6;
	public static final int NEWLINE=7;
	public static final int PREP_DEFAULT_NETTYPE=8;
	public static final int PREP_ELSE=9;
	public static final int PREP_ENDIF=10;
	public static final int PREP_IFDEF=11;
	public static final int PREP_IFNDEF=12;
	public static final int PREP_INCLUDE=13;
	public static final int WORD=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SystemVerilogPreprocessorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SystemVerilogPreprocessorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("SystemVerilogPreprocessorParserTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return SystemVerilogPreprocessorParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g"; }


	public static class preprocess_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "preprocess"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:32:1: preprocess : ( ( . )* ( ifdef | ignore ) )* ;
	public final SystemVerilogPreprocessorParser.preprocess_return preprocess() throws RecognitionException {
		SystemVerilogPreprocessorParser.preprocess_return retval = new SystemVerilogPreprocessorParser.preprocess_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:33:3: ( ( ( . )* ( ifdef | ignore ) )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:3: ( ( . )* ( ifdef | ignore ) )*
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:3: ( ( . )* ( ifdef | ignore ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= COMMENTAR_LONG && LA3_0 <= 16)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:4: ( . )* ( ifdef | ignore )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:4: ( . )*
					loop1:
					while (true) {
						int alt1=2;
						switch ( input.LA(1) ) {
						case PREP_IFDEF:
						case PREP_IFNDEF:
							{
							alt1=2;
							}
							break;
						case PREP_DEFAULT_NETTYPE:
							{
							alt1=2;
							}
							break;
						case COMMENTAR_LONG:
						case COMMENTAR_SHORT:
						case CONTENT:
						case NEWLINE:
						case PREP_ELSE:
						case PREP_ENDIF:
						case PREP_INCLUDE:
						case WORD:
						case WS:
						case 16:
							{
							alt1=1;
							}
							break;
						}
						switch (alt1) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:4: .
							{
							matchAny(input); 
							}
							break;

						default :
							break loop1;
						}
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:7: ( ifdef | ignore )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( ((LA2_0 >= PREP_IFDEF && LA2_0 <= PREP_IFNDEF)) ) {
						alt2=1;
					}
					else if ( (LA2_0==PREP_DEFAULT_NETTYPE) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:8: ifdef
							{
							pushFollow(FOLLOW_ifdef_in_preprocess76);
							ifdef();
							state._fsp--;

							}
							break;
						case 2 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:36:14: ignore
							{
							pushFollow(FOLLOW_ignore_in_preprocess78);
							ignore();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "preprocess"


	public static class ifdef_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifdef"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:40:1: ifdef : ifdef_if ifcontent= content (ef= PREP_ENDIF -> template(content=$ifcontent.text) \"<content>\"| ifdef_else elsecontent= content PREP_ENDIF -> template(content=$elsecontent.text) \"<content>\") ;
	public final SystemVerilogPreprocessorParser.ifdef_return ifdef() throws RecognitionException {
		SystemVerilogPreprocessorParser.ifdef_return retval = new SystemVerilogPreprocessorParser.ifdef_return();
		retval.start = input.LT(1);

		Token ef=null;
		ParserRuleReturnScope ifcontent =null;
		ParserRuleReturnScope elsecontent =null;
		ParserRuleReturnScope ifdef_if1 =null;
		ParserRuleReturnScope ifdef_else2 =null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:40:6: ( ifdef_if ifcontent= content (ef= PREP_ENDIF -> template(content=$ifcontent.text) \"<content>\"| ifdef_else elsecontent= content PREP_ENDIF -> template(content=$elsecontent.text) \"<content>\") )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:42:3: ifdef_if ifcontent= content (ef= PREP_ENDIF -> template(content=$ifcontent.text) \"<content>\"| ifdef_else elsecontent= content PREP_ENDIF -> template(content=$elsecontent.text) \"<content>\")
			{
			pushFollow(FOLLOW_ifdef_if_in_ifdef96);
			ifdef_if1=ifdef_if();
			state._fsp--;

			pushFollow(FOLLOW_content_in_ifdef100);
			ifcontent=content();
			state._fsp--;

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:43:3: (ef= PREP_ENDIF -> template(content=$ifcontent.text) \"<content>\"| ifdef_else elsecontent= content PREP_ENDIF -> template(content=$elsecontent.text) \"<content>\")
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==PREP_ENDIF) ) {
				alt4=1;
			}
			else if ( (LA4_0==PREP_ELSE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:46:5: ef= PREP_ENDIF
					{
					ef=(Token)match(input,PREP_ENDIF,FOLLOW_PREP_ENDIF_in_ifdef120); 

					//      System.out.println("`ifdef has content: "+(ifcontent!=null?input.toString(ifcontent.start,ifcontent.stop):null)+"//"+(ef!=null?ef.getText():null));
					    
					// TEMPLATE REWRITE
					// 52:5: -> template(content=$ifcontent.text) \"<content>\"
					{
						retval.st = new StringTemplate(templateLib, "<content>",new STAttrMap().put("content", (ifcontent!=null?input.toString(ifcontent.start,ifcontent.stop):null)));
					}


					((TokenRewriteStream)input).replace(
					  ((Token)retval.start).getTokenIndex(),
					  input.LT(-1).getTokenIndex(),
					  retval.st);


					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:55:5: ifdef_else elsecontent= content PREP_ENDIF
					{
					pushFollow(FOLLOW_ifdef_else_in_ifdef170);
					ifdef_else2=ifdef_else();
					state._fsp--;

					pushFollow(FOLLOW_content_in_ifdef178);
					elsecontent=content();
					state._fsp--;

					match(input,PREP_ENDIF,FOLLOW_PREP_ENDIF_in_ifdef184); 

					//      System.out.println("`ifdef : "+(ifdef_if1!=null?input.toString(ifdef_if1.start,ifdef_if1.stop):null));
					//      System.out.println("else has content: "+(elsecontent!=null?input.toString(elsecontent.start,elsecontent.stop):null)+"("+(ifdef_else2!=null?input.toString(ifdef_else2.start,ifdef_else2.stop):null)+")");
					    
					// TEMPLATE REWRITE
					// 62:5: -> template(content=$elsecontent.text) \"<content>\"
					{
						retval.st = new StringTemplate(templateLib, "<content>",new STAttrMap().put("content", (elsecontent!=null?input.toString(elsecontent.start,elsecontent.stop):null)));
					}


					((TokenRewriteStream)input).replace(
					  ((Token)retval.start).getTokenIndex(),
					  input.LT(-1).getTokenIndex(),
					  retval.st);


					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifdef"


	public static class ifdef_if_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifdef_if"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:66:1: ifdef_if : ( PREP_IFDEF | PREP_IFNDEF ) WORD ;
	public final SystemVerilogPreprocessorParser.ifdef_if_return ifdef_if() throws RecognitionException {
		SystemVerilogPreprocessorParser.ifdef_if_return retval = new SystemVerilogPreprocessorParser.ifdef_if_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:66:9: ( ( PREP_IFDEF | PREP_IFNDEF ) WORD )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:67:3: ( PREP_IFDEF | PREP_IFNDEF ) WORD
			{
			if ( (input.LA(1) >= PREP_IFDEF && input.LA(1) <= PREP_IFNDEF) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,WORD,FOLLOW_WORD_in_ifdef_if226); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifdef_if"


	public static class ifdef_else_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifdef_else"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:74:1: ifdef_else : PREP_ELSE ;
	public final SystemVerilogPreprocessorParser.ifdef_else_return ifdef_else() throws RecognitionException {
		SystemVerilogPreprocessorParser.ifdef_else_return retval = new SystemVerilogPreprocessorParser.ifdef_else_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:74:11: ( PREP_ELSE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:75:3: PREP_ELSE
			{
			match(input,PREP_ELSE,FOLLOW_PREP_ELSE_in_ifdef_else241); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifdef_else"


	public static class content_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "content"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:82:1: content : ( content_text | include )* ;
	public final SystemVerilogPreprocessorParser.content_return content() throws RecognitionException {
		SystemVerilogPreprocessorParser.content_return retval = new SystemVerilogPreprocessorParser.content_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:82:8: ( ( content_text | include )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:82:10: ( content_text | include )*
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:82:10: ( content_text | include )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= COMMENTAR_LONG && LA5_0 <= NEWLINE)||(LA5_0 >= PREP_IFDEF && LA5_0 <= PREP_IFNDEF)||(LA5_0 >= WORD && LA5_0 <= 16)) ) {
					alt5=1;
				}
				else if ( (LA5_0==PREP_INCLUDE) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:82:12: content_text
					{
					pushFollow(FOLLOW_content_text_in_content255);
					content_text();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:82:28: include
					{
					pushFollow(FOLLOW_include_in_content260);
					include();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "content"


	public static class content_text_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "content_text"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:84:1: content_text : (~ ( PREP_ENDIF | PREP_ELSE | PREP_INCLUDE | PREP_DEFAULT_NETTYPE ) )+ ;
	public final SystemVerilogPreprocessorParser.content_text_return content_text() throws RecognitionException {
		SystemVerilogPreprocessorParser.content_text_return retval = new SystemVerilogPreprocessorParser.content_text_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:84:13: ( (~ ( PREP_ENDIF | PREP_ELSE | PREP_INCLUDE | PREP_DEFAULT_NETTYPE ) )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:84:15: (~ ( PREP_ENDIF | PREP_ELSE | PREP_INCLUDE | PREP_DEFAULT_NETTYPE ) )+
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:84:15: (~ ( PREP_ENDIF | PREP_ELSE | PREP_INCLUDE | PREP_DEFAULT_NETTYPE ) )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= COMMENTAR_LONG && LA6_0 <= NEWLINE)||(LA6_0 >= PREP_IFDEF && LA6_0 <= PREP_IFNDEF)||(LA6_0 >= WORD && LA6_0 <= 16)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:
					{
					if ( (input.LA(1) >= COMMENTAR_LONG && input.LA(1) <= NEWLINE)||(input.LA(1) >= PREP_IFDEF && input.LA(1) <= PREP_IFNDEF)||(input.LA(1) >= WORD && input.LA(1) <= 16) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "content_text"


	public static class include_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "include"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:86:1: include : PREP_INCLUDE '\"' WORD '\"' -> template( \"\";
	public final SystemVerilogPreprocessorParser.include_return include() throws RecognitionException {
		SystemVerilogPreprocessorParser.include_return retval = new SystemVerilogPreprocessorParser.include_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:86:8: ( PREP_INCLUDE '\"' WORD '\"' -> template( \"\")
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:86:10: PREP_INCLUDE '\"' WORD '\"'
			{
			match(input,PREP_INCLUDE,FOLLOW_PREP_INCLUDE_in_include288); 
			match(input,16,FOLLOW_16_in_include290); 
			match(input,WORD,FOLLOW_WORD_in_include292); 
			match(input,16,FOLLOW_16_in_include294); 
			// TEMPLATE REWRITE
			// 86:36: -> template( \"\"
			{
				retval.st = new StringTemplate(templateLib, "");
			}


			((TokenRewriteStream)input).replace(
			  ((Token)retval.start).getTokenIndex(),
			  input.LT(-1).getTokenIndex(),
			  retval.st);


			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "include"


	public static class ignore_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ignore"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:89:1: ignore : PREP_DEFAULT_NETTYPE WORD -> template( \"\";
	public final SystemVerilogPreprocessorParser.ignore_return ignore() throws RecognitionException {
		SystemVerilogPreprocessorParser.ignore_return retval = new SystemVerilogPreprocessorParser.ignore_return();
		retval.start = input.LT(1);

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:89:7: ( PREP_DEFAULT_NETTYPE WORD -> template( \"\")
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\preproc\\SystemVerilogPreprocessor.g:89:9: PREP_DEFAULT_NETTYPE WORD
			{
			match(input,PREP_DEFAULT_NETTYPE,FOLLOW_PREP_DEFAULT_NETTYPE_in_ignore312); 
			match(input,WORD,FOLLOW_WORD_in_ignore314); 
			// TEMPLATE REWRITE
			// 89:35: -> template( \"\"
			{
				retval.st = new StringTemplate(templateLib, "");
			}


			((TokenRewriteStream)input).replace(
			  ((Token)retval.start).getTokenIndex(),
			  input.LT(-1).getTokenIndex(),
			  retval.st);


			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ignore"

	// Delegated rules



	public static final BitSet FOLLOW_ifdef_in_preprocess76 = new BitSet(new long[]{0x000000000001FFF2L});
	public static final BitSet FOLLOW_ignore_in_preprocess78 = new BitSet(new long[]{0x000000000001FFF2L});
	public static final BitSet FOLLOW_ifdef_if_in_ifdef96 = new BitSet(new long[]{0x000000000001FEF0L});
	public static final BitSet FOLLOW_content_in_ifdef100 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_PREP_ENDIF_in_ifdef120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifdef_else_in_ifdef170 = new BitSet(new long[]{0x000000000001FCF0L});
	public static final BitSet FOLLOW_content_in_ifdef178 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_PREP_ENDIF_in_ifdef184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_ifdef_if220 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_WORD_in_ifdef_if226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREP_ELSE_in_ifdef_else241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_content_text_in_content255 = new BitSet(new long[]{0x000000000001F8F2L});
	public static final BitSet FOLLOW_include_in_content260 = new BitSet(new long[]{0x000000000001F8F2L});
	public static final BitSet FOLLOW_PREP_INCLUDE_in_include288 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_include290 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_WORD_in_include292 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_include294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREP_DEFAULT_NETTYPE_in_ignore312 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_WORD_in_ignore314 = new BitSet(new long[]{0x0000000000000002L});
}
