// $ANTLR 3.4 /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g 2011-11-22 15:40:39


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

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SystemVerilogTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALWAYS", "ASSIGN", "AT", "BAND", "BASE_DATA_TYPE", "BEGIN", "BNOT", "BOR", "BSLASH", "BUS_VALUE", "BXNOR", "BXOR", "COLON", "COMMA", "COMMENTAR_LONG", "COMMENTAR_SHORT", "COMM_BEGIN", "DATA_SIZE", "DIV", "DOT", "DOXY", "DOXYGEN_GROUP_DEF", "DOXYGEN_GROUP_END", "DOXYGEN_GROUP_START", "DOXYGEN_PARAM", "DOXY_GROUP_START", "DOXY_GROUP_STOP", "DOXY_PARAM", "DQUOTE", "ELSE", "END", "EQ", "EQUAL", "EQ_CASE", "EXE_QUOTE", "EXPRESSION", "EXTENDED_IDENTIFIER", "FPATH", "FPGA_PARAM_START", "FPGA_PARAM_STOP", "GE", "GENERATE", "GT", "IDENTIFIER", "IF", "INITIAL", "LAND", "LBRACK", "LCURLY", "LE", "LNOT", "LOR", "LPAREN", "LT", "MINUS", "MOD", "MODULE", "MODULE_INSTANCE", "MODULE_INSTANCE_CONNECTION", "MODULE_NAME", "MODULE_PARAMETER", "MODULE_PARAMETERS", "MODULE_PORT", "MODULE_PORTS", "MODULE_VARIABLE", "NEGEDGE", "NEWLINE", "NOT_EQ", "NOT_EQ_CASE", "NUMBER", "OR", "PLUS", "PORT_DIRECTION", "POSEDGE", "POUND", "PPATH", "PREP_ELSE", "PREP_ENDIF", "PREP_IFDEF", "PREP_INCLUDE", "QUESTION", "RBRACK", "RCURLY", "RNAND", "RNOR", "RPAREN", "SEMI", "SL", "SQUOTE", "SR", "STAR", "SV_DATA_TYPE", "TEXT", "TRIGGER", "VALUE_BASE", "VERILOG", "WS", "'endmodule'", "'parameter'"
    };

    public static final int EOF=-1;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int ALWAYS=4;
    public static final int ASSIGN=5;
    public static final int AT=6;
    public static final int BAND=7;
    public static final int BASE_DATA_TYPE=8;
    public static final int BEGIN=9;
    public static final int BNOT=10;
    public static final int BOR=11;
    public static final int BSLASH=12;
    public static final int BUS_VALUE=13;
    public static final int BXNOR=14;
    public static final int BXOR=15;
    public static final int COLON=16;
    public static final int COMMA=17;
    public static final int COMMENTAR_LONG=18;
    public static final int COMMENTAR_SHORT=19;
    public static final int COMM_BEGIN=20;
    public static final int DATA_SIZE=21;
    public static final int DIV=22;
    public static final int DOT=23;
    public static final int DOXY=24;
    public static final int DOXYGEN_GROUP_DEF=25;
    public static final int DOXYGEN_GROUP_END=26;
    public static final int DOXYGEN_GROUP_START=27;
    public static final int DOXYGEN_PARAM=28;
    public static final int DOXY_GROUP_START=29;
    public static final int DOXY_GROUP_STOP=30;
    public static final int DOXY_PARAM=31;
    public static final int DQUOTE=32;
    public static final int ELSE=33;
    public static final int END=34;
    public static final int EQ=35;
    public static final int EQUAL=36;
    public static final int EQ_CASE=37;
    public static final int EXE_QUOTE=38;
    public static final int EXPRESSION=39;
    public static final int EXTENDED_IDENTIFIER=40;
    public static final int FPATH=41;
    public static final int FPGA_PARAM_START=42;
    public static final int FPGA_PARAM_STOP=43;
    public static final int GE=44;
    public static final int GENERATE=45;
    public static final int GT=46;
    public static final int IDENTIFIER=47;
    public static final int IF=48;
    public static final int INITIAL=49;
    public static final int LAND=50;
    public static final int LBRACK=51;
    public static final int LCURLY=52;
    public static final int LE=53;
    public static final int LNOT=54;
    public static final int LOR=55;
    public static final int LPAREN=56;
    public static final int LT=57;
    public static final int MINUS=58;
    public static final int MOD=59;
    public static final int MODULE=60;
    public static final int MODULE_INSTANCE=61;
    public static final int MODULE_INSTANCE_CONNECTION=62;
    public static final int MODULE_NAME=63;
    public static final int MODULE_PARAMETER=64;
    public static final int MODULE_PARAMETERS=65;
    public static final int MODULE_PORT=66;
    public static final int MODULE_PORTS=67;
    public static final int MODULE_VARIABLE=68;
    public static final int NEGEDGE=69;
    public static final int NEWLINE=70;
    public static final int NOT_EQ=71;
    public static final int NOT_EQ_CASE=72;
    public static final int NUMBER=73;
    public static final int OR=74;
    public static final int PLUS=75;
    public static final int PORT_DIRECTION=76;
    public static final int POSEDGE=77;
    public static final int POUND=78;
    public static final int PPATH=79;
    public static final int PREP_ELSE=80;
    public static final int PREP_ENDIF=81;
    public static final int PREP_IFDEF=82;
    public static final int PREP_INCLUDE=83;
    public static final int QUESTION=84;
    public static final int RBRACK=85;
    public static final int RCURLY=86;
    public static final int RNAND=87;
    public static final int RNOR=88;
    public static final int RPAREN=89;
    public static final int SEMI=90;
    public static final int SL=91;
    public static final int SQUOTE=92;
    public static final int SR=93;
    public static final int STAR=94;
    public static final int SV_DATA_TYPE=95;
    public static final int TEXT=96;
    public static final int TRIGGER=97;
    public static final int VALUE_BASE=98;
    public static final int VERILOG=99;
    public static final int WS=100;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators

    protected static class ParametersScope_scope {
        HashMap<String,Parameter> parameters;
    }
    protected Stack ParametersScope_stack = new Stack();



    public SystemVerilogTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SystemVerilogTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SystemVerilogTree.tokenNames; }
    public String getGrammarFileName() { return "/local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g"; }




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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:57:1: verilog returns [Verilog verilog] : ^( VERILOG ( module[null] )+ ) ;
    public final Verilog verilog() throws RecognitionException {
        Verilog verilog = null;



            verilog = this.verilog;
          
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:62:3: ( ^( VERILOG ( module[null] )+ ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:64:2: ^( VERILOG ( module[null] )+ )
            {
            match(input,VERILOG,FOLLOW_VERILOG_in_verilog79); 

            match(input, Token.DOWN, null); 
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:64:12: ( module[null] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MODULE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:64:12: module[null]
            	    {
            	    pushFollow(FOLLOW_module_in_verilog81);
            	    module(null);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:72:1: verilog_module[Module m] returns [Verilog verilog] : ^( VERILOG module[m] ) ;
    public final Verilog verilog_module(Module m) throws RecognitionException {
        Verilog verilog = null;



            verilog = this.verilog;
          
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:78:3: ( ^( VERILOG module[m] ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:80:3: ^( VERILOG module[m] )
            {
            match(input,VERILOG,FOLLOW_VERILOG_in_verilog_module124); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_module_in_verilog_module126);
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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:89:1: module[Module sourceModule] returns [Module module] : ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters[$module] )? ^( MODULE_PORTS module_ports[$module] ) ( variable_declaration[$module] )* ( module_instanciation[$module] )* ( initial_declaration )* ( always_declaration )* ( assign_declaration )* ) ;
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
            ((ParametersScope_scope)ParametersScope_stack.peek()).parameters = new HashMap<String,Parameter>();
          
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:102:3: ( ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters[$module] )? ^( MODULE_PORTS module_ports[$module] ) ( variable_declaration[$module] )* ( module_instanciation[$module] )* ( initial_declaration )* ( always_declaration )* ( assign_declaration )* ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:103:4: ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters[$module] )? ^( MODULE_PORTS module_ports[$module] ) ( variable_declaration[$module] )* ( module_instanciation[$module] )* ( initial_declaration )* ( always_declaration )* ( assign_declaration )* )
            {
            match(input,MODULE,FOLLOW_MODULE_in_module178); 

            match(input, Token.DOWN, null); 
            match(input,MODULE_NAME,FOLLOW_MODULE_NAME_in_module188); 

            match(input, Token.DOWN, null); 
            IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module190); 

            match(input, Token.UP, null); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:106:7: ( module_parameters[$module] )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE_PARAMETERS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:106:7: module_parameters[$module]
                    {
                    pushFollow(FOLLOW_module_parameters_in_module206);
                    module_parameters(module);

                    state._fsp--;


                    }
                    break;

            }


            match(input,MODULE_PORTS,FOLLOW_MODULE_PORTS_in_module224); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_module_ports_in_module226);
                module_ports(module);

                state._fsp--;


                match(input, Token.UP, null); 
            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:110:7: ( variable_declaration[$module] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==MODULE_VARIABLE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:110:8: variable_declaration[$module]
            	    {
            	    pushFollow(FOLLOW_variable_declaration_in_module244);
            	    variable_declaration(module);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:112:7: ( module_instanciation[$module] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MODULE_INSTANCE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:112:8: module_instanciation[$module]
            	    {
            	    pushFollow(FOLLOW_module_instanciation_in_module263);
            	    module_instanciation(module);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:114:7: ( initial_declaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==INITIAL) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:114:8: initial_declaration
            	    {
            	    pushFollow(FOLLOW_initial_declaration_in_module282);
            	    initial_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:116:7: ( always_declaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ALWAYS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:116:8: always_declaration
            	    {
            	    pushFollow(FOLLOW_always_declaration_in_module300);
            	    always_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:118:7: ( assign_declaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ASSIGN) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:118:8: assign_declaration
            	    {
            	    pushFollow(FOLLOW_assign_declaration_in_module318);
            	    assign_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:130:1: module_parameters[Module module] : ^( MODULE_PARAMETERS ( parameter_declaration[$module] )* ) ;
    public final void module_parameters(Module module) throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:130:33: ( ^( MODULE_PARAMETERS ( parameter_declaration[$module] )* ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:131:3: ^( MODULE_PARAMETERS ( parameter_declaration[$module] )* )
            {
            match(input,MODULE_PARAMETERS,FOLLOW_MODULE_PARAMETERS_in_module_parameters345); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:131:23: ( parameter_declaration[$module] )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==MODULE_PARAMETER) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:131:23: parameter_declaration[$module]
                	    {
                	    pushFollow(FOLLOW_parameter_declaration_in_module_parameters347);
                	    parameter_declaration(module);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


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
        return ;
    }
    // $ANTLR end "module_parameters"



    // $ANTLR start "parameter_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:138:1: parameter_declaration[Module module] : ^( MODULE_PARAMETER IDENTIFIER value= . ) ;
    public final void parameter_declaration(Module module) throws RecognitionException {
        CommonTree IDENTIFIER2=null;
        CommonTree value=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:139:3: ( ^( MODULE_PARAMETER IDENTIFIER value= . ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:140:3: ^( MODULE_PARAMETER IDENTIFIER value= . )
            {
            match(input,MODULE_PARAMETER,FOLLOW_MODULE_PARAMETER_in_parameter_declaration372); 

            match(input, Token.DOWN, null); 
            IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_declaration380); 

            value=(CommonTree)input.LT(1);

            matchAny(input); 

            match(input, Token.UP, null); 



                Parameter newParameter = new Parameter((IDENTIFIER2!=null?IDENTIFIER2.getText():null),new SVExpression(value.getText()));
                ((ParametersScope_scope)ParametersScope_stack.peek()).parameters.put((IDENTIFIER2!=null?IDENTIFIER2.getText():null),newParameter);
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
        return ;
    }
    // $ANTLR end "parameter_declaration"



    // $ANTLR start "module_ports"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:154:1: module_ports[Module module] : ( port_declaration[$module] )* ( doxygen_group_end )? ;
    public final void module_ports(Module module) throws RecognitionException {
        ModulePort port_declaration3 =null;


        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:154:28: ( ( port_declaration[$module] )* ( doxygen_group_end )? )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:155:3: ( port_declaration[$module] )* ( doxygen_group_end )?
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:155:3: ( port_declaration[$module] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MODULE_PORT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:155:3: port_declaration[$module]
            	    {
            	    pushFollow(FOLLOW_port_declaration_in_module_ports411);
            	    port_declaration3=port_declaration(module);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:156:3: ( doxygen_group_end )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOXY_GROUP_STOP) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:156:3: doxygen_group_end
                    {
                    pushFollow(FOLLOW_doxygen_group_end_in_module_ports418);
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
        return ;
    }
    // $ANTLR end "module_ports"



    // $ANTLR start "port_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:163:1: port_declaration[Module module] returns [ModulePort port] : ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? name= IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) ;
    public final ModulePort port_declaration(Module module) throws RecognitionException {
        ModulePort port = null;


        CommonTree name=null;
        CommonTree PORT_DIRECTION4=null;
        CommonTree BASE_DATA_TYPE5=null;
        SVExpression data_size6 =null;


        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:165:3: ( ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? name= IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:165:6: ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? name= IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? )
            {
            match(input,MODULE_PORT,FOLLOW_MODULE_PORT_in_port_declaration444); 

            match(input, Token.DOWN, null); 
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:166:9: ( PORT_DIRECTION )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==PORT_DIRECTION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:166:9: PORT_DIRECTION
                    {
                    PORT_DIRECTION4=(CommonTree)match(input,PORT_DIRECTION,FOLLOW_PORT_DIRECTION_in_port_declaration455); 

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:167:9: ( BASE_DATA_TYPE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BASE_DATA_TYPE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:167:9: BASE_DATA_TYPE
                    {
                    BASE_DATA_TYPE5=(CommonTree)match(input,BASE_DATA_TYPE,FOLLOW_BASE_DATA_TYPE_in_port_declaration466); 

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:168:9: ( data_size )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DATA_SIZE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:168:9: data_size
                    {
                    pushFollow(FOLLOW_data_size_in_port_declaration477);
                    data_size6=data_size();

                    state._fsp--;


                    }
                    break;

            }


            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_declaration490); 

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:171:9: ( doxygen_group_end )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DOXY_GROUP_STOP) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:171:9: doxygen_group_end
                    {
                    pushFollow(FOLLOW_doxygen_group_end_in_port_declaration509);
                    doxygen_group_end();

                    state._fsp--;


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:172:9: ( doxygen_group_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:172:9: doxygen_group_def
                    {
                    pushFollow(FOLLOW_doxygen_group_def_in_port_declaration520);
                    doxygen_group_def();

                    state._fsp--;


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:173:9: ( doxygen_param )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==DOXY_PARAM) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:173:9: doxygen_param
            	    {
            	    pushFollow(FOLLOW_doxygen_param_in_port_declaration532);
            	    doxygen_param();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:174:9: ( doxygen_group_begin )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOXY_GROUP_START) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:174:9: doxygen_group_begin
                    {
                    pushFollow(FOLLOW_doxygen_group_begin_in_port_declaration543);
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



    // $ANTLR start "module_instanciation"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:203:1: module_instanciation[Module m] returns [ModuleInstance mi] : ^( MODULE_INSTANCE type= IDENTIFIER name= IDENTIFIER ( port_connection )* ) ;
    public final ModuleInstance module_instanciation(Module m) throws RecognitionException {
        ModuleInstance mi = null;


        CommonTree type=null;
        CommonTree name=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:204:30: ( ^( MODULE_INSTANCE type= IDENTIFIER name= IDENTIFIER ( port_connection )* ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:206:3: ^( MODULE_INSTANCE type= IDENTIFIER name= IDENTIFIER ( port_connection )* )
            {
            match(input,MODULE_INSTANCE,FOLLOW_MODULE_INSTANCE_in_module_instanciation591); 

            match(input, Token.DOWN, null); 
            type=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation595); 

            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation599); 

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:206:53: ( port_connection )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MODULE_INSTANCE_CONNECTION) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:206:53: port_connection
            	    {
            	    pushFollow(FOLLOW_port_connection_in_module_instanciation601);
            	    port_connection();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:213:1: port_connection : ^( MODULE_INSTANCE_CONNECTION port_name= IDENTIFIER (local_connection= IDENTIFIER )? ) ;
    public final void port_connection() throws RecognitionException {
        CommonTree port_name=null;
        CommonTree local_connection=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:213:16: ( ^( MODULE_INSTANCE_CONNECTION port_name= IDENTIFIER (local_connection= IDENTIFIER )? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:213:18: ^( MODULE_INSTANCE_CONNECTION port_name= IDENTIFIER (local_connection= IDENTIFIER )? )
            {
            match(input,MODULE_INSTANCE_CONNECTION,FOLLOW_MODULE_INSTANCE_CONNECTION_in_port_connection621); 

            match(input, Token.DOWN, null); 
            port_name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_connection625); 

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:213:84: (local_connection= IDENTIFIER )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:213:84: local_connection= IDENTIFIER
                    {
                    local_connection=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_connection629); 

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
        return ;
    }
    // $ANTLR end "port_connection"



    // $ANTLR start "variable_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:219:1: variable_declaration[Module m] : ^( MODULE_VARIABLE data_type ( size_def )? IDENTIFIER ) ;
    public final void variable_declaration(Module m) throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:219:32: ( ^( MODULE_VARIABLE data_type ( size_def )? IDENTIFIER ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:220:3: ^( MODULE_VARIABLE data_type ( size_def )? IDENTIFIER )
            {
            match(input,MODULE_VARIABLE,FOLLOW_MODULE_VARIABLE_in_variable_declaration647); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_data_type_in_variable_declaration649);
            data_type();

            state._fsp--;


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:220:31: ( size_def )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EXPRESSION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:220:31: size_def
                    {
                    pushFollow(FOLLOW_size_def_in_variable_declaration651);
                    size_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration654); 

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
        return ;
    }
    // $ANTLR end "variable_declaration"



    // $ANTLR start "initial_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:225:1: initial_declaration : INITIAL ;
    public final void initial_declaration() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:225:21: ( INITIAL )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:225:23: INITIAL
            {
            match(input,INITIAL,FOLLOW_INITIAL_in_initial_declaration667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "initial_declaration"



    // $ANTLR start "always_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:227:1: always_declaration : ALWAYS ;
    public final void always_declaration() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:227:19: ( ALWAYS )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:227:21: ALWAYS
            {
            match(input,ALWAYS,FOLLOW_ALWAYS_in_always_declaration682); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "always_declaration"



    // $ANTLR start "assign_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:229:1: assign_declaration : ASSIGN ;
    public final void assign_declaration() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:229:19: ( ASSIGN )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:229:21: ASSIGN
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_declaration697); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign_declaration"



    // $ANTLR start "data_type"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:233:1: data_type : ( BASE_DATA_TYPE | SV_DATA_TYPE );
    public final void data_type() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:233:10: ( BASE_DATA_TYPE | SV_DATA_TYPE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:
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
        return ;
    }
    // $ANTLR end "data_type"



    // $ANTLR start "data_size"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:235:1: data_size returns [SVExpression size] : ^( DATA_SIZE size_def ) ;
    public final SVExpression data_size() throws RecognitionException {
        SVExpression size = null;


        SVExpression size_def7 =null;


        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:237:3: ( ^( DATA_SIZE size_def ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:239:3: ^( DATA_SIZE size_def )
            {
            match(input,DATA_SIZE,FOLLOW_DATA_SIZE_in_data_size733); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_size_def_in_data_size735);
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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:246:1: size_def returns [SVExpression size] : ^( EXPRESSION expression[$size] ^( TEXT txt= . ) ) ;
    public final SVExpression size_def() throws RecognitionException {
        SVExpression size = null;


        CommonTree txt=null;


            size = new SVExpression();
          
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:251:3: ( ^( EXPRESSION expression[$size] ^( TEXT txt= . ) ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:253:5: ^( EXPRESSION expression[$size] ^( TEXT txt= . ) )
            {
            match(input,EXPRESSION,FOLLOW_EXPRESSION_in_size_def773); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_size_def775);
            expression(size);

            state._fsp--;


            match(input,TEXT,FOLLOW_TEXT_in_size_def779); 

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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:260:1: expression[SVExpression expression] : ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )? ( expression_operator expression[$expression] )? ;
    public final void expression(SVExpression expression) throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:262:3: ( ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )? ( expression_operator expression[$expression] )? )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:263:3: ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )? ( expression_operator expression[$expression] )?
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:263:3: ( ( LPAREN expression[$expression] RPAREN ) | expression_operand[$expression] )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAREN) ) {
                alt21=1;
            }
            else if ( (LA21_0==BUS_VALUE||LA21_0==EXE_QUOTE||LA21_0==IDENTIFIER||LA21_0==NUMBER) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:263:4: ( LPAREN expression[$expression] RPAREN )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:263:4: ( LPAREN expression[$expression] RPAREN )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:263:5: LPAREN expression[$expression] RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_expression812); 

                    pushFollow(FOLLOW_expression_in_expression814);
                    expression(expression);

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_expression817); 

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:264:5: expression_operand[$expression]
                    {
                    pushFollow(FOLLOW_expression_operand_in_expression825);
                    expression_operand(expression);

                    state._fsp--;


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:264:40: ( expression_operator expression[$expression] )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BAND||(LA22_0 >= BNOT && LA22_0 <= BOR)||(LA22_0 >= BXNOR && LA22_0 <= COLON)||LA22_0==DIV||LA22_0==EQ||LA22_0==GE||LA22_0==GT||LA22_0==LAND||(LA22_0 >= LE && LA22_0 <= LOR)||(LA22_0 >= LT && LA22_0 <= MINUS)||LA22_0==PLUS||LA22_0==QUESTION||LA22_0==STAR) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:264:41: expression_operator expression[$expression]
                    {
                    pushFollow(FOLLOW_expression_operator_in_expression832);
                    expression_operator();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression834);
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
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "expression_operand"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:266:1: expression_operand[SVExpression expression] : ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | NUMBER | ( EXE_QUOTE IDENTIFIER ) | typed_value );
    public final void expression_operand(SVExpression expression) throws RecognitionException {
        CommonTree IDENTIFIER8=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:268:3: ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | NUMBER | ( EXE_QUOTE IDENTIFIER ) | typed_value )
            int alt24=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt24=1;
                }
                break;
            case NUMBER:
                {
                alt24=2;
                }
                break;
            case EXE_QUOTE:
                {
                alt24=3;
                }
                break;
            case BUS_VALUE:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:269:3: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:269:3: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:269:4: IDENTIFIER ( LBRACK NUMBER RBRACK )?
                    {
                    IDENTIFIER8=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand856); 

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:269:15: ( LBRACK NUMBER RBRACK )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==LBRACK) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:269:16: LBRACK NUMBER RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_expression_operand859); 

                            match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand861); 

                            match(input,RBRACK,FOLLOW_RBRACK_in_expression_operand863); 

                            }
                            break;

                    }


                    }


                    expression.addParameter(((ParametersScope_scope)ParametersScope_stack.peek()).parameters.get((IDENTIFIER8!=null?IDENTIFIER8.getText():null)));

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:270:5: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand875); 

                    }
                    break;
                case 3 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:271:5: ( EXE_QUOTE IDENTIFIER )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:271:5: ( EXE_QUOTE IDENTIFIER )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:271:6: EXE_QUOTE IDENTIFIER
                    {
                    match(input,EXE_QUOTE,FOLLOW_EXE_QUOTE_in_expression_operand883); 

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand885); 

                    }


                    }
                    break;
                case 4 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:272:5: typed_value
                    {
                    pushFollow(FOLLOW_typed_value_in_expression_operand892);
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
        return ;
    }
    // $ANTLR end "expression_operand"



    // $ANTLR start "expression_operator"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:274:1: expression_operator : ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE );
    public final void expression_operator() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:274:20: ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:
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
        return ;
    }
    // $ANTLR end "expression_operator"



    // $ANTLR start "typed_value"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:277:1: typed_value : BUS_VALUE ;
    public final void typed_value() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:277:12: ( BUS_VALUE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:277:14: BUS_VALUE
            {
            match(input,BUS_VALUE,FOLLOW_BUS_VALUE_in_typed_value985); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "typed_value"



    // $ANTLR start "doxygen_group_def"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:282:1: doxygen_group_def : ( IDENTIFIER ) ;
    public final void doxygen_group_def() throws RecognitionException {
        CommonTree IDENTIFIER9=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:282:18: ( ( IDENTIFIER ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:283:4: ( IDENTIFIER )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:283:4: ( IDENTIFIER )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:283:5: IDENTIFIER
            {
            IDENTIFIER9=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_doxygen_group_def1000); 

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
        return ;
    }
    // $ANTLR end "doxygen_group_def"



    // $ANTLR start "doxygen_group_begin"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:298:1: doxygen_group_begin : ( DOXY_GROUP_START ) ;
    public final void doxygen_group_begin() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:298:20: ( ( DOXY_GROUP_START ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:299:4: ( DOXY_GROUP_START )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:299:4: ( DOXY_GROUP_START )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:299:5: DOXY_GROUP_START
            {
            match(input,DOXY_GROUP_START,FOLLOW_DOXY_GROUP_START_in_doxygen_group_begin1018); 

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
        return ;
    }
    // $ANTLR end "doxygen_group_begin"



    // $ANTLR start "doxygen_group_end"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:313:1: doxygen_group_end : ( DOXY_GROUP_STOP ) ;
    public final void doxygen_group_end() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:313:18: ( ( DOXY_GROUP_STOP ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:314:3: ( DOXY_GROUP_STOP )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:314:3: ( DOXY_GROUP_STOP )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:314:4: DOXY_GROUP_STOP
            {
            match(input,DOXY_GROUP_STOP,FOLLOW_DOXY_GROUP_STOP_in_doxygen_group_end1034); 

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
        return ;
    }
    // $ANTLR end "doxygen_group_end"



    // $ANTLR start "doxygen_param"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:328:1: doxygen_param : ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) ;
    public final void doxygen_param() throws RecognitionException {
        CommonTree EXTENDED_IDENTIFIER10=null;
        String short_long_identifier11 =null;


        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:328:14: ( ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:329:3: ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? )
            {
            match(input,DOXY_PARAM,FOLLOW_DOXY_PARAM_in_doxygen_param1055); 

            match(input, Token.DOWN, null); 
            EXTENDED_IDENTIFIER10=(CommonTree)match(input,EXTENDED_IDENTIFIER,FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param1057); 

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:329:36: ( short_long_identifier )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DQUOTE||LA25_0==IDENTIFIER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:329:36: short_long_identifier
                    {
                    pushFollow(FOLLOW_short_long_identifier_in_doxygen_param1059);
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
        return ;
    }
    // $ANTLR end "doxygen_param"



    // $ANTLR start "short_long_identifier"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:352:1: short_long_identifier returns [String s] : ( IDENTIFIER | DQUOTE ( IDENTIFIER (content= ( ( WS )+ IDENTIFIER ) )* ) DQUOTE );
    public final String short_long_identifier() throws RecognitionException {
        String s = null;


        CommonTree content=null;
        CommonTree IDENTIFIER12=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:353:22: ( IDENTIFIER | DQUOTE ( IDENTIFIER (content= ( ( WS )+ IDENTIFIER ) )* ) DQUOTE )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENTIFIER) ) {
                alt28=1;
            }
            else if ( (LA28_0==DQUOTE) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:354:3: IDENTIFIER
                    {
                    IDENTIFIER12=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier1089); 


                        s = (IDENTIFIER12!=null?IDENTIFIER12.getText():null);
                      

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:3: DQUOTE ( IDENTIFIER (content= ( ( WS )+ IDENTIFIER ) )* ) DQUOTE
                    {
                    match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier1103); 

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:10: ( IDENTIFIER (content= ( ( WS )+ IDENTIFIER ) )* )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:11: IDENTIFIER (content= ( ( WS )+ IDENTIFIER ) )*
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier1106); 

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:29: (content= ( ( WS )+ IDENTIFIER ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==WS) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:29: content= ( ( WS )+ IDENTIFIER )
                    	    {
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:30: ( ( WS )+ IDENTIFIER )
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:31: ( WS )+ IDENTIFIER
                    	    {
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:31: ( WS )+
                    	    int cnt26=0;
                    	    loop26:
                    	    do {
                    	        int alt26=2;
                    	        int LA26_0 = input.LA(1);

                    	        if ( (LA26_0==WS) ) {
                    	            alt26=1;
                    	        }


                    	        switch (alt26) {
                    	    	case 1 :
                    	    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogTree.g:359:31: WS
                    	    	    {
                    	    	    match(input,WS,FOLLOW_WS_in_short_long_identifier1111); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt26 >= 1 ) break loop26;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(26, input);
                    	                throw eee;
                    	        }
                    	        cnt26++;
                    	    } while (true);


                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier1114); 

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }


                    match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier1120); 


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


 

    public static final BitSet FOLLOW_VERILOG_in_verilog79 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_module_in_verilog81 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_VERILOG_in_verilog_module124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_module_in_verilog_module126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODULE_in_module178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MODULE_NAME_in_module188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_module_parameters_in_module206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MODULE_PORTS_in_module224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_module_ports_in_module226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_declaration_in_module244 = new BitSet(new long[]{0x2002000000000038L,0x0000000000000010L});
    public static final BitSet FOLLOW_module_instanciation_in_module263 = new BitSet(new long[]{0x2002000000000038L});
    public static final BitSet FOLLOW_initial_declaration_in_module282 = new BitSet(new long[]{0x0002000000000038L});
    public static final BitSet FOLLOW_always_declaration_in_module300 = new BitSet(new long[]{0x0000000000000038L});
    public static final BitSet FOLLOW_assign_declaration_in_module318 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_MODULE_PARAMETERS_in_module_parameters345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_declaration_in_module_parameters347 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_MODULE_PARAMETER_in_parameter_declaration372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_declaration380 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_port_declaration_in_module_ports411 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_doxygen_group_end_in_module_ports418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_PORT_in_port_declaration444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PORT_DIRECTION_in_port_declaration455 = new BitSet(new long[]{0x0000800000200100L});
    public static final BitSet FOLLOW_BASE_DATA_TYPE_in_port_declaration466 = new BitSet(new long[]{0x0000800000200000L});
    public static final BitSet FOLLOW_data_size_in_port_declaration477 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_port_declaration490 = new BitSet(new long[]{0x00008000E0000008L});
    public static final BitSet FOLLOW_doxygen_group_end_in_port_declaration509 = new BitSet(new long[]{0x00008000A0000008L});
    public static final BitSet FOLLOW_doxygen_group_def_in_port_declaration520 = new BitSet(new long[]{0x00000000A0000008L});
    public static final BitSet FOLLOW_doxygen_param_in_port_declaration532 = new BitSet(new long[]{0x00000000A0000008L});
    public static final BitSet FOLLOW_doxygen_group_begin_in_port_declaration543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODULE_INSTANCE_in_module_instanciation591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation595 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation599 = new BitSet(new long[]{0x4000000000000008L});
    public static final BitSet FOLLOW_port_connection_in_module_instanciation601 = new BitSet(new long[]{0x4000000000000008L});
    public static final BitSet FOLLOW_MODULE_INSTANCE_CONNECTION_in_port_connection621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_port_connection625 = new BitSet(new long[]{0x0000800000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_port_connection629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODULE_VARIABLE_in_variable_declaration647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_data_type_in_variable_declaration649 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_size_def_in_variable_declaration651 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INITIAL_in_initial_declaration667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALWAYS_in_always_declaration682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_declaration697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_SIZE_in_data_size733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_size_def_in_data_size735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_size_def773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_size_def775 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_TEXT_in_size_def779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LPAREN_in_expression812 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000042100A00L});
    public static final BitSet FOLLOW_expression_in_expression814 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_expression817 = new BitSet(new long[]{0x06E450080041CC82L,0x0000000040100800L});
    public static final BitSet FOLLOW_expression_operand_in_expression825 = new BitSet(new long[]{0x06E450080041CC82L,0x0000000040100800L});
    public static final BitSet FOLLOW_expression_operator_in_expression832 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_expression_in_expression834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand856 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_expression_operand859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_expression_operand861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_expression_operand863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_operand875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXE_QUOTE_in_expression_operand883 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_value_in_expression_operand892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUS_VALUE_in_typed_value985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_doxygen_group_def1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXY_GROUP_START_in_doxygen_group_begin1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXY_GROUP_STOP_in_doxygen_group_end1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXY_PARAM_in_doxygen_param1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param1057 = new BitSet(new long[]{0x0000800100000008L});
    public static final BitSet FOLLOW_short_long_identifier_in_doxygen_param1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier1103 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier1106 = new BitSet(new long[]{0x0000000100000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_WS_in_short_long_identifier1111 = new BitSet(new long[]{0x0000800000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier1114 = new BitSet(new long[]{0x0000000100000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier1120 = new BitSet(new long[]{0x0000000000000002L});

}