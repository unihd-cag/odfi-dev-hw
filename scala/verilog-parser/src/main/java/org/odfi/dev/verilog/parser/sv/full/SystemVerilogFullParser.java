// $ANTLR 3.5.2 E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g 2014-11-08 10:39:00

package org.odfi.dev.verilog.parser.sv.full;


import org.odfi.dev.verilog.parser.parsing.*;
import org.odfi.dev.verilog.parser.parsing.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SystemVerilogFullParser extends XQParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALWAYS", "ANY", "ASSIGN", "AT", 
		"BAND", "BASE_DATA_TYPE", "BEGIN", "BNOT", "BOR", "BSLASH", "BUS_VALUE", 
		"BXNOR", "BXOR", "COLON", "COMMA", "COMMENTAR_LONG", "COMMENTAR_SHORT", 
		"COMM_BEGIN", "CONNECTION_IDENTIFIER", "DATA_SIZE", "DIV", "DOT", "DOXY", 
		"DOXYGEN_GROUP_DEF", "DOXYGEN_GROUP_END", "DOXYGEN_GROUP_START", "DOXYGEN_PARAM", 
		"DOXY_GROUP_START", "DOXY_GROUP_STOP", "DOXY_PARAM", "DQUOTE", "ELSE", 
		"END", "ENDMODULE", "EQ", "EQUAL", "EQ_CASE", "EXE_QUOTE", "EXPRESSION", 
		"EXTENDED_IDENTIFIER", "FPATH", "FPGA_PARAM_START", "FPGA_PARAM_STOP", 
		"GE", "GENERATE", "GT", "IDENTIFIER", "IF", "INITIAL", "LAND", "LBRACK", 
		"LCURLY", "LE", "LNOT", "LOR", "LPAREN", "LT", "MINUS", "MOD", "MODULE", 
		"MODULE_INSTANCE", "MODULE_INSTANCE_CONNECTION", "MODULE_NAME", "MODULE_PARAMETER", 
		"MODULE_PARAMETERS", "MODULE_PORT", "MODULE_PORTS", "MODULE_VARIABLE", 
		"NEGEDGE", "NEWLINE", "NOT_EQ", "NOT_EQ_CASE", "NUMBER", "OR", "PLUS", 
		"PORT_DIRECTION", "POSEDGE", "POUND", "PPATH", "PREP_ELSE", "PREP_ENDIF", 
		"PREP_IFDEF", "PREP_INCLUDE", "QUESTION", "RBRACK", "RCURLY", "RNAND", 
		"RNOR", "RPAREN", "SEMI", "SL", "SQUOTE", "SR", "STAR", "SV_DATA_TYPE", 
		"TEXT", "TRIGGER", "VALUE_BASE", "VERILOG", "WS", "'parameter'"
	};
	public static final int EOF=-1;
	public static final int T__104=104;
	public static final int ALWAYS=4;
	public static final int ANY=5;
	public static final int ASSIGN=6;
	public static final int AT=7;
	public static final int BAND=8;
	public static final int BASE_DATA_TYPE=9;
	public static final int BEGIN=10;
	public static final int BNOT=11;
	public static final int BOR=12;
	public static final int BSLASH=13;
	public static final int BUS_VALUE=14;
	public static final int BXNOR=15;
	public static final int BXOR=16;
	public static final int COLON=17;
	public static final int COMMA=18;
	public static final int COMMENTAR_LONG=19;
	public static final int COMMENTAR_SHORT=20;
	public static final int COMM_BEGIN=21;
	public static final int CONNECTION_IDENTIFIER=22;
	public static final int DATA_SIZE=23;
	public static final int DIV=24;
	public static final int DOT=25;
	public static final int DOXY=26;
	public static final int DOXYGEN_GROUP_DEF=27;
	public static final int DOXYGEN_GROUP_END=28;
	public static final int DOXYGEN_GROUP_START=29;
	public static final int DOXYGEN_PARAM=30;
	public static final int DOXY_GROUP_START=31;
	public static final int DOXY_GROUP_STOP=32;
	public static final int DOXY_PARAM=33;
	public static final int DQUOTE=34;
	public static final int ELSE=35;
	public static final int END=36;
	public static final int ENDMODULE=37;
	public static final int EQ=38;
	public static final int EQUAL=39;
	public static final int EQ_CASE=40;
	public static final int EXE_QUOTE=41;
	public static final int EXPRESSION=42;
	public static final int EXTENDED_IDENTIFIER=43;
	public static final int FPATH=44;
	public static final int FPGA_PARAM_START=45;
	public static final int FPGA_PARAM_STOP=46;
	public static final int GE=47;
	public static final int GENERATE=48;
	public static final int GT=49;
	public static final int IDENTIFIER=50;
	public static final int IF=51;
	public static final int INITIAL=52;
	public static final int LAND=53;
	public static final int LBRACK=54;
	public static final int LCURLY=55;
	public static final int LE=56;
	public static final int LNOT=57;
	public static final int LOR=58;
	public static final int LPAREN=59;
	public static final int LT=60;
	public static final int MINUS=61;
	public static final int MOD=62;
	public static final int MODULE=63;
	public static final int MODULE_INSTANCE=64;
	public static final int MODULE_INSTANCE_CONNECTION=65;
	public static final int MODULE_NAME=66;
	public static final int MODULE_PARAMETER=67;
	public static final int MODULE_PARAMETERS=68;
	public static final int MODULE_PORT=69;
	public static final int MODULE_PORTS=70;
	public static final int MODULE_VARIABLE=71;
	public static final int NEGEDGE=72;
	public static final int NEWLINE=73;
	public static final int NOT_EQ=74;
	public static final int NOT_EQ_CASE=75;
	public static final int NUMBER=76;
	public static final int OR=77;
	public static final int PLUS=78;
	public static final int PORT_DIRECTION=79;
	public static final int POSEDGE=80;
	public static final int POUND=81;
	public static final int PPATH=82;
	public static final int PREP_ELSE=83;
	public static final int PREP_ENDIF=84;
	public static final int PREP_IFDEF=85;
	public static final int PREP_INCLUDE=86;
	public static final int QUESTION=87;
	public static final int RBRACK=88;
	public static final int RCURLY=89;
	public static final int RNAND=90;
	public static final int RNOR=91;
	public static final int RPAREN=92;
	public static final int SEMI=93;
	public static final int SL=94;
	public static final int SQUOTE=95;
	public static final int SR=96;
	public static final int STAR=97;
	public static final int SV_DATA_TYPE=98;
	public static final int TEXT=99;
	public static final int TRIGGER=100;
	public static final int VALUE_BASE=101;
	public static final int VERILOG=102;
	public static final int WS=103;

	// delegates
	public XQParser[] getDelegates() {
		return new XQParser[] {};
	}

	// delegators


	public SystemVerilogFullParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SystemVerilogFullParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return SystemVerilogFullParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g"; }



	  /**
	   * Groups
	   */
	   private String currentGroup = null;
	   private boolean currentGroupActive = false;
	   
	   /**
	    * Params map for current active section
	    */
	    private HashMap<String,String> doxyParams = new HashMap<String,String>();
	   


	public static class verilog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "verilog"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:76:1: verilog : ( module )+ -> ^( VERILOG ( module )+ ) ;
	public final SystemVerilogFullParser.verilog_return verilog() throws RecognitionException {
		SystemVerilogFullParser.verilog_return retval = new SystemVerilogFullParser.verilog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope module1 =null;

		RewriteRuleSubtreeStream stream_module=new RewriteRuleSubtreeStream(adaptor,"rule module");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:76:9: ( ( module )+ -> ^( VERILOG ( module )+ ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:77:3: ( module )+
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:77:3: ( module )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ALWAYS && LA1_0 <= 104)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:77:3: module
					{
					pushFollow(FOLLOW_module_in_verilog168);
					module1=module();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module.add(module1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: module
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:11: -> ^( VERILOG ( module )+ )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:77:14: ^( VERILOG ( module )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VERILOG, "VERILOG"), root_1);
				if ( !(stream_module.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_module.hasNext() ) {
					adaptor.addChild(root_1, stream_module.nextTree());
				}
				stream_module.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "verilog"


	public static class module_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "module"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:83:1: module : ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( variable_declaration | module_instanciation | initial_declaration | always_declaration | assign_declaration )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( variable_declaration )* ( module_instanciation )* ) ;
	public final SystemVerilogFullParser.module_return module() throws RecognitionException {
		SystemVerilogFullParser.module_return retval = new SystemVerilogFullParser.module_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken wildcard2=null;
		XQToken string_literal3=null;
		XQToken IDENTIFIER4=null;
		XQToken POUND5=null;
		XQToken LPAREN6=null;
		XQToken NEWLINE8=null;
		XQToken RPAREN9=null;
		XQToken LPAREN10=null;
		XQToken NEWLINE12=null;
		XQToken RPAREN13=null;
		XQToken SEMI14=null;
		XQToken string_literal20=null;
		ParserRuleReturnScope module_parameters7 =null;
		ParserRuleReturnScope module_ports11 =null;
		ParserRuleReturnScope variable_declaration15 =null;
		ParserRuleReturnScope module_instanciation16 =null;
		ParserRuleReturnScope initial_declaration17 =null;
		ParserRuleReturnScope always_declaration18 =null;
		ParserRuleReturnScope assign_declaration19 =null;

		CommonTree wildcard2_tree=null;
		CommonTree string_literal3_tree=null;
		CommonTree IDENTIFIER4_tree=null;
		CommonTree POUND5_tree=null;
		CommonTree LPAREN6_tree=null;
		CommonTree NEWLINE8_tree=null;
		CommonTree RPAREN9_tree=null;
		CommonTree LPAREN10_tree=null;
		CommonTree NEWLINE12_tree=null;
		CommonTree RPAREN13_tree=null;
		CommonTree SEMI14_tree=null;
		CommonTree string_literal20_tree=null;
		RewriteRuleTokenStream stream_POUND=new RewriteRuleTokenStream(adaptor,"token POUND");
		RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
		RewriteRuleTokenStream stream_ENDMODULE=new RewriteRuleTokenStream(adaptor,"token ENDMODULE");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_module_instanciation=new RewriteRuleSubtreeStream(adaptor,"rule module_instanciation");
		RewriteRuleSubtreeStream stream_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule variable_declaration");
		RewriteRuleSubtreeStream stream_module_parameters=new RewriteRuleSubtreeStream(adaptor,"rule module_parameters");
		RewriteRuleSubtreeStream stream_initial_declaration=new RewriteRuleSubtreeStream(adaptor,"rule initial_declaration");
		RewriteRuleSubtreeStream stream_module_ports=new RewriteRuleSubtreeStream(adaptor,"rule module_ports");
		RewriteRuleSubtreeStream stream_assign_declaration=new RewriteRuleSubtreeStream(adaptor,"rule assign_declaration");
		RewriteRuleSubtreeStream stream_always_declaration=new RewriteRuleSubtreeStream(adaptor,"rule always_declaration");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:83:8: ( ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( variable_declaration | module_instanciation | initial_declaration | always_declaration | assign_declaration )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( variable_declaration )* ( module_instanciation )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:84:3: ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( variable_declaration | module_instanciation | initial_declaration | always_declaration | assign_declaration )* ( 'endmodule' )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:84:3: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MODULE) ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= ALWAYS && LA2_0 <= MOD)||(LA2_0 >= MODULE_INSTANCE && LA2_0 <= 104)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:84:3: .
					{
					wildcard2=(XQToken)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard2_tree = (CommonTree)adaptor.create(wildcard2);
					adaptor.addChild(root_0, wildcard2_tree);
					}

					}
					break;

				default :
					break loop2;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:85:2: ( 'module' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:85:3: 'module'
			{
			string_literal3=(XQToken)match(input,MODULE,FOLLOW_MODULE_in_module198); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MODULE.add(string_literal3);

			}

			IDENTIFIER4=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module202); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER4);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:87:2: ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==POUND) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:87:3: POUND LPAREN module_parameters ( NEWLINE )? RPAREN
					{
					POUND5=(XQToken)match(input,POUND,FOLLOW_POUND_in_module206); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POUND.add(POUND5);

					LPAREN6=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_module208); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN6);

					pushFollow(FOLLOW_module_parameters_in_module210);
					module_parameters7=module_parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module_parameters.add(module_parameters7.getTree());
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:87:35: ( NEWLINE )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==NEWLINE) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:87:35: NEWLINE
							{
							NEWLINE8=(XQToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_module213); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE8);

							}
							break;

					}

					RPAREN9=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_module216); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN9);

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:88:2: ( LPAREN module_ports ( NEWLINE )? RPAREN )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LPAREN) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:88:3: LPAREN module_ports ( NEWLINE )? RPAREN
					{
					LPAREN10=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_module222); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN10);

					pushFollow(FOLLOW_module_ports_in_module224);
					module_ports11=module_ports();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module_ports.add(module_ports11.getTree());
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:88:23: ( NEWLINE )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==NEWLINE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:88:23: NEWLINE
							{
							NEWLINE12=(XQToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_module226); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE12);

							}
							break;

					}

					RPAREN13=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_module229); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN13);

					}
					break;

			}

			SEMI14=(XQToken)match(input,SEMI,FOLLOW_SEMI_in_module234); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMI.add(SEMI14);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:92:2: ( variable_declaration | module_instanciation | initial_declaration | always_declaration | assign_declaration )*
			loop7:
			while (true) {
				int alt7=6;
				switch ( input.LA(1) ) {
				case BASE_DATA_TYPE:
				case SV_DATA_TYPE:
					{
					alt7=1;
					}
					break;
				case IDENTIFIER:
					{
					alt7=2;
					}
					break;
				case INITIAL:
					{
					alt7=3;
					}
					break;
				case ALWAYS:
					{
					alt7=4;
					}
					break;
				case ASSIGN:
					{
					alt7=5;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:93:3: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_module244);
					variable_declaration15=variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable_declaration.add(variable_declaration15.getTree());
					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:94:5: module_instanciation
					{
					pushFollow(FOLLOW_module_instanciation_in_module250);
					module_instanciation16=module_instanciation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module_instanciation.add(module_instanciation16.getTree());
					}
					break;
				case 3 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:95:5: initial_declaration
					{
					pushFollow(FOLLOW_initial_declaration_in_module256);
					initial_declaration17=initial_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initial_declaration.add(initial_declaration17.getTree());
					}
					break;
				case 4 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:96:5: always_declaration
					{
					pushFollow(FOLLOW_always_declaration_in_module262);
					always_declaration18=always_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_always_declaration.add(always_declaration18.getTree());
					}
					break;
				case 5 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:97:5: assign_declaration
					{
					pushFollow(FOLLOW_assign_declaration_in_module268);
					assign_declaration19=assign_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assign_declaration.add(assign_declaration19.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:2: ( 'endmodule' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:3: 'endmodule'
			{
			string_literal20=(XQToken)match(input,ENDMODULE,FOLLOW_ENDMODULE_in_module276); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ENDMODULE.add(string_literal20);

			}

			// AST REWRITE
			// elements: module_parameters, module_ports, module_instanciation, IDENTIFIER, variable_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 99:16: -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( variable_declaration )* ( module_instanciation )* )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:19: ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( variable_declaration )* ( module_instanciation )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE, "MODULE"), root_1);
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:28: ^( MODULE_NAME IDENTIFIER )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_NAME, "MODULE_NAME"), root_2);
				adaptor.addChild(root_2, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:54: ( module_parameters )?
				if ( stream_module_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_module_parameters.nextTree());
				}
				stream_module_parameters.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:73: ( module_ports )?
				if ( stream_module_ports.hasNext() ) {
					adaptor.addChild(root_1, stream_module_ports.nextTree());
				}
				stream_module_ports.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:87: ( variable_declaration )*
				while ( stream_variable_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_variable_declaration.nextTree());
				}
				stream_variable_declaration.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:99:109: ( module_instanciation )*
				while ( stream_module_instanciation.hasNext() ) {
					adaptor.addChild(root_1, stream_module_instanciation.nextTree());
				}
				stream_module_instanciation.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module"


	public static class module_hierarchical_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "module_hierarchical"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:119:1: module_hierarchical : ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( module_instanciation | ANY )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* ) ;
	public final SystemVerilogFullParser.module_hierarchical_return module_hierarchical() throws RecognitionException {
		SystemVerilogFullParser.module_hierarchical_return retval = new SystemVerilogFullParser.module_hierarchical_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken wildcard21=null;
		XQToken string_literal22=null;
		XQToken IDENTIFIER23=null;
		XQToken POUND24=null;
		XQToken LPAREN25=null;
		XQToken NEWLINE27=null;
		XQToken RPAREN28=null;
		XQToken LPAREN29=null;
		XQToken NEWLINE31=null;
		XQToken RPAREN32=null;
		XQToken SEMI33=null;
		XQToken ANY35=null;
		XQToken string_literal36=null;
		ParserRuleReturnScope module_parameters26 =null;
		ParserRuleReturnScope module_ports30 =null;
		ParserRuleReturnScope module_instanciation34 =null;

		CommonTree wildcard21_tree=null;
		CommonTree string_literal22_tree=null;
		CommonTree IDENTIFIER23_tree=null;
		CommonTree POUND24_tree=null;
		CommonTree LPAREN25_tree=null;
		CommonTree NEWLINE27_tree=null;
		CommonTree RPAREN28_tree=null;
		CommonTree LPAREN29_tree=null;
		CommonTree NEWLINE31_tree=null;
		CommonTree RPAREN32_tree=null;
		CommonTree SEMI33_tree=null;
		CommonTree ANY35_tree=null;
		CommonTree string_literal36_tree=null;
		RewriteRuleTokenStream stream_POUND=new RewriteRuleTokenStream(adaptor,"token POUND");
		RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
		RewriteRuleTokenStream stream_ENDMODULE=new RewriteRuleTokenStream(adaptor,"token ENDMODULE");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ANY=new RewriteRuleTokenStream(adaptor,"token ANY");
		RewriteRuleSubtreeStream stream_module_instanciation=new RewriteRuleSubtreeStream(adaptor,"rule module_instanciation");
		RewriteRuleSubtreeStream stream_module_parameters=new RewriteRuleSubtreeStream(adaptor,"rule module_parameters");
		RewriteRuleSubtreeStream stream_module_ports=new RewriteRuleSubtreeStream(adaptor,"rule module_ports");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:119:21: ( ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( module_instanciation | ANY )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:120:3: ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( module_instanciation | ANY )* ( 'endmodule' )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:120:3: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==MODULE) ) {
					alt8=2;
				}
				else if ( ((LA8_0 >= ALWAYS && LA8_0 <= MOD)||(LA8_0 >= MODULE_INSTANCE && LA8_0 <= 104)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:120:3: .
					{
					wildcard21=(XQToken)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard21_tree = (CommonTree)adaptor.create(wildcard21);
					adaptor.addChild(root_0, wildcard21_tree);
					}

					}
					break;

				default :
					break loop8;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:121:3: ( 'module' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:121:4: 'module'
			{
			string_literal22=(XQToken)match(input,MODULE,FOLLOW_MODULE_in_module_hierarchical322); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MODULE.add(string_literal22);

			}

			IDENTIFIER23=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_hierarchical327); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER23);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:123:3: ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==POUND) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:123:4: POUND LPAREN module_parameters ( NEWLINE )? RPAREN
					{
					POUND24=(XQToken)match(input,POUND,FOLLOW_POUND_in_module_hierarchical332); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POUND.add(POUND24);

					LPAREN25=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_module_hierarchical334); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN25);

					pushFollow(FOLLOW_module_parameters_in_module_hierarchical336);
					module_parameters26=module_parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module_parameters.add(module_parameters26.getTree());
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:123:36: ( NEWLINE )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==NEWLINE) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:123:36: NEWLINE
							{
							NEWLINE27=(XQToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_module_hierarchical339); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE27);

							}
							break;

					}

					RPAREN28=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_module_hierarchical342); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN28);

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:124:3: ( LPAREN module_ports ( NEWLINE )? RPAREN )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==LPAREN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:124:4: LPAREN module_ports ( NEWLINE )? RPAREN
					{
					LPAREN29=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_module_hierarchical349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN29);

					pushFollow(FOLLOW_module_ports_in_module_hierarchical351);
					module_ports30=module_ports();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module_ports.add(module_ports30.getTree());
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:124:24: ( NEWLINE )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==NEWLINE) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:124:24: NEWLINE
							{
							NEWLINE31=(XQToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_module_hierarchical353); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE31);

							}
							break;

					}

					RPAREN32=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_module_hierarchical356); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN32);

					}
					break;

			}

			SEMI33=(XQToken)match(input,SEMI,FOLLOW_SEMI_in_module_hierarchical362); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMI.add(SEMI33);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:132:3: ( module_instanciation | ANY )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==IDENTIFIER) ) {
					alt13=1;
				}
				else if ( (LA13_0==ANY) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:133:4: module_instanciation
					{
					pushFollow(FOLLOW_module_instanciation_in_module_hierarchical378);
					module_instanciation34=module_instanciation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_module_instanciation.add(module_instanciation34.getTree());
					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:133:27: ANY
					{
					ANY35=(XQToken)match(input,ANY,FOLLOW_ANY_in_module_hierarchical382); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ANY.add(ANY35);

					}
					break;

				default :
					break loop13;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:3: ( 'endmodule' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:4: 'endmodule'
			{
			string_literal36=(XQToken)match(input,ENDMODULE,FOLLOW_ENDMODULE_in_module_hierarchical392); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ENDMODULE.add(string_literal36);

			}

			// AST REWRITE
			// elements: module_instanciation, module_ports, module_parameters, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:17: -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:20: ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE, "MODULE"), root_1);
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:29: ^( MODULE_NAME IDENTIFIER )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_NAME, "MODULE_NAME"), root_2);
				adaptor.addChild(root_2, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:55: ( module_parameters )?
				if ( stream_module_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_module_parameters.nextTree());
				}
				stream_module_parameters.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:74: ( module_ports )?
				if ( stream_module_ports.hasNext() ) {
					adaptor.addChild(root_1, stream_module_ports.nextTree());
				}
				stream_module_ports.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:135:88: ( module_instanciation )*
				while ( stream_module_instanciation.hasNext() ) {
					adaptor.addChild(root_1, stream_module_instanciation.nextTree());
				}
				stream_module_instanciation.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module_hierarchical"


	public static class module_parameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "module_parameters"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:142:1: module_parameters : parameter_declaration ( ( ',' ) ! parameter_declaration )* -> ^( MODULE_PARAMETERS ( parameter_declaration )* ) ;
	public final SystemVerilogFullParser.module_parameters_return module_parameters() throws RecognitionException {
		SystemVerilogFullParser.module_parameters_return retval = new SystemVerilogFullParser.module_parameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken char_literal38=null;
		ParserRuleReturnScope parameter_declaration37 =null;
		ParserRuleReturnScope parameter_declaration39 =null;

		CommonTree char_literal38_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:142:19: ( parameter_declaration ( ( ',' ) ! parameter_declaration )* -> ^( MODULE_PARAMETERS ( parameter_declaration )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:5: parameter_declaration ( ( ',' ) ! parameter_declaration )*
			{
			pushFollow(FOLLOW_parameter_declaration_in_module_parameters433);
			parameter_declaration37=parameter_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration37.getTree());
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:27: ( ( ',' ) ! parameter_declaration )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:28: ( ',' ) ! parameter_declaration
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:28: ( ',' )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:29: ','
					{
					char_literal38=(XQToken)match(input,COMMA,FOLLOW_COMMA_in_module_parameters437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(char_literal38);

					}

					pushFollow(FOLLOW_parameter_declaration_in_module_parameters441);
					parameter_declaration39=parameter_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration39.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			// AST REWRITE
			// elements: parameter_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:60: -> ^( MODULE_PARAMETERS ( parameter_declaration )* )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:63: ^( MODULE_PARAMETERS ( parameter_declaration )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_PARAMETERS, "MODULE_PARAMETERS"), root_1);
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:143:83: ( parameter_declaration )*
				while ( stream_parameter_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter_declaration.nextTree());
				}
				stream_parameter_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module_parameters"


	public static class parameter_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:146:1: parameter_declaration : 'parameter' IDENTIFIER EQUAL parameter_value -> ^( MODULE_PARAMETER IDENTIFIER parameter_value ) ;
	public final SystemVerilogFullParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
		SystemVerilogFullParser.parameter_declaration_return retval = new SystemVerilogFullParser.parameter_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken string_literal40=null;
		XQToken IDENTIFIER41=null;
		XQToken EQUAL42=null;
		ParserRuleReturnScope parameter_value43 =null;

		CommonTree string_literal40_tree=null;
		CommonTree IDENTIFIER41_tree=null;
		CommonTree EQUAL42_tree=null;
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_parameter_value=new RewriteRuleSubtreeStream(adaptor,"rule parameter_value");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:146:22: ( 'parameter' IDENTIFIER EQUAL parameter_value -> ^( MODULE_PARAMETER IDENTIFIER parameter_value ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:147:3: 'parameter' IDENTIFIER EQUAL parameter_value
			{
			string_literal40=(XQToken)match(input,104,FOLLOW_104_in_parameter_declaration464); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_104.add(string_literal40);

			IDENTIFIER41=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_declaration466); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER41);

			EQUAL42=(XQToken)match(input,EQUAL,FOLLOW_EQUAL_in_parameter_declaration468); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL42);

			pushFollow(FOLLOW_parameter_value_in_parameter_declaration470);
			parameter_value43=parameter_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_parameter_value.add(parameter_value43.getTree());
			// AST REWRITE
			// elements: IDENTIFIER, parameter_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 147:48: -> ^( MODULE_PARAMETER IDENTIFIER parameter_value )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:147:51: ^( MODULE_PARAMETER IDENTIFIER parameter_value )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_PARAMETER, "MODULE_PARAMETER"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_parameter_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_declaration"


	public static class parameter_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter_value"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:159:1: parameter_value : ( expression -> ^() | long_identifier -> ^() );
	public final SystemVerilogFullParser.parameter_value_return parameter_value() throws RecognitionException {
		SystemVerilogFullParser.parameter_value_return retval = new SystemVerilogFullParser.parameter_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope long_identifier45 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_long_identifier=new RewriteRuleSubtreeStream(adaptor,"rule long_identifier");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:159:16: ( expression -> ^() | long_identifier -> ^() )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BAND||(LA15_0 >= BNOT && LA15_0 <= BOR)||(LA15_0 >= BUS_VALUE && LA15_0 <= COMMA)||LA15_0==DIV||LA15_0==EQ||LA15_0==EXE_QUOTE||LA15_0==GE||(LA15_0 >= GT && LA15_0 <= IDENTIFIER)||LA15_0==LAND||(LA15_0 >= LE && LA15_0 <= MINUS)||LA15_0==NEWLINE||LA15_0==NUMBER||LA15_0==PLUS||LA15_0==QUESTION||LA15_0==RCURLY||(LA15_0 >= RPAREN && LA15_0 <= SEMI)||LA15_0==STAR) ) {
				alt15=1;
			}
			else if ( (LA15_0==DQUOTE) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:161:3: expression
					{
					pushFollow(FOLLOW_expression_in_parameter_value494);
					expression44=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression44.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 161:14: -> ^()
					{
						// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:161:17: ^()
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(new CommonTree(new CommonToken(0,(expression44!=null?input.toString(expression44.start,expression44.stop):null))), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:162:5: long_identifier
					{
					pushFollow(FOLLOW_long_identifier_in_parameter_value507);
					long_identifier45=long_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_long_identifier.add(long_identifier45.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 162:21: -> ^()
					{
						// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:162:24: ^()
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(new CommonTree(new CommonToken(0,(long_identifier45!=null?input.toString(long_identifier45.start,long_identifier45.stop):null))), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_value"


	public static class module_ports_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "module_ports"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:169:1: module_ports : port_declaration ( ( ',' ) ! port_declaration )* ( doxygen_group_end )? -> ^( MODULE_PORTS ( port_declaration )* ) ;
	public final SystemVerilogFullParser.module_ports_return module_ports() throws RecognitionException {
		SystemVerilogFullParser.module_ports_return retval = new SystemVerilogFullParser.module_ports_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken char_literal47=null;
		ParserRuleReturnScope port_declaration46 =null;
		ParserRuleReturnScope port_declaration48 =null;
		ParserRuleReturnScope doxygen_group_end49 =null;

		CommonTree char_literal47_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_port_declaration=new RewriteRuleSubtreeStream(adaptor,"rule port_declaration");
		RewriteRuleSubtreeStream stream_doxygen_group_end=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_end");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:169:14: ( port_declaration ( ( ',' ) ! port_declaration )* ( doxygen_group_end )? -> ^( MODULE_PORTS ( port_declaration )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:171:4: port_declaration ( ( ',' ) ! port_declaration )* ( doxygen_group_end )?
			{
			pushFollow(FOLLOW_port_declaration_in_module_ports534);
			port_declaration46=port_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_port_declaration.add(port_declaration46.getTree());
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:173:5: ( ( ',' ) ! port_declaration )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:173:6: ( ',' ) ! port_declaration
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:173:6: ( ',' )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:173:7: ','
					{
					char_literal47=(XQToken)match(input,COMMA,FOLLOW_COMMA_in_module_ports548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(char_literal47);

					}

					pushFollow(FOLLOW_port_declaration_in_module_ports562);
					port_declaration48=port_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_port_declaration.add(port_declaration48.getTree());
					}
					break;

				default :
					break loop16;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:178:5: ( doxygen_group_end )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==DOXYGEN_GROUP_END) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:178:5: doxygen_group_end
					{
					pushFollow(FOLLOW_doxygen_group_end_in_module_ports581);
					doxygen_group_end49=doxygen_group_end();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_doxygen_group_end.add(doxygen_group_end49.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: port_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 180:3: -> ^( MODULE_PORTS ( port_declaration )* )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:180:6: ^( MODULE_PORTS ( port_declaration )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_PORTS, "MODULE_PORTS"), root_1);
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:180:21: ( port_declaration )*
				while ( stream_port_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_port_declaration.nextTree());
				}
				stream_port_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module_ports"


	public static class port_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "port_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:182:1: port_declaration : ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER -> ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) ;
	public final SystemVerilogFullParser.port_declaration_return port_declaration() throws RecognitionException {
		SystemVerilogFullParser.port_declaration_return retval = new SystemVerilogFullParser.port_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken PORT_DIRECTION54=null;
		XQToken BASE_DATA_TYPE55=null;
		XQToken IDENTIFIER57=null;
		ParserRuleReturnScope doxygen_group_end50 =null;
		ParserRuleReturnScope doxygen_group_def51 =null;
		ParserRuleReturnScope doxygen_param52 =null;
		ParserRuleReturnScope doxygen_group_begin53 =null;
		ParserRuleReturnScope data_size56 =null;

		CommonTree PORT_DIRECTION54_tree=null;
		CommonTree BASE_DATA_TYPE55_tree=null;
		CommonTree IDENTIFIER57_tree=null;
		RewriteRuleTokenStream stream_BASE_DATA_TYPE=new RewriteRuleTokenStream(adaptor,"token BASE_DATA_TYPE");
		RewriteRuleTokenStream stream_PORT_DIRECTION=new RewriteRuleTokenStream(adaptor,"token PORT_DIRECTION");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_data_size=new RewriteRuleSubtreeStream(adaptor,"rule data_size");
		RewriteRuleSubtreeStream stream_doxygen_group_def=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_def");
		RewriteRuleSubtreeStream stream_doxygen_param=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_param");
		RewriteRuleSubtreeStream stream_doxygen_group_begin=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_begin");
		RewriteRuleSubtreeStream stream_doxygen_group_end=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_end");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:182:17: ( ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER -> ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:184:3: ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:184:3: ( doxygen_group_end )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DOXYGEN_GROUP_END) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:184:3: doxygen_group_end
					{
					pushFollow(FOLLOW_doxygen_group_end_in_port_declaration613);
					doxygen_group_end50=doxygen_group_end();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_doxygen_group_end.add(doxygen_group_end50.getTree());
					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:185:3: ( doxygen_group_def )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DOXYGEN_GROUP_DEF) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:185:3: doxygen_group_def
					{
					pushFollow(FOLLOW_doxygen_group_def_in_port_declaration618);
					doxygen_group_def51=doxygen_group_def();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_doxygen_group_def.add(doxygen_group_def51.getTree());
					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:186:3: ( doxygen_param )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==DOXYGEN_PARAM) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:186:3: doxygen_param
					{
					pushFollow(FOLLOW_doxygen_param_in_port_declaration623);
					doxygen_param52=doxygen_param();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_doxygen_param.add(doxygen_param52.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:187:3: ( doxygen_group_begin )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DOXYGEN_GROUP_START) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:187:3: doxygen_group_begin
					{
					pushFollow(FOLLOW_doxygen_group_begin_in_port_declaration628);
					doxygen_group_begin53=doxygen_group_begin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_doxygen_group_begin.add(doxygen_group_begin53.getTree());
					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:190:3: ( PORT_DIRECTION )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==PORT_DIRECTION) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:190:3: PORT_DIRECTION
					{
					PORT_DIRECTION54=(XQToken)match(input,PORT_DIRECTION,FOLLOW_PORT_DIRECTION_in_port_declaration639); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PORT_DIRECTION.add(PORT_DIRECTION54);

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:191:3: ( BASE_DATA_TYPE )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==BASE_DATA_TYPE) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:191:3: BASE_DATA_TYPE
					{
					BASE_DATA_TYPE55=(XQToken)match(input,BASE_DATA_TYPE,FOLLOW_BASE_DATA_TYPE_in_port_declaration644); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BASE_DATA_TYPE.add(BASE_DATA_TYPE55);

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:192:3: ( data_size )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LBRACK) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:192:3: data_size
					{
					pushFollow(FOLLOW_data_size_in_port_declaration649);
					data_size56=data_size();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_data_size.add(data_size56.getTree());
					}
					break;

			}

			IDENTIFIER57=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_declaration655); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER57);

			if ( state.backtracking==0 ) {
			//    if((IDENTIFIER57!=null?IDENTIFIER57.getText():null).equals("pcie_clk"))
			//      System.out.println("Found Port "+(data_size56!=null?input.toString(data_size56.start,data_size56.stop):null));
			  
			//    System.out.println("Found Port "+(IDENTIFIER57!=null?IDENTIFIER57.getText():null)+" With active group: "+currentGroup);

			      //-- Prepare the stack of params a a node
			  //^(DOXY_GROUP {new CommonTree(new CommonToken(0,currentGroupActive?currentGroup:null))})
			  }
			// AST REWRITE
			// elements: doxygen_group_end, data_size, IDENTIFIER, doxygen_group_def, BASE_DATA_TYPE, doxygen_param, doxygen_group_begin, PORT_DIRECTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 204:3: -> ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:204:6: ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_PORT, "MODULE_PORT"), root_1);
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:205:9: ( PORT_DIRECTION )?
				if ( stream_PORT_DIRECTION.hasNext() ) {
					adaptor.addChild(root_1, stream_PORT_DIRECTION.nextNode());
				}
				stream_PORT_DIRECTION.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:206:9: ( BASE_DATA_TYPE )?
				if ( stream_BASE_DATA_TYPE.hasNext() ) {
					adaptor.addChild(root_1, stream_BASE_DATA_TYPE.nextNode());
				}
				stream_BASE_DATA_TYPE.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:207:9: ( data_size )?
				if ( stream_data_size.hasNext() ) {
					adaptor.addChild(root_1, stream_data_size.nextTree());
				}
				stream_data_size.reset();

				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:209:9: ( doxygen_group_end )?
				if ( stream_doxygen_group_end.hasNext() ) {
					adaptor.addChild(root_1, stream_doxygen_group_end.nextTree());
				}
				stream_doxygen_group_end.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:210:9: ( doxygen_group_def )?
				if ( stream_doxygen_group_def.hasNext() ) {
					adaptor.addChild(root_1, stream_doxygen_group_def.nextTree());
				}
				stream_doxygen_group_def.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:211:9: ( doxygen_param )*
				while ( stream_doxygen_param.hasNext() ) {
					adaptor.addChild(root_1, stream_doxygen_param.nextTree());
				}
				stream_doxygen_param.reset();

				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:212:9: ( doxygen_group_begin )?
				if ( stream_doxygen_group_begin.hasNext() ) {
					adaptor.addChild(root_1, stream_doxygen_group_begin.nextTree());
				}
				stream_doxygen_group_begin.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "port_declaration"


	public static class module_instanciation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "module_instanciation"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:221:1: module_instanciation : type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI -> ^( MODULE_INSTANCE $type $name port_connections ) ;
	public final SystemVerilogFullParser.module_instanciation_return module_instanciation() throws RecognitionException {
		SystemVerilogFullParser.module_instanciation_return retval = new SystemVerilogFullParser.module_instanciation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken type=null;
		XQToken name=null;
		XQToken POUND58=null;
		XQToken LPAREN59=null;
		XQToken RPAREN61=null;
		XQToken LPAREN62=null;
		XQToken RPAREN64=null;
		XQToken SEMI65=null;
		ParserRuleReturnScope parameter_connections60 =null;
		ParserRuleReturnScope port_connections63 =null;

		CommonTree type_tree=null;
		CommonTree name_tree=null;
		CommonTree POUND58_tree=null;
		CommonTree LPAREN59_tree=null;
		CommonTree RPAREN61_tree=null;
		CommonTree LPAREN62_tree=null;
		CommonTree RPAREN64_tree=null;
		CommonTree SEMI65_tree=null;
		RewriteRuleTokenStream stream_POUND=new RewriteRuleTokenStream(adaptor,"token POUND");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_port_connections=new RewriteRuleSubtreeStream(adaptor,"rule port_connections");
		RewriteRuleSubtreeStream stream_parameter_connections=new RewriteRuleSubtreeStream(adaptor,"rule parameter_connections");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:221:21: (type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI -> ^( MODULE_INSTANCE $type $name port_connections ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:222:5: type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI
			{
			type=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation793); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(type);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:223:5: ( POUND LPAREN parameter_connections RPAREN )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==POUND) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:223:6: POUND LPAREN parameter_connections RPAREN
					{
					POUND58=(XQToken)match(input,POUND,FOLLOW_POUND_in_module_instanciation801); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POUND.add(POUND58);

					LPAREN59=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_module_instanciation803); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN59);

					pushFollow(FOLLOW_parameter_connections_in_module_instanciation805);
					parameter_connections60=parameter_connections();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter_connections.add(parameter_connections60.getTree());
					RPAREN61=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_module_instanciation807); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN61);

					}
					break;

			}

			name=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation817); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

			LPAREN62=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_module_instanciation824); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN62);

			pushFollow(FOLLOW_port_connections_in_module_instanciation826);
			port_connections63=port_connections();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_port_connections.add(port_connections63.getTree());
			RPAREN64=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_module_instanciation828); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN64);

			SEMI65=(XQToken)match(input,SEMI,FOLLOW_SEMI_in_module_instanciation830); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMI.add(SEMI65);

			if ( state.backtracking==0 ) {System.out.println("Found a module instanciation");}
			// AST REWRITE
			// elements: type, name, port_connections
			// token labels: name, type
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 227:24: -> ^( MODULE_INSTANCE $type $name port_connections )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:227:27: ^( MODULE_INSTANCE $type $name port_connections )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_INSTANCE, "MODULE_INSTANCE"), root_1);
				adaptor.addChild(root_1, stream_type.nextNode());
				adaptor.addChild(root_1, stream_name.nextNode());
				adaptor.addChild(root_1, stream_port_connections.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module_instanciation"


	public static class port_connections_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "port_connections"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:230:1: port_connections : port_connection ( COMMA port_connection )* -> ( port_connection )+ ;
	public final SystemVerilogFullParser.port_connections_return port_connections() throws RecognitionException {
		SystemVerilogFullParser.port_connections_return retval = new SystemVerilogFullParser.port_connections_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken COMMA67=null;
		ParserRuleReturnScope port_connection66 =null;
		ParserRuleReturnScope port_connection68 =null;

		CommonTree COMMA67_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_port_connection=new RewriteRuleSubtreeStream(adaptor,"rule port_connection");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:230:17: ( port_connection ( COMMA port_connection )* -> ( port_connection )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:230:19: port_connection ( COMMA port_connection )*
			{
			pushFollow(FOLLOW_port_connection_in_port_connections902);
			port_connection66=port_connection();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_port_connection.add(port_connection66.getTree());
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:230:35: ( COMMA port_connection )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==COMMA) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:230:36: COMMA port_connection
					{
					COMMA67=(XQToken)match(input,COMMA,FOLLOW_COMMA_in_port_connections905); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);

					pushFollow(FOLLOW_port_connection_in_port_connections907);
					port_connection68=port_connection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_port_connection.add(port_connection68.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			// AST REWRITE
			// elements: port_connection
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 230:60: -> ( port_connection )+
			{
				if ( !(stream_port_connection.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_port_connection.hasNext() ) {
					adaptor.addChild(root_0, stream_port_connection.nextTree());
				}
				stream_port_connection.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "port_connections"


	public static class port_connection_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "port_connection"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:232:1: port_connection : port_name= CONNECTION_IDENTIFIER ( ( LPAREN local_connection= concatenable_expression RPAREN ) ) -> ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? ) ;
	public final SystemVerilogFullParser.port_connection_return port_connection() throws RecognitionException {
		SystemVerilogFullParser.port_connection_return retval = new SystemVerilogFullParser.port_connection_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken port_name=null;
		XQToken LPAREN69=null;
		XQToken RPAREN70=null;
		ParserRuleReturnScope local_connection =null;

		CommonTree port_name_tree=null;
		CommonTree LPAREN69_tree=null;
		CommonTree RPAREN70_tree=null;
		RewriteRuleTokenStream stream_CONNECTION_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token CONNECTION_IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_concatenable_expression=new RewriteRuleSubtreeStream(adaptor,"rule concatenable_expression");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:232:17: (port_name= CONNECTION_IDENTIFIER ( ( LPAREN local_connection= concatenable_expression RPAREN ) ) -> ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:232:20: port_name= CONNECTION_IDENTIFIER ( ( LPAREN local_connection= concatenable_expression RPAREN ) )
			{
			port_name=(XQToken)match(input,CONNECTION_IDENTIFIER,FOLLOW_CONNECTION_IDENTIFIER_in_port_connection925); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CONNECTION_IDENTIFIER.add(port_name);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:233:19: ( ( LPAREN local_connection= concatenable_expression RPAREN ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:235:20: ( LPAREN local_connection= concatenable_expression RPAREN )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:235:20: ( LPAREN local_connection= concatenable_expression RPAREN )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:235:21: LPAREN local_connection= concatenable_expression RPAREN
			{
			LPAREN69=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_port_connection975); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN69);

			pushFollow(FOLLOW_concatenable_expression_in_port_connection979);
			local_connection=concatenable_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_concatenable_expression.add(local_connection.getTree());
			RPAREN70=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_port_connection981); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN70);

			}

			}

			// AST REWRITE
			// elements: port_name, local_connection
			// token labels: port_name
			// rule labels: local_connection, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_port_name=new RewriteRuleTokenStream(adaptor,"token port_name",port_name);
			RewriteRuleSubtreeStream stream_local_connection=new RewriteRuleSubtreeStream(adaptor,"rule local_connection",local_connection!=null?local_connection.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 241:19: -> ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:241:23: ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_INSTANCE_CONNECTION, "MODULE_INSTANCE_CONNECTION"), root_1);
				adaptor.addChild(root_1, stream_port_name.nextNode());
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:241:64: ( $local_connection)?
				if ( stream_local_connection.hasNext() ) {
					adaptor.addChild(root_1, stream_local_connection.nextTree());
				}
				stream_local_connection.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "port_connection"


	public static class parameter_connections_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter_connections"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:1: parameter_connections : ( parameter_connection )? ( COMMA parameter_connection )* ;
	public final SystemVerilogFullParser.parameter_connections_return parameter_connections() throws RecognitionException {
		SystemVerilogFullParser.parameter_connections_return retval = new SystemVerilogFullParser.parameter_connections_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken COMMA72=null;
		ParserRuleReturnScope parameter_connection71 =null;
		ParserRuleReturnScope parameter_connection73 =null;

		CommonTree COMMA72_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:22: ( ( parameter_connection )? ( COMMA parameter_connection )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:24: ( parameter_connection )? ( COMMA parameter_connection )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:24: ( parameter_connection )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==DOT) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:24: parameter_connection
					{
					pushFollow(FOLLOW_parameter_connection_in_parameter_connections1063);
					parameter_connection71=parameter_connection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_connection71.getTree());

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:46: ( COMMA parameter_connection )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==COMMA) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:243:47: COMMA parameter_connection
					{
					COMMA72=(XQToken)match(input,COMMA,FOLLOW_COMMA_in_parameter_connections1067); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA72_tree = (CommonTree)adaptor.create(COMMA72);
					adaptor.addChild(root_0, COMMA72_tree);
					}

					pushFollow(FOLLOW_parameter_connection_in_parameter_connections1069);
					parameter_connection73=parameter_connection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_connection73.getTree());

					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_connections"


	public static class parameter_connection_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter_connection"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:244:1: parameter_connection : DOT param_name= IDENTIFIER LPAREN concatenable_expression RPAREN ;
	public final SystemVerilogFullParser.parameter_connection_return parameter_connection() throws RecognitionException {
		SystemVerilogFullParser.parameter_connection_return retval = new SystemVerilogFullParser.parameter_connection_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken param_name=null;
		XQToken DOT74=null;
		XQToken LPAREN75=null;
		XQToken RPAREN77=null;
		ParserRuleReturnScope concatenable_expression76 =null;

		CommonTree param_name_tree=null;
		CommonTree DOT74_tree=null;
		CommonTree LPAREN75_tree=null;
		CommonTree RPAREN77_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:244:21: ( DOT param_name= IDENTIFIER LPAREN concatenable_expression RPAREN )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:244:23: DOT param_name= IDENTIFIER LPAREN concatenable_expression RPAREN
			{
			root_0 = (CommonTree)adaptor.nil();


			DOT74=(XQToken)match(input,DOT,FOLLOW_DOT_in_parameter_connection1077); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DOT74_tree = (CommonTree)adaptor.create(DOT74);
			adaptor.addChild(root_0, DOT74_tree);
			}

			param_name=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_connection1081); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			param_name_tree = (CommonTree)adaptor.create(param_name);
			adaptor.addChild(root_0, param_name_tree);
			}

			LPAREN75=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_connection1083); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN75_tree = (CommonTree)adaptor.create(LPAREN75);
			adaptor.addChild(root_0, LPAREN75_tree);
			}

			pushFollow(FOLLOW_concatenable_expression_in_parameter_connection1085);
			concatenable_expression76=concatenable_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, concatenable_expression76.getTree());

			RPAREN77=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_connection1087); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN77_tree = (CommonTree)adaptor.create(RPAREN77);
			adaptor.addChild(root_0, RPAREN77_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_connection"


	public static class variable_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:1: variable_declaration : data_type ( data_size )? ( IDENTIFIER ( COMMA IDENTIFIER )* ) ( assign_expression )? SEMI -> ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ ) ;
	public final SystemVerilogFullParser.variable_declaration_return variable_declaration() throws RecognitionException {
		SystemVerilogFullParser.variable_declaration_return retval = new SystemVerilogFullParser.variable_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken IDENTIFIER80=null;
		XQToken COMMA81=null;
		XQToken IDENTIFIER82=null;
		XQToken SEMI84=null;
		ParserRuleReturnScope data_type78 =null;
		ParserRuleReturnScope data_size79 =null;
		ParserRuleReturnScope assign_expression83 =null;

		CommonTree IDENTIFIER80_tree=null;
		CommonTree COMMA81_tree=null;
		CommonTree IDENTIFIER82_tree=null;
		CommonTree SEMI84_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_data_size=new RewriteRuleSubtreeStream(adaptor,"rule data_size");
		RewriteRuleSubtreeStream stream_data_type=new RewriteRuleSubtreeStream(adaptor,"rule data_type");
		RewriteRuleSubtreeStream stream_assign_expression=new RewriteRuleSubtreeStream(adaptor,"rule assign_expression");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:21: ( data_type ( data_size )? ( IDENTIFIER ( COMMA IDENTIFIER )* ) ( assign_expression )? SEMI -> ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:23: data_type ( data_size )? ( IDENTIFIER ( COMMA IDENTIFIER )* ) ( assign_expression )? SEMI
			{
			pushFollow(FOLLOW_data_type_in_variable_declaration1096);
			data_type78=data_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_data_type.add(data_type78.getTree());
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:33: ( data_size )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LBRACK) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:33: data_size
					{
					pushFollow(FOLLOW_data_size_in_variable_declaration1098);
					data_size79=data_size();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_data_size.add(data_size79.getTree());
					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:44: ( IDENTIFIER ( COMMA IDENTIFIER )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:45: IDENTIFIER ( COMMA IDENTIFIER )*
			{
			IDENTIFIER80=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration1102); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER80);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:56: ( COMMA IDENTIFIER )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:57: COMMA IDENTIFIER
					{
					COMMA81=(XQToken)match(input,COMMA,FOLLOW_COMMA_in_variable_declaration1105); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA81);

					IDENTIFIER82=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration1107); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER82);

					}
					break;

				default :
					break loop30;
				}
			}

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:78: ( assign_expression )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQUAL||LA31_0==LE) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:78: assign_expression
					{
					pushFollow(FOLLOW_assign_expression_in_variable_declaration1113);
					assign_expression83=assign_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assign_expression.add(assign_expression83.getTree());
					}
					break;

			}

			SEMI84=(XQToken)match(input,SEMI,FOLLOW_SEMI_in_variable_declaration1116); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMI.add(SEMI84);

			// AST REWRITE
			// elements: data_size, data_type, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 248:102: -> ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:105: ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_VARIABLE, "MODULE_VARIABLE"), root_1);
				adaptor.addChild(root_1, stream_data_type.nextTree());
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:248:133: ( data_size )?
				if ( stream_data_size.hasNext() ) {
					adaptor.addChild(root_1, stream_data_size.nextTree());
				}
				stream_data_size.reset();

				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
					adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				}
				stream_IDENTIFIER.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration"


	public static class initial_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initial_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:254:1: initial_declaration : INITIAL ( ( logic_content ) | logic_instruction ) ;
	public final SystemVerilogFullParser.initial_declaration_return initial_declaration() throws RecognitionException {
		SystemVerilogFullParser.initial_declaration_return retval = new SystemVerilogFullParser.initial_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken INITIAL85=null;
		ParserRuleReturnScope logic_content86 =null;
		ParserRuleReturnScope logic_instruction87 =null;

		CommonTree INITIAL85_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:254:20: ( INITIAL ( ( logic_content ) | logic_instruction ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:255:3: INITIAL ( ( logic_content ) | logic_instruction )
			{
			root_0 = (CommonTree)adaptor.nil();


			INITIAL85=(XQToken)match(input,INITIAL,FOLLOW_INITIAL_in_initial_declaration1145); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INITIAL85_tree = (CommonTree)adaptor.create(INITIAL85);
			adaptor.addChild(root_0, INITIAL85_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:255:11: ( ( logic_content ) | logic_instruction )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==BEGIN) ) {
				alt32=1;
			}
			else if ( ((LA32_0 >= IDENTIFIER && LA32_0 <= IF)) ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:255:13: ( logic_content )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:255:13: ( logic_content )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:255:15: logic_content
					{
					pushFollow(FOLLOW_logic_content_in_initial_declaration1151);
					logic_content86=logic_content();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_content86.getTree());

					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:255:34: logic_instruction
					{
					pushFollow(FOLLOW_logic_instruction_in_initial_declaration1158);
					logic_instruction87=logic_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction87.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initial_declaration"


	public static class always_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "always_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:257:1: always_declaration : ALWAYS ( AT LPAREN ( sensitivity_list ) RPAREN )? ( ( logic_instruction | ( logic_content ) ) ) ;
	public final SystemVerilogFullParser.always_declaration_return always_declaration() throws RecognitionException {
		SystemVerilogFullParser.always_declaration_return retval = new SystemVerilogFullParser.always_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken ALWAYS88=null;
		XQToken AT89=null;
		XQToken LPAREN90=null;
		XQToken RPAREN92=null;
		ParserRuleReturnScope sensitivity_list91 =null;
		ParserRuleReturnScope logic_instruction93 =null;
		ParserRuleReturnScope logic_content94 =null;

		CommonTree ALWAYS88_tree=null;
		CommonTree AT89_tree=null;
		CommonTree LPAREN90_tree=null;
		CommonTree RPAREN92_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:257:19: ( ALWAYS ( AT LPAREN ( sensitivity_list ) RPAREN )? ( ( logic_instruction | ( logic_content ) ) ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:261:3: ALWAYS ( AT LPAREN ( sensitivity_list ) RPAREN )? ( ( logic_instruction | ( logic_content ) ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			ALWAYS88=(XQToken)match(input,ALWAYS,FOLLOW_ALWAYS_in_always_declaration1177); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ALWAYS88_tree = (CommonTree)adaptor.create(ALWAYS88);
			adaptor.addChild(root_0, ALWAYS88_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:261:10: ( AT LPAREN ( sensitivity_list ) RPAREN )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==AT) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:261:11: AT LPAREN ( sensitivity_list ) RPAREN
					{
					AT89=(XQToken)match(input,AT,FOLLOW_AT_in_always_declaration1180); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT89_tree = (CommonTree)adaptor.create(AT89);
					adaptor.addChild(root_0, AT89_tree);
					}

					LPAREN90=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_always_declaration1182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN90_tree = (CommonTree)adaptor.create(LPAREN90);
					adaptor.addChild(root_0, LPAREN90_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:261:21: ( sensitivity_list )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:261:22: sensitivity_list
					{
					pushFollow(FOLLOW_sensitivity_list_in_always_declaration1185);
					sensitivity_list91=sensitivity_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sensitivity_list91.getTree());

					}

					RPAREN92=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_always_declaration1188); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN92_tree = (CommonTree)adaptor.create(RPAREN92);
					adaptor.addChild(root_0, RPAREN92_tree);
					}

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:262:3: ( ( logic_instruction | ( logic_content ) ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:263:6: ( logic_instruction | ( logic_content ) )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:263:6: ( logic_instruction | ( logic_content ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( ((LA34_0 >= IDENTIFIER && LA34_0 <= IF)) ) {
				alt34=1;
			}
			else if ( (LA34_0==BEGIN) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:263:8: logic_instruction
					{
					pushFollow(FOLLOW_logic_instruction_in_always_declaration1203);
					logic_instruction93=logic_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction93.getTree());

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:263:28: ( logic_content )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:263:28: ( logic_content )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:263:30: logic_content
					{
					pushFollow(FOLLOW_logic_content_in_always_declaration1209);
					logic_content94=logic_content();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_content94.getTree());

					}

					}
					break;

			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "always_declaration"


	public static class assign_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assign_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:266:1: assign_declaration : ASSIGN IDENTIFIER assign_expression SEMI ;
	public final SystemVerilogFullParser.assign_declaration_return assign_declaration() throws RecognitionException {
		SystemVerilogFullParser.assign_declaration_return retval = new SystemVerilogFullParser.assign_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken ASSIGN95=null;
		XQToken IDENTIFIER96=null;
		XQToken SEMI98=null;
		ParserRuleReturnScope assign_expression97 =null;

		CommonTree ASSIGN95_tree=null;
		CommonTree IDENTIFIER96_tree=null;
		CommonTree SEMI98_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:266:19: ( ASSIGN IDENTIFIER assign_expression SEMI )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:268:3: ASSIGN IDENTIFIER assign_expression SEMI
			{
			root_0 = (CommonTree)adaptor.nil();


			ASSIGN95=(XQToken)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_declaration1229); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN95_tree = (CommonTree)adaptor.create(ASSIGN95);
			adaptor.addChild(root_0, ASSIGN95_tree);
			}

			IDENTIFIER96=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign_declaration1231); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER96_tree = (CommonTree)adaptor.create(IDENTIFIER96);
			adaptor.addChild(root_0, IDENTIFIER96_tree);
			}

			pushFollow(FOLLOW_assign_expression_in_assign_declaration1233);
			assign_expression97=assign_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expression97.getTree());

			SEMI98=(XQToken)match(input,SEMI,FOLLOW_SEMI_in_assign_declaration1235); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SEMI98_tree = (CommonTree)adaptor.create(SEMI98);
			adaptor.addChild(root_0, SEMI98_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign_declaration"


	public static class assign_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assign_expression"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:273:1: assign_expression : ( EQUAL | LE ) ( concatenable_expression ) ;
	public final SystemVerilogFullParser.assign_expression_return assign_expression() throws RecognitionException {
		SystemVerilogFullParser.assign_expression_return retval = new SystemVerilogFullParser.assign_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken set99=null;
		ParserRuleReturnScope concatenable_expression100 =null;

		CommonTree set99_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:273:18: ( ( EQUAL | LE ) ( concatenable_expression ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:274:2: ( EQUAL | LE ) ( concatenable_expression )
			{
			root_0 = (CommonTree)adaptor.nil();


			set99=(XQToken)input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==LE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set99));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:275:3: ( concatenable_expression )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:278:7: concatenable_expression
			{
			pushFollow(FOLLOW_concatenable_expression_in_assign_expression1276);
			concatenable_expression100=concatenable_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, concatenable_expression100.getTree());

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign_expression"


	public static class logic_content_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logic_content"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:284:1: logic_content : BEGIN ( logic_instruction )* END ;
	public final SystemVerilogFullParser.logic_content_return logic_content() throws RecognitionException {
		SystemVerilogFullParser.logic_content_return retval = new SystemVerilogFullParser.logic_content_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken BEGIN101=null;
		XQToken END103=null;
		ParserRuleReturnScope logic_instruction102 =null;

		CommonTree BEGIN101_tree=null;
		CommonTree END103_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:284:14: ( BEGIN ( logic_instruction )* END )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:285:3: BEGIN ( logic_instruction )* END
			{
			root_0 = (CommonTree)adaptor.nil();


			BEGIN101=(XQToken)match(input,BEGIN,FOLLOW_BEGIN_in_logic_content1293); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BEGIN101_tree = (CommonTree)adaptor.create(BEGIN101);
			adaptor.addChild(root_0, BEGIN101_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:286:5: ( logic_instruction )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= IDENTIFIER && LA35_0 <= IF)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:286:5: logic_instruction
					{
					pushFollow(FOLLOW_logic_instruction_in_logic_content1299);
					logic_instruction102=logic_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction102.getTree());

					}
					break;

				default :
					break loop35;
				}
			}

			END103=(XQToken)match(input,END,FOLLOW_END_in_logic_content1304); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END103_tree = (CommonTree)adaptor.create(END103);
			adaptor.addChild(root_0, END103_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_content"


	public static class logic_instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logic_instruction"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:292:1: logic_instruction : ( single_instruction | decision_ifelse );
	public final SystemVerilogFullParser.logic_instruction_return logic_instruction() throws RecognitionException {
		SystemVerilogFullParser.logic_instruction_return retval = new SystemVerilogFullParser.logic_instruction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope single_instruction104 =null;
		ParserRuleReturnScope decision_ifelse105 =null;


		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:293:3: ( single_instruction | decision_ifelse )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==IDENTIFIER) ) {
				alt36=1;
			}
			else if ( (LA36_0==IF) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:294:3: single_instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_single_instruction_in_logic_instruction1318);
					single_instruction104=single_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction104.getTree());

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:295:5: decision_ifelse
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_decision_ifelse_in_logic_instruction1324);
					decision_ifelse105=decision_ifelse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_ifelse105.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_instruction"


	public static class single_instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "single_instruction"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:302:1: single_instruction : IDENTIFIER assign_expression SEMI ;
	public final SystemVerilogFullParser.single_instruction_return single_instruction() throws RecognitionException {
		SystemVerilogFullParser.single_instruction_return retval = new SystemVerilogFullParser.single_instruction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken IDENTIFIER106=null;
		XQToken SEMI108=null;
		ParserRuleReturnScope assign_expression107 =null;

		CommonTree IDENTIFIER106_tree=null;
		CommonTree SEMI108_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:302:19: ( IDENTIFIER assign_expression SEMI )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:302:21: IDENTIFIER assign_expression SEMI
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENTIFIER106=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_single_instruction1338); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER106_tree = (CommonTree)adaptor.create(IDENTIFIER106);
			adaptor.addChild(root_0, IDENTIFIER106_tree);
			}

			pushFollow(FOLLOW_assign_expression_in_single_instruction1340);
			assign_expression107=assign_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expression107.getTree());

			SEMI108=(XQToken)match(input,SEMI,FOLLOW_SEMI_in_single_instruction1342); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SEMI108_tree = (CommonTree)adaptor.create(SEMI108);
			adaptor.addChild(root_0, SEMI108_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_instruction"


	public static class decision_if_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decision_if"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:305:1: decision_if : IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) ;
	public final SystemVerilogFullParser.decision_if_return decision_if() throws RecognitionException {
		SystemVerilogFullParser.decision_if_return retval = new SystemVerilogFullParser.decision_if_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken IF109=null;
		XQToken LPAREN110=null;
		XQToken RPAREN112=null;
		XQToken BEGIN115=null;
		XQToken END118=null;
		ParserRuleReturnScope expression111 =null;
		ParserRuleReturnScope decision_if113 =null;
		ParserRuleReturnScope single_instruction114 =null;
		ParserRuleReturnScope decision_if116 =null;
		ParserRuleReturnScope single_instruction117 =null;

		CommonTree IF109_tree=null;
		CommonTree LPAREN110_tree=null;
		CommonTree RPAREN112_tree=null;
		CommonTree BEGIN115_tree=null;
		CommonTree END118_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:305:12: ( IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:306:3: IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			IF109=(XQToken)match(input,IF,FOLLOW_IF_in_decision_if1352); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF109_tree = (CommonTree)adaptor.create(IF109);
			adaptor.addChild(root_0, IF109_tree);
			}

			LPAREN110=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_decision_if1354); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN110_tree = (CommonTree)adaptor.create(LPAREN110);
			adaptor.addChild(root_0, LPAREN110_tree);
			}

			pushFollow(FOLLOW_expression_in_decision_if1356);
			expression111=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression111.getTree());

			RPAREN112=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_decision_if1358); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN112_tree = (CommonTree)adaptor.create(RPAREN112);
			adaptor.addChild(root_0, RPAREN112_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:307:3: ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==IF) && (synpred1_SystemVerilogFull())) {
				alt38=1;
			}
			else if ( (LA38_0==IDENTIFIER) ) {
				alt38=2;
			}
			else if ( (LA38_0==BEGIN) ) {
				alt38=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:308:5: ( decision_if )=> decision_if
					{
					pushFollow(FOLLOW_decision_if_in_decision_if1375);
					decision_if113=decision_if();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if113.getTree());

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:309:7: single_instruction
					{
					pushFollow(FOLLOW_single_instruction_in_decision_if1383);
					single_instruction114=single_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction114.getTree());

					}
					break;
				case 3 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:310:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:310:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:311:9: BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END
					{
					BEGIN115=(XQToken)match(input,BEGIN,FOLLOW_BEGIN_in_decision_if1401); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN115_tree = (CommonTree)adaptor.create(BEGIN115);
					adaptor.addChild(root_0, BEGIN115_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:312:11: ( ( decision_if )=> decision_if | single_instruction )+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=3;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==IF) && (synpred2_SystemVerilogFull())) {
							alt37=1;
						}
						else if ( (LA37_0==IDENTIFIER) ) {
							alt37=2;
						}

						switch (alt37) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:313:13: ( decision_if )=> decision_if
							{
							pushFollow(FOLLOW_decision_if_in_decision_if1434);
							decision_if116=decision_if();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if116.getTree());

							}
							break;
						case 2 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:314:15: single_instruction
							{
							pushFollow(FOLLOW_single_instruction_in_decision_if1450);
							single_instruction117=single_instruction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction117.getTree());

							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					END118=(XQToken)match(input,END,FOLLOW_END_in_decision_if1473); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					END118_tree = (CommonTree)adaptor.create(END118);
					adaptor.addChild(root_0, END118_tree);
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decision_if"


	public static class decision_elseif_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decision_elseif"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:324:1: decision_elseif : ELSE IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) ;
	public final SystemVerilogFullParser.decision_elseif_return decision_elseif() throws RecognitionException {
		SystemVerilogFullParser.decision_elseif_return retval = new SystemVerilogFullParser.decision_elseif_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken ELSE119=null;
		XQToken IF120=null;
		XQToken LPAREN121=null;
		XQToken RPAREN123=null;
		XQToken BEGIN126=null;
		XQToken END129=null;
		ParserRuleReturnScope expression122 =null;
		ParserRuleReturnScope decision_if124 =null;
		ParserRuleReturnScope single_instruction125 =null;
		ParserRuleReturnScope decision_if127 =null;
		ParserRuleReturnScope single_instruction128 =null;

		CommonTree ELSE119_tree=null;
		CommonTree IF120_tree=null;
		CommonTree LPAREN121_tree=null;
		CommonTree RPAREN123_tree=null;
		CommonTree BEGIN126_tree=null;
		CommonTree END129_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:324:16: ( ELSE IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:325:3: ELSE IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			ELSE119=(XQToken)match(input,ELSE,FOLLOW_ELSE_in_decision_elseif1500); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ELSE119_tree = (CommonTree)adaptor.create(ELSE119);
			adaptor.addChild(root_0, ELSE119_tree);
			}

			IF120=(XQToken)match(input,IF,FOLLOW_IF_in_decision_elseif1502); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF120_tree = (CommonTree)adaptor.create(IF120);
			adaptor.addChild(root_0, IF120_tree);
			}

			LPAREN121=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_decision_elseif1504); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN121_tree = (CommonTree)adaptor.create(LPAREN121);
			adaptor.addChild(root_0, LPAREN121_tree);
			}

			pushFollow(FOLLOW_expression_in_decision_elseif1506);
			expression122=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression122.getTree());

			RPAREN123=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_decision_elseif1508); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN123_tree = (CommonTree)adaptor.create(RPAREN123);
			adaptor.addChild(root_0, RPAREN123_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:326:3: ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==IF) && (synpred3_SystemVerilogFull())) {
				alt40=1;
			}
			else if ( (LA40_0==IDENTIFIER) ) {
				alt40=2;
			}
			else if ( (LA40_0==BEGIN) ) {
				alt40=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:327:5: ( decision_if )=> decision_if
					{
					pushFollow(FOLLOW_decision_if_in_decision_elseif1525);
					decision_if124=decision_if();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if124.getTree());

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:328:7: single_instruction
					{
					pushFollow(FOLLOW_single_instruction_in_decision_elseif1533);
					single_instruction125=single_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction125.getTree());

					}
					break;
				case 3 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:329:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:329:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:330:9: BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END
					{
					BEGIN126=(XQToken)match(input,BEGIN,FOLLOW_BEGIN_in_decision_elseif1551); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN126_tree = (CommonTree)adaptor.create(BEGIN126);
					adaptor.addChild(root_0, BEGIN126_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:331:11: ( ( decision_if )=> decision_if | single_instruction )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=3;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==IF) && (synpred4_SystemVerilogFull())) {
							alt39=1;
						}
						else if ( (LA39_0==IDENTIFIER) ) {
							alt39=2;
						}

						switch (alt39) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:332:13: ( decision_if )=> decision_if
							{
							pushFollow(FOLLOW_decision_if_in_decision_elseif1584);
							decision_if127=decision_if();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if127.getTree());

							}
							break;
						case 2 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:333:15: single_instruction
							{
							pushFollow(FOLLOW_single_instruction_in_decision_elseif1600);
							single_instruction128=single_instruction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction128.getTree());

							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					END129=(XQToken)match(input,END,FOLLOW_END_in_decision_elseif1623); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					END129_tree = (CommonTree)adaptor.create(END129);
					adaptor.addChild(root_0, END129_tree);
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decision_elseif"


	public static class decision_else_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decision_else"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:340:1: decision_else : ELSE ( ( BEGIN ( logic_instruction )* END ) | single_instruction ) ;
	public final SystemVerilogFullParser.decision_else_return decision_else() throws RecognitionException {
		SystemVerilogFullParser.decision_else_return retval = new SystemVerilogFullParser.decision_else_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken ELSE130=null;
		XQToken BEGIN131=null;
		XQToken END133=null;
		ParserRuleReturnScope logic_instruction132 =null;
		ParserRuleReturnScope single_instruction134 =null;

		CommonTree ELSE130_tree=null;
		CommonTree BEGIN131_tree=null;
		CommonTree END133_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:340:14: ( ELSE ( ( BEGIN ( logic_instruction )* END ) | single_instruction ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:341:3: ELSE ( ( BEGIN ( logic_instruction )* END ) | single_instruction )
			{
			root_0 = (CommonTree)adaptor.nil();


			ELSE130=(XQToken)match(input,ELSE,FOLLOW_ELSE_in_decision_else1647); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ELSE130_tree = (CommonTree)adaptor.create(ELSE130);
			adaptor.addChild(root_0, ELSE130_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:5: ( ( BEGIN ( logic_instruction )* END ) | single_instruction )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==BEGIN) ) {
				alt42=1;
			}
			else if ( (LA42_0==IDENTIFIER) ) {
				alt42=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:7: ( BEGIN ( logic_instruction )* END )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:7: ( BEGIN ( logic_instruction )* END )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:8: BEGIN ( logic_instruction )* END
					{
					BEGIN131=(XQToken)match(input,BEGIN,FOLLOW_BEGIN_in_decision_else1657); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN131_tree = (CommonTree)adaptor.create(BEGIN131);
					adaptor.addChild(root_0, BEGIN131_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:14: ( logic_instruction )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( ((LA41_0 >= IDENTIFIER && LA41_0 <= IF)) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:14: logic_instruction
							{
							pushFollow(FOLLOW_logic_instruction_in_decision_else1659);
							logic_instruction132=logic_instruction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction132.getTree());

							}
							break;

						default :
							break loop41;
						}
					}

					END133=(XQToken)match(input,END,FOLLOW_END_in_decision_else1662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					END133_tree = (CommonTree)adaptor.create(END133);
					adaptor.addChild(root_0, END133_tree);
					}

					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:342:40: single_instruction
					{
					pushFollow(FOLLOW_single_instruction_in_decision_else1667);
					single_instruction134=single_instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction134.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decision_else"


	public static class decision_ifelse_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decision_ifelse"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:346:1: decision_ifelse : decision_if ( decision_elseif )* ( decision_else )? ;
	public final SystemVerilogFullParser.decision_ifelse_return decision_ifelse() throws RecognitionException {
		SystemVerilogFullParser.decision_ifelse_return retval = new SystemVerilogFullParser.decision_ifelse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decision_if135 =null;
		ParserRuleReturnScope decision_elseif136 =null;
		ParserRuleReturnScope decision_else137 =null;


		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:346:16: ( decision_if ( decision_elseif )* ( decision_else )? )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:347:3: decision_if ( decision_elseif )* ( decision_else )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_decision_if_in_decision_ifelse1683);
			decision_if135=decision_if();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if135.getTree());

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:348:3: ( decision_elseif )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==ELSE) ) {
					int LA43_1 = input.LA(2);
					if ( (LA43_1==IF) ) {
						alt43=1;
					}

				}

				switch (alt43) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:348:3: decision_elseif
					{
					pushFollow(FOLLOW_decision_elseif_in_decision_ifelse1687);
					decision_elseif136=decision_elseif();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_elseif136.getTree());

					}
					break;

				default :
					break loop43;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:349:3: ( decision_else )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==ELSE) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:349:3: decision_else
					{
					pushFollow(FOLLOW_decision_else_in_decision_ifelse1692);
					decision_else137=decision_else();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_else137.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decision_ifelse"


	public static class data_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "data_type"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:355:1: data_type : ( BASE_DATA_TYPE | SV_DATA_TYPE );
	public final SystemVerilogFullParser.data_type_return data_type() throws RecognitionException {
		SystemVerilogFullParser.data_type_return retval = new SystemVerilogFullParser.data_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken set138=null;

		CommonTree set138_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:355:10: ( BASE_DATA_TYPE | SV_DATA_TYPE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set138=(XQToken)input.LT(1);
			if ( input.LA(1)==BASE_DATA_TYPE||input.LA(1)==SV_DATA_TYPE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set138));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "data_type"


	public static class data_size_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "data_size"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:357:1: data_size : ( LBRACK size_def COLON NUMBER RBRACK ) -> ^( DATA_SIZE size_def ) ;
	public final SystemVerilogFullParser.data_size_return data_size() throws RecognitionException {
		SystemVerilogFullParser.data_size_return retval = new SystemVerilogFullParser.data_size_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken LBRACK139=null;
		XQToken COLON141=null;
		XQToken NUMBER142=null;
		XQToken RBRACK143=null;
		ParserRuleReturnScope size_def140 =null;

		CommonTree LBRACK139_tree=null;
		CommonTree COLON141_tree=null;
		CommonTree NUMBER142_tree=null;
		CommonTree RBRACK143_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_size_def=new RewriteRuleSubtreeStream(adaptor,"rule size_def");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:357:11: ( ( LBRACK size_def COLON NUMBER RBRACK ) -> ^( DATA_SIZE size_def ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:357:13: ( LBRACK size_def COLON NUMBER RBRACK )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:357:13: ( LBRACK size_def COLON NUMBER RBRACK )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:357:14: LBRACK size_def COLON NUMBER RBRACK
			{
			LBRACK139=(XQToken)match(input,LBRACK,FOLLOW_LBRACK_in_data_size1717); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK139);

			pushFollow(FOLLOW_size_def_in_data_size1719);
			size_def140=size_def();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_size_def.add(size_def140.getTree());
			COLON141=(XQToken)match(input,COLON,FOLLOW_COLON_in_data_size1721); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON141);

			NUMBER142=(XQToken)match(input,NUMBER,FOLLOW_NUMBER_in_data_size1723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER142);

			RBRACK143=(XQToken)match(input,RBRACK,FOLLOW_RBRACK_in_data_size1725); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK143);

			}

			// AST REWRITE
			// elements: size_def
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 357:51: -> ^( DATA_SIZE size_def )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:357:54: ^( DATA_SIZE size_def )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DATA_SIZE, "DATA_SIZE"), root_1);
				adaptor.addChild(root_1, stream_size_def.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "data_size"


	public static class size_def_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "size_def"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:359:1: size_def : expression -> ^( EXPRESSION expression ^( TEXT ) ) ;
	public final SystemVerilogFullParser.size_def_return size_def() throws RecognitionException {
		SystemVerilogFullParser.size_def_return retval = new SystemVerilogFullParser.size_def_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression144 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:359:10: ( expression -> ^( EXPRESSION expression ^( TEXT ) ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:360:9: expression
			{
			pushFollow(FOLLOW_expression_in_size_def1752);
			expression144=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression144.getTree());
			if ( state.backtracking==0 ) {
			          //System.out.println("Found Expression in parser: "+(expression144!=null?input.toString(expression144.start,expression144.stop):null));
			        
			        }
			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 365:9: -> ^( EXPRESSION expression ^( TEXT ) )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:365:12: ^( EXPRESSION expression ^( TEXT ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:365:36: ^( TEXT )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEXT, "TEXT"), root_2);
				adaptor.addChild(root_2, new CommonTree(new CommonToken(0,(expression144!=null?input.toString(expression144.start,expression144.stop):null))));
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "size_def"


	public static class concatenable_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "concatenable_expression"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:371:1: concatenable_expression : ( ( LCURLY expression ( COMMA expression )* RCURLY ) | expression );
	public final SystemVerilogFullParser.concatenable_expression_return concatenable_expression() throws RecognitionException {
		SystemVerilogFullParser.concatenable_expression_return retval = new SystemVerilogFullParser.concatenable_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken LCURLY145=null;
		XQToken COMMA147=null;
		XQToken RCURLY149=null;
		ParserRuleReturnScope expression146 =null;
		ParserRuleReturnScope expression148 =null;
		ParserRuleReturnScope expression150 =null;

		CommonTree LCURLY145_tree=null;
		CommonTree COMMA147_tree=null;
		CommonTree RCURLY149_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:371:24: ( ( LCURLY expression ( COMMA expression )* RCURLY ) | expression )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==LCURLY) ) {
				alt46=1;
			}
			else if ( (LA46_0==BAND||(LA46_0 >= BNOT && LA46_0 <= BOR)||(LA46_0 >= BUS_VALUE && LA46_0 <= COMMA)||LA46_0==DIV||LA46_0==EQ||LA46_0==EXE_QUOTE||LA46_0==GE||(LA46_0 >= GT && LA46_0 <= IDENTIFIER)||LA46_0==LAND||(LA46_0 >= LE && LA46_0 <= MINUS)||LA46_0==NEWLINE||LA46_0==NUMBER||LA46_0==PLUS||LA46_0==QUESTION||LA46_0==RCURLY||(LA46_0 >= RPAREN && LA46_0 <= SEMI)||LA46_0==STAR) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:372:3: ( LCURLY expression ( COMMA expression )* RCURLY )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:372:3: ( LCURLY expression ( COMMA expression )* RCURLY )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:372:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY145=(XQToken)match(input,LCURLY,FOLLOW_LCURLY_in_concatenable_expression1800); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LCURLY145_tree = (CommonTree)adaptor.create(LCURLY145);
					adaptor.addChild(root_0, LCURLY145_tree);
					}

					pushFollow(FOLLOW_expression_in_concatenable_expression1802);
					expression146=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:372:22: ( COMMA expression )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==COMMA) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:372:23: COMMA expression
							{
							COMMA147=(XQToken)match(input,COMMA,FOLLOW_COMMA_in_concatenable_expression1805); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA147_tree = (CommonTree)adaptor.create(COMMA147);
							adaptor.addChild(root_0, COMMA147_tree);
							}

							pushFollow(FOLLOW_expression_in_concatenable_expression1807);
							expression148=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression148.getTree());

							}
							break;

						default :
							break loop45;
						}
					}

					RCURLY149=(XQToken)match(input,RCURLY,FOLLOW_RCURLY_in_concatenable_expression1811); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RCURLY149_tree = (CommonTree)adaptor.create(RCURLY149);
					adaptor.addChild(root_0, RCURLY149_tree);
					}

					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:373:5: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_concatenable_expression1819);
					expression150=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression150.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concatenable_expression"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:375:1: expression : ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )? ;
	public final SystemVerilogFullParser.expression_return expression() throws RecognitionException {
		SystemVerilogFullParser.expression_return retval = new SystemVerilogFullParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken LPAREN151=null;
		XQToken RPAREN153=null;
		ParserRuleReturnScope expression152 =null;
		ParserRuleReturnScope expression_operand154 =null;
		ParserRuleReturnScope expression_operator155 =null;
		ParserRuleReturnScope expression156 =null;

		CommonTree LPAREN151_tree=null;
		CommonTree RPAREN153_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:375:11: ( ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )? )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:3: ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:3: ( ( LPAREN expression RPAREN ) | expression_operand )?
			int alt47=3;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==LPAREN) ) {
				alt47=1;
			}
			else if ( (LA47_0==BUS_VALUE||LA47_0==EXE_QUOTE||LA47_0==IDENTIFIER||LA47_0==NUMBER) ) {
				alt47=2;
			}
			switch (alt47) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:4: ( LPAREN expression RPAREN )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:4: ( LPAREN expression RPAREN )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:5: LPAREN expression RPAREN
					{
					LPAREN151=(XQToken)match(input,LPAREN,FOLLOW_LPAREN_in_expression1833); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN151_tree = (CommonTree)adaptor.create(LPAREN151);
					adaptor.addChild(root_0, LPAREN151_tree);
					}

					pushFollow(FOLLOW_expression_in_expression1835);
					expression152=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression152.getTree());

					RPAREN153=(XQToken)match(input,RPAREN,FOLLOW_RPAREN_in_expression1837); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN153_tree = (CommonTree)adaptor.create(RPAREN153);
					adaptor.addChild(root_0, RPAREN153_tree);
					}

					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:33: expression_operand
					{
					pushFollow(FOLLOW_expression_operand_in_expression1842);
					expression_operand154=expression_operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_operand154.getTree());

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:55: ( expression_operator expression )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==COLON) ) {
				int LA48_1 = input.LA(2);
				if ( (LA48_1==NUMBER) ) {
					int LA48_4 = input.LA(3);
					if ( (LA48_4==BAND||(LA48_4 >= BNOT && LA48_4 <= BOR)||(LA48_4 >= BXNOR && LA48_4 <= COMMA)||LA48_4==DIV||LA48_4==EQ||LA48_4==GE||LA48_4==GT||LA48_4==LAND||(LA48_4 >= LE && LA48_4 <= LOR)||(LA48_4 >= LT && LA48_4 <= MINUS)||LA48_4==NEWLINE||LA48_4==PLUS||LA48_4==QUESTION||LA48_4==RCURLY||(LA48_4 >= RPAREN && LA48_4 <= SEMI)||LA48_4==STAR) ) {
						alt48=1;
					}
				}
				else if ( (LA48_1==BAND||(LA48_1 >= BNOT && LA48_1 <= BOR)||(LA48_1 >= BUS_VALUE && LA48_1 <= COMMA)||LA48_1==DIV||LA48_1==EQ||LA48_1==EXE_QUOTE||LA48_1==GE||(LA48_1 >= GT && LA48_1 <= IDENTIFIER)||LA48_1==LAND||(LA48_1 >= LE && LA48_1 <= MINUS)||LA48_1==NEWLINE||LA48_1==PLUS||LA48_1==QUESTION||LA48_1==RCURLY||(LA48_1 >= RPAREN && LA48_1 <= SEMI)||LA48_1==STAR) ) {
					alt48=1;
				}
			}
			else if ( (LA48_0==BAND||(LA48_0 >= BNOT && LA48_0 <= BOR)||(LA48_0 >= BXNOR && LA48_0 <= BXOR)||LA48_0==DIV||LA48_0==EQ||LA48_0==GE||LA48_0==GT||LA48_0==LAND||(LA48_0 >= LE && LA48_0 <= LOR)||(LA48_0 >= LT && LA48_0 <= MINUS)||LA48_0==PLUS||LA48_0==QUESTION||LA48_0==STAR) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:376:56: expression_operator expression
					{
					pushFollow(FOLLOW_expression_operator_in_expression1848);
					expression_operator155=expression_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_operator155.getTree());

					pushFollow(FOLLOW_expression_in_expression1850);
					expression156=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expression_operand_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_operand"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:1: expression_operand : ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | ( EXE_QUOTE IDENTIFIER ) | NUMBER | typed_value );
	public final SystemVerilogFullParser.expression_operand_return expression_operand() throws RecognitionException {
		SystemVerilogFullParser.expression_operand_return retval = new SystemVerilogFullParser.expression_operand_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken IDENTIFIER157=null;
		XQToken LBRACK158=null;
		XQToken NUMBER159=null;
		XQToken RBRACK160=null;
		XQToken EXE_QUOTE161=null;
		XQToken IDENTIFIER162=null;
		XQToken NUMBER163=null;
		ParserRuleReturnScope typed_value164 =null;

		CommonTree IDENTIFIER157_tree=null;
		CommonTree LBRACK158_tree=null;
		CommonTree NUMBER159_tree=null;
		CommonTree RBRACK160_tree=null;
		CommonTree EXE_QUOTE161_tree=null;
		CommonTree IDENTIFIER162_tree=null;
		CommonTree NUMBER163_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:20: ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | ( EXE_QUOTE IDENTIFIER ) | NUMBER | typed_value )
			int alt50=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt50=1;
				}
				break;
			case EXE_QUOTE:
				{
				alt50=2;
				}
				break;
			case NUMBER:
				{
				alt50=3;
				}
				break;
			case BUS_VALUE:
				{
				alt50=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:22: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:22: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:23: IDENTIFIER ( LBRACK NUMBER RBRACK )?
					{
					IDENTIFIER157=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand1861); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER157_tree = (CommonTree)adaptor.create(IDENTIFIER157);
					adaptor.addChild(root_0, IDENTIFIER157_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:34: ( LBRACK NUMBER RBRACK )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==LBRACK) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:35: LBRACK NUMBER RBRACK
							{
							LBRACK158=(XQToken)match(input,LBRACK,FOLLOW_LBRACK_in_expression_operand1864); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LBRACK158_tree = (CommonTree)adaptor.create(LBRACK158);
							adaptor.addChild(root_0, LBRACK158_tree);
							}

							NUMBER159=(XQToken)match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand1866); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NUMBER159_tree = (CommonTree)adaptor.create(NUMBER159);
							adaptor.addChild(root_0, NUMBER159_tree);
							}

							RBRACK160=(XQToken)match(input,RBRACK,FOLLOW_RBRACK_in_expression_operand1868); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							RBRACK160_tree = (CommonTree)adaptor.create(RBRACK160);
							adaptor.addChild(root_0, RBRACK160_tree);
							}

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:61: ( EXE_QUOTE IDENTIFIER )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:61: ( EXE_QUOTE IDENTIFIER )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:62: EXE_QUOTE IDENTIFIER
					{
					EXE_QUOTE161=(XQToken)match(input,EXE_QUOTE,FOLLOW_EXE_QUOTE_in_expression_operand1876); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXE_QUOTE161_tree = (CommonTree)adaptor.create(EXE_QUOTE161);
					adaptor.addChild(root_0, EXE_QUOTE161_tree);
					}

					IDENTIFIER162=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand1878); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER162_tree = (CommonTree)adaptor.create(IDENTIFIER162);
					adaptor.addChild(root_0, IDENTIFIER162_tree);
					}

					}

					}
					break;
				case 3 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:85: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					NUMBER163=(XQToken)match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand1882); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER163_tree = (CommonTree)adaptor.create(NUMBER163);
					adaptor.addChild(root_0, NUMBER163_tree);
					}

					}
					break;
				case 4 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:378:94: typed_value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typed_value_in_expression_operand1886);
					typed_value164=typed_value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typed_value164.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_operand"


	public static class expression_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_operator"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:379:1: expression_operator : ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE );
	public final SystemVerilogFullParser.expression_operator_return expression_operator() throws RecognitionException {
		SystemVerilogFullParser.expression_operator_return retval = new SystemVerilogFullParser.expression_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken set165=null;

		CommonTree set165_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:379:20: ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set165=(XQToken)input.LT(1);
			if ( input.LA(1)==BAND||(input.LA(1) >= BNOT && input.LA(1) <= BOR)||(input.LA(1) >= BXNOR && input.LA(1) <= COLON)||input.LA(1)==DIV||input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LAND||(input.LA(1) >= LE && input.LA(1) <= LOR)||(input.LA(1) >= LT && input.LA(1) <= MINUS)||input.LA(1)==PLUS||input.LA(1)==QUESTION||input.LA(1)==STAR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set165));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_operator"


	public static class typed_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typed_value"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:384:1: typed_value : BUS_VALUE ;
	public final SystemVerilogFullParser.typed_value_return typed_value() throws RecognitionException {
		SystemVerilogFullParser.typed_value_return retval = new SystemVerilogFullParser.typed_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken BUS_VALUE166=null;

		CommonTree BUS_VALUE166_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:384:12: ( BUS_VALUE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:384:14: BUS_VALUE
			{
			root_0 = (CommonTree)adaptor.nil();


			BUS_VALUE166=(XQToken)match(input,BUS_VALUE,FOLLOW_BUS_VALUE_in_typed_value1978); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BUS_VALUE166_tree = (CommonTree)adaptor.create(BUS_VALUE166);
			adaptor.addChild(root_0, BUS_VALUE166_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typed_value"


	public static class sensitivity_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sensitivity_list"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:390:1: sensitivity_list : sensitivity ( ( OR ) sensitivity )* ;
	public final SystemVerilogFullParser.sensitivity_list_return sensitivity_list() throws RecognitionException {
		SystemVerilogFullParser.sensitivity_list_return retval = new SystemVerilogFullParser.sensitivity_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken OR168=null;
		ParserRuleReturnScope sensitivity167 =null;
		ParserRuleReturnScope sensitivity169 =null;

		CommonTree OR168_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:390:17: ( sensitivity ( ( OR ) sensitivity )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:392:3: sensitivity ( ( OR ) sensitivity )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_sensitivity_in_sensitivity_list1993);
			sensitivity167=sensitivity();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sensitivity167.getTree());

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:392:15: ( ( OR ) sensitivity )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==OR) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:392:17: ( OR ) sensitivity
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:392:17: ( OR )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:392:18: OR
					{
					OR168=(XQToken)match(input,OR,FOLLOW_OR_in_sensitivity_list1998); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR168_tree = (CommonTree)adaptor.create(OR168);
					adaptor.addChild(root_0, OR168_tree);
					}

					}

					pushFollow(FOLLOW_sensitivity_in_sensitivity_list2001);
					sensitivity169=sensitivity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sensitivity169.getTree());

					}
					break;

				default :
					break loop51;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sensitivity_list"


	public static class sensitivity_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sensitivity"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:397:1: sensitivity : ( POSEDGE | NEGEDGE ) IDENTIFIER ;
	public final SystemVerilogFullParser.sensitivity_return sensitivity() throws RecognitionException {
		SystemVerilogFullParser.sensitivity_return retval = new SystemVerilogFullParser.sensitivity_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken set170=null;
		XQToken IDENTIFIER171=null;

		CommonTree set170_tree=null;
		CommonTree IDENTIFIER171_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:397:12: ( ( POSEDGE | NEGEDGE ) IDENTIFIER )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:398:3: ( POSEDGE | NEGEDGE ) IDENTIFIER
			{
			root_0 = (CommonTree)adaptor.nil();


			set170=(XQToken)input.LT(1);
			if ( input.LA(1)==NEGEDGE||input.LA(1)==POSEDGE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set170));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			IDENTIFIER171=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_sensitivity2021); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER171_tree = (CommonTree)adaptor.create(IDENTIFIER171);
			adaptor.addChild(root_0, IDENTIFIER171_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sensitivity"


	public static class nokeywords_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nokeywords"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:404:1: nokeywords : ~ ( BEGIN | END | SEMI ) ;
	public final SystemVerilogFullParser.nokeywords_return nokeywords() throws RecognitionException {
		SystemVerilogFullParser.nokeywords_return retval = new SystemVerilogFullParser.nokeywords_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken set172=null;

		CommonTree set172_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:404:11: (~ ( BEGIN | END | SEMI ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set172=(XQToken)input.LT(1);
			if ( (input.LA(1) >= ALWAYS && input.LA(1) <= BASE_DATA_TYPE)||(input.LA(1) >= BNOT && input.LA(1) <= ELSE)||(input.LA(1) >= ENDMODULE && input.LA(1) <= RPAREN)||(input.LA(1) >= SL && input.LA(1) <= 104) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set172));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nokeywords"


	public static class fpga_param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fpga_param"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:409:1: fpga_param : FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~ DQUOTE )* DQUOTE FPGA_PARAM_STOP ;
	public final SystemVerilogFullParser.fpga_param_return fpga_param() throws RecognitionException {
		SystemVerilogFullParser.fpga_param_return retval = new SystemVerilogFullParser.fpga_param_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken FPGA_PARAM_START173=null;
		XQToken IDENTIFIER174=null;
		XQToken EQUAL175=null;
		XQToken DQUOTE176=null;
		XQToken set177=null;
		XQToken DQUOTE178=null;
		XQToken FPGA_PARAM_STOP179=null;

		CommonTree FPGA_PARAM_START173_tree=null;
		CommonTree IDENTIFIER174_tree=null;
		CommonTree EQUAL175_tree=null;
		CommonTree DQUOTE176_tree=null;
		CommonTree set177_tree=null;
		CommonTree DQUOTE178_tree=null;
		CommonTree FPGA_PARAM_STOP179_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:409:11: ( FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~ DQUOTE )* DQUOTE FPGA_PARAM_STOP )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:411:3: FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~ DQUOTE )* DQUOTE FPGA_PARAM_STOP
			{
			root_0 = (CommonTree)adaptor.nil();


			FPGA_PARAM_START173=(XQToken)match(input,FPGA_PARAM_START,FOLLOW_FPGA_PARAM_START_in_fpga_param2052); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FPGA_PARAM_START173_tree = (CommonTree)adaptor.create(FPGA_PARAM_START173);
			adaptor.addChild(root_0, FPGA_PARAM_START173_tree);
			}

			IDENTIFIER174=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fpga_param2054); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER174_tree = (CommonTree)adaptor.create(IDENTIFIER174);
			adaptor.addChild(root_0, IDENTIFIER174_tree);
			}

			EQUAL175=(XQToken)match(input,EQUAL,FOLLOW_EQUAL_in_fpga_param2056); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EQUAL175_tree = (CommonTree)adaptor.create(EQUAL175);
			adaptor.addChild(root_0, EQUAL175_tree);
			}

			DQUOTE176=(XQToken)match(input,DQUOTE,FOLLOW_DQUOTE_in_fpga_param2058); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DQUOTE176_tree = (CommonTree)adaptor.create(DQUOTE176);
			adaptor.addChild(root_0, DQUOTE176_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:411:44: (~ DQUOTE )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( ((LA52_0 >= ALWAYS && LA52_0 <= DOXY_PARAM)||(LA52_0 >= ELSE && LA52_0 <= 104)) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
					{
					set177=(XQToken)input.LT(1);
					if ( (input.LA(1) >= ALWAYS && input.LA(1) <= DOXY_PARAM)||(input.LA(1) >= ELSE && input.LA(1) <= 104) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set177));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop52;
				}
			}

			DQUOTE178=(XQToken)match(input,DQUOTE,FOLLOW_DQUOTE_in_fpga_param2066); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DQUOTE178_tree = (CommonTree)adaptor.create(DQUOTE178);
			adaptor.addChild(root_0, DQUOTE178_tree);
			}

			FPGA_PARAM_STOP179=(XQToken)match(input,FPGA_PARAM_STOP,FOLLOW_FPGA_PARAM_STOP_in_fpga_param2068); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FPGA_PARAM_STOP179_tree = (CommonTree)adaptor.create(FPGA_PARAM_STOP179);
			adaptor.addChild(root_0, FPGA_PARAM_STOP179_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fpga_param"


	public static class doxygen_group_def_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "doxygen_group_def"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:416:1: doxygen_group_def : DOXYGEN_GROUP_DEF IDENTIFIER -> ^( IDENTIFIER ) ;
	public final SystemVerilogFullParser.doxygen_group_def_return doxygen_group_def() throws RecognitionException {
		SystemVerilogFullParser.doxygen_group_def_return retval = new SystemVerilogFullParser.doxygen_group_def_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken DOXYGEN_GROUP_DEF180=null;
		XQToken IDENTIFIER181=null;

		CommonTree DOXYGEN_GROUP_DEF180_tree=null;
		CommonTree IDENTIFIER181_tree=null;
		RewriteRuleTokenStream stream_DOXYGEN_GROUP_DEF=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_GROUP_DEF");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:416:18: ( DOXYGEN_GROUP_DEF IDENTIFIER -> ^( IDENTIFIER ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:417:3: DOXYGEN_GROUP_DEF IDENTIFIER
			{
			DOXYGEN_GROUP_DEF180=(XQToken)match(input,DOXYGEN_GROUP_DEF,FOLLOW_DOXYGEN_GROUP_DEF_in_doxygen_group_def2081); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOXYGEN_GROUP_DEF.add(DOXYGEN_GROUP_DEF180);

			IDENTIFIER181=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_doxygen_group_def2083); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER181);

			if ( state.backtracking==0 ) {
			//    System.out.println("Defined Group: "+(IDENTIFIER181!=null?IDENTIFIER181.getText():null));
			    //this.currentGroup = new ModulePortGroup((IDENTIFIER181!=null?IDENTIFIER181.getText():null));
			    this.currentGroup = (IDENTIFIER181!=null?IDENTIFIER181.getText():null);
			  }
			// AST REWRITE
			// elements: IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 423:3: -> ^( IDENTIFIER )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:423:6: ^( IDENTIFIER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doxygen_group_def"


	public static class doxygen_group_begin_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "doxygen_group_begin"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:425:1: doxygen_group_begin : DOXYGEN_GROUP_START -> ^( DOXY_GROUP_START ) ;
	public final SystemVerilogFullParser.doxygen_group_begin_return doxygen_group_begin() throws RecognitionException {
		SystemVerilogFullParser.doxygen_group_begin_return retval = new SystemVerilogFullParser.doxygen_group_begin_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken DOXYGEN_GROUP_START182=null;

		CommonTree DOXYGEN_GROUP_START182_tree=null;
		RewriteRuleTokenStream stream_DOXYGEN_GROUP_START=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_GROUP_START");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:425:20: ( DOXYGEN_GROUP_START -> ^( DOXY_GROUP_START ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:426:3: DOXYGEN_GROUP_START
			{
			DOXYGEN_GROUP_START182=(XQToken)match(input,DOXYGEN_GROUP_START,FOLLOW_DOXYGEN_GROUP_START_in_doxygen_group_begin2106); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOXYGEN_GROUP_START.add(DOXYGEN_GROUP_START182);

			if ( state.backtracking==0 ) {

			    this.currentGroupActive = true;
			  }
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 432:3: -> ^( DOXY_GROUP_START )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:432:6: ^( DOXY_GROUP_START )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOXY_GROUP_START, "DOXY_GROUP_START"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doxygen_group_begin"


	public static class doxygen_group_end_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "doxygen_group_end"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:434:1: doxygen_group_end : DOXYGEN_GROUP_END -> ^( DOXY_GROUP_STOP ) ;
	public final SystemVerilogFullParser.doxygen_group_end_return doxygen_group_end() throws RecognitionException {
		SystemVerilogFullParser.doxygen_group_end_return retval = new SystemVerilogFullParser.doxygen_group_end_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken DOXYGEN_GROUP_END183=null;

		CommonTree DOXYGEN_GROUP_END183_tree=null;
		RewriteRuleTokenStream stream_DOXYGEN_GROUP_END=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_GROUP_END");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:434:18: ( DOXYGEN_GROUP_END -> ^( DOXY_GROUP_STOP ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:435:3: DOXYGEN_GROUP_END
			{
			DOXYGEN_GROUP_END183=(XQToken)match(input,DOXYGEN_GROUP_END,FOLLOW_DOXYGEN_GROUP_END_in_doxygen_group_end2131); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOXYGEN_GROUP_END.add(DOXYGEN_GROUP_END183);

			if ( state.backtracking==0 ) {
			    
			    this.currentGroupActive = false;
			    this.currentGroup = null;
			    
			    //-- Clean Params stack
			    this.doxyParams.clear();
			  }
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 444:3: -> ^( DOXY_GROUP_STOP )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:444:6: ^( DOXY_GROUP_STOP )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOXY_GROUP_STOP, "DOXY_GROUP_STOP"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doxygen_group_end"


	public static class doxygen_param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "doxygen_param"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:447:1: doxygen_param : DOXYGEN_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? -> ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) ;
	public final SystemVerilogFullParser.doxygen_param_return doxygen_param() throws RecognitionException {
		SystemVerilogFullParser.doxygen_param_return retval = new SystemVerilogFullParser.doxygen_param_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken DOXYGEN_PARAM184=null;
		XQToken EXTENDED_IDENTIFIER185=null;
		ParserRuleReturnScope short_long_identifier186 =null;

		CommonTree DOXYGEN_PARAM184_tree=null;
		CommonTree EXTENDED_IDENTIFIER185_tree=null;
		RewriteRuleTokenStream stream_EXTENDED_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token EXTENDED_IDENTIFIER");
		RewriteRuleTokenStream stream_DOXYGEN_PARAM=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_PARAM");
		RewriteRuleSubtreeStream stream_short_long_identifier=new RewriteRuleSubtreeStream(adaptor,"rule short_long_identifier");

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:447:14: ( DOXYGEN_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? -> ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:448:3: DOXYGEN_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )?
			{
			DOXYGEN_PARAM184=(XQToken)match(input,DOXYGEN_PARAM,FOLLOW_DOXYGEN_PARAM_in_doxygen_param2154); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOXYGEN_PARAM.add(DOXYGEN_PARAM184);

			EXTENDED_IDENTIFIER185=(XQToken)match(input,EXTENDED_IDENTIFIER,FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param2156); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXTENDED_IDENTIFIER.add(EXTENDED_IDENTIFIER185);

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:448:37: ( short_long_identifier )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==IDENTIFIER) ) {
				int LA53_1 = input.LA(2);
				if ( (LA53_1==BASE_DATA_TYPE||(LA53_1 >= DOXYGEN_GROUP_START && LA53_1 <= DOXYGEN_PARAM)||LA53_1==IDENTIFIER||LA53_1==LBRACK||LA53_1==PORT_DIRECTION) ) {
					alt53=1;
				}
			}
			else if ( (LA53_0==DQUOTE) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:448:37: short_long_identifier
					{
					pushFollow(FOLLOW_short_long_identifier_in_doxygen_param2158);
					short_long_identifier186=short_long_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_short_long_identifier.add(short_long_identifier186.getTree());
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    //-- Stack parameter for active section
			    //this.doxyParams.put($doxygen_param_name.text,(short_long_identifier186!=null?input.toString(short_long_identifier186.start,short_long_identifier186.stop):null).replaceAll("\"",""));
			    
			    //-- Add to group if we are in one
			  }
			// AST REWRITE
			// elements: short_long_identifier, EXTENDED_IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 455:3: -> ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? )
			{
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:455:6: ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOXY_PARAM, "DOXY_PARAM"), root_1);
				adaptor.addChild(root_1, stream_EXTENDED_IDENTIFIER.nextNode());
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:455:39: ( short_long_identifier )?
				if ( stream_short_long_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_short_long_identifier.nextTree());
				}
				stream_short_long_identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doxygen_param"


	public static class short_long_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "short_long_identifier"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:1: short_long_identifier : ( IDENTIFIER | DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE );
	public final SystemVerilogFullParser.short_long_identifier_return short_long_identifier() throws RecognitionException {
		SystemVerilogFullParser.short_long_identifier_return retval = new SystemVerilogFullParser.short_long_identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken IDENTIFIER187=null;
		XQToken DQUOTE188=null;
		XQToken IDENTIFIER189=null;
		XQToken WS190=null;
		XQToken IDENTIFIER191=null;
		XQToken DQUOTE192=null;

		CommonTree IDENTIFIER187_tree=null;
		CommonTree DQUOTE188_tree=null;
		CommonTree IDENTIFIER189_tree=null;
		CommonTree WS190_tree=null;
		CommonTree IDENTIFIER191_tree=null;
		CommonTree DQUOTE192_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:23: ( IDENTIFIER | DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==IDENTIFIER) ) {
				alt56=1;
			}
			else if ( (LA56_0==DQUOTE) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:25: IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENTIFIER187=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier2190); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER187_tree = (CommonTree)adaptor.create(IDENTIFIER187);
					adaptor.addChild(root_0, IDENTIFIER187_tree);
					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:38: DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE
					{
					root_0 = (CommonTree)adaptor.nil();


					DQUOTE188=(XQToken)match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier2194); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DQUOTE188_tree = (CommonTree)adaptor.create(DQUOTE188);
					adaptor.addChild(root_0, DQUOTE188_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:45: ( IDENTIFIER ( ( WS )+ IDENTIFIER )* )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:46: IDENTIFIER ( ( WS )+ IDENTIFIER )*
					{
					IDENTIFIER189=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier2197); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER189_tree = (CommonTree)adaptor.create(IDENTIFIER189);
					adaptor.addChild(root_0, IDENTIFIER189_tree);
					}

					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:57: ( ( WS )+ IDENTIFIER )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==WS) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:58: ( WS )+ IDENTIFIER
							{
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:58: ( WS )+
							int cnt54=0;
							loop54:
							while (true) {
								int alt54=2;
								int LA54_0 = input.LA(1);
								if ( (LA54_0==WS) ) {
									alt54=1;
								}

								switch (alt54) {
								case 1 :
									// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:463:58: WS
									{
									WS190=(XQToken)match(input,WS,FOLLOW_WS_in_short_long_identifier2200); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									WS190_tree = (CommonTree)adaptor.create(WS190);
									adaptor.addChild(root_0, WS190_tree);
									}

									}
									break;

								default :
									if ( cnt54 >= 1 ) break loop54;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(54, input);
									throw eee;
								}
								cnt54++;
							}

							IDENTIFIER191=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier2203); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENTIFIER191_tree = (CommonTree)adaptor.create(IDENTIFIER191);
							adaptor.addChild(root_0, IDENTIFIER191_tree);
							}

							}
							break;

						default :
							break loop55;
						}
					}

					}

					DQUOTE192=(XQToken)match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier2208); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DQUOTE192_tree = (CommonTree)adaptor.create(DQUOTE192);
					adaptor.addChild(root_0, DQUOTE192_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "short_long_identifier"


	public static class long_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "long_identifier"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:1: long_identifier : DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE ;
	public final SystemVerilogFullParser.long_identifier_return long_identifier() throws RecognitionException {
		SystemVerilogFullParser.long_identifier_return retval = new SystemVerilogFullParser.long_identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		XQToken DQUOTE193=null;
		XQToken IDENTIFIER194=null;
		XQToken WS195=null;
		XQToken IDENTIFIER196=null;
		XQToken DQUOTE197=null;

		CommonTree DQUOTE193_tree=null;
		CommonTree IDENTIFIER194_tree=null;
		CommonTree WS195_tree=null;
		CommonTree IDENTIFIER196_tree=null;
		CommonTree DQUOTE197_tree=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:17: ( DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:19: DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE
			{
			root_0 = (CommonTree)adaptor.nil();


			DQUOTE193=(XQToken)match(input,DQUOTE,FOLLOW_DQUOTE_in_long_identifier2217); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DQUOTE193_tree = (CommonTree)adaptor.create(DQUOTE193);
			adaptor.addChild(root_0, DQUOTE193_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:26: ( IDENTIFIER ( ( WS )+ IDENTIFIER )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:27: IDENTIFIER ( ( WS )+ IDENTIFIER )*
			{
			IDENTIFIER194=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_long_identifier2220); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER194_tree = (CommonTree)adaptor.create(IDENTIFIER194);
			adaptor.addChild(root_0, IDENTIFIER194_tree);
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:38: ( ( WS )+ IDENTIFIER )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==WS) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:39: ( WS )+ IDENTIFIER
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:39: ( WS )+
					int cnt57=0;
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==WS) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:464:39: WS
							{
							WS195=(XQToken)match(input,WS,FOLLOW_WS_in_long_identifier2223); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							WS195_tree = (CommonTree)adaptor.create(WS195);
							adaptor.addChild(root_0, WS195_tree);
							}

							}
							break;

						default :
							if ( cnt57 >= 1 ) break loop57;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(57, input);
							throw eee;
						}
						cnt57++;
					}

					IDENTIFIER196=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_long_identifier2226); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER196_tree = (CommonTree)adaptor.create(IDENTIFIER196);
					adaptor.addChild(root_0, IDENTIFIER196_tree);
					}

					}
					break;

				default :
					break loop58;
				}
			}

			}

			DQUOTE197=(XQToken)match(input,DQUOTE,FOLLOW_DQUOTE_in_long_identifier2231); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DQUOTE197_tree = (CommonTree)adaptor.create(DQUOTE197);
			adaptor.addChild(root_0, DQUOTE197_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "long_identifier"

	// $ANTLR start synpred1_SystemVerilogFull
	public final void synpred1_SystemVerilogFull_fragment() throws RecognitionException {
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:308:5: ( decision_if )
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:308:6: decision_if
		{
		pushFollow(FOLLOW_decision_if_in_synpred1_SystemVerilogFull1370);
		decision_if();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_SystemVerilogFull

	// $ANTLR start synpred2_SystemVerilogFull
	public final void synpred2_SystemVerilogFull_fragment() throws RecognitionException {
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:313:13: ( decision_if )
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:313:14: decision_if
		{
		pushFollow(FOLLOW_decision_if_in_synpred2_SystemVerilogFull1429);
		decision_if();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_SystemVerilogFull

	// $ANTLR start synpred3_SystemVerilogFull
	public final void synpred3_SystemVerilogFull_fragment() throws RecognitionException {
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:327:5: ( decision_if )
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:327:6: decision_if
		{
		pushFollow(FOLLOW_decision_if_in_synpred3_SystemVerilogFull1520);
		decision_if();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_SystemVerilogFull

	// $ANTLR start synpred4_SystemVerilogFull
	public final void synpred4_SystemVerilogFull_fragment() throws RecognitionException {
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:332:13: ( decision_if )
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:332:14: decision_if
		{
		pushFollow(FOLLOW_decision_if_in_synpred4_SystemVerilogFull1579);
		decision_if();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_SystemVerilogFull

	// Delegated rules

	public final boolean synpred3_SystemVerilogFull() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_SystemVerilogFull_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_SystemVerilogFull() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_SystemVerilogFull_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_SystemVerilogFull() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_SystemVerilogFull_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_SystemVerilogFull() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_SystemVerilogFull_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_module_in_verilog168 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000001FFFFFFFFFFL});
	public static final BitSet FOLLOW_MODULE_in_module198 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module202 = new BitSet(new long[]{0x0800000000000000L,0x0000000020020000L});
	public static final BitSet FOLLOW_POUND_in_module206 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_module208 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_module_parameters_in_module210 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000200L});
	public static final BitSet FOLLOW_NEWLINE_in_module213 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_module216 = new BitSet(new long[]{0x0800000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_module222 = new BitSet(new long[]{0x0044000078000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_module_ports_in_module224 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000200L});
	public static final BitSet FOLLOW_NEWLINE_in_module226 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_module229 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_module234 = new BitSet(new long[]{0x0014002000000250L,0x0000000400000000L});
	public static final BitSet FOLLOW_variable_declaration_in_module244 = new BitSet(new long[]{0x0014002000000250L,0x0000000400000000L});
	public static final BitSet FOLLOW_module_instanciation_in_module250 = new BitSet(new long[]{0x0014002000000250L,0x0000000400000000L});
	public static final BitSet FOLLOW_initial_declaration_in_module256 = new BitSet(new long[]{0x0014002000000250L,0x0000000400000000L});
	public static final BitSet FOLLOW_always_declaration_in_module262 = new BitSet(new long[]{0x0014002000000250L,0x0000000400000000L});
	public static final BitSet FOLLOW_assign_declaration_in_module268 = new BitSet(new long[]{0x0014002000000250L,0x0000000400000000L});
	public static final BitSet FOLLOW_ENDMODULE_in_module276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODULE_in_module_hierarchical322 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module_hierarchical327 = new BitSet(new long[]{0x0800000000000000L,0x0000000020020000L});
	public static final BitSet FOLLOW_POUND_in_module_hierarchical332 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_module_hierarchical334 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_module_parameters_in_module_hierarchical336 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000200L});
	public static final BitSet FOLLOW_NEWLINE_in_module_hierarchical339 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_module_hierarchical342 = new BitSet(new long[]{0x0800000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_module_hierarchical349 = new BitSet(new long[]{0x0044000078000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_module_ports_in_module_hierarchical351 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000200L});
	public static final BitSet FOLLOW_NEWLINE_in_module_hierarchical353 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_module_hierarchical356 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_module_hierarchical362 = new BitSet(new long[]{0x0004002000000020L});
	public static final BitSet FOLLOW_module_instanciation_in_module_hierarchical378 = new BitSet(new long[]{0x0004002000000020L});
	public static final BitSet FOLLOW_ANY_in_module_hierarchical382 = new BitSet(new long[]{0x0004002000000020L});
	public static final BitSet FOLLOW_ENDMODULE_in_module_hierarchical392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_declaration_in_module_parameters433 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_module_parameters437 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_parameter_declaration_in_module_parameters441 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_104_in_parameter_declaration464 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_parameter_declaration466 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_EQUAL_in_parameter_declaration468 = new BitSet(new long[]{0x3F2682440103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_parameter_value_in_parameter_declaration470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_parameter_value494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_long_identifier_in_parameter_value507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_port_declaration_in_module_ports534 = new BitSet(new long[]{0x0000000010040002L});
	public static final BitSet FOLLOW_COMMA_in_module_ports548 = new BitSet(new long[]{0x0044000078000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_port_declaration_in_module_ports562 = new BitSet(new long[]{0x0000000010040002L});
	public static final BitSet FOLLOW_doxygen_group_end_in_module_ports581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doxygen_group_end_in_port_declaration613 = new BitSet(new long[]{0x0044000068000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_doxygen_group_def_in_port_declaration618 = new BitSet(new long[]{0x0044000060000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_doxygen_param_in_port_declaration623 = new BitSet(new long[]{0x0044000060000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_doxygen_group_begin_in_port_declaration628 = new BitSet(new long[]{0x0044000000000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_PORT_DIRECTION_in_port_declaration639 = new BitSet(new long[]{0x0044000000000200L});
	public static final BitSet FOLLOW_BASE_DATA_TYPE_in_port_declaration644 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_data_size_in_port_declaration649 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_port_declaration655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation793 = new BitSet(new long[]{0x0004000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_POUND_in_module_instanciation801 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_module_instanciation803 = new BitSet(new long[]{0x0000000002040000L,0x0000000010000000L});
	public static final BitSet FOLLOW_parameter_connections_in_module_instanciation805 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_module_instanciation807 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation817 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_module_instanciation824 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_port_connections_in_module_instanciation826 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_module_instanciation828 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_module_instanciation830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_port_connection_in_port_connections902 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_port_connections905 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_port_connection_in_port_connections907 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_CONNECTION_IDENTIFIER_in_port_connection925 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_port_connection975 = new BitSet(new long[]{0x3FA682400103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_concatenable_expression_in_port_connection979 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_port_connection981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_connection_in_parameter_connections1063 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_parameter_connections1067 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_parameter_connection_in_parameter_connections1069 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_DOT_in_parameter_connection1077 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_parameter_connection1081 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_parameter_connection1083 = new BitSet(new long[]{0x3FA682400103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_concatenable_expression_in_parameter_connection1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_parameter_connection1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_variable_declaration1096 = new BitSet(new long[]{0x0044000000000000L});
	public static final BitSet FOLLOW_data_size_in_variable_declaration1098 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration1102 = new BitSet(new long[]{0x0100008000040000L,0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_variable_declaration1105 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration1107 = new BitSet(new long[]{0x0100008000040000L,0x0000000020000000L});
	public static final BitSet FOLLOW_assign_expression_in_variable_declaration1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_variable_declaration1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INITIAL_in_initial_declaration1145 = new BitSet(new long[]{0x000C000000000400L});
	public static final BitSet FOLLOW_logic_content_in_initial_declaration1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_instruction_in_initial_declaration1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALWAYS_in_always_declaration1177 = new BitSet(new long[]{0x000C000000000480L});
	public static final BitSet FOLLOW_AT_in_always_declaration1180 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_always_declaration1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010100L});
	public static final BitSet FOLLOW_sensitivity_list_in_always_declaration1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_always_declaration1188 = new BitSet(new long[]{0x000C000000000400L});
	public static final BitSet FOLLOW_logic_instruction_in_always_declaration1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_content_in_always_declaration1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign_declaration1229 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign_declaration1231 = new BitSet(new long[]{0x0100008000000000L});
	public static final BitSet FOLLOW_assign_expression_in_assign_declaration1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_assign_declaration1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assign_expression1247 = new BitSet(new long[]{0x3FA682400103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_concatenable_expression_in_assign_expression1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_logic_content1293 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_logic_instruction_in_logic_content1299 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_END_in_logic_content1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_instruction_in_logic_instruction1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decision_ifelse_in_logic_instruction1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_single_instruction1338 = new BitSet(new long[]{0x0100008000000000L});
	public static final BitSet FOLLOW_assign_expression_in_single_instruction1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_single_instruction1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_decision_if1352 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_decision_if1354 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000210805000L});
	public static final BitSet FOLLOW_expression_in_decision_if1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_decision_if1358 = new BitSet(new long[]{0x000C000000000400L});
	public static final BitSet FOLLOW_decision_if_in_decision_if1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_instruction_in_decision_if1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_decision_if1401 = new BitSet(new long[]{0x000C000000000000L});
	public static final BitSet FOLLOW_decision_if_in_decision_if1434 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_single_instruction_in_decision_if1450 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_END_in_decision_if1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_decision_elseif1500 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_IF_in_decision_elseif1502 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_decision_elseif1504 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000210805000L});
	public static final BitSet FOLLOW_expression_in_decision_elseif1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_decision_elseif1508 = new BitSet(new long[]{0x000C000000000400L});
	public static final BitSet FOLLOW_decision_if_in_decision_elseif1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_instruction_in_decision_elseif1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_decision_elseif1551 = new BitSet(new long[]{0x000C000000000000L});
	public static final BitSet FOLLOW_decision_if_in_decision_elseif1584 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_single_instruction_in_decision_elseif1600 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_END_in_decision_elseif1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_decision_else1647 = new BitSet(new long[]{0x0004000000000400L});
	public static final BitSet FOLLOW_BEGIN_in_decision_else1657 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_logic_instruction_in_decision_else1659 = new BitSet(new long[]{0x000C001000000000L});
	public static final BitSet FOLLOW_END_in_decision_else1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_instruction_in_decision_else1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decision_if_in_decision_ifelse1683 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_decision_elseif_in_decision_ifelse1687 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_decision_else_in_decision_ifelse1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_data_size1717 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_size_def_in_data_size1719 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLON_in_data_size1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_NUMBER_in_data_size1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACK_in_data_size1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_size_def1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_concatenable_expression1800 = new BitSet(new long[]{0x3F2682400107D900L,0x0000000202805000L});
	public static final BitSet FOLLOW_expression_in_concatenable_expression1802 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_concatenable_expression1805 = new BitSet(new long[]{0x3F2682400107D900L,0x0000000202805000L});
	public static final BitSet FOLLOW_expression_in_concatenable_expression1807 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RCURLY_in_concatenable_expression1811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_concatenable_expression1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expression1833 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000210805000L});
	public static final BitSet FOLLOW_expression_in_expression1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_expression1837 = new BitSet(new long[]{0x3722804001039902L,0x0000000200804000L});
	public static final BitSet FOLLOW_expression_operand_in_expression1842 = new BitSet(new long[]{0x3722804001039902L,0x0000000200804000L});
	public static final BitSet FOLLOW_expression_operator_in_expression1848 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_expression_in_expression1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand1861 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_expression_operand1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_NUMBER_in_expression_operand1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACK_in_expression_operand1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXE_QUOTE_in_expression_operand1876 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expression_operand1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typed_value_in_expression_operand1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BUS_VALUE_in_typed_value1978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sensitivity_in_sensitivity_list1993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_OR_in_sensitivity_list1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010100L});
	public static final BitSet FOLLOW_sensitivity_in_sensitivity_list2001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_sensitivity2015 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_sensitivity2021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FPGA_PARAM_START_in_fpga_param2052 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fpga_param2054 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_EQUAL_in_fpga_param2056 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_DQUOTE_in_fpga_param2058 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000001FFFFFFFFFFL});
	public static final BitSet FOLLOW_DQUOTE_in_fpga_param2066 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_FPGA_PARAM_STOP_in_fpga_param2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXYGEN_GROUP_DEF_in_doxygen_group_def2081 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_doxygen_group_def2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXYGEN_GROUP_START_in_doxygen_group_begin2106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXYGEN_GROUP_END_in_doxygen_group_end2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXYGEN_PARAM_in_doxygen_param2154 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param2156 = new BitSet(new long[]{0x0004000400000002L});
	public static final BitSet FOLLOW_short_long_identifier_in_doxygen_param2158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier2194 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier2197 = new BitSet(new long[]{0x0000000400000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_WS_in_short_long_identifier2200 = new BitSet(new long[]{0x0004000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier2203 = new BitSet(new long[]{0x0000000400000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTE_in_long_identifier2217 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_long_identifier2220 = new BitSet(new long[]{0x0000000400000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_WS_in_long_identifier2223 = new BitSet(new long[]{0x0004000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_long_identifier2226 = new BitSet(new long[]{0x0000000400000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DQUOTE_in_long_identifier2231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decision_if_in_synpred1_SystemVerilogFull1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decision_if_in_synpred2_SystemVerilogFull1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decision_if_in_synpred3_SystemVerilogFull1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decision_if_in_synpred4_SystemVerilogFull1579 = new BitSet(new long[]{0x0000000000000002L});
}
