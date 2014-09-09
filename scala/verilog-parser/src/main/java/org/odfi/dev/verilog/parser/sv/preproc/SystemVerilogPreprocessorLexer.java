// $ANTLR 3.4 /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g 2011-11-22 15:40:36

package org.odfi.dev.verilog.parser.sv.preproc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SystemVerilogPreprocessorLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SystemVerilogPreprocessorLexer() {} 
    public SystemVerilogPreprocessorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SystemVerilogPreprocessorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:11:7: ( '\"' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:11:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "PREP_INCLUDE"
    public final void mPREP_INCLUDE() throws RecognitionException {
        try {
            int _type = PREP_INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:103:23: ( '`include' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:103:25: '`include'
            {
            match("`include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_INCLUDE"

    // $ANTLR start "PREP_IFDEF"
    public final void mPREP_IFDEF() throws RecognitionException {
        try {
            int _type = PREP_IFDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:104:23: ( '`ifdef' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:104:25: '`ifdef'
            {
            match("`ifdef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_IFDEF"

    // $ANTLR start "PREP_IFNDEF"
    public final void mPREP_IFNDEF() throws RecognitionException {
        try {
            int _type = PREP_IFNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:105:23: ( '`ifndef' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:105:25: '`ifndef'
            {
            match("`ifndef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_IFNDEF"

    // $ANTLR start "PREP_ELSE"
    public final void mPREP_ELSE() throws RecognitionException {
        try {
            int _type = PREP_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:106:23: ( '`else' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:106:25: '`else'
            {
            match("`else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_ELSE"

    // $ANTLR start "PREP_ENDIF"
    public final void mPREP_ENDIF() throws RecognitionException {
        try {
            int _type = PREP_ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:107:23: ( '`endif' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:107:25: '`endif'
            {
            match("`endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_ENDIF"

    // $ANTLR start "PREP_DEFAULT_NETTYPE"
    public final void mPREP_DEFAULT_NETTYPE() throws RecognitionException {
        try {
            int _type = PREP_DEFAULT_NETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:108:23: ( '`default_nettype' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:108:25: '`default_nettype'
            {
            match("`default_nettype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_DEFAULT_NETTYPE"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:113:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '.' | '0' .. '9' )+ )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:114:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '.' | '0' .. '9' )+
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:114:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '.' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||LA1_0=='.'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "COMMENTAR_SHORT"
    public final void mCOMMENTAR_SHORT() throws RecognitionException {
        try {
            int _type = COMMENTAR_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:120:16: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:120:18: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:120:23: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:120:37: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:120:37: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENTAR_SHORT"

    // $ANTLR start "COMMENTAR_LONG"
    public final void mCOMMENTAR_LONG() throws RecognitionException {
        try {
            int _type = COMMENTAR_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:121:15: ( '/*' ( . )* '*/' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:121:17: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:121:22: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:121:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENTAR_LONG"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:122:8: ( ( '\\r' )? '\\n' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:122:9: ( '\\r' )? '\\n'
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:122:9: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:122:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:123:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:123:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:123:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "CONTENT"
    public final void mCONTENT() throws RecognitionException {
        try {
            int _type = CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:125:8: ( . )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:125:10: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTENT"

    public void mTokens() throws RecognitionException {
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:8: ( T__16 | PREP_INCLUDE | PREP_IFDEF | PREP_IFNDEF | PREP_ELSE | PREP_ENDIF | PREP_DEFAULT_NETTYPE | WORD | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS | CONTENT )
        int alt7=13;
        int LA7_0 = input.LA(1);

        if ( (LA7_0=='\"') ) {
            alt7=1;
        }
        else if ( (LA7_0=='`') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA7_10 = input.LA(3);

                if ( (LA7_10=='n') ) {
                    alt7=2;
                }
                else if ( (LA7_10=='f') ) {
                    int LA7_20 = input.LA(4);

                    if ( (LA7_20=='d') ) {
                        alt7=3;
                    }
                    else if ( (LA7_20=='n') ) {
                        alt7=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 20, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 10, input);

                    throw nvae;

                }
                }
                break;
            case 'e':
                {
                int LA7_11 = input.LA(3);

                if ( (LA7_11=='l') ) {
                    alt7=5;
                }
                else if ( (LA7_11=='n') ) {
                    alt7=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 11, input);

                    throw nvae;

                }
                }
                break;
            case 'd':
                {
                alt7=7;
                }
                break;
            default:
                alt7=13;
            }

        }
        else if ( (LA7_0=='$'||LA7_0=='.'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
            alt7=8;
        }
        else if ( (LA7_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt7=9;
                }
                break;
            case '*':
                {
                alt7=10;
                }
                break;
            default:
                alt7=13;
            }

        }
        else if ( (LA7_0=='\r') ) {
            int LA7_5 = input.LA(2);

            if ( (LA7_5=='\n') ) {
                int LA7_16 = input.LA(3);

                if ( ((LA7_16 >= '\t' && LA7_16 <= '\n')||LA7_16=='\r'||LA7_16==' ') ) {
                    alt7=12;
                }
                else {
                    alt7=11;
                }
            }
            else {
                alt7=12;
            }
        }
        else if ( (LA7_0=='\n') ) {
            int LA7_6 = input.LA(2);

            if ( ((LA7_6 >= '\t' && LA7_6 <= '\n')||LA7_6=='\r'||LA7_6==' ') ) {
                alt7=12;
            }
            else {
                alt7=11;
            }
        }
        else if ( (LA7_0=='\t'||LA7_0==' ') ) {
            alt7=12;
        }
        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\u001F')||LA7_0=='!'||LA7_0=='#'||(LA7_0 >= '%' && LA7_0 <= '-')||(LA7_0 >= ':' && LA7_0 <= '@')||(LA7_0 >= '[' && LA7_0 <= '^')||(LA7_0 >= '{' && LA7_0 <= '\uFFFF')) ) {
            alt7=13;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }
        switch (alt7) {
            case 1 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:10: T__16
                {
                mT__16(); 


                }
                break;
            case 2 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:16: PREP_INCLUDE
                {
                mPREP_INCLUDE(); 


                }
                break;
            case 3 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:29: PREP_IFDEF
                {
                mPREP_IFDEF(); 


                }
                break;
            case 4 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:40: PREP_IFNDEF
                {
                mPREP_IFNDEF(); 


                }
                break;
            case 5 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:52: PREP_ELSE
                {
                mPREP_ELSE(); 


                }
                break;
            case 6 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:62: PREP_ENDIF
                {
                mPREP_ENDIF(); 


                }
                break;
            case 7 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:73: PREP_DEFAULT_NETTYPE
                {
                mPREP_DEFAULT_NETTYPE(); 


                }
                break;
            case 8 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:94: WORD
                {
                mWORD(); 


                }
                break;
            case 9 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:99: COMMENTAR_SHORT
                {
                mCOMMENTAR_SHORT(); 


                }
                break;
            case 10 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:115: COMMENTAR_LONG
                {
                mCOMMENTAR_LONG(); 


                }
                break;
            case 11 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:130: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 12 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:138: WS
                {
                mWS(); 


                }
                break;
            case 13 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/preproc/SystemVerilogPreprocessor.g:1:141: CONTENT
                {
                mCONTENT(); 


                }
                break;

        }

    }


 

}