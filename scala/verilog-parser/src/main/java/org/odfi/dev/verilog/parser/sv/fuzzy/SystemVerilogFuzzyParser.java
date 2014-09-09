// $ANTLR 3.4 /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g 2011-11-22 15:40:37


package org.odfi.dev.verilog.parser.sv.fuzzy;

import org.odfi.dev.verilog.parser.parsing.*;

import java.util.LinkedList;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SystemVerilogFuzzyParser extends XQParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALWAYS", "ASSIGN", "AT", "BAND", "BASE_DATA_TYPE", "BEGIN", "BNOT", "BOR", "BSLASH", "BXNOR", "BXOR", "COLON", "COMMA", "COMMENTAR_LONG", "COMMENTAR_SHORT", "DIV", "DOT", "ELSE", "ELSEIF", "END", "END_GENERATE", "EQ", "EQUAL", "EQ_CASE", "EXE_QUOTE", "FPATH", "GE", "GENERATE", "GT", "IDENTIFIER", "IF", "INITIAL", "LAND", "LBRACK", "LCURLY", "LE", "LNOT", "LOR", "LPAREN", "LT_", "MINUS", "MOD", "MODULE", "NEWLINE", "NOT_EQ", "NOT_EQ_CASE", "NUMBER", "PLUS", "PORT_DIRECTION", "POUND", "PPATH", "QUESTION", "RBRACK", "RCURLY", "RNAND", "RNOR", "RPAREN", "SEMI", "SL", "SQUOTE", "SR", "STAR", "SV_DATA_TYPE", "TRIGGER", "VALUE_BASE", "WS"
    };

    public static final int EOF=-1;
    public static final int ALWAYS=4;
    public static final int ASSIGN=5;
    public static final int AT=6;
    public static final int BAND=7;
    public static final int BASE_DATA_TYPE=8;
    public static final int BEGIN=9;
    public static final int BNOT=10;
    public static final int BOR=11;
    public static final int BSLASH=12;
    public static final int BXNOR=13;
    public static final int BXOR=14;
    public static final int COLON=15;
    public static final int COMMA=16;
    public static final int COMMENTAR_LONG=17;
    public static final int COMMENTAR_SHORT=18;
    public static final int DIV=19;
    public static final int DOT=20;
    public static final int ELSE=21;
    public static final int ELSEIF=22;
    public static final int END=23;
    public static final int END_GENERATE=24;
    public static final int EQ=25;
    public static final int EQUAL=26;
    public static final int EQ_CASE=27;
    public static final int EXE_QUOTE=28;
    public static final int FPATH=29;
    public static final int GE=30;
    public static final int GENERATE=31;
    public static final int GT=32;
    public static final int IDENTIFIER=33;
    public static final int IF=34;
    public static final int INITIAL=35;
    public static final int LAND=36;
    public static final int LBRACK=37;
    public static final int LCURLY=38;
    public static final int LE=39;
    public static final int LNOT=40;
    public static final int LOR=41;
    public static final int LPAREN=42;
    public static final int LT_=43;
    public static final int MINUS=44;
    public static final int MOD=45;
    public static final int MODULE=46;
    public static final int NEWLINE=47;
    public static final int NOT_EQ=48;
    public static final int NOT_EQ_CASE=49;
    public static final int NUMBER=50;
    public static final int PLUS=51;
    public static final int PORT_DIRECTION=52;
    public static final int POUND=53;
    public static final int PPATH=54;
    public static final int QUESTION=55;
    public static final int RBRACK=56;
    public static final int RCURLY=57;
    public static final int RNAND=58;
    public static final int RNOR=59;
    public static final int RPAREN=60;
    public static final int SEMI=61;
    public static final int SL=62;
    public static final int SQUOTE=63;
    public static final int SR=64;
    public static final int STAR=65;
    public static final int SV_DATA_TYPE=66;
    public static final int TRIGGER=67;
    public static final int VALUE_BASE=68;
    public static final int WS=69;

    // delegates
    public XQParser[] getDelegates() {
        return new XQParser[] {};
    }

    // delegators


    public SystemVerilogFuzzyParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SystemVerilogFuzzyParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SystemVerilogFuzzyParser.tokenNames; }
    public String getGrammarFileName() { return "/local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g"; }


    protected Object recoverFromMismatchedToken(IntStream input,
                                                int ttype,
                                                BitSet follow)
        throws RecognitionException
    {   
        throw new MismatchedTokenException(ttype, input);
    }   



    // $ANTLR start "module_name"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:55:1: module_name returns [String name] : ( . )* MODULE IDENTIFIER ;
    public final String module_name() throws RecognitionException {
        String name = null;


        XQToken IDENTIFIER1=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:56:3: ( ( . )* MODULE IDENTIFIER )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:57:3: ( . )* MODULE IDENTIFIER
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:57:3: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MODULE) ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= ALWAYS && LA1_0 <= MOD)||(LA1_0 >= NEWLINE && LA1_0 <= WS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:57:3: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,MODULE,FOLLOW_MODULE_in_module_name95); 

            IDENTIFIER1=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name97); 


                                  name = (IDENTIFIER1!=null?IDENTIFIER1.getText():null);
                                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "module_name"



    // $ANTLR start "module_instanciations"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:67:1: module_instanciations returns [List<String> instances] options {greedy=false; } : ( ( . )* mi= module_instanciation[$instances] )* ;
    public final List<String> module_instanciations() throws RecognitionException {
        List<String> instances = null;



            instances = new LinkedList<String>();
          
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:73:3: ( ( ( . )* mi= module_instanciation[$instances] )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:73:5: ( ( . )* mi= module_instanciation[$instances] )*
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:73:5: ( ( . )* mi= module_instanciation[$instances] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= ALWAYS && LA3_0 <= WS)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:74:5: ( . )* mi= module_instanciation[$instances]
            	    {
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:74:5: ( . )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==IDENTIFIER) ) {
            	            alt2=2;
            	        }
            	        else if ( ((LA2_0 >= ALWAYS && LA2_0 <= GT)||(LA2_0 >= IF && LA2_0 <= WS)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:74:5: .
            	    	    {
            	    	    matchAny(input); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_module_instanciation_in_module_instanciations179);
            	    module_instanciation(instances);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instances;
    }
    // $ANTLR end "module_instanciations"



    // $ANTLR start "module_instanciations_types"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:81:1: module_instanciations_types returns [List<String> instances] : ( ( . )* mi= module_instanciation[filteredInstances] )* ;
    public final List<String> module_instanciations_types() throws RecognitionException {
        List<String> instances = null;



            instances = new LinkedList<String>();
            LinkedList<String> filteredInstances= new LinkedList<String>();
          
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:87:3: ( ( ( . )* mi= module_instanciation[filteredInstances] )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:88:5: ( ( . )* mi= module_instanciation[filteredInstances] )*
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:88:5: ( ( . )* mi= module_instanciation[filteredInstances] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= ALWAYS && LA5_0 <= WS)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:89:5: ( . )* mi= module_instanciation[filteredInstances]
            	    {
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:89:5: ( . )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==IDENTIFIER) ) {
            	            alt4=2;
            	        }
            	        else if ( ((LA4_0 >= ALWAYS && LA4_0 <= GT)||(LA4_0 >= IF && LA4_0 <= WS)) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:89:5: .
            	    	    {
            	    	    matchAny(input); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_module_instanciation_in_module_instanciations_types235);
            	    module_instanciation(filteredInstances);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



                // Filter result
                for (String instance: filteredInstances) {
                  if (!instances.contains(instance))
                    instances.add(instance);
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
        return instances;
    }
    // $ANTLR end "module_instanciations_types"



    // $ANTLR start "module_instanciation"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:101:1: module_instanciation[List<String> instances] : type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI ;
    public final void module_instanciation(List<String> instances) throws RecognitionException {
        XQToken type=null;
        XQToken name=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:104:3: (type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:106:5: type= IDENTIFIER ( POUND LPAREN parameter_connections RPAREN )? name= IDENTIFIER LPAREN port_connections RPAREN SEMI
            {
            type=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation279); 

            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:107:5: ( POUND LPAREN parameter_connections RPAREN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==POUND) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:107:6: POUND LPAREN parameter_connections RPAREN
                    {
                    match(input,POUND,FOLLOW_POUND_in_module_instanciation286); 

                    match(input,LPAREN,FOLLOW_LPAREN_in_module_instanciation288); 

                    pushFollow(FOLLOW_parameter_connections_in_module_instanciation290);
                    parameter_connections();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_module_instanciation292); 

                    }
                    break;

            }


            name=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_instanciation302); 

            match(input,LPAREN,FOLLOW_LPAREN_in_module_instanciation309); 

            pushFollow(FOLLOW_port_connections_in_module_instanciation311);
            port_connections();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_module_instanciation313); 

            match(input,SEMI,FOLLOW_SEMI_in_module_instanciation315); 


                   System.out.println("In module instanciation "+(type!=null?type.getText():null)+" at "+(type!=null?type.getLine():0));
                   instances.add((type!=null?type.getText():null)); 
                

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
    // $ANTLR end "module_instanciation"



    // $ANTLR start "port_connections"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:1: port_connections : ( port_connection )? ( COMMA port_connection )* ;
    public final void port_connections() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:17: ( ( port_connection )? ( COMMA port_connection )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:19: ( port_connection )? ( COMMA port_connection )*
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:19: ( port_connection )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DOT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:19: port_connection
                    {
                    pushFollow(FOLLOW_port_connection_in_port_connections355);
                    port_connection();

                    state._fsp--;


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:36: ( COMMA port_connection )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:119:37: COMMA port_connection
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_port_connections359); 

            	    pushFollow(FOLLOW_port_connection_in_port_connections361);
            	    port_connection();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "port_connections"



    // $ANTLR start "port_connection"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:121:1: port_connection : DOT port_name= IDENTIFIER LPAREN concatenable_expression RPAREN ;
    public final void port_connection() throws RecognitionException {
        XQToken port_name=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:121:17: ( DOT port_name= IDENTIFIER LPAREN concatenable_expression RPAREN )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:121:19: DOT port_name= IDENTIFIER LPAREN concatenable_expression RPAREN
            {
            match(input,DOT,FOLLOW_DOT_in_port_connection371); 

            port_name=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_port_connection375); 

            match(input,LPAREN,FOLLOW_LPAREN_in_port_connection377); 

            pushFollow(FOLLOW_concatenable_expression_in_port_connection379);
            concatenable_expression();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_port_connection381); 

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



    // $ANTLR start "parameter_connections"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:1: parameter_connections : ( parameter_connection )? ( COMMA parameter_connection )* ;
    public final void parameter_connections() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:22: ( ( parameter_connection )? ( COMMA parameter_connection )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:24: ( parameter_connection )? ( COMMA parameter_connection )*
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:24: ( parameter_connection )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DOT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:24: parameter_connection
                    {
                    pushFollow(FOLLOW_parameter_connection_in_parameter_connections390);
                    parameter_connection();

                    state._fsp--;


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:46: ( COMMA parameter_connection )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:124:47: COMMA parameter_connection
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameter_connections394); 

            	    pushFollow(FOLLOW_parameter_connection_in_parameter_connections396);
            	    parameter_connection();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "parameter_connections"



    // $ANTLR start "parameter_connection"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:125:1: parameter_connection : DOT param_name= IDENTIFIER LPAREN expression RPAREN ;
    public final void parameter_connection() throws RecognitionException {
        XQToken param_name=null;

        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:125:21: ( DOT param_name= IDENTIFIER LPAREN expression RPAREN )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:125:23: DOT param_name= IDENTIFIER LPAREN expression RPAREN
            {
            match(input,DOT,FOLLOW_DOT_in_parameter_connection404); 

            param_name=(XQToken)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_connection408); 

            match(input,LPAREN,FOLLOW_LPAREN_in_parameter_connection410); 

            pushFollow(FOLLOW_expression_in_parameter_connection412);
            expression();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_parameter_connection414); 

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
    // $ANTLR end "parameter_connection"



    // $ANTLR start "concatenable_expression"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:128:1: concatenable_expression : ( ( LCURLY expression ( COMMA expression )* RCURLY ) | expression );
    public final void concatenable_expression() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:128:24: ( ( LCURLY expression ( COMMA expression )* RCURLY ) | expression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LCURLY) ) {
                alt12=1;
            }
            else if ( (LA12_0==BAND||(LA12_0 >= BNOT && LA12_0 <= BOR)||(LA12_0 >= BXNOR && LA12_0 <= BXOR)||LA12_0==COMMA||LA12_0==IDENTIFIER||LA12_0==LAND||LA12_0==LNOT||LA12_0==LPAREN||LA12_0==MINUS||(LA12_0 >= NUMBER && LA12_0 <= PLUS)||LA12_0==RCURLY||LA12_0==RPAREN||LA12_0==STAR) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:129:3: ( LCURLY expression ( COMMA expression )* RCURLY )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:129:3: ( LCURLY expression ( COMMA expression )* RCURLY )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:129:4: LCURLY expression ( COMMA expression )* RCURLY
                    {
                    match(input,LCURLY,FOLLOW_LCURLY_in_concatenable_expression426); 

                    pushFollow(FOLLOW_expression_in_concatenable_expression428);
                    expression();

                    state._fsp--;


                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:129:22: ( COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:129:23: COMMA expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_concatenable_expression431); 

                    	    pushFollow(FOLLOW_expression_in_concatenable_expression433);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match(input,RCURLY,FOLLOW_RCURLY_in_concatenable_expression437); 

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:130:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_concatenable_expression445);
                    expression();

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
    // $ANTLR end "concatenable_expression"



    // $ANTLR start "expression"
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:132:1: expression : ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )? ;
    public final void expression() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:132:11: ( ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )? )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:3: ( ( LPAREN expression RPAREN ) | expression_operand )? ( expression_operator expression )?
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:3: ( ( LPAREN expression RPAREN ) | expression_operand )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN) ) {
                alt13=1;
            }
            else if ( (LA13_0==IDENTIFIER||LA13_0==NUMBER) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:4: ( LPAREN expression RPAREN )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:4: ( LPAREN expression RPAREN )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:5: LPAREN expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_expression459); 

                    pushFollow(FOLLOW_expression_in_expression461);
                    expression();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_expression463); 

                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:33: expression_operand
                    {
                    pushFollow(FOLLOW_expression_operand_in_expression468);
                    expression_operand();

                    state._fsp--;


                    }
                    break;

            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:55: ( expression_operator expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BAND||(LA14_0 >= BNOT && LA14_0 <= BOR)||(LA14_0 >= BXNOR && LA14_0 <= BXOR)||LA14_0==LAND||LA14_0==LNOT||LA14_0==MINUS||LA14_0==PLUS||LA14_0==STAR) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:133:56: expression_operator expression
                    {
                    pushFollow(FOLLOW_expression_operator_in_expression474);
                    expression_operator();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression476);
                    expression();

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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:1: expression_operand : ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | NUMBER | typed_value );
    public final void expression_operand() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:20: ( ( IDENTIFIER ( LBRACK NUMBER RBRACK )? ) | NUMBER | typed_value )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            else if ( (LA16_0==NUMBER) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==SQUOTE) ) {
                    alt16=3;
                }
                else if ( (LA16_2==BAND||(LA16_2 >= BNOT && LA16_2 <= BOR)||(LA16_2 >= BXNOR && LA16_2 <= BXOR)||LA16_2==COMMA||LA16_2==LAND||LA16_2==LNOT||LA16_2==MINUS||LA16_2==PLUS||LA16_2==RCURLY||LA16_2==RPAREN||LA16_2==STAR) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:22: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
                    {
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:22: ( IDENTIFIER ( LBRACK NUMBER RBRACK )? )
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:23: IDENTIFIER ( LBRACK NUMBER RBRACK )?
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression_operand488); 

                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:34: ( LBRACK NUMBER RBRACK )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==LBRACK) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:35: LBRACK NUMBER RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_expression_operand491); 

                            match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand493); 

                            match(input,RBRACK,FOLLOW_RBRACK_in_expression_operand495); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:61: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_expression_operand502); 

                    }
                    break;
                case 3 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:136:70: typed_value
                    {
                    pushFollow(FOLLOW_typed_value_in_expression_operand506);
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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:138:1: expression_operator : ( LAND | BOR | BAND | PLUS | BNOT | MINUS | STAR | BXOR | BXNOR | LNOT );
    public final void expression_operator() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:138:20: ( LAND | BOR | BAND | PLUS | BNOT | MINUS | STAR | BXOR | BXNOR | LNOT )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:
            {
            if ( input.LA(1)==BAND||(input.LA(1) >= BNOT && input.LA(1) <= BOR)||(input.LA(1) >= BXNOR && input.LA(1) <= BXOR)||input.LA(1)==LAND||input.LA(1)==LNOT||input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==STAR ) {
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
    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:141:1: typed_value : NUMBER SQUOTE VALUE_BASE NUMBER ;
    public final void typed_value() throws RecognitionException {
        try {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:141:12: ( NUMBER SQUOTE VALUE_BASE NUMBER )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/fuzzy/SystemVerilogFuzzy.g:141:14: NUMBER SQUOTE VALUE_BASE NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_typed_value558); 

            match(input,SQUOTE,FOLLOW_SQUOTE_in_typed_value560); 

            match(input,VALUE_BASE,FOLLOW_VALUE_BASE_in_typed_value562); 

            match(input,NUMBER,FOLLOW_NUMBER_in_typed_value564); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module_name95 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_instanciation_in_module_instanciations179 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000000003FL});
    public static final BitSet FOLLOW_module_instanciation_in_module_instanciations_types235 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000000003FL});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation279 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_POUND_in_module_instanciation286 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_module_instanciation288 = new BitSet(new long[]{0x1000000000110000L});
    public static final BitSet FOLLOW_parameter_connections_in_module_instanciation290 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_module_instanciation292 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_instanciation302 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_module_instanciation309 = new BitSet(new long[]{0x1000000000110000L});
    public static final BitSet FOLLOW_port_connections_in_module_instanciation311 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_module_instanciation313 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_module_instanciation315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_port_connection_in_port_connections355 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_COMMA_in_port_connections359 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_port_connection_in_port_connections361 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOT_in_port_connection371 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_port_connection375 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_port_connection377 = new BitSet(new long[]{0x000C155200006C80L,0x0000000000000002L});
    public static final BitSet FOLLOW_concatenable_expression_in_port_connection379 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_port_connection381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_connection_in_parameter_connections390 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_connections394 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_connection_in_parameter_connections396 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOT_in_parameter_connection404 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_connection408 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_connection410 = new BitSet(new long[]{0x100C151200006C80L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter_connection412 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_connection414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_concatenable_expression426 = new BitSet(new long[]{0x020C151200016C80L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_concatenable_expression428 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_COMMA_in_concatenable_expression431 = new BitSet(new long[]{0x020C151200016C80L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_concatenable_expression433 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_RCURLY_in_concatenable_expression437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_concatenable_expression445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expression459 = new BitSet(new long[]{0x100C151200006C80L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression461 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expression463 = new BitSet(new long[]{0x0008111000006C82L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_operand_in_expression468 = new BitSet(new long[]{0x0008111000006C82L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_operator_in_expression474 = new BitSet(new long[]{0x000C151200006C80L,0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression_operand488 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LBRACK_in_expression_operand491 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_expression_operand493 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_expression_operand495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_operand502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_value_in_expression_operand506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_typed_value558 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_SQUOTE_in_typed_value560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_VALUE_BASE_in_typed_value562 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_typed_value564 = new BitSet(new long[]{0x0000000000000002L});

}