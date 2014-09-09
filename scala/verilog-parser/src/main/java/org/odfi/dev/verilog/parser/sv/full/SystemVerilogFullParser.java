// $ANTLR 3.4 /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g 2011-11-22 15:40:40

package org.odfi.dev.verilog.parser.sv.full;

//import uni.hd.cag.languages.parsing.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SystemVerilogFullParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
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
    public String[] getTokenNames() { return SystemVerilogFullParser.tokenNames; }
    public String getGrammarFileName() { return "/local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g"; }



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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verilog"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:69:1: verilog : ( module )+ -> ^( VERILOG ( module )+ ) ;
    public final SystemVerilogFullParser.verilog_return verilog() throws RecognitionException {
        SystemVerilogFullParser.verilog_return retval = new SystemVerilogFullParser.verilog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SystemVerilogFullParser.module_return module1 =null;


        RewriteRuleSubtreeStream stream_module=new RewriteRuleSubtreeStream(adaptor,"rule module");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:69:9: ( ( module )+ -> ^( VERILOG ( module )+ ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:70:3: ( module )+
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:70:3: ( module )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ALWAYS && LA1_0 <= 102)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:70:3: module
            	    {
            	    pushFollow(FOLLOW_module_in_verilog148);
            	    module1=module();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_module.add(module1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: module
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 70:11: -> ^( VERILOG ( module )+ )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:70:14: ^( VERILOG ( module )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VERILOG, "VERILOG")
                , root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:95:1: module : ( . )* ( fpga_param )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( . )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ) ;
    public final SystemVerilogFullParser.module_return module() throws RecognitionException {
        SystemVerilogFullParser.module_return retval = new SystemVerilogFullParser.module_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token wildcard2=null;
        Token string_literal4=null;
        Token IDENTIFIER5=null;
        Token POUND6=null;
        Token LPAREN7=null;
        Token NEWLINE9=null;
        Token RPAREN10=null;
        Token LPAREN11=null;
        Token NEWLINE13=null;
        Token RPAREN14=null;
        Token SEMI15=null;
        Token wildcard16=null;
        Token string_literal17=null;
        SystemVerilogFullParser.fpga_param_return fpga_param3 =null;

        SystemVerilogFullParser.module_parameters_return module_parameters8 =null;

        SystemVerilogFullParser.module_ports_return module_ports12 =null;


        CommonTree wildcard2_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree IDENTIFIER5_tree=null;
        CommonTree POUND6_tree=null;
        CommonTree LPAREN7_tree=null;
        CommonTree NEWLINE9_tree=null;
        CommonTree RPAREN10_tree=null;
        CommonTree LPAREN11_tree=null;
        CommonTree NEWLINE13_tree=null;
        CommonTree RPAREN14_tree=null;
        CommonTree SEMI15_tree=null;
        CommonTree wildcard16_tree=null;
        CommonTree string_literal17_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_POUND=new RewriteRuleTokenStream(adaptor,"token POUND");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_module_parameters=new RewriteRuleSubtreeStream(adaptor,"rule module_parameters");
        RewriteRuleSubtreeStream stream_module_ports=new RewriteRuleSubtreeStream(adaptor,"rule module_ports");
        RewriteRuleSubtreeStream stream_fpga_param=new RewriteRuleSubtreeStream(adaptor,"rule fpga_param");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:95:8: ( ( . )* ( fpga_param )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( . )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:96:3: ( . )* ( fpga_param )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( . )* ( 'endmodule' )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:96:3: ( . )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case FPGA_PARAM_START:
                    {
                    alt2=2;
                    }
                    break;
                case MODULE:
                    {
                    alt2=2;
                    }
                    break;
                case ALWAYS:
                case ASSIGN:
                case AT:
                case BAND:
                case BASE_DATA_TYPE:
                case BEGIN:
                case BNOT:
                case BOR:
                case BSLASH:
                case BUS_VALUE:
                case BXNOR:
                case BXOR:
                case COLON:
                case COMMA:
                case COMMENTAR_LONG:
                case COMMENTAR_SHORT:
                case COMM_BEGIN:
                case DATA_SIZE:
                case DIV:
                case DOT:
                case DOXY:
                case DOXYGEN_GROUP_DEF:
                case DOXYGEN_GROUP_END:
                case DOXYGEN_GROUP_START:
                case DOXYGEN_PARAM:
                case DOXY_GROUP_START:
                case DOXY_GROUP_STOP:
                case DOXY_PARAM:
                case DQUOTE:
                case ELSE:
                case END:
                case EQ:
                case EQUAL:
                case EQ_CASE:
                case EXE_QUOTE:
                case EXPRESSION:
                case EXTENDED_IDENTIFIER:
                case FPATH:
                case FPGA_PARAM_STOP:
                case GE:
                case GENERATE:
                case GT:
                case IDENTIFIER:
                case IF:
                case INITIAL:
                case LAND:
                case LBRACK:
                case LCURLY:
                case LE:
                case LNOT:
                case LOR:
                case LPAREN:
                case LT:
                case MINUS:
                case MOD:
                case MODULE_INSTANCE:
                case MODULE_INSTANCE_CONNECTION:
                case MODULE_NAME:
                case MODULE_PARAMETER:
                case MODULE_PARAMETERS:
                case MODULE_PORT:
                case MODULE_PORTS:
                case MODULE_VARIABLE:
                case NEGEDGE:
                case NEWLINE:
                case NOT_EQ:
                case NOT_EQ_CASE:
                case NUMBER:
                case OR:
                case PLUS:
                case PORT_DIRECTION:
                case POSEDGE:
                case POUND:
                case PPATH:
                case PREP_ELSE:
                case PREP_ENDIF:
                case PREP_IFDEF:
                case PREP_INCLUDE:
                case QUESTION:
                case RBRACK:
                case RCURLY:
                case RNAND:
                case RNOR:
                case RPAREN:
                case SEMI:
                case SL:
                case SQUOTE:
                case SR:
                case STAR:
                case SV_DATA_TYPE:
                case TEXT:
                case TRIGGER:
                case VALUE_BASE:
                case VERILOG:
                case WS:
                case 101:
                case 102:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:96:3: .
            	    {
            	    wildcard2=(Token)input.LT(1);

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
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:97:3: ( fpga_param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==FPGA_PARAM_START) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:97:3: fpga_param
            	    {
            	    pushFollow(FOLLOW_fpga_param_in_module181);
            	    fpga_param3=fpga_param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fpga_param.add(fpga_param3.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:98:3: ( 'module' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:98:4: 'module'
            {
            string_literal4=(Token)match(input,MODULE,FOLLOW_MODULE_in_module187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(string_literal4);


            }


            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER5);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:100:3: ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==POUND) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:100:4: POUND LPAREN module_parameters ( NEWLINE )? RPAREN
                    {
                    POUND6=(Token)match(input,POUND,FOLLOW_POUND_in_module197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_POUND.add(POUND6);


                    LPAREN7=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_module199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN7);


                    pushFollow(FOLLOW_module_parameters_in_module201);
                    module_parameters8=module_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_module_parameters.add(module_parameters8.getTree());

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:100:36: ( NEWLINE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NEWLINE) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:100:36: NEWLINE
                            {
                            NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_module204); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);


                            }
                            break;

                    }


                    RPAREN10=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_module207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN10);


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:101:3: ( LPAREN module_ports ( NEWLINE )? RPAREN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:101:4: LPAREN module_ports ( NEWLINE )? RPAREN
                    {
                    LPAREN11=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_module214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN11);


                    pushFollow(FOLLOW_module_ports_in_module216);
                    module_ports12=module_ports();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_module_ports.add(module_ports12.getTree());

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:101:24: ( NEWLINE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NEWLINE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:101:24: NEWLINE
                            {
                            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_module218); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE13);


                            }
                            break;

                    }


                    RPAREN14=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_module221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN14);


                    }
                    break;

            }


            SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_module227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI15);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:104:3: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==101) ) {
                    alt8=2;
                }
                else if ( ((LA8_0 >= ALWAYS && LA8_0 <= WS)||LA8_0==102) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:105:5: .
            	    {
            	    wildcard16=(Token)input.LT(1);

            	    matchAny(input); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    wildcard16_tree = (CommonTree)adaptor.create(wildcard16);
            	    adaptor.addChild(root_0, wildcard16_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:107:3: ( 'endmodule' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:107:4: 'endmodule'
            {
            string_literal17=(Token)match(input,101,FOLLOW_101_in_module250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(string_literal17);


            }


            // AST REWRITE
            // elements: module_ports, module_parameters, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 107:17: -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:107:20: ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:107:29: ^( MODULE_NAME IDENTIFIER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_NAME, "MODULE_NAME")
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:107:55: ( module_parameters )?
                if ( stream_module_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_module_parameters.nextTree());

                }
                stream_module_parameters.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:107:74: ( module_ports )?
                if ( stream_module_ports.hasNext() ) {
                    adaptor.addChild(root_1, stream_module_ports.nextTree());

                }
                stream_module_ports.reset();

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_hierarchical"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:110:1: module_hierarchical : ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( module_instanciation )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* ) ;
    public final SystemVerilogFullParser.module_hierarchical_return module_hierarchical() throws RecognitionException {
        SystemVerilogFullParser.module_hierarchical_return retval = new SystemVerilogFullParser.module_hierarchical_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token wildcard18=null;
        Token string_literal19=null;
        Token IDENTIFIER20=null;
        Token POUND21=null;
        Token LPAREN22=null;
        Token NEWLINE24=null;
        Token RPAREN25=null;
        Token LPAREN26=null;
        Token NEWLINE28=null;
        Token RPAREN29=null;
        Token SEMI30=null;
        Token string_literal32=null;
        SystemVerilogFullParser.module_parameters_return module_parameters23 =null;

        SystemVerilogFullParser.module_ports_return module_ports27 =null;

        SystemVerilogFullParser.module_instanciation_return module_instanciation31 =null;


        CommonTree wildcard18_tree=null;
        CommonTree string_literal19_tree=null;
        CommonTree IDENTIFIER20_tree=null;
        CommonTree POUND21_tree=null;
        CommonTree LPAREN22_tree=null;
        CommonTree NEWLINE24_tree=null;
        CommonTree RPAREN25_tree=null;
        CommonTree LPAREN26_tree=null;
        CommonTree NEWLINE28_tree=null;
        CommonTree RPAREN29_tree=null;
        CommonTree SEMI30_tree=null;
        CommonTree string_literal32_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_POUND=new RewriteRuleTokenStream(adaptor,"token POUND");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_module_parameters=new RewriteRuleSubtreeStream(adaptor,"rule module_parameters");
        RewriteRuleSubtreeStream stream_module_ports=new RewriteRuleSubtreeStream(adaptor,"rule module_ports");
        RewriteRuleSubtreeStream stream_module_instanciation=new RewriteRuleSubtreeStream(adaptor,"rule module_instanciation");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:110:21: ( ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( module_instanciation )* ( 'endmodule' ) -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:111:3: ( . )* ( 'module' ) IDENTIFIER ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )? ( LPAREN module_ports ( NEWLINE )? RPAREN )? SEMI ( module_instanciation )* ( 'endmodule' )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:111:3: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MODULE) ) {
                    alt9=2;
                }
                else if ( ((LA9_0 >= ALWAYS && LA9_0 <= MOD)||(LA9_0 >= MODULE_INSTANCE && LA9_0 <= 102)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:111:3: .
            	    {
            	    wildcard18=(Token)input.LT(1);

            	    matchAny(input); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    wildcard18_tree = (CommonTree)adaptor.create(wildcard18);
            	    adaptor.addChild(root_0, wildcard18_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:112:3: ( 'module' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:112:4: 'module'
            {
            string_literal19=(Token)match(input,MODULE,FOLLOW_MODULE_in_module_hierarchical287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(string_literal19);


            }


            IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_hierarchical292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER20);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:114:3: ( POUND LPAREN module_parameters ( NEWLINE )? RPAREN )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==POUND) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:114:4: POUND LPAREN module_parameters ( NEWLINE )? RPAREN
                    {
                    POUND21=(Token)match(input,POUND,FOLLOW_POUND_in_module_hierarchical297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_POUND.add(POUND21);


                    LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_module_hierarchical299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN22);


                    pushFollow(FOLLOW_module_parameters_in_module_hierarchical301);
                    module_parameters23=module_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_module_parameters.add(module_parameters23.getTree());

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:114:36: ( NEWLINE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NEWLINE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:114:36: NEWLINE
                            {
                            NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_module_hierarchical304); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE24);


                            }
                            break;

                    }


                    RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_module_hierarchical307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN25);


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:115:3: ( LPAREN module_ports ( NEWLINE )? RPAREN )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:115:4: LPAREN module_ports ( NEWLINE )? RPAREN
                    {
                    LPAREN26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_module_hierarchical314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN26);


                    pushFollow(FOLLOW_module_ports_in_module_hierarchical316);
                    module_ports27=module_ports();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_module_ports.add(module_ports27.getTree());

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:115:24: ( NEWLINE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NEWLINE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:115:24: NEWLINE
                            {
                            NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_module_hierarchical318); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE28);


                            }
                            break;

                    }


                    RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_module_hierarchical321); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN29);


                    }
                    break;

            }


            SEMI30=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_hierarchical327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI30);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:123:3: ( module_instanciation )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==IDENTIFIER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:124:4: module_instanciation
            	    {
            	    pushFollow(FOLLOW_module_instanciation_in_module_hierarchical343);
            	    module_instanciation31=module_instanciation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_module_instanciation.add(module_instanciation31.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:3: ( 'endmodule' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:4: 'endmodule'
            {
            string_literal32=(Token)match(input,101,FOLLOW_101_in_module_hierarchical353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(string_literal32);


            }


            // AST REWRITE
            // elements: module_instanciation, IDENTIFIER, module_parameters, module_ports
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 126:17: -> ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:20: ^( MODULE ^( MODULE_NAME IDENTIFIER ) ( module_parameters )? ( module_ports )? ( module_instanciation )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:29: ^( MODULE_NAME IDENTIFIER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_NAME, "MODULE_NAME")
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:55: ( module_parameters )?
                if ( stream_module_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_module_parameters.nextTree());

                }
                stream_module_parameters.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:74: ( module_ports )?
                if ( stream_module_ports.hasNext() ) {
                    adaptor.addChild(root_1, stream_module_ports.nextTree());

                }
                stream_module_ports.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:126:88: ( module_instanciation )*
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_parameters"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:133:1: module_parameters : parameter_declaration ( ( ',' ) ! parameter_declaration )* -> ^( MODULE_PARAMETERS ( parameter_declaration )* ) ;
    public final SystemVerilogFullParser.module_parameters_return module_parameters() throws RecognitionException {
        SystemVerilogFullParser.module_parameters_return retval = new SystemVerilogFullParser.module_parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal34=null;
        SystemVerilogFullParser.parameter_declaration_return parameter_declaration33 =null;

        SystemVerilogFullParser.parameter_declaration_return parameter_declaration35 =null;


        CommonTree char_literal34_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:133:19: ( parameter_declaration ( ( ',' ) ! parameter_declaration )* -> ^( MODULE_PARAMETERS ( parameter_declaration )* ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:5: parameter_declaration ( ( ',' ) ! parameter_declaration )*
            {
            pushFollow(FOLLOW_parameter_declaration_in_module_parameters394);
            parameter_declaration33=parameter_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration33.getTree());

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:27: ( ( ',' ) ! parameter_declaration )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:28: ( ',' ) ! parameter_declaration
            	    {
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:28: ( ',' )
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:29: ','
            	    {
            	    char_literal34=(Token)match(input,COMMA,FOLLOW_COMMA_in_module_parameters398); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal34);


            	    }


            	    pushFollow(FOLLOW_parameter_declaration_in_module_parameters402);
            	    parameter_declaration35=parameter_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration35.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // AST REWRITE
            // elements: parameter_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:60: -> ^( MODULE_PARAMETERS ( parameter_declaration )* )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:63: ^( MODULE_PARAMETERS ( parameter_declaration )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_PARAMETERS, "MODULE_PARAMETERS")
                , root_1);

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:134:83: ( parameter_declaration )*
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:137:1: parameter_declaration : 'parameter' IDENTIFIER EQUAL parameter_value -> ^( MODULE_PARAMETER IDENTIFIER parameter_value ) ;
    public final SystemVerilogFullParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        SystemVerilogFullParser.parameter_declaration_return retval = new SystemVerilogFullParser.parameter_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal36=null;
        Token IDENTIFIER37=null;
        Token EQUAL38=null;
        SystemVerilogFullParser.parameter_value_return parameter_value39 =null;


        CommonTree string_literal36_tree=null;
        CommonTree IDENTIFIER37_tree=null;
        CommonTree EQUAL38_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_parameter_value=new RewriteRuleSubtreeStream(adaptor,"rule parameter_value");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:137:22: ( 'parameter' IDENTIFIER EQUAL parameter_value -> ^( MODULE_PARAMETER IDENTIFIER parameter_value ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:138:3: 'parameter' IDENTIFIER EQUAL parameter_value
            {
            string_literal36=(Token)match(input,102,FOLLOW_102_in_parameter_declaration425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(string_literal36);


            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_declaration427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER37);


            EQUAL38=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_parameter_declaration429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL38);


            pushFollow(FOLLOW_parameter_value_in_parameter_declaration431);
            parameter_value39=parameter_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_value.add(parameter_value39.getTree());

            // AST REWRITE
            // elements: parameter_value, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:48: -> ^( MODULE_PARAMETER IDENTIFIER parameter_value )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:138:51: ^( MODULE_PARAMETER IDENTIFIER parameter_value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_PARAMETER, "MODULE_PARAMETER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_value"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:150:1: parameter_value : ( expression -> ^() | long_identifier -> ^() );
    public final SystemVerilogFullParser.parameter_value_return parameter_value() throws RecognitionException {
        SystemVerilogFullParser.parameter_value_return retval = new SystemVerilogFullParser.parameter_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SystemVerilogFullParser.expression_return expression40 =null;

        SystemVerilogFullParser.long_identifier_return long_identifier41 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_long_identifier=new RewriteRuleSubtreeStream(adaptor,"rule long_identifier");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:150:16: ( expression -> ^() | long_identifier -> ^() )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==BAND||(LA16_0 >= BNOT && LA16_0 <= BOR)||(LA16_0 >= BUS_VALUE && LA16_0 <= COMMA)||LA16_0==DIV||LA16_0==EQ||LA16_0==EXE_QUOTE||LA16_0==GE||(LA16_0 >= GT && LA16_0 <= IDENTIFIER)||LA16_0==LAND||(LA16_0 >= LE && LA16_0 <= MINUS)||LA16_0==NEWLINE||LA16_0==NUMBER||LA16_0==PLUS||LA16_0==QUESTION||LA16_0==RCURLY||(LA16_0 >= RPAREN && LA16_0 <= SEMI)||LA16_0==STAR) ) {
                alt16=1;
            }
            else if ( (LA16_0==DQUOTE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:152:3: expression
                    {
                    pushFollow(FOLLOW_expression_in_parameter_value455);
                    expression40=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression40.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 152:14: -> ^()
                    {
                        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:152:17: ^()
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(new CommonTree(new CommonToken(0,(expression40!=null?input.toString(expression40.start,expression40.stop):null))), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:153:5: long_identifier
                    {
                    pushFollow(FOLLOW_long_identifier_in_parameter_value468);
                    long_identifier41=long_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_long_identifier.add(long_identifier41.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:21: -> ^()
                    {
                        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:153:24: ^()
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(new CommonTree(new CommonToken(0,(long_identifier41!=null?input.toString(long_identifier41.start,long_identifier41.stop):null))), root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_ports"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:160:1: module_ports : port_declaration ( ( ',' ) ! port_declaration )* ( doxygen_group_end )? -> ^( MODULE_PORTS ( port_declaration )* ) ;
    public final SystemVerilogFullParser.module_ports_return module_ports() throws RecognitionException {
        SystemVerilogFullParser.module_ports_return retval = new SystemVerilogFullParser.module_ports_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal43=null;
        SystemVerilogFullParser.port_declaration_return port_declaration42 =null;

        SystemVerilogFullParser.port_declaration_return port_declaration44 =null;

        SystemVerilogFullParser.doxygen_group_end_return doxygen_group_end45 =null;


        CommonTree char_literal43_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_doxygen_group_end=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_end");
        RewriteRuleSubtreeStream stream_port_declaration=new RewriteRuleSubtreeStream(adaptor,"rule port_declaration");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:160:14: ( port_declaration ( ( ',' ) ! port_declaration )* ( doxygen_group_end )? -> ^( MODULE_PORTS ( port_declaration )* ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:162:4: port_declaration ( ( ',' ) ! port_declaration )* ( doxygen_group_end )?
            {
            pushFollow(FOLLOW_port_declaration_in_module_ports495);
            port_declaration42=port_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_port_declaration.add(port_declaration42.getTree());

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:164:5: ( ( ',' ) ! port_declaration )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:164:6: ( ',' ) ! port_declaration
            	    {
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:164:6: ( ',' )
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:164:7: ','
            	    {
            	    char_literal43=(Token)match(input,COMMA,FOLLOW_COMMA_in_module_ports509); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal43);


            	    }


            	    pushFollow(FOLLOW_port_declaration_in_module_ports523);
            	    port_declaration44=port_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_port_declaration.add(port_declaration44.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:169:5: ( doxygen_group_end )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DOXYGEN_GROUP_END) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:169:5: doxygen_group_end
                    {
                    pushFollow(FOLLOW_doxygen_group_end_in_module_ports542);
                    doxygen_group_end45=doxygen_group_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doxygen_group_end.add(doxygen_group_end45.getTree());

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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:3: -> ^( MODULE_PORTS ( port_declaration )* )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:171:6: ^( MODULE_PORTS ( port_declaration )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_PORTS, "MODULE_PORTS")
                , root_1);

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:171:21: ( port_declaration )*
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "port_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:173:1: port_declaration : ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER -> ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) ;
    public final SystemVerilogFullParser.port_declaration_return port_declaration() throws RecognitionException {
        SystemVerilogFullParser.port_declaration_return retval = new SystemVerilogFullParser.port_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PORT_DIRECTION50=null;
        Token BASE_DATA_TYPE51=null;
        Token IDENTIFIER53=null;
        SystemVerilogFullParser.doxygen_group_end_return doxygen_group_end46 =null;

        SystemVerilogFullParser.doxygen_group_def_return doxygen_group_def47 =null;

        SystemVerilogFullParser.doxygen_param_return doxygen_param48 =null;

        SystemVerilogFullParser.doxygen_group_begin_return doxygen_group_begin49 =null;

        SystemVerilogFullParser.data_size_return data_size52 =null;


        CommonTree PORT_DIRECTION50_tree=null;
        CommonTree BASE_DATA_TYPE51_tree=null;
        CommonTree IDENTIFIER53_tree=null;
        RewriteRuleTokenStream stream_PORT_DIRECTION=new RewriteRuleTokenStream(adaptor,"token PORT_DIRECTION");
        RewriteRuleTokenStream stream_BASE_DATA_TYPE=new RewriteRuleTokenStream(adaptor,"token BASE_DATA_TYPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_doxygen_group_end=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_end");
        RewriteRuleSubtreeStream stream_data_size=new RewriteRuleSubtreeStream(adaptor,"rule data_size");
        RewriteRuleSubtreeStream stream_doxygen_param=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_param");
        RewriteRuleSubtreeStream stream_doxygen_group_begin=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_begin");
        RewriteRuleSubtreeStream stream_doxygen_group_def=new RewriteRuleSubtreeStream(adaptor,"rule doxygen_group_def");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:173:17: ( ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER -> ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:175:3: ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:175:3: ( doxygen_group_end )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==DOXYGEN_GROUP_END) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:175:3: doxygen_group_end
                    {
                    pushFollow(FOLLOW_doxygen_group_end_in_port_declaration574);
                    doxygen_group_end46=doxygen_group_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doxygen_group_end.add(doxygen_group_end46.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:176:3: ( doxygen_group_def )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOXYGEN_GROUP_DEF) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:176:3: doxygen_group_def
                    {
                    pushFollow(FOLLOW_doxygen_group_def_in_port_declaration579);
                    doxygen_group_def47=doxygen_group_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doxygen_group_def.add(doxygen_group_def47.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:177:3: ( doxygen_param )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==DOXYGEN_PARAM) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:177:3: doxygen_param
            	    {
            	    pushFollow(FOLLOW_doxygen_param_in_port_declaration584);
            	    doxygen_param48=doxygen_param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_doxygen_param.add(doxygen_param48.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:178:3: ( doxygen_group_begin )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOXYGEN_GROUP_START) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:178:3: doxygen_group_begin
                    {
                    pushFollow(FOLLOW_doxygen_group_begin_in_port_declaration589);
                    doxygen_group_begin49=doxygen_group_begin();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doxygen_group_begin.add(doxygen_group_begin49.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:181:3: ( PORT_DIRECTION )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PORT_DIRECTION) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:181:3: PORT_DIRECTION
                    {
                    PORT_DIRECTION50=(Token)match(input,PORT_DIRECTION,FOLLOW_PORT_DIRECTION_in_port_declaration600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PORT_DIRECTION.add(PORT_DIRECTION50);


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:182:3: ( BASE_DATA_TYPE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BASE_DATA_TYPE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:182:3: BASE_DATA_TYPE
                    {
                    BASE_DATA_TYPE51=(Token)match(input,BASE_DATA_TYPE,FOLLOW_BASE_DATA_TYPE_in_port_declaration605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BASE_DATA_TYPE.add(BASE_DATA_TYPE51);


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:183:3: ( data_size )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LBRACK) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:183:3: data_size
                    {
                    pushFollow(FOLLOW_data_size_in_port_declaration610);
                    data_size52=data_size();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_data_size.add(data_size52.getTree());

                    }
                    break;

            }


            IDENTIFIER53=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_declaration616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER53);


            if ( state.backtracking==0 ) {
            //    if((IDENTIFIER53!=null?IDENTIFIER53.getText():null).equals("pcie_clk"))
            //      System.out.println("Found Port "+(data_size52!=null?input.toString(data_size52.start,data_size52.stop):null));
              
            //    System.out.println("Found Port "+(IDENTIFIER53!=null?IDENTIFIER53.getText():null)+" With active group: "+currentGroup);

                  //-- Prepare the stack of params a a node
              //^(DOXY_GROUP {new CommonTree(new CommonToken(0,currentGroupActive?currentGroup:null))})
              }

            // AST REWRITE
            // elements: IDENTIFIER, BASE_DATA_TYPE, PORT_DIRECTION, doxygen_group_end, doxygen_param, doxygen_group_begin, doxygen_group_def, data_size
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 195:3: -> ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:195:6: ^( MODULE_PORT ( PORT_DIRECTION )? ( BASE_DATA_TYPE )? ( data_size )? IDENTIFIER ( doxygen_group_end )? ( doxygen_group_def )? ( doxygen_param )* ( doxygen_group_begin )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_PORT, "MODULE_PORT")
                , root_1);

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:196:9: ( PORT_DIRECTION )?
                if ( stream_PORT_DIRECTION.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_PORT_DIRECTION.nextNode()
                    );

                }
                stream_PORT_DIRECTION.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:197:9: ( BASE_DATA_TYPE )?
                if ( stream_BASE_DATA_TYPE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_BASE_DATA_TYPE.nextNode()
                    );

                }
                stream_BASE_DATA_TYPE.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:198:9: ( data_size )?
                if ( stream_data_size.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_size.nextTree());

                }
                stream_data_size.reset();

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:200:9: ( doxygen_group_end )?
                if ( stream_doxygen_group_end.hasNext() ) {
                    adaptor.addChild(root_1, stream_doxygen_group_end.nextTree());

                }
                stream_doxygen_group_end.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:201:9: ( doxygen_group_def )?
                if ( stream_doxygen_group_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_doxygen_group_def.nextTree());

                }
                stream_doxygen_group_def.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:202:9: ( doxygen_param )*
                while ( stream_doxygen_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_doxygen_param.nextTree());

                }
                stream_doxygen_param.reset();

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:203:9: ( doxygen_group_begin )?
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_instanciation"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:212:1: module_instanciation : type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI -> ^( MODULE_INSTANCE $type $name port_connections ) ;
    public final SystemVerilogFullParser.module_instanciation_return module_instanciation() throws RecognitionException {
        SystemVerilogFullParser.module_instanciation_return retval = new SystemVerilogFullParser.module_instanciation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token type=null;
        Token name=null;
        Token POUND54=null;
        Token LPAREN55=null;
        Token RPAREN57=null;
        Token LPAREN58=null;
        Token RPAREN60=null;
        Token SEMI61=null;
        SystemVerilogFullParser.parameter_connections_return parameter_connections56 =null;

        SystemVerilogFullParser.port_connections_return port_connections59 =null;


        CommonTree type_tree=null;
        CommonTree name_tree=null;
        CommonTree POUND54_tree=null;
        CommonTree LPAREN55_tree=null;
        CommonTree RPAREN57_tree=null;
        CommonTree LPAREN58_tree=null;
        CommonTree RPAREN60_tree=null;
        CommonTree SEMI61_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_POUND=new RewriteRuleTokenStream(adaptor,"token POUND");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_port_connections=new RewriteRuleSubtreeStream(adaptor,"rule port_connections");
        RewriteRuleSubtreeStream stream_parameter_connections=new RewriteRuleSubtreeStream(adaptor,"rule parameter_connections");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:212:21: (type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI -> ^( MODULE_INSTANCE $type $name port_connections ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:213:5: type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI
            {
            type=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation754); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(type);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:214:5: ( POUND LPAREN parameter_connections RPAREN )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==POUND) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:214:6: POUND LPAREN parameter_connections RPAREN
                    {
                    POUND54=(Token)match(input,POUND,FOLLOW_POUND_in_module_instanciation762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_POUND.add(POUND54);


                    LPAREN55=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_module_instanciation764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN55);


                    pushFollow(FOLLOW_parameter_connections_in_module_instanciation766);
                    parameter_connections56=parameter_connections();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_connections.add(parameter_connections56.getTree());

                    RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_module_instanciation768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN57);


                    }
                    break;

            }


            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);


            LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_module_instanciation785); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN58);


            pushFollow(FOLLOW_port_connections_in_module_instanciation787);
            port_connections59=port_connections();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_port_connections.add(port_connections59.getTree());

            RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_module_instanciation789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN60);


            SEMI61=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_instanciation791); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI61);


            if ( state.backtracking==0 ) {System.out.println("Found a module instanciation");}

            // AST REWRITE
            // elements: name, type, port_connections
            // token labels: name, type
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:24: -> ^( MODULE_INSTANCE $type $name port_connections )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:218:27: ^( MODULE_INSTANCE $type $name port_connections )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_INSTANCE, "MODULE_INSTANCE")
                , root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "port_connections"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:1: port_connections : ( port_connection )? ( COMMA port_connection )* ;
    public final SystemVerilogFullParser.port_connections_return port_connections() throws RecognitionException {
        SystemVerilogFullParser.port_connections_return retval = new SystemVerilogFullParser.port_connections_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA63=null;
        SystemVerilogFullParser.port_connection_return port_connection62 =null;

        SystemVerilogFullParser.port_connection_return port_connection64 =null;


        CommonTree COMMA63_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:17: ( ( port_connection )? ( COMMA port_connection )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:19: ( port_connection )? ( COMMA port_connection )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:19: ( port_connection )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DOT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:19: port_connection
                    {
                    pushFollow(FOLLOW_port_connection_in_port_connections863);
                    port_connection62=port_connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, port_connection62.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:36: ( COMMA port_connection )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:221:37: COMMA port_connection
            	    {
            	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_port_connections867); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA63_tree = 
            	    (CommonTree)adaptor.create(COMMA63)
            	    ;
            	    adaptor.addChild(root_0, COMMA63_tree);
            	    }

            	    pushFollow(FOLLOW_port_connection_in_port_connections869);
            	    port_connection64=port_connection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, port_connection64.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "port_connection"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:223:1: port_connection : DOT port_name= IDENTIFIER ( ( LPAREN local_connection= concatenable_expression RPAREN ) ) -> ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? ) ;
    public final SystemVerilogFullParser.port_connection_return port_connection() throws RecognitionException {
        SystemVerilogFullParser.port_connection_return retval = new SystemVerilogFullParser.port_connection_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token port_name=null;
        Token DOT65=null;
        Token LPAREN66=null;
        Token RPAREN67=null;
        SystemVerilogFullParser.concatenable_expression_return local_connection =null;


        CommonTree port_name_tree=null;
        CommonTree DOT65_tree=null;
        CommonTree LPAREN66_tree=null;
        CommonTree RPAREN67_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_concatenable_expression=new RewriteRuleSubtreeStream(adaptor,"rule concatenable_expression");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:223:17: ( DOT port_name= IDENTIFIER ( ( LPAREN local_connection= concatenable_expression RPAREN ) ) -> ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:223:19: DOT port_name= IDENTIFIER ( ( LPAREN local_connection= concatenable_expression RPAREN ) )
            {
            DOT65=(Token)match(input,DOT,FOLLOW_DOT_in_port_connection879); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT65);


            port_name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_connection902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(port_name);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:225:19: ( ( LPAREN local_connection= concatenable_expression RPAREN ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:227:20: ( LPAREN local_connection= concatenable_expression RPAREN )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:227:20: ( LPAREN local_connection= concatenable_expression RPAREN )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:227:21: LPAREN local_connection= concatenable_expression RPAREN
            {
            LPAREN66=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_port_connection952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN66);


            pushFollow(FOLLOW_concatenable_expression_in_port_connection956);
            local_connection=concatenable_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_concatenable_expression.add(local_connection.getTree());

            RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_port_connection958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN67);


            }


            }


            // AST REWRITE
            // elements: local_connection, port_name
            // token labels: port_name
            // rule labels: retval, local_connection
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_port_name=new RewriteRuleTokenStream(adaptor,"token port_name",port_name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_local_connection=new RewriteRuleSubtreeStream(adaptor,"rule local_connection",local_connection!=null?local_connection.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:19: -> ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:233:23: ^( MODULE_INSTANCE_CONNECTION $port_name ( $local_connection)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_INSTANCE_CONNECTION, "MODULE_INSTANCE_CONNECTION")
                , root_1);

                adaptor.addChild(root_1, stream_port_name.nextNode());

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:233:64: ( $local_connection)?
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_connections"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:1: parameter_connections : ( parameter_connection )? ( COMMA parameter_connection )* ;
    public final SystemVerilogFullParser.parameter_connections_return parameter_connections() throws RecognitionException {
        SystemVerilogFullParser.parameter_connections_return retval = new SystemVerilogFullParser.parameter_connections_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA69=null;
        SystemVerilogFullParser.parameter_connection_return parameter_connection68 =null;

        SystemVerilogFullParser.parameter_connection_return parameter_connection70 =null;


        CommonTree COMMA69_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:22: ( ( parameter_connection )? ( COMMA parameter_connection )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:24: ( parameter_connection )? ( COMMA parameter_connection )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:24: ( parameter_connection )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:24: parameter_connection
                    {
                    pushFollow(FOLLOW_parameter_connection_in_parameter_connections1040);
                    parameter_connection68=parameter_connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_connection68.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:46: ( COMMA parameter_connection )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:235:47: COMMA parameter_connection
            	    {
            	    COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_connections1044); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA69_tree = 
            	    (CommonTree)adaptor.create(COMMA69)
            	    ;
            	    adaptor.addChild(root_0, COMMA69_tree);
            	    }

            	    pushFollow(FOLLOW_parameter_connection_in_parameter_connections1046);
            	    parameter_connection70=parameter_connection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_connection70.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_connection"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:236:1: parameter_connection : DOT param_name= IDENTIFIER LPAREN concatenable_expression RPAREN ;
    public final SystemVerilogFullParser.parameter_connection_return parameter_connection() throws RecognitionException {
        SystemVerilogFullParser.parameter_connection_return retval = new SystemVerilogFullParser.parameter_connection_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token param_name=null;
        Token DOT71=null;
        Token LPAREN72=null;
        Token RPAREN74=null;
        SystemVerilogFullParser.concatenable_expression_return concatenable_expression73 =null;


        CommonTree param_name_tree=null;
        CommonTree DOT71_tree=null;
        CommonTree LPAREN72_tree=null;
        CommonTree RPAREN74_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:236:21: ( DOT param_name= IDENTIFIER LPAREN concatenable_expression RPAREN )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:236:23: DOT param_name= IDENTIFIER LPAREN concatenable_expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            DOT71=(Token)match(input,DOT,FOLLOW_DOT_in_parameter_connection1054); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT71_tree = 
            (CommonTree)adaptor.create(DOT71)
            ;
            adaptor.addChild(root_0, DOT71_tree);
            }

            param_name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_connection1058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            param_name_tree = 
            (CommonTree)adaptor.create(param_name)
            ;
            adaptor.addChild(root_0, param_name_tree);
            }

            LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_connection1060); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN72_tree = 
            (CommonTree)adaptor.create(LPAREN72)
            ;
            adaptor.addChild(root_0, LPAREN72_tree);
            }

            pushFollow(FOLLOW_concatenable_expression_in_parameter_connection1062);
            concatenable_expression73=concatenable_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, concatenable_expression73.getTree());

            RPAREN74=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_connection1064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN74_tree = 
            (CommonTree)adaptor.create(RPAREN74)
            ;
            adaptor.addChild(root_0, RPAREN74_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:1: variable_declaration : data_type ( data_size )? ( IDENTIFIER ( COMMA IDENTIFIER )* ) ( assign_expression )? SEMI -> ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ ) ;
    public final SystemVerilogFullParser.variable_declaration_return variable_declaration() throws RecognitionException {
        SystemVerilogFullParser.variable_declaration_return retval = new SystemVerilogFullParser.variable_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER77=null;
        Token COMMA78=null;
        Token IDENTIFIER79=null;
        Token SEMI81=null;
        SystemVerilogFullParser.data_type_return data_type75 =null;

        SystemVerilogFullParser.data_size_return data_size76 =null;

        SystemVerilogFullParser.assign_expression_return assign_expression80 =null;


        CommonTree IDENTIFIER77_tree=null;
        CommonTree COMMA78_tree=null;
        CommonTree IDENTIFIER79_tree=null;
        CommonTree SEMI81_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_assign_expression=new RewriteRuleSubtreeStream(adaptor,"rule assign_expression");
        RewriteRuleSubtreeStream stream_data_type=new RewriteRuleSubtreeStream(adaptor,"rule data_type");
        RewriteRuleSubtreeStream stream_data_size=new RewriteRuleSubtreeStream(adaptor,"rule data_size");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:21: ( data_type ( data_size )? ( IDENTIFIER ( COMMA IDENTIFIER )* ) ( assign_expression )? SEMI -> ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:23: data_type ( data_size )? ( IDENTIFIER ( COMMA IDENTIFIER )* ) ( assign_expression )? SEMI
            {
            pushFollow(FOLLOW_data_type_in_variable_declaration1073);
            data_type75=data_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_type.add(data_type75.getTree());

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:33: ( data_size )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LBRACK) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:33: data_size
                    {
                    pushFollow(FOLLOW_data_size_in_variable_declaration1075);
                    data_size76=data_size();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_data_size.add(data_size76.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:44: ( IDENTIFIER ( COMMA IDENTIFIER )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:45: IDENTIFIER ( COMMA IDENTIFIER )*
            {
            IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration1079); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER77);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:56: ( COMMA IDENTIFIER )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:57: COMMA IDENTIFIER
            	    {
            	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_variable_declaration1082); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);


            	    IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration1084); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER79);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:78: ( assign_expression )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EQUAL||LA33_0==LE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:78: assign_expression
                    {
                    pushFollow(FOLLOW_assign_expression_in_variable_declaration1090);
                    assign_expression80=assign_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assign_expression.add(assign_expression80.getTree());

                    }
                    break;

            }


            SEMI81=(Token)match(input,SEMI,FOLLOW_SEMI_in_variable_declaration1093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI81);


            // AST REWRITE
            // elements: data_size, IDENTIFIER, data_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 240:102: -> ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:105: ^( MODULE_VARIABLE data_type ( data_size )? ( IDENTIFIER )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_VARIABLE, "MODULE_VARIABLE")
                , root_1);

                adaptor.addChild(root_1, stream_data_type.nextTree());

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:240:133: ( data_size )?
                if ( stream_data_size.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_size.nextTree());

                }
                stream_data_size.reset();

                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initial_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:246:1: initial_declaration : INITIAL ( ( logic_content ) | logic_instruction ) ;
    public final SystemVerilogFullParser.initial_declaration_return initial_declaration() throws RecognitionException {
        SystemVerilogFullParser.initial_declaration_return retval = new SystemVerilogFullParser.initial_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INITIAL82=null;
        SystemVerilogFullParser.logic_content_return logic_content83 =null;

        SystemVerilogFullParser.logic_instruction_return logic_instruction84 =null;


        CommonTree INITIAL82_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:246:20: ( INITIAL ( ( logic_content ) | logic_instruction ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:247:3: INITIAL ( ( logic_content ) | logic_instruction )
            {
            root_0 = (CommonTree)adaptor.nil();


            INITIAL82=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_initial_declaration1122); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INITIAL82_tree = 
            (CommonTree)adaptor.create(INITIAL82)
            ;
            adaptor.addChild(root_0, INITIAL82_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:247:11: ( ( logic_content ) | logic_instruction )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BEGIN) ) {
                alt34=1;
            }
            else if ( ((LA34_0 >= IDENTIFIER && LA34_0 <= IF)) ) {
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
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:247:13: ( logic_content )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:247:13: ( logic_content )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:247:15: logic_content
                    {
                    pushFollow(FOLLOW_logic_content_in_initial_declaration1128);
                    logic_content83=logic_content();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_content83.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:247:34: logic_instruction
                    {
                    pushFollow(FOLLOW_logic_instruction_in_initial_declaration1135);
                    logic_instruction84=logic_instruction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction84.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "always_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:249:1: always_declaration : ALWAYS ( AT LPAREN ( sensitivity_list ) RPAREN )? ( ( logic_instruction | ( logic_content ) ) ) ;
    public final SystemVerilogFullParser.always_declaration_return always_declaration() throws RecognitionException {
        SystemVerilogFullParser.always_declaration_return retval = new SystemVerilogFullParser.always_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALWAYS85=null;
        Token AT86=null;
        Token LPAREN87=null;
        Token RPAREN89=null;
        SystemVerilogFullParser.sensitivity_list_return sensitivity_list88 =null;

        SystemVerilogFullParser.logic_instruction_return logic_instruction90 =null;

        SystemVerilogFullParser.logic_content_return logic_content91 =null;


        CommonTree ALWAYS85_tree=null;
        CommonTree AT86_tree=null;
        CommonTree LPAREN87_tree=null;
        CommonTree RPAREN89_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:249:19: ( ALWAYS ( AT LPAREN ( sensitivity_list ) RPAREN )? ( ( logic_instruction | ( logic_content ) ) ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:253:3: ALWAYS ( AT LPAREN ( sensitivity_list ) RPAREN )? ( ( logic_instruction | ( logic_content ) ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            ALWAYS85=(Token)match(input,ALWAYS,FOLLOW_ALWAYS_in_always_declaration1154); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALWAYS85_tree = 
            (CommonTree)adaptor.create(ALWAYS85)
            ;
            adaptor.addChild(root_0, ALWAYS85_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:253:10: ( AT LPAREN ( sensitivity_list ) RPAREN )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==AT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:253:11: AT LPAREN ( sensitivity_list ) RPAREN
                    {
                    AT86=(Token)match(input,AT,FOLLOW_AT_in_always_declaration1157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT86_tree = 
                    (CommonTree)adaptor.create(AT86)
                    ;
                    adaptor.addChild(root_0, AT86_tree);
                    }

                    LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_always_declaration1159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN87_tree = 
                    (CommonTree)adaptor.create(LPAREN87)
                    ;
                    adaptor.addChild(root_0, LPAREN87_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:253:21: ( sensitivity_list )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:253:22: sensitivity_list
                    {
                    pushFollow(FOLLOW_sensitivity_list_in_always_declaration1162);
                    sensitivity_list88=sensitivity_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sensitivity_list88.getTree());

                    }


                    RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_always_declaration1165); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN89_tree = 
                    (CommonTree)adaptor.create(RPAREN89)
                    ;
                    adaptor.addChild(root_0, RPAREN89_tree);
                    }

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:254:3: ( ( logic_instruction | ( logic_content ) ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:255:6: ( logic_instruction | ( logic_content ) )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:255:6: ( logic_instruction | ( logic_content ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= IDENTIFIER && LA36_0 <= IF)) ) {
                alt36=1;
            }
            else if ( (LA36_0==BEGIN) ) {
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
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:255:8: logic_instruction
                    {
                    pushFollow(FOLLOW_logic_instruction_in_always_declaration1180);
                    logic_instruction90=logic_instruction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction90.getTree());

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:255:28: ( logic_content )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:255:28: ( logic_content )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:255:30: logic_content
                    {
                    pushFollow(FOLLOW_logic_content_in_always_declaration1186);
                    logic_content91=logic_content();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_content91.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_declaration"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:258:1: assign_declaration : ASSIGN IDENTIFIER assign_expression SEMI ;
    public final SystemVerilogFullParser.assign_declaration_return assign_declaration() throws RecognitionException {
        SystemVerilogFullParser.assign_declaration_return retval = new SystemVerilogFullParser.assign_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASSIGN92=null;
        Token IDENTIFIER93=null;
        Token SEMI95=null;
        SystemVerilogFullParser.assign_expression_return assign_expression94 =null;


        CommonTree ASSIGN92_tree=null;
        CommonTree IDENTIFIER93_tree=null;
        CommonTree SEMI95_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:258:19: ( ASSIGN IDENTIFIER assign_expression SEMI )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:260:3: ASSIGN IDENTIFIER assign_expression SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            ASSIGN92=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_declaration1206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN92_tree = 
            (CommonTree)adaptor.create(ASSIGN92)
            ;
            adaptor.addChild(root_0, ASSIGN92_tree);
            }

            IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign_declaration1208); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER93_tree = 
            (CommonTree)adaptor.create(IDENTIFIER93)
            ;
            adaptor.addChild(root_0, IDENTIFIER93_tree);
            }

            pushFollow(FOLLOW_assign_expression_in_assign_declaration1210);
            assign_expression94=assign_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expression94.getTree());

            SEMI95=(Token)match(input,SEMI,FOLLOW_SEMI_in_assign_declaration1212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI95_tree = 
            (CommonTree)adaptor.create(SEMI95)
            ;
            adaptor.addChild(root_0, SEMI95_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_expression"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:265:1: assign_expression : ( EQUAL | LE ) ( concatenable_expression ) ;
    public final SystemVerilogFullParser.assign_expression_return assign_expression() throws RecognitionException {
        SystemVerilogFullParser.assign_expression_return retval = new SystemVerilogFullParser.assign_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set96=null;
        SystemVerilogFullParser.concatenable_expression_return concatenable_expression97 =null;


        CommonTree set96_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:265:18: ( ( EQUAL | LE ) ( concatenable_expression ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:266:2: ( EQUAL | LE ) ( concatenable_expression )
            {
            root_0 = (CommonTree)adaptor.nil();


            set96=(Token)input.LT(1);

            if ( input.LA(1)==EQUAL||input.LA(1)==LE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set96)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:267:3: ( concatenable_expression )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:270:7: concatenable_expression
            {
            pushFollow(FOLLOW_concatenable_expression_in_assign_expression1253);
            concatenable_expression97=concatenable_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, concatenable_expression97.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_content"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:276:1: logic_content : BEGIN ( logic_instruction )* END ;
    public final SystemVerilogFullParser.logic_content_return logic_content() throws RecognitionException {
        SystemVerilogFullParser.logic_content_return retval = new SystemVerilogFullParser.logic_content_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BEGIN98=null;
        Token END100=null;
        SystemVerilogFullParser.logic_instruction_return logic_instruction99 =null;


        CommonTree BEGIN98_tree=null;
        CommonTree END100_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:276:14: ( BEGIN ( logic_instruction )* END )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:277:3: BEGIN ( logic_instruction )* END
            {
            root_0 = (CommonTree)adaptor.nil();


            BEGIN98=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_logic_content1270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BEGIN98_tree = 
            (CommonTree)adaptor.create(BEGIN98)
            ;
            adaptor.addChild(root_0, BEGIN98_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:278:5: ( logic_instruction )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= IDENTIFIER && LA37_0 <= IF)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:278:5: logic_instruction
            	    {
            	    pushFollow(FOLLOW_logic_instruction_in_logic_content1276);
            	    logic_instruction99=logic_instruction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction99.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            END100=(Token)match(input,END,FOLLOW_END_in_logic_content1281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END100_tree = 
            (CommonTree)adaptor.create(END100)
            ;
            adaptor.addChild(root_0, END100_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_instruction"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:284:1: logic_instruction : ( single_instruction | decision_ifelse );
    public final SystemVerilogFullParser.logic_instruction_return logic_instruction() throws RecognitionException {
        SystemVerilogFullParser.logic_instruction_return retval = new SystemVerilogFullParser.logic_instruction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SystemVerilogFullParser.single_instruction_return single_instruction101 =null;

        SystemVerilogFullParser.decision_ifelse_return decision_ifelse102 =null;



        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:285:3: ( single_instruction | decision_ifelse )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENTIFIER) ) {
                alt38=1;
            }
            else if ( (LA38_0==IF) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:286:3: single_instruction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_single_instruction_in_logic_instruction1295);
                    single_instruction101=single_instruction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction101.getTree());

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:287:5: decision_ifelse
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_decision_ifelse_in_logic_instruction1301);
                    decision_ifelse102=decision_ifelse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_ifelse102.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_instruction"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:294:1: single_instruction : IDENTIFIER assign_expression SEMI ;
    public final SystemVerilogFullParser.single_instruction_return single_instruction() throws RecognitionException {
        SystemVerilogFullParser.single_instruction_return retval = new SystemVerilogFullParser.single_instruction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER103=null;
        Token SEMI105=null;
        SystemVerilogFullParser.assign_expression_return assign_expression104 =null;


        CommonTree IDENTIFIER103_tree=null;
        CommonTree SEMI105_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:294:19: ( IDENTIFIER assign_expression SEMI )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:294:21: IDENTIFIER assign_expression SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER103=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_single_instruction1315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER103_tree = 
            (CommonTree)adaptor.create(IDENTIFIER103)
            ;
            adaptor.addChild(root_0, IDENTIFIER103_tree);
            }

            pushFollow(FOLLOW_assign_expression_in_single_instruction1317);
            assign_expression104=assign_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expression104.getTree());

            SEMI105=(Token)match(input,SEMI,FOLLOW_SEMI_in_single_instruction1319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI105_tree = 
            (CommonTree)adaptor.create(SEMI105)
            ;
            adaptor.addChild(root_0, SEMI105_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decision_if"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:297:1: decision_if : IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) ;
    public final SystemVerilogFullParser.decision_if_return decision_if() throws RecognitionException {
        SystemVerilogFullParser.decision_if_return retval = new SystemVerilogFullParser.decision_if_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF106=null;
        Token LPAREN107=null;
        Token RPAREN109=null;
        Token BEGIN112=null;
        Token END115=null;
        SystemVerilogFullParser.expression_return expression108 =null;

        SystemVerilogFullParser.decision_if_return decision_if110 =null;

        SystemVerilogFullParser.single_instruction_return single_instruction111 =null;

        SystemVerilogFullParser.decision_if_return decision_if113 =null;

        SystemVerilogFullParser.single_instruction_return single_instruction114 =null;


        CommonTree IF106_tree=null;
        CommonTree LPAREN107_tree=null;
        CommonTree RPAREN109_tree=null;
        CommonTree BEGIN112_tree=null;
        CommonTree END115_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:297:12: ( IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:298:3: IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            IF106=(Token)match(input,IF,FOLLOW_IF_in_decision_if1329); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF106_tree = 
            (CommonTree)adaptor.create(IF106)
            ;
            adaptor.addChild(root_0, IF106_tree);
            }

            LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decision_if1331); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN107_tree = 
            (CommonTree)adaptor.create(LPAREN107)
            ;
            adaptor.addChild(root_0, LPAREN107_tree);
            }

            pushFollow(FOLLOW_expression_in_decision_if1333);
            expression108=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression108.getTree());

            RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decision_if1335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN109_tree = 
            (CommonTree)adaptor.create(RPAREN109)
            ;
            adaptor.addChild(root_0, RPAREN109_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:299:3: ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IF) && (synpred1_SystemVerilogFull())) {
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
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:300:5: ( decision_if )=> decision_if
                    {
                    pushFollow(FOLLOW_decision_if_in_decision_if1352);
                    decision_if110=decision_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if110.getTree());

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:301:7: single_instruction
                    {
                    pushFollow(FOLLOW_single_instruction_in_decision_if1360);
                    single_instruction111=single_instruction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction111.getTree());

                    }
                    break;
                case 3 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:302:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:302:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:303:9: BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END
                    {
                    BEGIN112=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_decision_if1378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BEGIN112_tree = 
                    (CommonTree)adaptor.create(BEGIN112)
                    ;
                    adaptor.addChild(root_0, BEGIN112_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:304:11: ( ( decision_if )=> decision_if | single_instruction )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==IF) && (synpred2_SystemVerilogFull())) {
                            alt39=1;
                        }
                        else if ( (LA39_0==IDENTIFIER) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:305:13: ( decision_if )=> decision_if
                    	    {
                    	    pushFollow(FOLLOW_decision_if_in_decision_if1411);
                    	    decision_if113=decision_if();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if113.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:306:15: single_instruction
                    	    {
                    	    pushFollow(FOLLOW_single_instruction_in_decision_if1427);
                    	    single_instruction114=single_instruction();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    END115=(Token)match(input,END,FOLLOW_END_in_decision_if1450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END115_tree = 
                    (CommonTree)adaptor.create(END115)
                    ;
                    adaptor.addChild(root_0, END115_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decision_elseif"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:316:1: decision_elseif : ELSE IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) ;
    public final SystemVerilogFullParser.decision_elseif_return decision_elseif() throws RecognitionException {
        SystemVerilogFullParser.decision_elseif_return retval = new SystemVerilogFullParser.decision_elseif_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE116=null;
        Token IF117=null;
        Token LPAREN118=null;
        Token RPAREN120=null;
        Token BEGIN123=null;
        Token END126=null;
        SystemVerilogFullParser.expression_return expression119 =null;

        SystemVerilogFullParser.decision_if_return decision_if121 =null;

        SystemVerilogFullParser.single_instruction_return single_instruction122 =null;

        SystemVerilogFullParser.decision_if_return decision_if124 =null;

        SystemVerilogFullParser.single_instruction_return single_instruction125 =null;


        CommonTree ELSE116_tree=null;
        CommonTree IF117_tree=null;
        CommonTree LPAREN118_tree=null;
        CommonTree RPAREN120_tree=null;
        CommonTree BEGIN123_tree=null;
        CommonTree END126_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:316:16: ( ELSE IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:317:3: ELSE IF LPAREN expression RPAREN ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            ELSE116=(Token)match(input,ELSE,FOLLOW_ELSE_in_decision_elseif1477); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE116_tree = 
            (CommonTree)adaptor.create(ELSE116)
            ;
            adaptor.addChild(root_0, ELSE116_tree);
            }

            IF117=(Token)match(input,IF,FOLLOW_IF_in_decision_elseif1479); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF117_tree = 
            (CommonTree)adaptor.create(IF117)
            ;
            adaptor.addChild(root_0, IF117_tree);
            }

            LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decision_elseif1481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN118_tree = 
            (CommonTree)adaptor.create(LPAREN118)
            ;
            adaptor.addChild(root_0, LPAREN118_tree);
            }

            pushFollow(FOLLOW_expression_in_decision_elseif1483);
            expression119=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression119.getTree());

            RPAREN120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decision_elseif1485); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN120_tree = 
            (CommonTree)adaptor.create(RPAREN120)
            ;
            adaptor.addChild(root_0, RPAREN120_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:318:3: ( ( decision_if )=> decision_if | single_instruction | ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==IF) && (synpred3_SystemVerilogFull())) {
                alt42=1;
            }
            else if ( (LA42_0==IDENTIFIER) ) {
                alt42=2;
            }
            else if ( (LA42_0==BEGIN) ) {
                alt42=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:319:5: ( decision_if )=> decision_if
                    {
                    pushFollow(FOLLOW_decision_if_in_decision_elseif1502);
                    decision_if121=decision_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if121.getTree());

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:320:7: single_instruction
                    {
                    pushFollow(FOLLOW_single_instruction_in_decision_elseif1510);
                    single_instruction122=single_instruction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction122.getTree());

                    }
                    break;
                case 3 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:321:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:321:7: ( BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:322:9: BEGIN ( ( decision_if )=> decision_if | single_instruction )+ END
                    {
                    BEGIN123=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_decision_elseif1528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BEGIN123_tree = 
                    (CommonTree)adaptor.create(BEGIN123)
                    ;
                    adaptor.addChild(root_0, BEGIN123_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:323:11: ( ( decision_if )=> decision_if | single_instruction )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==IF) && (synpred4_SystemVerilogFull())) {
                            alt41=1;
                        }
                        else if ( (LA41_0==IDENTIFIER) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:324:13: ( decision_if )=> decision_if
                    	    {
                    	    pushFollow(FOLLOW_decision_if_in_decision_elseif1561);
                    	    decision_if124=decision_if();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if124.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:325:15: single_instruction
                    	    {
                    	    pushFollow(FOLLOW_single_instruction_in_decision_elseif1577);
                    	    single_instruction125=single_instruction();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    END126=(Token)match(input,END,FOLLOW_END_in_decision_elseif1600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END126_tree = 
                    (CommonTree)adaptor.create(END126)
                    ;
                    adaptor.addChild(root_0, END126_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decision_else"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:332:1: decision_else : ELSE ( ( BEGIN ( logic_instruction )* END ) | single_instruction ) ;
    public final SystemVerilogFullParser.decision_else_return decision_else() throws RecognitionException {
        SystemVerilogFullParser.decision_else_return retval = new SystemVerilogFullParser.decision_else_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE127=null;
        Token BEGIN128=null;
        Token END130=null;
        SystemVerilogFullParser.logic_instruction_return logic_instruction129 =null;

        SystemVerilogFullParser.single_instruction_return single_instruction131 =null;


        CommonTree ELSE127_tree=null;
        CommonTree BEGIN128_tree=null;
        CommonTree END130_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:332:14: ( ELSE ( ( BEGIN ( logic_instruction )* END ) | single_instruction ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:333:3: ELSE ( ( BEGIN ( logic_instruction )* END ) | single_instruction )
            {
            root_0 = (CommonTree)adaptor.nil();


            ELSE127=(Token)match(input,ELSE,FOLLOW_ELSE_in_decision_else1624); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE127_tree = 
            (CommonTree)adaptor.create(ELSE127)
            ;
            adaptor.addChild(root_0, ELSE127_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:5: ( ( BEGIN ( logic_instruction )* END ) | single_instruction )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==BEGIN) ) {
                alt44=1;
            }
            else if ( (LA44_0==IDENTIFIER) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:7: ( BEGIN ( logic_instruction )* END )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:7: ( BEGIN ( logic_instruction )* END )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:8: BEGIN ( logic_instruction )* END
                    {
                    BEGIN128=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_decision_else1634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BEGIN128_tree = 
                    (CommonTree)adaptor.create(BEGIN128)
                    ;
                    adaptor.addChild(root_0, BEGIN128_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:14: ( logic_instruction )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0 >= IDENTIFIER && LA43_0 <= IF)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:14: logic_instruction
                    	    {
                    	    pushFollow(FOLLOW_logic_instruction_in_decision_else1636);
                    	    logic_instruction129=logic_instruction();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic_instruction129.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    END130=(Token)match(input,END,FOLLOW_END_in_decision_else1639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END130_tree = 
                    (CommonTree)adaptor.create(END130)
                    ;
                    adaptor.addChild(root_0, END130_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:334:40: single_instruction
                    {
                    pushFollow(FOLLOW_single_instruction_in_decision_else1644);
                    single_instruction131=single_instruction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_instruction131.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decision_ifelse"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:338:1: decision_ifelse : decision_if ( decision_elseif )* ( decision_else )? ;
    public final SystemVerilogFullParser.decision_ifelse_return decision_ifelse() throws RecognitionException {
        SystemVerilogFullParser.decision_ifelse_return retval = new SystemVerilogFullParser.decision_ifelse_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SystemVerilogFullParser.decision_if_return decision_if132 =null;

        SystemVerilogFullParser.decision_elseif_return decision_elseif133 =null;

        SystemVerilogFullParser.decision_else_return decision_else134 =null;



        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:338:16: ( decision_if ( decision_elseif )* ( decision_else )? )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:339:3: decision_if ( decision_elseif )* ( decision_else )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_decision_if_in_decision_ifelse1660);
            decision_if132=decision_if();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_if132.getTree());

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:340:3: ( decision_elseif )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ELSE) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==IF) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:340:3: decision_elseif
            	    {
            	    pushFollow(FOLLOW_decision_elseif_in_decision_ifelse1664);
            	    decision_elseif133=decision_elseif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_elseif133.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:341:3: ( decision_else )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ELSE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:341:3: decision_else
                    {
                    pushFollow(FOLLOW_decision_else_in_decision_ifelse1669);
                    decision_else134=decision_else();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decision_else134.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_type"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:347:1: data_type : ( BASE_DATA_TYPE | SV_DATA_TYPE );
    public final SystemVerilogFullParser.data_type_return data_type() throws RecognitionException {
        SystemVerilogFullParser.data_type_return retval = new SystemVerilogFullParser.data_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set135=null;

        CommonTree set135_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:347:10: ( BASE_DATA_TYPE | SV_DATA_TYPE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set135=(Token)input.LT(1);

            if ( input.LA(1)==BASE_DATA_TYPE||input.LA(1)==SV_DATA_TYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set135)
                );
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_size"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:349:1: data_size : ( LBRACK size_def COLON NUMBER RBRACK ) -> ^( DATA_SIZE size_def ) ;
    public final SystemVerilogFullParser.data_size_return data_size() throws RecognitionException {
        SystemVerilogFullParser.data_size_return retval = new SystemVerilogFullParser.data_size_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LBRACK136=null;
        Token COLON138=null;
        Token NUMBER139=null;
        Token RBRACK140=null;
        SystemVerilogFullParser.size_def_return size_def137 =null;


        CommonTree LBRACK136_tree=null;
        CommonTree COLON138_tree=null;
        CommonTree NUMBER139_tree=null;
        CommonTree RBRACK140_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_size_def=new RewriteRuleSubtreeStream(adaptor,"rule size_def");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:349:11: ( ( LBRACK size_def COLON NUMBER RBRACK ) -> ^( DATA_SIZE size_def ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:349:13: ( LBRACK size_def COLON NUMBER RBRACK )
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:349:13: ( LBRACK size_def COLON NUMBER RBRACK )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:349:14: LBRACK size_def COLON NUMBER RBRACK
            {
            LBRACK136=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_data_size1694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK136);


            pushFollow(FOLLOW_size_def_in_data_size1696);
            size_def137=size_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_size_def.add(size_def137.getTree());

            COLON138=(Token)match(input,COLON,FOLLOW_COLON_in_data_size1698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON138);


            NUMBER139=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_data_size1700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER139);


            RBRACK140=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_data_size1702); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK140);


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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 349:51: -> ^( DATA_SIZE size_def )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:349:54: ^( DATA_SIZE size_def )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DATA_SIZE, "DATA_SIZE")
                , root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "size_def"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:351:1: size_def : expression -> ^( EXPRESSION expression ^( TEXT ) ) ;
    public final SystemVerilogFullParser.size_def_return size_def() throws RecognitionException {
        SystemVerilogFullParser.size_def_return retval = new SystemVerilogFullParser.size_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SystemVerilogFullParser.expression_return expression141 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:351:10: ( expression -> ^( EXPRESSION expression ^( TEXT ) ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:352:9: expression
            {
            pushFollow(FOLLOW_expression_in_size_def1729);
            expression141=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression141.getTree());

            if ( state.backtracking==0 ) {
                      //System.out.println("Found Expression in parser: "+(expression141!=null?input.toString(expression141.start,expression141.stop):null));
                    
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 357:9: -> ^( EXPRESSION expression ^( TEXT ) )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:357:12: ^( EXPRESSION expression ^( TEXT ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPRESSION, "EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:357:36: ^( TEXT )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEXT, "TEXT")
                , root_2);

                adaptor.addChild(root_2, new CommonTree(new CommonToken(0,(expression141!=null?input.toString(expression141.start,expression141.stop):null))));

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concatenable_expression"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:363:1: concatenable_expression : ( ( LCURLY expression ( COMMA expression )* RCURLY ) | expression );
    public final SystemVerilogFullParser.concatenable_expression_return concatenable_expression() throws RecognitionException {
        SystemVerilogFullParser.concatenable_expression_return retval = new SystemVerilogFullParser.concatenable_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LCURLY142=null;
        Token COMMA144=null;
        Token RCURLY146=null;
        SystemVerilogFullParser.expression_return expression143 =null;

        SystemVerilogFullParser.expression_return expression145 =null;

        SystemVerilogFullParser.expression_return expression147 =null;


        CommonTree LCURLY142_tree=null;
        CommonTree COMMA144_tree=null;
        CommonTree RCURLY146_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:363:24: ( ( LCURLY expression ( COMMA expression )* RCURLY ) | expression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LCURLY) ) {
                alt48=1;
            }
            else if ( (LA48_0==BAND||(LA48_0 >= BNOT && LA48_0 <= BOR)||(LA48_0 >= BUS_VALUE && LA48_0 <= COMMA)||LA48_0==DIV||LA48_0==EQ||LA48_0==EXE_QUOTE||LA48_0==GE||(LA48_0 >= GT && LA48_0 <= IDENTIFIER)||LA48_0==LAND||(LA48_0 >= LE && LA48_0 <= MINUS)||LA48_0==NEWLINE||LA48_0==NUMBER||LA48_0==PLUS||LA48_0==QUESTION||LA48_0==RCURLY||(LA48_0 >= RPAREN && LA48_0 <= SEMI)||LA48_0==STAR) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:364:3: ( LCURLY expression ( COMMA expression )* RCURLY )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:364:3: ( LCURLY expression ( COMMA expression )* RCURLY )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:364:4: LCURLY expression ( COMMA expression )* RCURLY
                    {
                    LCURLY142=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_concatenable_expression1777); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LCURLY142_tree = 
                    (CommonTree)adaptor.create(LCURLY142)
                    ;
                    adaptor.addChild(root_0, LCURLY142_tree);
                    }

                    pushFollow(FOLLOW_expression_in_concatenable_expression1779);
                    expression143=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:364:22: ( COMMA expression )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==COMMA) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:364:23: COMMA expression
                    	    {
                    	    COMMA144=(Token)match(input,COMMA,FOLLOW_COMMA_in_concatenable_expression1782); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA144_tree = 
                    	    (CommonTree)adaptor.create(COMMA144)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA144_tree);
                    	    }

                    	    pushFollow(FOLLOW_expression_in_concatenable_expression1784);
                    	    expression145=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression145.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    RCURLY146=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_concatenable_expression1788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RCURLY146_tree = 
                    (CommonTree)adaptor.create(RCURLY146)
                    ;
                    adaptor.addChild(root_0, RCURLY146_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:365:5: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_concatenable_expression1796);
                    expression147=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression147.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:367:1: expression : ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )? ;
    public final SystemVerilogFullParser.expression_return expression() throws RecognitionException {
        SystemVerilogFullParser.expression_return retval = new SystemVerilogFullParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN148=null;
        Token RPAREN150=null;
        SystemVerilogFullParser.expression_return expression149 =null;

        SystemVerilogFullParser.expression_operand_return expression_operand151 =null;

        SystemVerilogFullParser.expression_operator_return expression_operator152 =null;

        SystemVerilogFullParser.expression_return expression153 =null;


        CommonTree LPAREN148_tree=null;
        CommonTree RPAREN150_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:367:11: ( ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )? )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:3: ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:3: ( ( LPAREN expression RPAREN ) | expression_operand )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LPAREN) ) {
                alt49=1;
            }
            else if ( (LA49_0==BUS_VALUE||LA49_0==EXE_QUOTE||LA49_0==IDENTIFIER||LA49_0==NUMBER) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:4: ( LPAREN expression RPAREN )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:4: ( LPAREN expression RPAREN )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:5: LPAREN expression RPAREN
                    {
                    LPAREN148=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expression1810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN148_tree = 
                    (CommonTree)adaptor.create(LPAREN148)
                    ;
                    adaptor.addChild(root_0, LPAREN148_tree);
                    }

                    pushFollow(FOLLOW_expression_in_expression1812);
                    expression149=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());

                    RPAREN150=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expression1814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN150_tree = 
                    (CommonTree)adaptor.create(RPAREN150)
                    ;
                    adaptor.addChild(root_0, RPAREN150_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:33: expression_operand
                    {
                    pushFollow(FOLLOW_expression_operand_in_expression1819);
                    expression_operand151=expression_operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_operand151.getTree());

                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:55: ( expression_operator expression )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COLON) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==NUMBER) ) {
                    int LA50_4 = input.LA(3);

                    if ( (LA50_4==BAND||(LA50_4 >= BNOT && LA50_4 <= BOR)||(LA50_4 >= BXNOR && LA50_4 <= COMMA)||LA50_4==DIV||LA50_4==EQ||LA50_4==GE||LA50_4==GT||LA50_4==LAND||(LA50_4 >= LE && LA50_4 <= LOR)||(LA50_4 >= LT && LA50_4 <= MINUS)||LA50_4==NEWLINE||LA50_4==PLUS||LA50_4==QUESTION||LA50_4==RCURLY||(LA50_4 >= RPAREN && LA50_4 <= SEMI)||LA50_4==STAR) ) {
                        alt50=1;
                    }
                }
                else if ( (LA50_1==BAND||(LA50_1 >= BNOT && LA50_1 <= BOR)||(LA50_1 >= BUS_VALUE && LA50_1 <= COMMA)||LA50_1==DIV||LA50_1==EQ||LA50_1==EXE_QUOTE||LA50_1==GE||(LA50_1 >= GT && LA50_1 <= IDENTIFIER)||LA50_1==LAND||(LA50_1 >= LE && LA50_1 <= MINUS)||LA50_1==NEWLINE||LA50_1==PLUS||LA50_1==QUESTION||LA50_1==RCURLY||(LA50_1 >= RPAREN && LA50_1 <= SEMI)||LA50_1==STAR) ) {
                    alt50=1;
                }
            }
            else if ( (LA50_0==BAND||(LA50_0 >= BNOT && LA50_0 <= BOR)||(LA50_0 >= BXNOR && LA50_0 <= BXOR)||LA50_0==DIV||LA50_0==EQ||LA50_0==GE||LA50_0==GT||LA50_0==LAND||(LA50_0 >= LE && LA50_0 <= LOR)||(LA50_0 >= LT && LA50_0 <= MINUS)||LA50_0==PLUS||LA50_0==QUESTION||LA50_0==STAR) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:368:56: expression_operator expression
                    {
                    pushFollow(FOLLOW_expression_operator_in_expression1825);
                    expression_operator152=expression_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_operator152.getTree());

                    pushFollow(FOLLOW_expression_in_expression1827);
                    expression153=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression153.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_operand"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:1: expression_operand : ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | ( EXE_QUOTE IDENTIFIER ) | NUMBER | typed_value );
    public final SystemVerilogFullParser.expression_operand_return expression_operand() throws RecognitionException {
        SystemVerilogFullParser.expression_operand_return retval = new SystemVerilogFullParser.expression_operand_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER154=null;
        Token LBRACK155=null;
        Token NUMBER156=null;
        Token RBRACK157=null;
        Token EXE_QUOTE158=null;
        Token IDENTIFIER159=null;
        Token NUMBER160=null;
        SystemVerilogFullParser.typed_value_return typed_value161 =null;


        CommonTree IDENTIFIER154_tree=null;
        CommonTree LBRACK155_tree=null;
        CommonTree NUMBER156_tree=null;
        CommonTree RBRACK157_tree=null;
        CommonTree EXE_QUOTE158_tree=null;
        CommonTree IDENTIFIER159_tree=null;
        CommonTree NUMBER160_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:20: ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | ( EXE_QUOTE IDENTIFIER ) | NUMBER | typed_value )
            int alt52=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt52=1;
                }
                break;
            case EXE_QUOTE:
                {
                alt52=2;
                }
                break;
            case NUMBER:
                {
                alt52=3;
                }
                break;
            case BUS_VALUE:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:22: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:22: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:23: IDENTIFIER ( LBRACK NUMBER RBRACK )?
                    {
                    IDENTIFIER154=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand1838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER154_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER154)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER154_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:34: ( LBRACK NUMBER RBRACK )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==LBRACK) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:35: LBRACK NUMBER RBRACK
                            {
                            LBRACK155=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_expression_operand1841); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LBRACK155_tree = 
                            (CommonTree)adaptor.create(LBRACK155)
                            ;
                            adaptor.addChild(root_0, LBRACK155_tree);
                            }

                            NUMBER156=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand1843); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NUMBER156_tree = 
                            (CommonTree)adaptor.create(NUMBER156)
                            ;
                            adaptor.addChild(root_0, NUMBER156_tree);
                            }

                            RBRACK157=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_expression_operand1845); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            RBRACK157_tree = 
                            (CommonTree)adaptor.create(RBRACK157)
                            ;
                            adaptor.addChild(root_0, RBRACK157_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:61: ( EXE_QUOTE IDENTIFIER )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:61: ( EXE_QUOTE IDENTIFIER )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:62: EXE_QUOTE IDENTIFIER
                    {
                    EXE_QUOTE158=(Token)match(input,EXE_QUOTE,FOLLOW_EXE_QUOTE_in_expression_operand1853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXE_QUOTE158_tree = 
                    (CommonTree)adaptor.create(EXE_QUOTE158)
                    ;
                    adaptor.addChild(root_0, EXE_QUOTE158_tree);
                    }

                    IDENTIFIER159=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand1855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER159_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER159)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER159_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:85: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER160=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand1859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER160_tree = 
                    (CommonTree)adaptor.create(NUMBER160)
                    ;
                    adaptor.addChild(root_0, NUMBER160_tree);
                    }

                    }
                    break;
                case 4 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:370:94: typed_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_typed_value_in_expression_operand1863);
                    typed_value161=typed_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typed_value161.getTree());

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_operator"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:371:1: expression_operator : ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE );
    public final SystemVerilogFullParser.expression_operator_return expression_operator() throws RecognitionException {
        SystemVerilogFullParser.expression_operator_return retval = new SystemVerilogFullParser.expression_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set162=null;

        CommonTree set162_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:371:20: ( DIV | PLUS | MINUS | LAND | BOR | BAND | BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set162=(Token)input.LT(1);

            if ( input.LA(1)==BAND||(input.LA(1) >= BNOT && input.LA(1) <= BOR)||(input.LA(1) >= BXNOR && input.LA(1) <= COLON)||input.LA(1)==DIV||input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LAND||(input.LA(1) >= LE && input.LA(1) <= LOR)||(input.LA(1) >= LT && input.LA(1) <= MINUS)||input.LA(1)==PLUS||input.LA(1)==QUESTION||input.LA(1)==STAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set162)
                );
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typed_value"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:376:1: typed_value : BUS_VALUE ;
    public final SystemVerilogFullParser.typed_value_return typed_value() throws RecognitionException {
        SystemVerilogFullParser.typed_value_return retval = new SystemVerilogFullParser.typed_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUS_VALUE163=null;

        CommonTree BUS_VALUE163_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:376:12: ( BUS_VALUE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:376:14: BUS_VALUE
            {
            root_0 = (CommonTree)adaptor.nil();


            BUS_VALUE163=(Token)match(input,BUS_VALUE,FOLLOW_BUS_VALUE_in_typed_value1955); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BUS_VALUE163_tree = 
            (CommonTree)adaptor.create(BUS_VALUE163)
            ;
            adaptor.addChild(root_0, BUS_VALUE163_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sensitivity_list"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:382:1: sensitivity_list : sensitivity ( ( OR ) sensitivity )* ;
    public final SystemVerilogFullParser.sensitivity_list_return sensitivity_list() throws RecognitionException {
        SystemVerilogFullParser.sensitivity_list_return retval = new SystemVerilogFullParser.sensitivity_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR165=null;
        SystemVerilogFullParser.sensitivity_return sensitivity164 =null;

        SystemVerilogFullParser.sensitivity_return sensitivity166 =null;


        CommonTree OR165_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:382:17: ( sensitivity ( ( OR ) sensitivity )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:384:3: sensitivity ( ( OR ) sensitivity )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sensitivity_in_sensitivity_list1970);
            sensitivity164=sensitivity();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sensitivity164.getTree());

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:384:15: ( ( OR ) sensitivity )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==OR) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:384:17: ( OR ) sensitivity
            	    {
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:384:17: ( OR )
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:384:18: OR
            	    {
            	    OR165=(Token)match(input,OR,FOLLOW_OR_in_sensitivity_list1975); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR165_tree = 
            	    (CommonTree)adaptor.create(OR165)
            	    ;
            	    adaptor.addChild(root_0, OR165_tree);
            	    }

            	    }


            	    pushFollow(FOLLOW_sensitivity_in_sensitivity_list1978);
            	    sensitivity166=sensitivity();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sensitivity166.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sensitivity"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:389:1: sensitivity : ( POSEDGE | NEGEDGE ) IDENTIFIER ;
    public final SystemVerilogFullParser.sensitivity_return sensitivity() throws RecognitionException {
        SystemVerilogFullParser.sensitivity_return retval = new SystemVerilogFullParser.sensitivity_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set167=null;
        Token IDENTIFIER168=null;

        CommonTree set167_tree=null;
        CommonTree IDENTIFIER168_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:389:12: ( ( POSEDGE | NEGEDGE ) IDENTIFIER )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:390:3: ( POSEDGE | NEGEDGE ) IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            set167=(Token)input.LT(1);

            if ( input.LA(1)==NEGEDGE||input.LA(1)==POSEDGE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set167)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            IDENTIFIER168=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_sensitivity1998); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER168_tree = 
            (CommonTree)adaptor.create(IDENTIFIER168)
            ;
            adaptor.addChild(root_0, IDENTIFIER168_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nokeywords"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:396:1: nokeywords : ~ ( BEGIN | END | SEMI ) ;
    public final SystemVerilogFullParser.nokeywords_return nokeywords() throws RecognitionException {
        SystemVerilogFullParser.nokeywords_return retval = new SystemVerilogFullParser.nokeywords_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set169=null;

        CommonTree set169_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:396:11: (~ ( BEGIN | END | SEMI ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set169=(Token)input.LT(1);

            if ( (input.LA(1) >= ALWAYS && input.LA(1) <= BASE_DATA_TYPE)||(input.LA(1) >= BNOT && input.LA(1) <= ELSE)||(input.LA(1) >= EQ && input.LA(1) <= RPAREN)||(input.LA(1) >= SL && input.LA(1) <= 102) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set169)
                );
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fpga_param"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:401:1: fpga_param : FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~ DQUOTE )* DQUOTE FPGA_PARAM_STOP ;
    public final SystemVerilogFullParser.fpga_param_return fpga_param() throws RecognitionException {
        SystemVerilogFullParser.fpga_param_return retval = new SystemVerilogFullParser.fpga_param_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FPGA_PARAM_START170=null;
        Token IDENTIFIER171=null;
        Token EQUAL172=null;
        Token DQUOTE173=null;
        Token set174=null;
        Token DQUOTE175=null;
        Token FPGA_PARAM_STOP176=null;

        CommonTree FPGA_PARAM_START170_tree=null;
        CommonTree IDENTIFIER171_tree=null;
        CommonTree EQUAL172_tree=null;
        CommonTree DQUOTE173_tree=null;
        CommonTree set174_tree=null;
        CommonTree DQUOTE175_tree=null;
        CommonTree FPGA_PARAM_STOP176_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:401:11: ( FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~ DQUOTE )* DQUOTE FPGA_PARAM_STOP )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:403:3: FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~ DQUOTE )* DQUOTE FPGA_PARAM_STOP
            {
            root_0 = (CommonTree)adaptor.nil();


            FPGA_PARAM_START170=(Token)match(input,FPGA_PARAM_START,FOLLOW_FPGA_PARAM_START_in_fpga_param2029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FPGA_PARAM_START170_tree = 
            (CommonTree)adaptor.create(FPGA_PARAM_START170)
            ;
            adaptor.addChild(root_0, FPGA_PARAM_START170_tree);
            }

            IDENTIFIER171=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fpga_param2031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER171_tree = 
            (CommonTree)adaptor.create(IDENTIFIER171)
            ;
            adaptor.addChild(root_0, IDENTIFIER171_tree);
            }

            EQUAL172=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_fpga_param2033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUAL172_tree = 
            (CommonTree)adaptor.create(EQUAL172)
            ;
            adaptor.addChild(root_0, EQUAL172_tree);
            }

            DQUOTE173=(Token)match(input,DQUOTE,FOLLOW_DQUOTE_in_fpga_param2035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DQUOTE173_tree = 
            (CommonTree)adaptor.create(DQUOTE173)
            ;
            adaptor.addChild(root_0, DQUOTE173_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:403:44: (~ DQUOTE )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0 >= ALWAYS && LA54_0 <= DOXY_PARAM)||(LA54_0 >= ELSE && LA54_0 <= 102)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
            	    {
            	    set174=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ALWAYS && input.LA(1) <= DOXY_PARAM)||(input.LA(1) >= ELSE && input.LA(1) <= 102) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set174)
            	        );
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
            	    break loop54;
                }
            } while (true);


            DQUOTE175=(Token)match(input,DQUOTE,FOLLOW_DQUOTE_in_fpga_param2043); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DQUOTE175_tree = 
            (CommonTree)adaptor.create(DQUOTE175)
            ;
            adaptor.addChild(root_0, DQUOTE175_tree);
            }

            FPGA_PARAM_STOP176=(Token)match(input,FPGA_PARAM_STOP,FOLLOW_FPGA_PARAM_STOP_in_fpga_param2045); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FPGA_PARAM_STOP176_tree = 
            (CommonTree)adaptor.create(FPGA_PARAM_STOP176)
            ;
            adaptor.addChild(root_0, FPGA_PARAM_STOP176_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doxygen_group_def"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:408:1: doxygen_group_def : DOXYGEN_GROUP_DEF IDENTIFIER -> ^( IDENTIFIER ) ;
    public final SystemVerilogFullParser.doxygen_group_def_return doxygen_group_def() throws RecognitionException {
        SystemVerilogFullParser.doxygen_group_def_return retval = new SystemVerilogFullParser.doxygen_group_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOXYGEN_GROUP_DEF177=null;
        Token IDENTIFIER178=null;

        CommonTree DOXYGEN_GROUP_DEF177_tree=null;
        CommonTree IDENTIFIER178_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_DOXYGEN_GROUP_DEF=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_GROUP_DEF");

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:408:18: ( DOXYGEN_GROUP_DEF IDENTIFIER -> ^( IDENTIFIER ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:409:3: DOXYGEN_GROUP_DEF IDENTIFIER
            {
            DOXYGEN_GROUP_DEF177=(Token)match(input,DOXYGEN_GROUP_DEF,FOLLOW_DOXYGEN_GROUP_DEF_in_doxygen_group_def2058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOXYGEN_GROUP_DEF.add(DOXYGEN_GROUP_DEF177);


            IDENTIFIER178=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_doxygen_group_def2060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER178);


            if ( state.backtracking==0 ) {
            //    System.out.println("Defined Group: "+(IDENTIFIER178!=null?IDENTIFIER178.getText():null));
                //this.currentGroup = new ModulePortGroup((IDENTIFIER178!=null?IDENTIFIER178.getText():null));
                this.currentGroup = (IDENTIFIER178!=null?IDENTIFIER178.getText():null);
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 415:3: -> ^( IDENTIFIER )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:415:6: ^( IDENTIFIER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doxygen_group_begin"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:417:1: doxygen_group_begin : DOXYGEN_GROUP_START -> ^( DOXY_GROUP_START ) ;
    public final SystemVerilogFullParser.doxygen_group_begin_return doxygen_group_begin() throws RecognitionException {
        SystemVerilogFullParser.doxygen_group_begin_return retval = new SystemVerilogFullParser.doxygen_group_begin_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOXYGEN_GROUP_START179=null;

        CommonTree DOXYGEN_GROUP_START179_tree=null;
        RewriteRuleTokenStream stream_DOXYGEN_GROUP_START=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_GROUP_START");

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:417:20: ( DOXYGEN_GROUP_START -> ^( DOXY_GROUP_START ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:418:3: DOXYGEN_GROUP_START
            {
            DOXYGEN_GROUP_START179=(Token)match(input,DOXYGEN_GROUP_START,FOLLOW_DOXYGEN_GROUP_START_in_doxygen_group_begin2083); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOXYGEN_GROUP_START.add(DOXYGEN_GROUP_START179);


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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 424:3: -> ^( DOXY_GROUP_START )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:424:6: ^( DOXY_GROUP_START )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DOXY_GROUP_START, "DOXY_GROUP_START")
                , root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doxygen_group_end"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:426:1: doxygen_group_end : DOXYGEN_GROUP_END -> ^( DOXY_GROUP_STOP ) ;
    public final SystemVerilogFullParser.doxygen_group_end_return doxygen_group_end() throws RecognitionException {
        SystemVerilogFullParser.doxygen_group_end_return retval = new SystemVerilogFullParser.doxygen_group_end_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOXYGEN_GROUP_END180=null;

        CommonTree DOXYGEN_GROUP_END180_tree=null;
        RewriteRuleTokenStream stream_DOXYGEN_GROUP_END=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_GROUP_END");

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:426:18: ( DOXYGEN_GROUP_END -> ^( DOXY_GROUP_STOP ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:427:3: DOXYGEN_GROUP_END
            {
            DOXYGEN_GROUP_END180=(Token)match(input,DOXYGEN_GROUP_END,FOLLOW_DOXYGEN_GROUP_END_in_doxygen_group_end2108); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOXYGEN_GROUP_END.add(DOXYGEN_GROUP_END180);


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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 436:3: -> ^( DOXY_GROUP_STOP )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:436:6: ^( DOXY_GROUP_STOP )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DOXY_GROUP_STOP, "DOXY_GROUP_STOP")
                , root_1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doxygen_param"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:439:1: doxygen_param : DOXYGEN_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? -> ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) ;
    public final SystemVerilogFullParser.doxygen_param_return doxygen_param() throws RecognitionException {
        SystemVerilogFullParser.doxygen_param_return retval = new SystemVerilogFullParser.doxygen_param_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOXYGEN_PARAM181=null;
        Token EXTENDED_IDENTIFIER182=null;
        SystemVerilogFullParser.short_long_identifier_return short_long_identifier183 =null;


        CommonTree DOXYGEN_PARAM181_tree=null;
        CommonTree EXTENDED_IDENTIFIER182_tree=null;
        RewriteRuleTokenStream stream_EXTENDED_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token EXTENDED_IDENTIFIER");
        RewriteRuleTokenStream stream_DOXYGEN_PARAM=new RewriteRuleTokenStream(adaptor,"token DOXYGEN_PARAM");
        RewriteRuleSubtreeStream stream_short_long_identifier=new RewriteRuleSubtreeStream(adaptor,"rule short_long_identifier");
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:439:14: ( DOXYGEN_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? -> ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:440:3: DOXYGEN_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )?
            {
            DOXYGEN_PARAM181=(Token)match(input,DOXYGEN_PARAM,FOLLOW_DOXYGEN_PARAM_in_doxygen_param2131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOXYGEN_PARAM.add(DOXYGEN_PARAM181);


            EXTENDED_IDENTIFIER182=(Token)match(input,EXTENDED_IDENTIFIER,FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param2133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDED_IDENTIFIER.add(EXTENDED_IDENTIFIER182);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:440:37: ( short_long_identifier )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENTIFIER) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==BASE_DATA_TYPE||(LA55_1 >= DOXYGEN_GROUP_START && LA55_1 <= DOXYGEN_PARAM)||LA55_1==IDENTIFIER||LA55_1==LBRACK||LA55_1==PORT_DIRECTION) ) {
                    alt55=1;
                }
            }
            else if ( (LA55_0==DQUOTE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:440:37: short_long_identifier
                    {
                    pushFollow(FOLLOW_short_long_identifier_in_doxygen_param2135);
                    short_long_identifier183=short_long_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_short_long_identifier.add(short_long_identifier183.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                //-- Stack parameter for active section
                //this.doxyParams.put($doxygen_param_name.text,(short_long_identifier183!=null?input.toString(short_long_identifier183.start,short_long_identifier183.stop):null).replaceAll("\"",""));
                
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 447:3: -> ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? )
            {
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:447:6: ^( DOXY_PARAM EXTENDED_IDENTIFIER ( short_long_identifier )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DOXY_PARAM, "DOXY_PARAM")
                , root_1);

                adaptor.addChild(root_1, 
                stream_EXTENDED_IDENTIFIER.nextNode()
                );

                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:447:39: ( short_long_identifier )?
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "short_long_identifier"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:1: short_long_identifier : ( IDENTIFIER | DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE );
    public final SystemVerilogFullParser.short_long_identifier_return short_long_identifier() throws RecognitionException {
        SystemVerilogFullParser.short_long_identifier_return retval = new SystemVerilogFullParser.short_long_identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER184=null;
        Token DQUOTE185=null;
        Token IDENTIFIER186=null;
        Token WS187=null;
        Token IDENTIFIER188=null;
        Token DQUOTE189=null;

        CommonTree IDENTIFIER184_tree=null;
        CommonTree DQUOTE185_tree=null;
        CommonTree IDENTIFIER186_tree=null;
        CommonTree WS187_tree=null;
        CommonTree IDENTIFIER188_tree=null;
        CommonTree DQUOTE189_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:23: ( IDENTIFIER | DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENTIFIER) ) {
                alt58=1;
            }
            else if ( (LA58_0==DQUOTE) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:25: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENTIFIER184=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier2167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER184_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER184)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER184_tree);
                    }

                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:38: DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DQUOTE185=(Token)match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier2171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DQUOTE185_tree = 
                    (CommonTree)adaptor.create(DQUOTE185)
                    ;
                    adaptor.addChild(root_0, DQUOTE185_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:45: ( IDENTIFIER ( ( WS )+ IDENTIFIER )* )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:46: IDENTIFIER ( ( WS )+ IDENTIFIER )*
                    {
                    IDENTIFIER186=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier2174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER186_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER186)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER186_tree);
                    }

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:57: ( ( WS )+ IDENTIFIER )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==WS) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:58: ( WS )+ IDENTIFIER
                    	    {
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:58: ( WS )+
                    	    int cnt56=0;
                    	    loop56:
                    	    do {
                    	        int alt56=2;
                    	        int LA56_0 = input.LA(1);

                    	        if ( (LA56_0==WS) ) {
                    	            alt56=1;
                    	        }


                    	        switch (alt56) {
                    	    	case 1 :
                    	    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:455:58: WS
                    	    	    {
                    	    	    WS187=(Token)match(input,WS,FOLLOW_WS_in_short_long_identifier2177); if (state.failed) return retval;
                    	    	    if ( state.backtracking==0 ) {
                    	    	    WS187_tree = 
                    	    	    (CommonTree)adaptor.create(WS187)
                    	    	    ;
                    	    	    adaptor.addChild(root_0, WS187_tree);
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt56 >= 1 ) break loop56;
                    	    	    if (state.backtracking>0) {state.failed=true; return retval;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(56, input);
                    	                throw eee;
                    	        }
                    	        cnt56++;
                    	    } while (true);


                    	    IDENTIFIER188=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_short_long_identifier2180); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    IDENTIFIER188_tree = 
                    	    (CommonTree)adaptor.create(IDENTIFIER188)
                    	    ;
                    	    adaptor.addChild(root_0, IDENTIFIER188_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }


                    DQUOTE189=(Token)match(input,DQUOTE,FOLLOW_DQUOTE_in_short_long_identifier2185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DQUOTE189_tree = 
                    (CommonTree)adaptor.create(DQUOTE189)
                    ;
                    adaptor.addChild(root_0, DQUOTE189_tree);
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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "long_identifier"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:1: long_identifier : DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE ;
    public final SystemVerilogFullParser.long_identifier_return long_identifier() throws RecognitionException {
        SystemVerilogFullParser.long_identifier_return retval = new SystemVerilogFullParser.long_identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DQUOTE190=null;
        Token IDENTIFIER191=null;
        Token WS192=null;
        Token IDENTIFIER193=null;
        Token DQUOTE194=null;

        CommonTree DQUOTE190_tree=null;
        CommonTree IDENTIFIER191_tree=null;
        CommonTree WS192_tree=null;
        CommonTree IDENTIFIER193_tree=null;
        CommonTree DQUOTE194_tree=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:17: ( DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:19: DQUOTE ( IDENTIFIER ( ( WS )+ IDENTIFIER )* ) DQUOTE
            {
            root_0 = (CommonTree)adaptor.nil();


            DQUOTE190=(Token)match(input,DQUOTE,FOLLOW_DQUOTE_in_long_identifier2194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DQUOTE190_tree = 
            (CommonTree)adaptor.create(DQUOTE190)
            ;
            adaptor.addChild(root_0, DQUOTE190_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:26: ( IDENTIFIER ( ( WS )+ IDENTIFIER )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:27: IDENTIFIER ( ( WS )+ IDENTIFIER )*
            {
            IDENTIFIER191=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_long_identifier2197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER191_tree = 
            (CommonTree)adaptor.create(IDENTIFIER191)
            ;
            adaptor.addChild(root_0, IDENTIFIER191_tree);
            }

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:38: ( ( WS )+ IDENTIFIER )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==WS) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:39: ( WS )+ IDENTIFIER
            	    {
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:39: ( WS )+
            	    int cnt59=0;
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==WS) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:456:39: WS
            	    	    {
            	    	    WS192=(Token)match(input,WS,FOLLOW_WS_in_long_identifier2200); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    WS192_tree = 
            	    	    (CommonTree)adaptor.create(WS192)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS192_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt59 >= 1 ) break loop59;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(59, input);
            	                throw eee;
            	        }
            	        cnt59++;
            	    } while (true);


            	    IDENTIFIER193=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_long_identifier2203); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    IDENTIFIER193_tree = 
            	    (CommonTree)adaptor.create(IDENTIFIER193)
            	    ;
            	    adaptor.addChild(root_0, IDENTIFIER193_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            DQUOTE194=(Token)match(input,DQUOTE,FOLLOW_DQUOTE_in_long_identifier2208); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DQUOTE194_tree = 
            (CommonTree)adaptor.create(DQUOTE194)
            ;
            adaptor.addChild(root_0, DQUOTE194_tree);
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
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:300:5: ( decision_if )
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:300:6: decision_if
        {
        pushFollow(FOLLOW_decision_if_in_synpred1_SystemVerilogFull1347);
        decision_if();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_SystemVerilogFull

    // $ANTLR start synpred2_SystemVerilogFull
    public final void synpred2_SystemVerilogFull_fragment() throws RecognitionException {
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:305:13: ( decision_if )
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:305:14: decision_if
        {
        pushFollow(FOLLOW_decision_if_in_synpred2_SystemVerilogFull1406);
        decision_if();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_SystemVerilogFull

    // $ANTLR start synpred3_SystemVerilogFull
    public final void synpred3_SystemVerilogFull_fragment() throws RecognitionException {
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:319:5: ( decision_if )
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:319:6: decision_if
        {
        pushFollow(FOLLOW_decision_if_in_synpred3_SystemVerilogFull1497);
        decision_if();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_SystemVerilogFull

    // $ANTLR start synpred4_SystemVerilogFull
    public final void synpred4_SystemVerilogFull_fragment() throws RecognitionException {
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:324:13: ( decision_if )
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:324:14: decision_if
        {
        pushFollow(FOLLOW_decision_if_in_synpred4_SystemVerilogFull1556);
        decision_if();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_SystemVerilogFull

    // Delegated rules

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


 

    public static final BitSet FOLLOW_module_in_verilog148 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_fpga_param_in_module181 = new BitSet(new long[]{0x1000040000000000L});
    public static final BitSet FOLLOW_MODULE_in_module187 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module192 = new BitSet(new long[]{0x0100000000000000L,0x0000000004004000L});
    public static final BitSet FOLLOW_POUND_in_module197 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_module199 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_module_parameters_in_module201 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000040L});
    public static final BitSet FOLLOW_NEWLINE_in_module204 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_module207 = new BitSet(new long[]{0x0100000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_module214 = new BitSet(new long[]{0x000880001E000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_module_ports_in_module216 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000040L});
    public static final BitSet FOLLOW_NEWLINE_in_module218 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_module221 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_module227 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_101_in_module250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_hierarchical287 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_hierarchical292 = new BitSet(new long[]{0x0100000000000000L,0x0000000004004000L});
    public static final BitSet FOLLOW_POUND_in_module_hierarchical297 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_module_hierarchical299 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_module_parameters_in_module_hierarchical301 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000040L});
    public static final BitSet FOLLOW_NEWLINE_in_module_hierarchical304 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_module_hierarchical307 = new BitSet(new long[]{0x0100000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_module_hierarchical314 = new BitSet(new long[]{0x000880001E000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_module_ports_in_module_hierarchical316 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000040L});
    public static final BitSet FOLLOW_NEWLINE_in_module_hierarchical318 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_module_hierarchical321 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_module_hierarchical327 = new BitSet(new long[]{0x0000800000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_module_instanciation_in_module_hierarchical343 = new BitSet(new long[]{0x0000800000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_module_hierarchical353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_module_parameters394 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_module_parameters398 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_module_parameters402 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_102_in_parameter_declaration425 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_declaration427 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_EQUAL_in_parameter_declaration429 = new BitSet(new long[]{0x07E4D0490041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_parameter_value_in_parameter_declaration431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter_value455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_identifier_in_parameter_value468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_port_declaration_in_module_ports495 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_COMMA_in_module_ports509 = new BitSet(new long[]{0x000880001E000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_port_declaration_in_module_ports523 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_doxygen_group_end_in_module_ports542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doxygen_group_end_in_port_declaration574 = new BitSet(new long[]{0x000880001A000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_doxygen_group_def_in_port_declaration579 = new BitSet(new long[]{0x0008800018000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_doxygen_param_in_port_declaration584 = new BitSet(new long[]{0x0008800018000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_doxygen_group_begin_in_port_declaration589 = new BitSet(new long[]{0x0008800000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_PORT_DIRECTION_in_port_declaration600 = new BitSet(new long[]{0x0008800000000100L});
    public static final BitSet FOLLOW_BASE_DATA_TYPE_in_port_declaration605 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_data_size_in_port_declaration610 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_port_declaration616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation754 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_POUND_in_module_instanciation762 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_module_instanciation764 = new BitSet(new long[]{0x0000000000820000L,0x0000000002000000L});
    public static final BitSet FOLLOW_parameter_connections_in_module_instanciation766 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_module_instanciation768 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation778 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_module_instanciation785 = new BitSet(new long[]{0x0000000000820000L,0x0000000002000000L});
    public static final BitSet FOLLOW_port_connections_in_module_instanciation787 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_module_instanciation789 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_module_instanciation791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_port_connection_in_port_connections863 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_port_connections867 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_port_connection_in_port_connections869 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_port_connection879 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_port_connection902 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_port_connection952 = new BitSet(new long[]{0x07F4D0480041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_concatenable_expression_in_port_connection956 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_port_connection958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_connection_in_parameter_connections1040 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_connections1044 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_connection_in_parameter_connections1046 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_parameter_connection1054 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_connection1058 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_connection1060 = new BitSet(new long[]{0x07F4D0480041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_concatenable_expression_in_parameter_connection1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_connection1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_variable_declaration1073 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_data_size_in_variable_declaration1075 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration1079 = new BitSet(new long[]{0x0020001000020000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_variable_declaration1082 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration1084 = new BitSet(new long[]{0x0020001000020000L,0x0000000004000000L});
    public static final BitSet FOLLOW_assign_expression_in_variable_declaration1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_variable_declaration1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIAL_in_initial_declaration1122 = new BitSet(new long[]{0x0001800000000200L});
    public static final BitSet FOLLOW_logic_content_in_initial_declaration1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_instruction_in_initial_declaration1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALWAYS_in_always_declaration1154 = new BitSet(new long[]{0x0001800000000240L});
    public static final BitSet FOLLOW_AT_in_always_declaration1157 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_always_declaration1159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002020L});
    public static final BitSet FOLLOW_sensitivity_list_in_always_declaration1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_always_declaration1165 = new BitSet(new long[]{0x0001800000000200L});
    public static final BitSet FOLLOW_logic_instruction_in_always_declaration1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_content_in_always_declaration1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_declaration1206 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assign_declaration1208 = new BitSet(new long[]{0x0020001000000000L});
    public static final BitSet FOLLOW_assign_expression_in_assign_declaration1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_assign_declaration1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assign_expression1224 = new BitSet(new long[]{0x07F4D0480041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_concatenable_expression_in_assign_expression1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_logic_content1270 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_logic_instruction_in_logic_content1276 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_END_in_logic_content1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_instruction_in_logic_instruction1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decision_ifelse_in_logic_instruction1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_single_instruction1315 = new BitSet(new long[]{0x0020001000000000L});
    public static final BitSet FOLLOW_assign_expression_in_single_instruction1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_single_instruction1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_decision_if1329 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_decision_if1331 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000042100A00L});
    public static final BitSet FOLLOW_expression_in_decision_if1333 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_decision_if1335 = new BitSet(new long[]{0x0001800000000200L});
    public static final BitSet FOLLOW_decision_if_in_decision_if1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_instruction_in_decision_if1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_decision_if1378 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_decision_if_in_decision_if1411 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_single_instruction_in_decision_if1427 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_END_in_decision_if1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_decision_elseif1477 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IF_in_decision_elseif1479 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_decision_elseif1481 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000042100A00L});
    public static final BitSet FOLLOW_expression_in_decision_elseif1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_decision_elseif1485 = new BitSet(new long[]{0x0001800000000200L});
    public static final BitSet FOLLOW_decision_if_in_decision_elseif1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_instruction_in_decision_elseif1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_decision_elseif1528 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_decision_if_in_decision_elseif1561 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_single_instruction_in_decision_elseif1577 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_END_in_decision_elseif1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_decision_else1624 = new BitSet(new long[]{0x0000800000000200L});
    public static final BitSet FOLLOW_BEGIN_in_decision_else1634 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_logic_instruction_in_decision_else1636 = new BitSet(new long[]{0x0001800400000000L});
    public static final BitSet FOLLOW_END_in_decision_else1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_instruction_in_decision_else1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decision_if_in_decision_ifelse1660 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_decision_elseif_in_decision_ifelse1664 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_decision_else_in_decision_ifelse1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_data_size1694 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_size_def_in_data_size1696 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_data_size1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_data_size1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_data_size1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_size_def1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_concatenable_expression1777 = new BitSet(new long[]{0x07E4D0480043EC80L,0x0000000040500A00L});
    public static final BitSet FOLLOW_expression_in_concatenable_expression1779 = new BitSet(new long[]{0x0000000000020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_concatenable_expression1782 = new BitSet(new long[]{0x07E4D0480043EC80L,0x0000000040500A00L});
    public static final BitSet FOLLOW_expression_in_concatenable_expression1784 = new BitSet(new long[]{0x0000000000020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_concatenable_expression1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_concatenable_expression1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expression1810 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000042100A00L});
    public static final BitSet FOLLOW_expression_in_expression1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_expression1814 = new BitSet(new long[]{0x06E450080041CC82L,0x0000000040100800L});
    public static final BitSet FOLLOW_expression_operand_in_expression1819 = new BitSet(new long[]{0x06E450080041CC82L,0x0000000040100800L});
    public static final BitSet FOLLOW_expression_operator_in_expression1825 = new BitSet(new long[]{0x07E4D0480041EC80L,0x0000000040100A00L});
    public static final BitSet FOLLOW_expression_in_expression1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand1838 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_expression_operand1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_expression_operand1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_expression_operand1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXE_QUOTE_in_expression_operand1853 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_operand1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_value_in_expression_operand1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUS_VALUE_in_typed_value1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensitivity_in_sensitivity_list1970 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_sensitivity_list1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002020L});
    public static final BitSet FOLLOW_sensitivity_in_sensitivity_list1978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_sensitivity1992 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_sensitivity1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPGA_PARAM_START_in_fpga_param2029 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fpga_param2031 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_EQUAL_in_fpga_param2033 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_DQUOTE_in_fpga_param2035 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_DQUOTE_in_fpga_param2043 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FPGA_PARAM_STOP_in_fpga_param2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXYGEN_GROUP_DEF_in_doxygen_group_def2058 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_doxygen_group_def2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXYGEN_GROUP_START_in_doxygen_group_begin2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXYGEN_GROUP_END_in_doxygen_group_end2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOXYGEN_PARAM_in_doxygen_param2131 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_EXTENDED_IDENTIFIER_in_doxygen_param2133 = new BitSet(new long[]{0x0000800100000002L});
    public static final BitSet FOLLOW_short_long_identifier_in_doxygen_param2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier2171 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier2174 = new BitSet(new long[]{0x0000000100000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_WS_in_short_long_identifier2177 = new BitSet(new long[]{0x0000800000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_short_long_identifier2180 = new BitSet(new long[]{0x0000000100000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DQUOTE_in_short_long_identifier2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOTE_in_long_identifier2194 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_long_identifier2197 = new BitSet(new long[]{0x0000000100000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_WS_in_long_identifier2200 = new BitSet(new long[]{0x0000800000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_long_identifier2203 = new BitSet(new long[]{0x0000000100000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DQUOTE_in_long_identifier2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decision_if_in_synpred1_SystemVerilogFull1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decision_if_in_synpred2_SystemVerilogFull1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decision_if_in_synpred3_SystemVerilogFull1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decision_if_in_synpred4_SystemVerilogFull1556 = new BitSet(new long[]{0x0000000000000002L});

}