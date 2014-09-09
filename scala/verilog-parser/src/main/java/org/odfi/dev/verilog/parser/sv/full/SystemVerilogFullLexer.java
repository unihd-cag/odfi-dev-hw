// $ANTLR 3.4 /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g 2011-11-22 15:40:40

package org.odfi.dev.verilog.parser.sv.full;
//import uni.hd.cag.languages.parsing.*;
//import uni.hd.cag.languages.parsing.Lexer;


import org.antlr.runtime.*;
import org.antlr.runtime.Lexer;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SystemVerilogFullLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SystemVerilogFullLexer() {} 
    public SystemVerilogFullLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SystemVerilogFullLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g"; }

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:13:8: ( 'endmodule' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:13:10: 'endmodule'
            {
            match("endmodule"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:14:8: ( 'parameter' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:14:10: 'parameter'
            {
            match("parameter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:462:13: ( '@' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:462:15: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:463:13: ( ':' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:463:15: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:464:13: ( ',' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:464:15: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:465:13: ( '.' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:465:15: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:466:13: ( '=' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:466:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:467:13: ( '-' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:467:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:468:13: ( '[' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:468:15: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:469:13: ( ']' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:469:15: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:470:13: ( '{' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:470:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:471:13: ( '}' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:471:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:472:13: ( '(' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:472:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:473:13: ( ')' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:473:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:474:13: ( '#' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:474:15: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:475:13: ( '?' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:475:15: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:476:13: ( ';' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:476:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:477:13: ( '+' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:477:15: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "LNOT"
    public final void mLNOT() throws RecognitionException {
        try {
            int _type = LNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:478:13: ( '!' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:478:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LNOT"

    // $ANTLR start "BNOT"
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:479:13: ( '~' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:479:15: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BNOT"

    // $ANTLR start "BAND"
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:480:13: ( '&' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:480:15: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAND"

    // $ANTLR start "RNAND"
    public final void mRNAND() throws RecognitionException {
        try {
            int _type = RNAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:481:13: ( '~&' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:481:15: '~&'
            {
            match("~&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RNAND"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:482:13: ( '|' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:482:15: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "RNOR"
    public final void mRNOR() throws RecognitionException {
        try {
            int _type = RNOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:483:13: ( '~|' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:483:15: '~|'
            {
            match("~|"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RNOR"

    // $ANTLR start "BXOR"
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:484:13: ( '^' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:484:15: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BXOR"

    // $ANTLR start "BXNOR"
    public final void mBXNOR() throws RecognitionException {
        try {
            int _type = BXNOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:485:13: ( '~^' | '^~' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='~') ) {
                alt1=1;
            }
            else if ( (LA1_0=='^') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:485:15: '~^'
                    {
                    match("~^"); 



                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:485:22: '^~'
                    {
                    match("^~"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BXNOR"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:486:13: ( '*' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:486:15: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:487:13: ( '/' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:487:15: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:488:13: ( '%' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:488:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:489:13: ( '==' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:489:15: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:490:13: ( '!=' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:490:15: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "NOT_EQ_CASE"
    public final void mNOT_EQ_CASE() throws RecognitionException {
        try {
            int _type = NOT_EQ_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:491:13: ( '!==' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:491:15: '!=='
            {
            match("!=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQ_CASE"

    // $ANTLR start "EQ_CASE"
    public final void mEQ_CASE() throws RecognitionException {
        try {
            int _type = EQ_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:492:13: ( '===' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:492:15: '==='
            {
            match("==="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ_CASE"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:493:13: ( '&&' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:493:15: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:494:13: ( '||' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:494:15: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:495:13: ( '<' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:495:15: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:496:13: ( '<=' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:496:15: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:497:13: ( '>' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:497:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:498:13: ( '>=' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:498:15: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "SR"
    public final void mSR() throws RecognitionException {
        try {
            int _type = SR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:499:13: ( '>>' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:499:15: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SR"

    // $ANTLR start "SL"
    public final void mSL() throws RecognitionException {
        try {
            int _type = SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:500:13: ( '<<' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:500:15: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL"

    // $ANTLR start "TRIGGER"
    public final void mTRIGGER() throws RecognitionException {
        try {
            int _type = TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:501:13: ( '->' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:501:15: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRIGGER"

    // $ANTLR start "PPATH"
    public final void mPPATH() throws RecognitionException {
        try {
            int _type = PPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:502:13: ( '=>' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:502:15: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PPATH"

    // $ANTLR start "FPATH"
    public final void mFPATH() throws RecognitionException {
        try {
            int _type = FPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:503:13: ( '*>' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:503:15: '*>'
            {
            match("*>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FPATH"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:504:13: ( '\\'' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:504:15: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:505:13: ( '\"' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:505:15: '\"'
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
    // $ANTLR end "DQUOTE"

    // $ANTLR start "BSLASH"
    public final void mBSLASH() throws RecognitionException {
        try {
            int _type = BSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:506:13: ( '\\\\' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:506:15: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BSLASH"

    // $ANTLR start "EXE_QUOTE"
    public final void mEXE_QUOTE() throws RecognitionException {
        try {
            int _type = EXE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:507:13: ( '`' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:507:15: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXE_QUOTE"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:508:13: ( 'or' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:508:15: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "FPGA_PARAM_START"
    public final void mFPGA_PARAM_START() throws RecognitionException {
        try {
            int _type = FPGA_PARAM_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:511:18: ( '(*' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:511:20: '(*'
            {
            match("(*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FPGA_PARAM_START"

    // $ANTLR start "FPGA_PARAM_STOP"
    public final void mFPGA_PARAM_STOP() throws RecognitionException {
        try {
            int _type = FPGA_PARAM_STOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:512:16: ( '*)' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:512:18: '*)'
            {
            match("*)"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FPGA_PARAM_STOP"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:514:7: ( 'module' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:514:9: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "PORT_DIRECTION"
    public final void mPORT_DIRECTION() throws RecognitionException {
        try {
            int _type = PORT_DIRECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:515:16: ( 'input' | 'output' | 'inout' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='i') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='n') ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3=='p') ) {
                        alt2=1;
                    }
                    else if ( (LA2_3=='o') ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0=='o') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:515:18: 'input'
                    {
                    match("input"); 



                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:515:28: 'output'
                    {
                    match("output"); 



                    }
                    break;
                case 3 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:515:39: 'inout'
                    {
                    match("inout"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PORT_DIRECTION"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:518:13: ( 'assign' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:518:15: 'assign'
            {
            match("assign"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ALWAYS"
    public final void mALWAYS() throws RecognitionException {
        try {
            int _type = ALWAYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:519:13: ( 'always' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:519:15: 'always'
            {
            match("always"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALWAYS"

    // $ANTLR start "INITIAL"
    public final void mINITIAL() throws RecognitionException {
        try {
            int _type = INITIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:520:13: ( 'initial' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:520:15: 'initial'
            {
            match("initial"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INITIAL"

    // $ANTLR start "GENERATE"
    public final void mGENERATE() throws RecognitionException {
        try {
            int _type = GENERATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:521:13: ( 'generate' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:521:15: 'generate'
            {
            match("generate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GENERATE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:524:13: ( 'if' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:524:14: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:525:13: ( 'else' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:525:14: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:527:13: ( 'begin' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:527:15: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:528:13: ( 'end' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:528:15: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "BASE_DATA_TYPE"
    public final void mBASE_DATA_TYPE() throws RecognitionException {
        try {
            int _type = BASE_DATA_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:531:16: ( 'wire' | 'reg' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='w') ) {
                alt3=1;
            }
            else if ( (LA3_0=='r') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:531:18: 'wire'
                    {
                    match("wire"); 



                    }
                    break;
                case 2 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:531:27: 'reg'
                    {
                    match("reg"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BASE_DATA_TYPE"

    // $ANTLR start "SV_DATA_TYPE"
    public final void mSV_DATA_TYPE() throws RecognitionException {
        try {
            int _type = SV_DATA_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:532:13: ( 'logic' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:532:16: 'logic'
            {
            match("logic"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SV_DATA_TYPE"

    // $ANTLR start "POSEDGE"
    public final void mPOSEDGE() throws RecognitionException {
        try {
            int _type = POSEDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:535:13: ( 'posedge' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:535:15: 'posedge'
            {
            match("posedge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSEDGE"

    // $ANTLR start "NEGEDGE"
    public final void mNEGEDGE() throws RecognitionException {
        try {
            int _type = NEGEDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:536:13: ( 'negedge' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:536:15: 'negedge'
            {
            match("negedge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEGEDGE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:540:13: ( ( '0' .. '9' )+ )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:540:15: ( '0' .. '9' )+
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:540:15: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "VALUE_BASE"
    public final void mVALUE_BASE() throws RecognitionException {
        try {
            int _type = VALUE_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:543:11: ( NUMBER SQUOTE ( 'h' | 'b' | 'd' ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:543:13: NUMBER SQUOTE ( 'h' | 'b' | 'd' )
            {
            mNUMBER(); 


            mSQUOTE(); 


            if ( input.LA(1)=='b'||input.LA(1)=='d'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUE_BASE"

    // $ANTLR start "BUS_VALUE"
    public final void mBUS_VALUE() throws RecognitionException {
        try {
            int _type = BUS_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:545:10: ( VALUE_BASE ( NUMBER | ( 'a' .. 'z' | 'A' .. 'Z' ) )+ )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:545:12: VALUE_BASE ( NUMBER | ( 'a' .. 'z' | 'A' .. 'Z' ) )+
            {
            mVALUE_BASE(); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:545:23: ( NUMBER | ( 'a' .. 'z' | 'A' .. 'Z' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }
                else if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:545:24: NUMBER
            	    {
            	    mNUMBER(); 


            	    }
            	    break;
            	case 2 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:545:33: ( 'a' .. 'z' | 'A' .. 'Z' )
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BUS_VALUE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:550:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:551:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:551:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='$'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "EXTENDED_IDENTIFIER"
    public final void mEXTENDED_IDENTIFIER() throws RecognitionException {
        try {
            int _type = EXTENDED_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:554:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '$' | '0' .. '9' )* )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:555:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '$' | '0' .. '9' )*
            {
            if ( input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:555:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '$' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='$'||LA7_0=='.'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDED_IDENTIFIER"

    // $ANTLR start "DOXY"
    public final void mDOXY() throws RecognitionException {
        try {
            int _type = DOXY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:560:7: ( '///' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:560:9: '///'
            {
            match("///"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOXY"

    // $ANTLR start "DOXYGEN_GROUP_DEF"
    public final void mDOXYGEN_GROUP_DEF() throws RecognitionException {
        try {
            int _type = DOXYGEN_GROUP_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:561:18: ( DOXY ( WS )* BSLASH 'defgroup' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:562:3: DOXY ( WS )* BSLASH 'defgroup'
            {
            mDOXY(); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:562:9: ( WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:562:9: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            mBSLASH(); 


            match("defgroup"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOXYGEN_GROUP_DEF"

    // $ANTLR start "DOXYGEN_GROUP_START"
    public final void mDOXYGEN_GROUP_START() throws RecognitionException {
        try {
            int _type = DOXYGEN_GROUP_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:564:20: ( DOXY ( WS )* '@{' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:565:3: DOXY ( WS )* '@{'
            {
            mDOXY(); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:565:8: ( WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:565:8: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match("@{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOXYGEN_GROUP_START"

    // $ANTLR start "DOXYGEN_GROUP_END"
    public final void mDOXYGEN_GROUP_END() throws RecognitionException {
        try {
            int _type = DOXYGEN_GROUP_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:567:18: ( DOXY ( WS )* '}@' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:568:3: DOXY ( WS )* '}@'
            {
            mDOXY(); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:568:8: ( WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:568:8: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match("}@"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOXYGEN_GROUP_END"

    // $ANTLR start "DOXYGEN_PARAM"
    public final void mDOXYGEN_PARAM() throws RecognitionException {
        try {
            int _type = DOXYGEN_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:570:14: ( DOXY ( WS )* BSLASH 'param' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:571:3: DOXY ( WS )* BSLASH 'param'
            {
            mDOXY(); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:571:8: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:571:8: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            mBSLASH(); 


            match("param"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOXYGEN_PARAM"

    // $ANTLR start "PREP_INCLUDE"
    public final void mPREP_INCLUDE() throws RecognitionException {
        try {
            int _type = PREP_INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:577:13: ( EXE_QUOTE 'include' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:577:15: EXE_QUOTE 'include'
            {
            mEXE_QUOTE(); 


            match("include"); 



            _channel=HIDDEN;

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
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:578:11: ( EXE_QUOTE 'ifdef' IDENTIFIER )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:578:13: EXE_QUOTE 'ifdef' IDENTIFIER
            {
            mEXE_QUOTE(); 


            match("ifdef"); 



            mIDENTIFIER(); 


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_IFDEF"

    // $ANTLR start "PREP_ELSE"
    public final void mPREP_ELSE() throws RecognitionException {
        try {
            int _type = PREP_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:579:10: ( EXE_QUOTE ELSE )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:579:12: EXE_QUOTE ELSE
            {
            mEXE_QUOTE(); 


            mELSE(); 


            _channel=HIDDEN;

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
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:580:11: ( EXE_QUOTE 'endif' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:580:13: EXE_QUOTE 'endif'
            {
            mEXE_QUOTE(); 


            match("endif"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREP_ENDIF"

    // $ANTLR start "COMM_BEGIN"
    public final void mCOMM_BEGIN() throws RecognitionException {
        try {
            int _type = COMM_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:589:16: ( '//' ~ ( DIV ) )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:589:18: '//' ~ ( DIV )
            {
            match("//"); 



            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMM_BEGIN"

    // $ANTLR start "COMMENTAR_SHORT"
    public final void mCOMMENTAR_SHORT() throws RecognitionException {
        try {
            int _type = COMMENTAR_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:590:16: ( COMM_BEGIN (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:590:18: COMM_BEGIN (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            mCOMM_BEGIN(); 


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:590:29: (~ ( '\\n' | '\\r' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
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
            	    break loop12;
                }
            } while (true);


            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:590:43: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:590:43: '\\r'
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
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:591:15: ( '/*' ( . )* '*/' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:591:17: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:591:22: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:591:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:592:8: ( ( '\\r' )? '\\n' )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:592:9: ( '\\r' )? '\\n'
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:592:9: ( '\\r' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:592:9: '\\r'
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
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:593:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:593:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:593:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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

    public void mTokens() throws RecognitionException {
        // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:8: ( T__101 | T__102 | AT | COLON | COMMA | DOT | EQUAL | MINUS | LBRACK | RBRACK | LCURLY | RCURLY | LPAREN | RPAREN | POUND | QUESTION | SEMI | PLUS | LNOT | BNOT | BAND | RNAND | BOR | RNOR | BXOR | BXNOR | STAR | DIV | MOD | EQ | NOT_EQ | NOT_EQ_CASE | EQ_CASE | LAND | LOR | LT | LE | GT | GE | SR | SL | TRIGGER | PPATH | FPATH | SQUOTE | DQUOTE | BSLASH | EXE_QUOTE | OR | FPGA_PARAM_START | FPGA_PARAM_STOP | MODULE | PORT_DIRECTION | ASSIGN | ALWAYS | INITIAL | GENERATE | IF | ELSE | BEGIN | END | BASE_DATA_TYPE | SV_DATA_TYPE | POSEDGE | NEGEDGE | NUMBER | VALUE_BASE | BUS_VALUE | IDENTIFIER | EXTENDED_IDENTIFIER | DOXY | DOXYGEN_GROUP_DEF | DOXYGEN_GROUP_START | DOXYGEN_GROUP_END | DOXYGEN_PARAM | PREP_INCLUDE | PREP_IFDEF | PREP_ELSE | PREP_ENDIF | COMM_BEGIN | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS )
        int alt17=84;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:10: T__101
                {
                mT__101(); 


                }
                break;
            case 2 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:17: T__102
                {
                mT__102(); 


                }
                break;
            case 3 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:24: AT
                {
                mAT(); 


                }
                break;
            case 4 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:27: COLON
                {
                mCOLON(); 


                }
                break;
            case 5 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:33: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 6 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:39: DOT
                {
                mDOT(); 


                }
                break;
            case 7 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:43: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 8 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:49: MINUS
                {
                mMINUS(); 


                }
                break;
            case 9 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:55: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 10 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:62: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 11 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:69: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 12 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:76: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 13 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:83: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 14 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:90: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 15 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:97: POUND
                {
                mPOUND(); 


                }
                break;
            case 16 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:103: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 17 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:112: SEMI
                {
                mSEMI(); 


                }
                break;
            case 18 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:117: PLUS
                {
                mPLUS(); 


                }
                break;
            case 19 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:122: LNOT
                {
                mLNOT(); 


                }
                break;
            case 20 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:127: BNOT
                {
                mBNOT(); 


                }
                break;
            case 21 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:132: BAND
                {
                mBAND(); 


                }
                break;
            case 22 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:137: RNAND
                {
                mRNAND(); 


                }
                break;
            case 23 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:143: BOR
                {
                mBOR(); 


                }
                break;
            case 24 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:147: RNOR
                {
                mRNOR(); 


                }
                break;
            case 25 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:152: BXOR
                {
                mBXOR(); 


                }
                break;
            case 26 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:157: BXNOR
                {
                mBXNOR(); 


                }
                break;
            case 27 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:163: STAR
                {
                mSTAR(); 


                }
                break;
            case 28 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:168: DIV
                {
                mDIV(); 


                }
                break;
            case 29 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:172: MOD
                {
                mMOD(); 


                }
                break;
            case 30 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:176: EQ
                {
                mEQ(); 


                }
                break;
            case 31 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:179: NOT_EQ
                {
                mNOT_EQ(); 


                }
                break;
            case 32 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:186: NOT_EQ_CASE
                {
                mNOT_EQ_CASE(); 


                }
                break;
            case 33 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:198: EQ_CASE
                {
                mEQ_CASE(); 


                }
                break;
            case 34 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:206: LAND
                {
                mLAND(); 


                }
                break;
            case 35 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:211: LOR
                {
                mLOR(); 


                }
                break;
            case 36 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:215: LT
                {
                mLT(); 


                }
                break;
            case 37 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:218: LE
                {
                mLE(); 


                }
                break;
            case 38 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:221: GT
                {
                mGT(); 


                }
                break;
            case 39 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:224: GE
                {
                mGE(); 


                }
                break;
            case 40 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:227: SR
                {
                mSR(); 


                }
                break;
            case 41 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:230: SL
                {
                mSL(); 


                }
                break;
            case 42 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:233: TRIGGER
                {
                mTRIGGER(); 


                }
                break;
            case 43 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:241: PPATH
                {
                mPPATH(); 


                }
                break;
            case 44 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:247: FPATH
                {
                mFPATH(); 


                }
                break;
            case 45 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:253: SQUOTE
                {
                mSQUOTE(); 


                }
                break;
            case 46 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:260: DQUOTE
                {
                mDQUOTE(); 


                }
                break;
            case 47 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:267: BSLASH
                {
                mBSLASH(); 


                }
                break;
            case 48 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:274: EXE_QUOTE
                {
                mEXE_QUOTE(); 


                }
                break;
            case 49 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:284: OR
                {
                mOR(); 


                }
                break;
            case 50 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:287: FPGA_PARAM_START
                {
                mFPGA_PARAM_START(); 


                }
                break;
            case 51 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:304: FPGA_PARAM_STOP
                {
                mFPGA_PARAM_STOP(); 


                }
                break;
            case 52 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:320: MODULE
                {
                mMODULE(); 


                }
                break;
            case 53 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:327: PORT_DIRECTION
                {
                mPORT_DIRECTION(); 


                }
                break;
            case 54 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:342: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 55 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:349: ALWAYS
                {
                mALWAYS(); 


                }
                break;
            case 56 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:356: INITIAL
                {
                mINITIAL(); 


                }
                break;
            case 57 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:364: GENERATE
                {
                mGENERATE(); 


                }
                break;
            case 58 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:373: IF
                {
                mIF(); 


                }
                break;
            case 59 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:376: ELSE
                {
                mELSE(); 


                }
                break;
            case 60 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:381: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 61 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:387: END
                {
                mEND(); 


                }
                break;
            case 62 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:391: BASE_DATA_TYPE
                {
                mBASE_DATA_TYPE(); 


                }
                break;
            case 63 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:406: SV_DATA_TYPE
                {
                mSV_DATA_TYPE(); 


                }
                break;
            case 64 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:419: POSEDGE
                {
                mPOSEDGE(); 


                }
                break;
            case 65 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:427: NEGEDGE
                {
                mNEGEDGE(); 


                }
                break;
            case 66 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:435: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 67 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:442: VALUE_BASE
                {
                mVALUE_BASE(); 


                }
                break;
            case 68 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:453: BUS_VALUE
                {
                mBUS_VALUE(); 


                }
                break;
            case 69 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:463: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 70 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:474: EXTENDED_IDENTIFIER
                {
                mEXTENDED_IDENTIFIER(); 


                }
                break;
            case 71 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:494: DOXY
                {
                mDOXY(); 


                }
                break;
            case 72 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:499: DOXYGEN_GROUP_DEF
                {
                mDOXYGEN_GROUP_DEF(); 


                }
                break;
            case 73 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:517: DOXYGEN_GROUP_START
                {
                mDOXYGEN_GROUP_START(); 


                }
                break;
            case 74 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:537: DOXYGEN_GROUP_END
                {
                mDOXYGEN_GROUP_END(); 


                }
                break;
            case 75 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:555: DOXYGEN_PARAM
                {
                mDOXYGEN_PARAM(); 


                }
                break;
            case 76 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:569: PREP_INCLUDE
                {
                mPREP_INCLUDE(); 


                }
                break;
            case 77 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:582: PREP_IFDEF
                {
                mPREP_IFDEF(); 


                }
                break;
            case 78 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:593: PREP_ELSE
                {
                mPREP_ELSE(); 


                }
                break;
            case 79 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:603: PREP_ENDIF
                {
                mPREP_ENDIF(); 


                }
                break;
            case 80 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:614: COMM_BEGIN
                {
                mCOMM_BEGIN(); 


                }
                break;
            case 81 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:625: COMMENTAR_SHORT
                {
                mCOMMENTAR_SHORT(); 


                }
                break;
            case 82 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:641: COMMENTAR_LONG
                {
                mCOMMENTAR_LONG(); 


                }
                break;
            case 83 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:656: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 84 :
                // /local/home/rleys/projects/phd/sw/odfi/dev/languages/antlr-recognisers/src/main/java/org/odfi/dev/languages/antlr/sv/full/SystemVerilogFull.g:1:664: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\63\3\uffff\1\67\1\72\1\74\4\uffff\1\76\5\uffff\1\100"+
        "\1\104\1\106\1\110\1\111\1\114\1\117\1\uffff\1\122\1\125\3\uffff"+
        "\1\126\12\63\1\146\1\63\1\57\1\150\1\uffff\3\63\2\uffff\2\63\1\uffff"+
        "\1\156\6\uffff\1\160\31\uffff\1\167\3\63\1\175\10\63\3\uffff\1\u0088"+
        "\3\63\4\uffff\1\u008c\1\u0091\5\uffff\5\63\1\uffff\5\63\1\u009d"+
        "\2\63\1\u00a0\1\63\1\uffff\1\u00a3\2\63\7\uffff\11\63\1\u009d\1"+
        "\uffff\2\63\2\uffff\1\63\1\uffff\2\63\2\uffff\2\63\2\u00b8\4\63"+
        "\1\u00bd\1\u00be\4\63\1\u00b8\1\u00c3\1\uffff\1\63\1\u00c5\1\u00c6"+
        "\1\63\2\uffff\3\63\1\u00cb\1\uffff\1\u00cc\2\uffff\1\63\1\u00ce"+
        "\2\63\2\uffff\1\u00d1\1\uffff\1\u00d2\1\u00d3\3\uffff";
    static final String DFA17_eofS =
        "\u00d4\uffff";
    static final String DFA17_minS =
        "\1\11\2\44\3\uffff\1\44\1\75\1\76\4\uffff\1\52\5\uffff\1\75\2\46"+
        "\1\174\1\176\1\51\1\52\1\uffff\1\74\1\75\3\uffff\1\145\12\44\1\47"+
        "\1\44\1\12\1\11\1\uffff\3\44\2\uffff\2\44\1\uffff\1\75\6\uffff\1"+
        "\75\15\uffff\1\0\11\uffff\1\146\1\154\15\44\1\uffff\1\142\1\uffff"+
        "\4\44\4\uffff\1\11\1\0\5\uffff\5\44\1\uffff\10\44\1\60\1\44\1\uffff"+
        "\3\44\1\uffff\1\11\1\144\4\uffff\12\44\1\uffff\2\44\2\uffff\1\44"+
        "\1\uffff\2\44\2\uffff\20\44\1\uffff\4\44\2\uffff\4\44\1\uffff\1"+
        "\44\2\uffff\4\44\2\uffff\1\44\1\uffff\2\44\3\uffff";
    static final String DFA17_maxS =
        "\1\176\2\172\3\uffff\1\172\2\76\4\uffff\1\52\5\uffff\1\75\1\174"+
        "\1\46\1\174\1\176\1\76\1\57\1\uffff\1\75\1\76\3\uffff\1\151\12\172"+
        "\1\71\1\172\1\12\1\40\1\uffff\3\172\2\uffff\2\172\1\uffff\1\75\6"+
        "\uffff\1\75\15\uffff\1\uffff\11\uffff\2\156\15\172\1\uffff\1\150"+
        "\1\uffff\4\172\4\uffff\1\175\1\uffff\5\uffff\5\172\1\uffff\12\172"+
        "\1\uffff\3\172\1\uffff\1\175\1\160\4\uffff\12\172\1\uffff\2\172"+
        "\2\uffff\1\172\1\uffff\2\172\2\uffff\20\172\1\uffff\4\172\2\uffff"+
        "\4\172\1\uffff\1\172\2\uffff\4\172\2\uffff\1\172\1\uffff\2\172\3"+
        "\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\11\1\12\1\13\1\14\1\uffff\1\16\1"+
        "\17\1\20\1\21\1\22\7\uffff\1\35\2\uffff\1\55\1\56\1\57\17\uffff"+
        "\1\124\3\uffff\1\105\1\106\2\uffff\1\6\1\uffff\1\53\1\7\1\52\1\10"+
        "\1\62\1\15\1\uffff\1\23\1\26\1\30\1\32\1\24\1\42\1\25\1\43\1\27"+
        "\1\31\1\54\1\63\1\33\1\uffff\1\122\1\34\1\45\1\51\1\44\1\47\1\50"+
        "\1\46\1\60\17\uffff\1\102\1\uffff\1\123\4\uffff\1\41\1\36\1\40\1"+
        "\37\2\uffff\1\114\1\115\1\116\1\117\1\61\5\uffff\1\72\12\uffff\1"+
        "\75\3\uffff\1\107\2\uffff\1\111\1\112\1\120\1\121\12\uffff\1\76"+
        "\2\uffff\1\103\1\104\1\uffff\1\73\2\uffff\1\110\1\113\20\uffff\1"+
        "\65\4\uffff\1\74\1\77\4\uffff\1\64\1\uffff\1\66\1\67\4\uffff\1\100"+
        "\1\70\1\uffff\1\101\2\uffff\1\71\1\1\1\2";
    static final String DFA17_specialS =
        "\115\uffff\1\1\44\uffff\1\0\141\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\57\1\56\2\uffff\1\55\22\uffff\1\57\1\23\1\36\1\17\1\uffff"+
            "\1\32\1\25\1\35\1\15\1\16\1\30\1\22\1\5\1\10\1\6\1\31\12\53"+
            "\1\4\1\21\1\33\1\7\1\34\1\20\1\3\32\54\1\11\1\37\1\12\1\27\1"+
            "\54\1\40\1\44\1\46\2\54\1\1\1\54\1\45\1\54\1\43\2\54\1\51\1"+
            "\42\1\52\1\41\1\2\1\54\1\50\4\54\1\47\3\54\1\13\1\26\1\14\1"+
            "\24",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\13\62\1\61\1\62\1\60\14\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\1\65\15\62\1\66\13\62",
            "",
            "",
            "",
            "\1\64\11\uffff\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\70\1\71",
            "\1\73",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\101\67\uffff\1\103\35\uffff\1\102",
            "\1\105",
            "\1\107",
            "\1\103",
            "\1\113\24\uffff\1\112",
            "\1\116\4\uffff\1\115",
            "",
            "\1\121\1\120",
            "\1\123\1\124",
            "",
            "",
            "",
            "\1\130\3\uffff\1\127",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\21\62\1\131\2\62\1\132\5\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\16\62\1\133\13\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\5\62\1\135\7\62\1\134\14\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\13\62\1\137\6\62\1\136\7\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\140\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\141\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\10\62\1\142\21\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\143\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\16\62\1\144\13\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\145\25\62",
            "\1\147\10\uffff\12\53",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\56",
            "\2\57\2\uffff\1\57\22\uffff\1\57",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\3\62\1\151\26\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\22\62\1\152\7\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\21\62\1\153\10\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\22\62\1\154\7\62",
            "",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\57\162\1\161\uffd0\162",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164\7\uffff\1\163",
            "\1\165\1\uffff\1\166",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\170\6\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\3\62\1\171\26\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\10\62\1\174\5\62\1\173\1\172\12\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\22\62\1\176\7\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\26\62\1\177\3\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\15\62\1\u0080\14\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u0081\23\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\21\62\1\u0082\10\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u0083\23\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u0084\23\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u0085\23\62",
            "",
            "\1\u0086\1\uffff\1\u0086\3\uffff\1\u0086",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\14\62\1\u0087\15\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u0089\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\1\u008a\31\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u008b\25\62",
            "",
            "",
            "",
            "",
            "\2\u008d\2\uffff\1\u008d\22\uffff\1\u008d\37\uffff\1\u008f"+
            "\33\uffff\1\u008e\40\uffff\1\u0090",
            "\0\u0092",
            "",
            "",
            "",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\17\62\1\u0093\12\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\24\62\1\u0094\5\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\24\62\1\u0095\5\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\24\62\1\u0096\5\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\u0097\6\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\10\62\1\u0098\21\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\1\u0099\31\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u009a\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\10\62\1\u009b\21\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u009c\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\10\62\1\u009e\21\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u009f\25\62",
            "\12\u00a1\7\uffff\32\u00a1\6\uffff\32\u00a1",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\16\62\1\u00a2\13\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\14\62\1\u00a4\15\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\3\62\1\u00a5\26\62",
            "",
            "\2\u008d\2\uffff\1\u008d\22\uffff\1\u008d\37\uffff\1\u008f"+
            "\33\uffff\1\u008e\40\uffff\1\u0090",
            "\1\u00a6\13\uffff\1\u00a7",
            "",
            "",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\24\62\1\u00a8\5\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\13\62\1\u00a9\16\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\u00aa\6\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\u00ab\6\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\10\62\1\u00ac\21\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u00ad\23\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\30\62\1\u00ae\1\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\21\62\1\u00af\10\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\15\62\1\u00b0\14\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\2\62\1\u00b1\27\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\3\62\1\u00b2\26\62",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\3\62\1\u00b3\26\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00b4\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u00b5\23\62",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\u00b6\6\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00b7\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\1\u00b9\31\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\15\62\1\u00ba\14\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\22\62\1\u00bb\7\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\1\u00bc\31\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\6\62\1\u00bf\23\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\24\62\1\u00c0\5\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\u00c1\6\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00c2\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\13\62\1\u00c4\16\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\23\62\1\u00c7\6\62",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00c8\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\13\62\1\u00c9\16\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00ca\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00cd\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\4\62\1\u00cf\25\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\21\62\1\u00d0\10\62",
            "",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "\1\62\11\uffff\1\64\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62"+
            "\1\uffff\32\62",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__101 | T__102 | AT | COLON | COMMA | DOT | EQUAL | MINUS | LBRACK | RBRACK | LCURLY | RCURLY | LPAREN | RPAREN | POUND | QUESTION | SEMI | PLUS | LNOT | BNOT | BAND | RNAND | BOR | RNOR | BXOR | BXNOR | STAR | DIV | MOD | EQ | NOT_EQ | NOT_EQ_CASE | EQ_CASE | LAND | LOR | LT | LE | GT | GE | SR | SL | TRIGGER | PPATH | FPATH | SQUOTE | DQUOTE | BSLASH | EXE_QUOTE | OR | FPGA_PARAM_START | FPGA_PARAM_STOP | MODULE | PORT_DIRECTION | ASSIGN | ALWAYS | INITIAL | GENERATE | IF | ELSE | BEGIN | END | BASE_DATA_TYPE | SV_DATA_TYPE | POSEDGE | NEGEDGE | NUMBER | VALUE_BASE | BUS_VALUE | IDENTIFIER | EXTENDED_IDENTIFIER | DOXY | DOXYGEN_GROUP_DEF | DOXYGEN_GROUP_START | DOXYGEN_GROUP_END | DOXYGEN_PARAM | PREP_INCLUDE | PREP_IFDEF | PREP_ELSE | PREP_ENDIF | COMM_BEGIN | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_114 = input.LA(1);

                        s = -1;
                        if ( ((LA17_114 >= '\u0000' && LA17_114 <= '\uFFFF')) ) {s = 146;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_77 = input.LA(1);

                        s = -1;
                        if ( (LA17_77=='/') ) {s = 113;}

                        else if ( ((LA17_77 >= '\u0000' && LA17_77 <= '.')||(LA17_77 >= '0' && LA17_77 <= '\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}
