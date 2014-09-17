// $ANTLR 3.5.2 E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g 2014-09-16 23:05:41


package org.odfi.dev.verilog.parser.sv.full;

import java.util.Map;
import java.util.HashMap;
import java.math.BigInteger;
import org.odfi.dev.verilog.parser.sv.model.*;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SystemVerilogTree extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators

	protected static class ParametersScope_scope {
		HashMap<String,Parameter> parameters;
	}
	protected Stack<ParametersScope_scope> ParametersScope_stack = new Stack<ParametersScope_scope>();


	public SystemVerilogTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public SystemVerilogTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SystemVerilogTree.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g"; }




	  Verilog verilog =  new Verilog();
	  
	  /**
	   * Map To store the found port groups
	   */
	  HashMap<String,ModulePortGroup> portGroups = new HashMap<String,ModulePortGroup>();
	  
	  /**
	   * The last added Group
	   */
	  private ModulePortGroup lastAddedGroup = null;
	  
	  /**
	   * The active group
	   */
	  private ModulePortGroup activeGroup = null;
	  
	  public Verilog getVerilog() {
	    return this.verilog;
	  }
	  
	  
	  



	// $ANTLR start "verilog"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:57:1: verilog returns [Verilog verilog] : ^( VERILOG ( module[null] )+ ) ;
	public final Verilog verilog() throws RecognitionException {
		Verilog verilog = null;



		    verilog = this.verilog;
		  
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:62:3: ( ^( VERILOG ( module[null] )+ ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:64:2: ^( VERILOG ( module[null] )+ )
			{
			match(input,VERILOG,FOLLOW_VERILOG_in_verilog81); 
			match(input, Token.DOWN, null); 
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:64:12: ( module[null] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MODULE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:64:12: module[null]
					{
					pushFollow(FOLLOW_module_in_verilog83);
					module(null);
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 


				   System.out.println("Verilog end of rule");
				  
				 
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return verilog;
	}
	// $ANTLR end "verilog"



	// $ANTLR start "verilog_module"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:72:1: verilog_module[Module m] returns [Verilog verilog] : ^( VERILOG module[m] ) ;
	public final Verilog verilog_module(Module m) throws RecognitionException {
		Verilog verilog = null;



		    verilog = this.verilog;
		  
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:78:3: ( ^( VERILOG module[m] ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:80:3: ^( VERILOG module[m] )
			{
			match(input,VERILOG,FOLLOW_VERILOG_in_verilog_module126); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_module_in_verilog_module128);
			module(m);
			state._fsp--;

			match(input, Token.UP, null); 


			     System.out.println("Verilog end of rule");
			    
			   
			   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return verilog;
	}
	// $ANTLR end "verilog_module"



	// $ANTLR start "module"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:89:1: module[Module sourceModule] returns [Module module] : ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters[$module] )? ^( MODULE_PORTS module_ports[$module] ) ( variable_declaration[$module] )* ( module_instanciation[$module] )* ( initial_declaration )* ( always_declaration )* ( assign_declaration )* ) ;
	public final Module module(Module sourceModule) throws RecognitionException {
		ParametersScope_stack.push(new ParametersScope_scope());

		Module module = null;


		CommonTree IDENTIFIER1=null;


		    if (sourceModule==null) {
		      module = new Module();
		    } else {
		      module = sourceModule;
		    }
		    verilog.getModules().add(module);
		    ParametersScope_stack.peek().parameters = new HashMap<String,Parameter>();
		  
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:102:3: ( ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters[$module] )? ^( MODULE_PORTS module_ports[$module] ) ( variable_declaration[$module] )* ( module_instanciation[$module] )* ( initial_declaration )* ( always_declaration )* ( assign_declaration )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:103:4: ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters[$module] )? ^( MODULE_PORTS module_ports[$module] ) ( variable_declaration[$module] )* ( module_instanciation[$module] )* ( initial_declaration )* ( always_declaration )* ( assign_declaration )* )
			{
			match(input,MODULE,FOLLOW_MODULE_in_module180); 
			match(input, Token.DOWN, null); 
			match(input,MODULE_NAME,FOLLOW_MODULE_NAME_in_module190); 
			match(input, Token.DOWN, null); 
			IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module192); 
			match(input, Token.UP, null); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:106:7: ( module_parameters[$module] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==MODULE_PARAMETERS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:106:7: module_parameters[$module]
					{
					pushFollow(FOLLOW_module_parameters_in_module208);
					module_parameters(module);
					state._fsp--;

					}
					break;

			}

			match(input,MODULE_PORTS,FOLLOW_MODULE_PORTS_in_module226); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_module_ports_in_module228);
				module_ports(module);
				state._fsp--;

				match(input, Token.UP, null); 
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:110:7: ( variable_declaration[$module] )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==MODULE_VARIABLE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:110:8: variable_declaration[$module]
					{
					pushFollow(FOLLOW_variable_declaration_in_module246);
					variable_declaration(module);
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:112:7: ( module_instanciation[$module] )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==MODULE_INSTANCE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:112:8: module_instanciation[$module]
					{
					pushFollow(FOLLOW_module_instanciation_in_module265);
					module_instanciation(module);
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:114:7: ( initial_declaration )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==INITIAL) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:114:8: initial_declaration
					{
					pushFollow(FOLLOW_initial_declaration_in_module284);
					initial_declaration();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:116:7: ( always_declaration )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ALWAYS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:116:8: always_declaration
					{
					pushFollow(FOLLOW_always_declaration_in_module302);
					always_declaration();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:118:7: ( assign_declaration )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ASSIGN) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:118:8: assign_declaration
					{
					pushFollow(FOLLOW_assign_declaration_in_module320);
					assign_declaration();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); 


			   
			    System.out.println("Module set name: "+(IDENTIFIER1!=null?IDENTIFIER1.getText():null)+"module is at: @"+(IDENTIFIER1!=null?IDENTIFIER1.getLine():0)+":"+IDENTIFIER1.getCharPositionInLine()+","+(IDENTIFIER1!=null?IDENTIFIER1.getText():null).length());
			    module.setName((IDENTIFIER1!=null?IDENTIFIER1.getText():null));
			    module.setParserSourceInformations(IDENTIFIER1);
			   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			ParametersScope_stack.pop();

		}
		return module;
	}
	// $ANTLR end "module"



	// $ANTLR start "module_parameters"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:130:1: module_parameters[Module module] : ^( MODULE_PARAMETERS ( parameter_declaration[$module] )* ) ;
	public final void module_parameters(Module module) throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:130:33: ( ^( MODULE_PARAMETERS ( parameter_declaration[$module] )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:131:3: ^( MODULE_PARAMETERS ( parameter_declaration[$module] )* )
			{
			match(input,MODULE_PARAMETERS,FOLLOW_MODULE_PARAMETERS_in_module_parameters347); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:131:23: ( parameter_declaration[$module] )*
				loop8:
				while (true) {
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==MODULE_PARAMETER) ) {
						alt8=1;
					}

					switch (alt8) {
					case 1 :
						// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:131:23: parameter_declaration[$module]
						{
						pushFollow(FOLLOW_parameter_declaration_in_module_parameters349);
						parameter_declaration(module);
						state._fsp--;

						}
						break;

					default :
						break loop8;
					}
				}

				match(input, Token.UP, null); 
			}


			   // module.getPorts().add($port_declaration.port);
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "module_parameters"



	// $ANTLR start "parameter_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:138:1: parameter_declaration[Module module] : ^( MODULE_PARAMETER IDENTIFIER value= . ) ;
	public final void parameter_declaration(Module module) throws RecognitionException {
		CommonTree IDENTIFIER2=null;
		CommonTree value=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:139:3: ( ^( MODULE_PARAMETER IDENTIFIER value= . ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:140:3: ^( MODULE_PARAMETER IDENTIFIER value= . )
			{
			match(input,MODULE_PARAMETER,FOLLOW_MODULE_PARAMETER_in_parameter_declaration374); 
			match(input, Token.DOWN, null); 
			IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_declaration382); 
			value=(CommonTree)input.LT(1);
			matchAny(input); 
			match(input, Token.UP, null); 


			    Parameter newParameter = new Parameter((IDENTIFIER2!=null?IDENTIFIER2.getText():null),new SVExpression(value.getText()));
			    ParametersScope_stack.peek().parameters.put((IDENTIFIER2!=null?IDENTIFIER2.getText():null),newParameter);
			    module.addParameter(newParameter);
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameter_declaration"



	// $ANTLR start "module_ports"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:154:1: module_ports[Module module] : ( port_declaration[$module] )* ( doxygen_group_end )? ;
	public final void module_ports(Module module) throws RecognitionException {
		ModulePort port_declaration3 =null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:154:28: ( ( port_declaration[$module] )* ( doxygen_group_end )? )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:155:3: ( port_declaration[$module] )* ( doxygen_group_end )?
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:155:3: ( port_declaration[$module] )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==MODULE_PORT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:155:3: port_declaration[$module]
					{
					pushFollow(FOLLOW_port_declaration_in_module_ports413);
					port_declaration3=port_declaration(module);
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:156:3: ( doxygen_group_end )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DOXY_GROUP_STOP) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:156:3: doxygen_group_end
					{
					pushFollow(FOLLOW_doxygen_group_end_in_module_ports420);
					doxygen_group_end();
					state._fsp--;

					}
					break;

			}


			   // module.getPorts().add(port_declaration3);
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "module_ports"



	// $ANTLR start "port_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:163:1: port_declaration[Module module] returns [ModulePort port] : ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? name= IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) ;
	public final ModulePort port_declaration(Module module) throws RecognitionException {
		ModulePort port = null;


		CommonTree name=null;
		CommonTree PORT_DIRECTION4=null;
		CommonTree BASE_DATA_TYPE5=null;
		SVExpression data_size6 =null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:165:3: ( ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? name= IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:165:6: ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? name= IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? )
			{
			match(input,MODULE_PORT,FOLLOW_MODULE_PORT_in_port_declaration446); 
			match(input, Token.DOWN, null); 
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:166:9: ( PORT_DIRECTION )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==PORT_DIRECTION) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:166:9: PORT_DIRECTION
					{
					PORT_DIRECTION4=(CommonTree)match(input,PORT_DIRECTION,FOLLOW_PORT_DIRECTION_in_port_declaration457); 
					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:167:9: ( BASE_DATA_TYPE )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BASE_DATA_TYPE) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:167:9: BASE_DATA_TYPE
					{
					BASE_DATA_TYPE5=(CommonTree)match(input,BASE_DATA_TYPE,FOLLOW_BASE_DATA_TYPE_in_port_declaration468); 
					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:168:9: ( data_size )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DATA_SIZE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:168:9: data_size
					{
					pushFollow(FOLLOW_data_size_in_port_declaration479);
					data_size6=data_size();
					state._fsp--;

					}
					break;

			}

			name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_declaration492); 
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:171:9: ( doxygen_group_end )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DOXY_GROUP_STOP) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:171:9: doxygen_group_end
					{
					pushFollow(FOLLOW_doxygen_group_end_in_port_declaration511);
					doxygen_group_end();
					state._fsp--;

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:172:9: ( doxygen_group_def )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==IDENTIFIER) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:172:9: doxygen_group_def
					{
					pushFollow(FOLLOW_doxygen_group_def_in_port_declaration522);
					doxygen_group_def();
					state._fsp--;

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:173:9: ( doxygen_param )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DOXY_PARAM) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:173:9: doxygen_param
					{
					pushFollow(FOLLOW_doxygen_param_in_port_declaration534);
					doxygen_param();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:174:9: ( doxygen_group_begin )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==DOXY_GROUP_START) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:174:9: doxygen_group_begin
					{
					pushFollow(FOLLOW_doxygen_group_begin_in_port_declaration545);
					doxygen_group_begin();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


				       //-- Create Port
				       port = new ModulePort();
				       if ((PORT_DIRECTION4!=null?PORT_DIRECTION4.getText():null)!=null) port.setDirection(ModulePort.DIRECTION.valueOf((PORT_DIRECTION4!=null?PORT_DIRECTION4.getText():null)));
				       if ((BASE_DATA_TYPE5!=null?BASE_DATA_TYPE5.getText():null)!=null) port.setType(ModulePort.TYPE.valueOf((BASE_DATA_TYPE5!=null?BASE_DATA_TYPE5.getText():null)));
				       
				       //-- Group
				       if (this.activeGroup!=null) {
				         port.setGroup(this.activeGroup);
				       }
				       port.setSize(data_size6);
				       port.setName((name!=null?name.getText():null));
				       module.getPorts().add(port);
				       
			//	       if((name!=null?name.getText():null).equals("pcie_clk"))
			//          System.out.println("Found Port "+(name!=null?name.getText():null)+" --> "+port.getSize());
				       
			//	       System.out.println("Found port: "+(PORT_DIRECTION4!=null?PORT_DIRECTION4.getText():null)+",s="+data_size6+","+(name!=null?name.getText():null));
				       
				     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return port;
	}
	// $ANTLR end "port_declaration"



	// $ANTLR start "module_instanciations"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:203:1: module_instanciations[Module m] : ( module_instanciation[m] )* ;
	public final void module_instanciations(Module m) throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:203:34: ( ( module_instanciation[m] )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:203:36: ( module_instanciation[m] )*
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:203:36: ( module_instanciation[m] )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==MODULE_INSTANCE) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:203:36: module_instanciation[m]
					{
					pushFollow(FOLLOW_module_instanciation_in_module_instanciations582);
					module_instanciation(m);
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "module_instanciations"



	// $ANTLR start "module_instanciation"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:204:1: module_instanciation[Module m] returns [ModuleInstance mi] : ^( MODULE_INSTANCE type= IDENTIFIER name= IDENTIFIER ( port_connection )* ) ;
	public final ModuleInstance module_instanciation(Module m) throws RecognitionException {
		ModuleInstance mi = null;


		CommonTree type=null;
		CommonTree name=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:205:30: ( ^( MODULE_INSTANCE type= IDENTIFIER name= IDENTIFIER ( port_connection )* ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:207:3: ^( MODULE_INSTANCE type= IDENTIFIER name= IDENTIFIER ( port_connection )* )
			{
			match(input,MODULE_INSTANCE,FOLLOW_MODULE_INSTANCE_in_module_instanciation604); 
			match(input, Token.DOWN, null); 
			type=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation608); 
			name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation612); 
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:207:53: ( port_connection )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==MODULE_INSTANCE_CONNECTION) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:207:53: port_connection
					{
					pushFollow(FOLLOW_port_connection_in_module_instanciation614);
					port_connection();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			match(input, Token.UP, null); 


			    mi = new ModuleInstance((type!=null?type.getText():null),(name!=null?name.getText():null)); 
			    m.getModuleInstances().add(mi);
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mi;
	}
	// $ANTLR end "module_instanciation"



	// $ANTLR start "port_connection"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:214:1: port_connection : ^( MODULE_INSTANCE_CONNECTION port_name= CONNECTION_IDENTIFIER (local_connection= IDENTIFIER )? ) ;
	public final void port_connection() throws RecognitionException {
		CommonTree port_name=null;
		CommonTree local_connection=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:214:16: ( ^( MODULE_INSTANCE_CONNECTION port_name= CONNECTION_IDENTIFIER (local_connection= IDENTIFIER )? ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:214:18: ^( MODULE_INSTANCE_CONNECTION port_name= CONNECTION_IDENTIFIER (local_connection= IDENTIFIER )? )
			{
			match(input,MODULE_INSTANCE_CONNECTION,FOLLOW_MODULE_INSTANCE_CONNECTION_in_port_connection634); 
			match(input, Token.DOWN, null); 
			port_name=(CommonTree)match(input,CONNECTION_IDENTIFIER,FOLLOW_CONNECTION_IDENTIFIER_in_port_connection638); 
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:214:95: (local_connection= IDENTIFIER )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==IDENTIFIER) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:214:95: local_connection= IDENTIFIER
					{
					local_connection=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_connection642); 
					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "port_connection"



	// $ANTLR start "variable_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:220:1: variable_declaration[Module m] : ^( MODULE_VARIABLE data_type ( size_def )? IDENTIFIER ) ;
	public final void variable_declaration(Module m) throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:220:32: ( ^( MODULE_VARIABLE data_type ( size_def )? IDENTIFIER ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:221:3: ^( MODULE_VARIABLE data_type ( size_def )? IDENTIFIER )
			{
			match(input,MODULE_VARIABLE,FOLLOW_MODULE_VARIABLE_in_variable_declaration660); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_data_type_in_variable_declaration662);
			data_type();
			state._fsp--;

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:221:31: ( size_def )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EXPRESSION) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:221:31: size_def
					{
					pushFollow(FOLLOW_size_def_in_variable_declaration664);
					size_def();
					state._fsp--;

					}
					break;

			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration667); 
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variable_declaration"



	// $ANTLR start "initial_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:226:1: initial_declaration : INITIAL ;
	public final void initial_declaration() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:226:21: ( INITIAL )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:226:23: INITIAL
			{
			match(input,INITIAL,FOLLOW_INITIAL_in_initial_declaration680); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "initial_declaration"



	// $ANTLR start "always_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:228:1: always_declaration : ALWAYS ;
	public final void always_declaration() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:228:19: ( ALWAYS )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:228:21: ALWAYS
			{
			match(input,ALWAYS,FOLLOW_ALWAYS_in_always_declaration695); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "always_declaration"



	// $ANTLR start "assign_declaration"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:230:1: assign_declaration : ASSIGN ;
	public final void assign_declaration() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:230:19: ( ASSIGN )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:230:21: ASSIGN
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_declaration710); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_declaration"



	// $ANTLR start "data_type"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:234:1: data_type : ( BASE_DATA_TYPE | SV_DATA_TYPE );
	public final void data_type() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:234:10: ( BASE_DATA_TYPE | SV_DATA_TYPE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:
			{
			if ( input.LA(1)==BASE_DATA_TYPE||input.LA(1)==SV_DATA_TYPE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "data_type"



	// $ANTLR start "data_size"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:236:1: data_size returns [SVExpression size] : ^( DATA_SIZE size_def ) ;
	public final SVExpression data_size() throws RecognitionException {
		SVExpression size = null;


		SVExpression size_def7 =null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:238:3: ( ^( DATA_SIZE size_def ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:240:3: ^( DATA_SIZE size_def )
			{
			match(input,DATA_SIZE,FOLLOW_DATA_SIZE_in_data_size746); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_size_def_in_data_size748);
			size_def7=size_def();
			state._fsp--;

			match(input, Token.UP, null); 


			    size =size_def7;
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "data_size"



	// $ANTLR start "size_def"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:247:1: size_def returns [SVExpression size] : ^( EXPRESSION expression[$size] ^( TEXT txt= . ) ) ;
	public final SVExpression size_def() throws RecognitionException {
		SVExpression size = null;


		CommonTree txt=null;


		    size = new SVExpression();
		  
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:252:3: ( ^( EXPRESSION expression[$size] ^( TEXT txt= . ) ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:254:5: ^( EXPRESSION expression[$size] ^( TEXT txt= . ) )
			{
			match(input,EXPRESSION,FOLLOW_EXPRESSION_in_size_def786); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_size_def788);
			expression(size);
			state._fsp--;

			match(input,TEXT,FOLLOW_TEXT_in_size_def792); 
			match(input, Token.DOWN, null); 
			txt=(CommonTree)input.LT(1);
			matchAny(input); 
			match(input, Token.UP, null); 

			match(input, Token.UP, null); 


			      size.setExpression(txt.getText());
			//      System.out.println("Found Size def in tree: "+txt.getText());
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "size_def"



	// $ANTLR start "expression"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:261:1: expression[SVExpression expression] : ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )? ( expression_operator expression[$expression] )? ;
	public final void expression(SVExpression expression) throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:263:3: ( ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )? ( expression_operator expression[$expression] )? )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:264:3: ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )? ( expression_operator expression[$expression] )?
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:264:3: ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )?
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LPAREN) ) {
				alt22=1;
			}
			else if ( (LA22_0==BUS_VALUE||LA22_0==EXE_QUOTE||LA22_0==IDENTIFIER||LA22_0==NUMBER) ) {
				alt22=2;
			}
			switch (alt22) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:264:4: ( LPAREN expression[$expression] RPAREN )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:264:4: ( LPAREN expression[$expression] RPAREN )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:264:5: LPAREN expression[$expression] RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_expression825); 
					pushFollow(FOLLOW_expression_in_expression827);
					expression(expression);
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_expression830); 
					}

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:265:5: expression_operand[$expression]
					{
					pushFollow(FOLLOW_expression_operand_in_expression838);
					expression_operand(expression);
					state._fsp--;

					}
					break;

			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:265:40: ( expression_operator expression[$expression] )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==BAND||(LA23_0 >= BNOT && LA23_0 <= BOR)||(LA23_0 >= BXNOR && LA23_0 <= COLON)||LA23_0==DIV||LA23_0==EQ||LA23_0==GE||LA23_0==GT||LA23_0==LAND||(LA23_0 >= LE && LA23_0 <= LOR)||(LA23_0 >= LT && LA23_0 <= MINUS)||LA23_0==PLUS||LA23_0==QUESTION||LA23_0==STAR) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:265:41: expression_operator expression[$expression]
					{
					pushFollow(FOLLOW_expression_operator_in_expression845);
					expression_operator();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression847);
					expression(expression);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "expression_operand"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:267:1: expression_operand[SVExpression expression] : ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | NUMBER | ( EXE_QUOTE IDENTIFIER ) | typed_value );
	public final void expression_operand(SVExpression expression) throws RecognitionException {
		CommonTree IDENTIFIER8=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:269:3: ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | NUMBER | ( EXE_QUOTE IDENTIFIER ) | typed_value )
			int alt25=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt25=1;
				}
				break;
			case NUMBER:
				{
				alt25=2;
				}
				break;
			case EXE_QUOTE:
				{
				alt25=3;
				}
				break;
			case BUS_VALUE:
				{
				alt25=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:270:3: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:270:3: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:270:4: IDENTIFIER ( LBRACK NUMBER RBRACK )?
					{
					IDENTIFIER8=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand869); 
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:270:15: ( LBRACK NUMBER RBRACK )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==LBRACK) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:270:16: LBRACK NUMBER RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_expression_operand872); 
							match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand874); 
							match(input,RBRACK,FOLLOW_RBRACK_in_expression_operand876); 
							}
							break;

					}

					}

					expression.addParameter(ParametersScope_stack.peek().parameters.get((IDENTIFIER8!=null?IDENTIFIER8.getText():null)));
					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:271:5: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand888); 
					}
					break;
				case 3 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:272:5: ( EXE_QUOTE IDENTIFIER )
					{
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:272:5: ( EXE_QUOTE IDENTIFIER )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:272:6: EXE_QUOTE IDENTIFIER
					{
					match(input,EXE_QUOTE,FOLLOW_EXE_QUOTE_in_expression_operand896); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand898); 
					}

					}
					break;
				case 4 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:273:5: typed_value
					{
					pushFollow(FOLLOW_typed_value_in_expression_operand905);
					typed_value();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression_operand"



	// $ANTLR start "expression_operator"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:275:1: expression_operator : ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE );
	public final void expression_operator() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:275:20: ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:
			{
			if ( input.LA(1)==BAND||(input.LA(1) >= BNOT && input.LA(1) <= BOR)||(input.LA(1) >= BXNOR && input.LA(1) <= COLON)||input.LA(1)==DIV||input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LAND||(input.LA(1) >= LE && input.LA(1) <= LOR)||(input.LA(1) >= LT && input.LA(1) <= MINUS)||input.LA(1)==PLUS||input.LA(1)==QUESTION||input.LA(1)==STAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression_operator"



	// $ANTLR start "typed_value"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:278:1: typed_value : BUS_VALUE ;
	public final void typed_value() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:278:12: ( BUS_VALUE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:278:14: BUS_VALUE
			{
			match(input,BUS_VALUE,FOLLOW_BUS_VALUE_in_typed_value998); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typed_value"



	// $ANTLR start "doxygen_group_def"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:283:1: doxygen_group_def : ( IDENTIFIER ) ;
	public final void doxygen_group_def() throws RecognitionException {
		CommonTree IDENTIFIER9=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:283:18: ( ( IDENTIFIER ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:284:4: ( IDENTIFIER )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:284:4: ( IDENTIFIER )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:284:5: IDENTIFIER
			{
			IDENTIFIER9=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_doxygen_group_def1013); 
			}


			    //-- Get from Map
			    ModulePortGroup group = this.portGroups.get(IDENTIFIER9.getText());
			    if (group==null) {
			      //-- Create if non-existent
			      group = new ModulePortGroup(IDENTIFIER9.getText());
			      this.portGroups.put(IDENTIFIER9.getText(),group);
			      this.lastAddedGroup = group;
			    }
			   

			   
			   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doxygen_group_def"



	// $ANTLR start "doxygen_group_begin"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:299:1: doxygen_group_begin : ( DOXY_GROUP_START ) ;
	public final void doxygen_group_begin() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:299:20: ( ( DOXY_GROUP_START ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:300:4: ( DOXY_GROUP_START )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:300:4: ( DOXY_GROUP_START )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:300:5: DOXY_GROUP_START
			{
			match(input,DOXY_GROUP_START,FOLLOW_DOXY_GROUP_START_in_doxygen_group_begin1031); 
			}


			      //-- If there is no last added group, create an anonymous one (not mapped)
			      if (this.lastAddedGroup==null) {
			        this.lastAddedGroup = new ModulePortGroup();     
			      }
			   
			      //-- Activate last group
			      this.activeGroup = this.lastAddedGroup;
			      
			      
			      
			   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doxygen_group_begin"



	// $ANTLR start "doxygen_group_end"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:314:1: doxygen_group_end : ( DOXY_GROUP_STOP ) ;
	public final void doxygen_group_end() throws RecognitionException {
		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:314:18: ( ( DOXY_GROUP_STOP ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:315:3: ( DOXY_GROUP_STOP )
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:315:3: ( DOXY_GROUP_STOP )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:315:4: DOXY_GROUP_STOP
			{
			match(input,DOXY_GROUP_STOP,FOLLOW_DOXY_GROUP_STOP_in_doxygen_group_end1047); 
			}


			  

			      // Deactivate active group
			      this.activeGroup = null;
			      this.lastAddedGroup = null;
			      
			      
			      
			   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doxygen_group_end"



	// $ANTLR start "doxygen_param"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:329:1: doxygen_param : ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) ;
	public final void doxygen_param() throws RecognitionException {
		CommonTree EXTENDED_IDENTIFIER10=null;
		String short_long_identifier11 =null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:329:14: ( ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:330:3: ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? )
			{
			match(input,DOXY_PARAM,FOLLOW_DOXY_PARAM_in_doxygen_param1068); 
			match(input, Token.DOWN, null); 
			EXTENDED_IDENTIFIER10=(CommonTree)match(input,EXTENDED_IDENTIFIER,FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param1070); 
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:330:36: ( short_long_identifier )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==DQUOTE||LA26_0==IDENTIFIER) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:330:36: short_long_identifier
					{
					pushFollow(FOLLOW_short_long_identifier_in_doxygen_param1072);
					short_long_identifier11=short_long_identifier();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 



			    //-- If there is no last added group, create an anonymous one (not mapped)
			     if (this.lastAddedGroup==null) {
			       this.lastAddedGroup = new ModulePortGroup();
			     }
			     
			    // System.out.println("Found Param: "+(EXTENDED_IDENTIFIER10!=null?EXTENDED_IDENTIFIER10.getText():null)+" => "+(short_long_identifier11!=null?short_long_identifier11:"true"));
			  
			    //-- Add Param to last defined Group if there is one
			    if (this.lastAddedGroup!=null) {
			      this.lastAddedGroup.addParameter((EXTENDED_IDENTIFIER10!=null?EXTENDED_IDENTIFIER10.getText():null),short_long_identifier11!=null?short_long_identifier11:"true");
			    }
			  
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doxygen_param"



	// $ANTLR start "short_long_identifier"
	// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:353:1: short_long_identifier returns [String s] : ( IDENTIFIER | DQUOTE ( IDENTIFIER content= ( ( WS )+ IDENTIFIER )* ) DQUOTE );
	public final String short_long_identifier() throws RecognitionException {
		String s = null;


		CommonTree content=null;
		CommonTree IDENTIFIER12=null;

		try {
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:354:22: ( IDENTIFIER | DQUOTE ( IDENTIFIER content= ( ( WS )+ IDENTIFIER )* ) DQUOTE )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==IDENTIFIER) ) {
				alt29=1;
			}
			else if ( (LA29_0==DQUOTE) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:355:3: IDENTIFIER
					{
					IDENTIFIER12=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier1102); 

					    s = (IDENTIFIER12!=null?IDENTIFIER12.getText():null);
					  
					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:3: DQUOTE ( IDENTIFIER content= ( ( WS )+ IDENTIFIER )* ) DQUOTE
					{
					match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier1116); 
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:10: ( IDENTIFIER content= ( ( WS )+ IDENTIFIER )* )
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:11: IDENTIFIER content= ( ( WS )+ IDENTIFIER )*
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier1119); 
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:30: ( ( WS )+ IDENTIFIER )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:31: ( WS )+ IDENTIFIER
							{
							// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:31: ( WS )+
							int cnt27=0;
							loop27:
							while (true) {
								int alt27=2;
								int LA27_0 = input.LA(1);
								if ( (LA27_0==WS) ) {
									alt27=1;
								}

								switch (alt27) {
								case 1 :
									// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogTree.g:360:31: WS
									{
									content=(CommonTree)match(input,WS,FOLLOW_WS_in_short_long_identifier1124); 
									}
									break;

								default :
									if ( cnt27 >= 1 ) break loop27;
									EarlyExitException eee = new EarlyExitException(27, input);
									throw eee;
								}
								cnt27++;
							}

							content=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier1127); 
							}
							break;

						default :
							break loop28;
						}
					}

					}

					match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier1133); 

					    s = (content!=null?content.getText():null);
					  
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "short_long_identifier"

	// Delegated rules



	public static final BitSet FOLLOW_VERILOG_in_verilog81 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_module_in_verilog83 = new BitSet(new long[]{0x8000000000000008L});
	public static final BitSet FOLLOW_VERILOG_in_verilog_module126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_module_in_verilog_module128 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULE_in_module180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MODULE_NAME_in_module190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_module_parameters_in_module208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_MODULE_PORTS_in_module226 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_module_ports_in_module228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_declaration_in_module246 = new BitSet(new long[]{0x0010000000000058L,0x0000000000000081L});
	public static final BitSet FOLLOW_module_instanciation_in_module265 = new BitSet(new long[]{0x0010000000000058L,0x0000000000000001L});
	public static final BitSet FOLLOW_initial_declaration_in_module284 = new BitSet(new long[]{0x0010000000000058L});
	public static final BitSet FOLLOW_always_declaration_in_module302 = new BitSet(new long[]{0x0000000000000058L});
	public static final BitSet FOLLOW_assign_declaration_in_module320 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_MODULE_PARAMETERS_in_module_parameters347 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_declaration_in_module_parameters349 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000008L});
	public static final BitSet FOLLOW_MODULE_PARAMETER_in_parameter_declaration374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_parameter_declaration382 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000001FFFFFFFFFFL});
	public static final BitSet FOLLOW_port_declaration_in_module_ports413 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_doxygen_group_end_in_module_ports420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODULE_PORT_in_port_declaration446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PORT_DIRECTION_in_port_declaration457 = new BitSet(new long[]{0x0004000000800200L});
	public static final BitSet FOLLOW_BASE_DATA_TYPE_in_port_declaration468 = new BitSet(new long[]{0x0004000000800000L});
	public static final BitSet FOLLOW_data_size_in_port_declaration479 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_port_declaration492 = new BitSet(new long[]{0x0004000380000008L});
	public static final BitSet FOLLOW_doxygen_group_end_in_port_declaration511 = new BitSet(new long[]{0x0004000280000008L});
	public static final BitSet FOLLOW_doxygen_group_def_in_port_declaration522 = new BitSet(new long[]{0x0000000280000008L});
	public static final BitSet FOLLOW_doxygen_param_in_port_declaration534 = new BitSet(new long[]{0x0000000280000008L});
	public static final BitSet FOLLOW_doxygen_group_begin_in_port_declaration545 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_module_instanciation_in_module_instanciations582 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_MODULE_INSTANCE_in_module_instanciation604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation608 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation612 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_port_connection_in_module_instanciation614 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_MODULE_INSTANCE_CONNECTION_in_port_connection634 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONNECTION_IDENTIFIER_in_port_connection638 = new BitSet(new long[]{0x0004000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_port_connection642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULE_VARIABLE_in_variable_declaration660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_data_type_in_variable_declaration662 = new BitSet(new long[]{0x0004040000000000L});
	public static final BitSet FOLLOW_size_def_in_variable_declaration664 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INITIAL_in_initial_declaration680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALWAYS_in_always_declaration695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign_declaration710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATA_SIZE_in_data_size746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_size_def_in_data_size748 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPRESSION_in_size_def786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_size_def788 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_TEXT_in_size_def792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_expression825 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000210805000L});
	public static final BitSet FOLLOW_expression_in_expression827 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_expression830 = new BitSet(new long[]{0x3722804001039902L,0x0000000200804000L});
	public static final BitSet FOLLOW_expression_operand_in_expression838 = new BitSet(new long[]{0x3722804001039902L,0x0000000200804000L});
	public static final BitSet FOLLOW_expression_operator_in_expression845 = new BitSet(new long[]{0x3F2682400103D900L,0x0000000200805000L});
	public static final BitSet FOLLOW_expression_in_expression847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand869 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_expression_operand872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_NUMBER_in_expression_operand874 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACK_in_expression_operand876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expression_operand888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXE_QUOTE_in_expression_operand896 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typed_value_in_expression_operand905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BUS_VALUE_in_typed_value998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_doxygen_group_def1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXY_GROUP_START_in_doxygen_group_begin1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXY_GROUP_STOP_in_doxygen_group_end1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOXY_PARAM_in_doxygen_param1068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param1070 = new BitSet(new long[]{0x0004000400000008L});
	public static final BitSet FOLLOW_short_long_identifier_in_doxygen_param1072 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier1116 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier1119 = new BitSet(new long[]{0x0000000400000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_WS_in_short_long_identifier1124 = new BitSet(new long[]{0x0004000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier1127 = new BitSet(new long[]{0x0000000400000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier1133 = new BitSet(new long[]{0x0000000000000002L});
}
