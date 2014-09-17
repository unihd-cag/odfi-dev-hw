// $ANTLR 3.5.2 E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g 2014-09-16 23:10:17

package org.odfi.dev.verilog.parser.sv.full;

import org.odfi.dev.verilog.parser.parsing.*;
import org.odfi.dev.verilog.parser.parsing.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SystemVerilogFullLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g"; }

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:15:8: ( 'parameter' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:15:10: 'parameter'
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
	// $ANTLR end "T__104"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:470:13: ( '@' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:470:15: '@'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:471:13: ( ':' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:471:15: ':'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:472:13: ( ',' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:472:15: ','
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:473:13: ( '.' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:473:15: '.'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:474:13: ( '=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:474:15: '='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:475:13: ( '-' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:475:15: '-'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:476:13: ( '[' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:476:15: '['
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:477:13: ( ']' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:477:15: ']'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:478:13: ( '{' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:478:15: '{'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:479:13: ( '}' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:479:15: '}'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:480:13: ( '(' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:480:15: '('
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:481:13: ( ')' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:481:15: ')'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:482:13: ( '#' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:482:15: '#'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:483:13: ( '?' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:483:15: '?'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:484:13: ( ';' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:484:15: ';'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:485:13: ( '+' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:485:15: '+'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:486:13: ( '!' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:486:15: '!'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:487:13: ( '~' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:487:15: '~'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:488:13: ( '&' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:488:15: '&'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:489:13: ( '~&' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:489:15: '~&'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:490:13: ( '|' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:490:15: '|'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:491:13: ( '~|' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:491:15: '~|'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:492:13: ( '^' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:492:15: '^'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:493:13: ( '~^' | '^~' )
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:493:15: '~^'
					{
					match("~^"); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:493:22: '^~'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:494:13: ( '*' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:494:15: '*'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:495:13: ( '/' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:495:15: '/'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:496:13: ( '%' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:496:15: '%'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:497:13: ( '==' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:497:15: '=='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:498:13: ( '!=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:498:15: '!='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:499:13: ( '!==' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:499:15: '!=='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:500:13: ( '===' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:500:15: '==='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:501:13: ( '&&' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:501:15: '&&'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:502:13: ( '||' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:502:15: '||'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:503:13: ( '<' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:503:15: '<'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:504:13: ( '<=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:504:15: '<='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:505:13: ( '>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:505:15: '>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:506:13: ( '>=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:506:15: '>='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:507:13: ( '>>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:507:15: '>>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:508:13: ( '<<' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:508:15: '<<'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:509:13: ( '->' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:509:15: '->'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:510:13: ( '=>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:510:15: '=>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:511:13: ( '*>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:511:15: '*>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:512:13: ( '\\'' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:512:15: '\\''
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:513:13: ( '\"' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:513:15: '\"'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:514:13: ( '\\\\' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:514:15: '\\\\'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:515:13: ( '`' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:515:15: '`'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:516:13: ( 'or' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:516:15: 'or'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:519:18: ( '(*' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:519:20: '(*'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:520:16: ( '*)' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:520:18: '*)'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:523:7: ( 'module' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:523:9: 'module'
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

	// $ANTLR start "ENDMODULE"
	public final void mENDMODULE() throws RecognitionException {
		try {
			int _type = ENDMODULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:524:10: ( 'endmodule' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:524:12: 'endmodule'
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
	// $ANTLR end "ENDMODULE"

	// $ANTLR start "PORT_DIRECTION"
	public final void mPORT_DIRECTION() throws RecognitionException {
		try {
			int _type = PORT_DIRECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:525:16: ( 'input' | 'output' | 'inout' )
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:525:18: 'input'
					{
					match("input"); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:525:28: 'output'
					{
					match("output"); 

					}
					break;
				case 3 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:525:39: 'inout'
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

	// $ANTLR start "CONNECTION_IDENTIFIER"
	public final void mCONNECTION_IDENTIFIER() throws RecognitionException {
		try {
			int _type = CONNECTION_IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:528:22: ( DOT IDENTIFIER )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:528:24: DOT IDENTIFIER
			{
			mDOT(); 

			mIDENTIFIER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONNECTION_IDENTIFIER"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:531:13: ( 'assign' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:531:15: 'assign'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:532:13: ( 'always' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:532:15: 'always'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:533:13: ( 'initial' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:533:15: 'initial'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:534:13: ( 'generate' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:534:15: 'generate'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:537:13: ( 'if' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:537:14: 'if'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:538:13: ( 'else' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:538:14: 'else'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:540:13: ( 'begin' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:540:15: 'begin'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:541:13: ( 'end' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:541:15: 'end'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:544:16: ( 'wire' | 'reg' )
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:544:18: 'wire'
					{
					match("wire"); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:544:27: 'reg'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:545:13: ( 'logic' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:545:16: 'logic'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:548:13: ( 'posedge' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:548:15: 'posedge'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:549:13: ( 'negedge' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:549:15: 'negedge'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:553:13: ( ( '0' .. '9' )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:553:15: ( '0' .. '9' )+
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:553:15: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
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
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:556:11: ( NUMBER SQUOTE ( 'h' | 'b' | 'd' ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:556:13: NUMBER SQUOTE ( 'h' | 'b' | 'd' )
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:558:10: ( VALUE_BASE ( NUMBER | ( 'a' .. 'z' | 'A' .. 'Z' ) )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:558:12: VALUE_BASE ( NUMBER | ( 'a' .. 'z' | 'A' .. 'Z' ) )+
			{
			mVALUE_BASE(); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:558:23: ( NUMBER | ( 'a' .. 'z' | 'A' .. 'Z' ) )+
			int cnt5=0;
			loop5:
			while (true) {
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:558:24: NUMBER
					{
					mNUMBER(); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:558:33: ( 'a' .. 'z' | 'A' .. 'Z' )
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
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:563:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:564:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:564:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='$'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
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
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:567:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '$' | '0' .. '9' )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:568:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:568:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '$' | '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='$'||LA7_0=='.'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
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
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:573:7: ( '///' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:573:9: '///'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:574:18: ( DOXY ( WS )* BSLASH 'defgroup' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:575:3: DOXY ( WS )* BSLASH 'defgroup'
			{
			mDOXY(); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:575:9: ( WS )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:575:9: WS
					{
					mWS(); 

					}
					break;

				default :
					break loop8;
				}
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:577:20: ( DOXY ( WS )* '@{' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:578:3: DOXY ( WS )* '@{'
			{
			mDOXY(); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:578:8: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:578:8: WS
					{
					mWS(); 

					}
					break;

				default :
					break loop9;
				}
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:580:18: ( DOXY ( WS )* '}@' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:581:3: DOXY ( WS )* '}@'
			{
			mDOXY(); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:581:8: ( WS )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:581:8: WS
					{
					mWS(); 

					}
					break;

				default :
					break loop10;
				}
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:583:14: ( DOXY ( WS )* BSLASH 'param' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:584:3: DOXY ( WS )* BSLASH 'param'
			{
			mDOXY(); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:584:8: ( WS )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:584:8: WS
					{
					mWS(); 

					}
					break;

				default :
					break loop11;
				}
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:592:13: ( EXE_QUOTE 'include' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:592:15: EXE_QUOTE 'include'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:593:11: ( EXE_QUOTE 'ifdef' IDENTIFIER )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:593:13: EXE_QUOTE 'ifdef' IDENTIFIER
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:594:10: ( EXE_QUOTE ELSE )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:594:12: EXE_QUOTE ELSE
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:595:11: ( EXE_QUOTE 'endif' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:595:13: EXE_QUOTE 'endif'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:602:16: ( '//' ~ ( DIV ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:602:18: '//' ~ ( DIV )
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:603:16: ( COMM_BEGIN (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:603:18: COMM_BEGIN (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			mCOMM_BEGIN(); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:603:29: (~ ( '\\n' | '\\r' ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
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
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:603:43: ( '\\r' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\r') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:603:43: '\\r'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:604:15: ( '/*' ( . )* '*/' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:604:17: '/*' ( . )* '*/'
			{
			match("/*"); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:604:22: ( . )*
			loop14:
			while (true) {
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:604:22: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop14;
				}
			}

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:605:8: ( ( '\\r' )? '\\n' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:605:9: ( '\\r' )? '\\n'
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:605:9: ( '\\r' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\r') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:605:9: '\\r'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:606:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:606:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:606:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:
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
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

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

	// $ANTLR start "ANY"
	public final void mANY() throws RecognitionException {
		try {
			int _type = ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:608:4: ( . )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:608:6: .
			{
			matchAny(); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANY"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:8: ( T__104 | AT | COLON | COMMA | DOT | EQUAL | MINUS | LBRACK | RBRACK | LCURLY | RCURLY | LPAREN | RPAREN | POUND | QUESTION | SEMI | PLUS | LNOT | BNOT | BAND | RNAND | BOR | RNOR | BXOR | BXNOR | STAR | DIV | MOD | EQ | NOT_EQ | NOT_EQ_CASE | EQ_CASE | LAND | LOR | LT | LE | GT | GE | SR | SL | TRIGGER | PPATH | FPATH | SQUOTE | DQUOTE | BSLASH | EXE_QUOTE | OR | FPGA_PARAM_START | FPGA_PARAM_STOP | MODULE | ENDMODULE | PORT_DIRECTION | CONNECTION_IDENTIFIER | ASSIGN | ALWAYS | INITIAL | GENERATE | IF | ELSE | BEGIN | END | BASE_DATA_TYPE | SV_DATA_TYPE | POSEDGE | NEGEDGE | NUMBER | VALUE_BASE | BUS_VALUE | IDENTIFIER | EXTENDED_IDENTIFIER | DOXY | DOXYGEN_GROUP_DEF | DOXYGEN_GROUP_START | DOXYGEN_GROUP_END | DOXYGEN_PARAM | PREP_INCLUDE | PREP_IFDEF | PREP_ELSE | PREP_ENDIF | COMM_BEGIN | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS | ANY )
		int alt17=86;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:10: T__104
				{
				mT__104(); 

				}
				break;
			case 2 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:17: AT
				{
				mAT(); 

				}
				break;
			case 3 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:20: COLON
				{
				mCOLON(); 

				}
				break;
			case 4 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:26: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 5 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:32: DOT
				{
				mDOT(); 

				}
				break;
			case 6 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:36: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 7 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:42: MINUS
				{
				mMINUS(); 

				}
				break;
			case 8 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:48: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 9 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:55: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 10 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:62: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 11 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:69: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 12 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:76: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 13 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:83: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 14 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:90: POUND
				{
				mPOUND(); 

				}
				break;
			case 15 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:96: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 16 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:105: SEMI
				{
				mSEMI(); 

				}
				break;
			case 17 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:110: PLUS
				{
				mPLUS(); 

				}
				break;
			case 18 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:115: LNOT
				{
				mLNOT(); 

				}
				break;
			case 19 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:120: BNOT
				{
				mBNOT(); 

				}
				break;
			case 20 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:125: BAND
				{
				mBAND(); 

				}
				break;
			case 21 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:130: RNAND
				{
				mRNAND(); 

				}
				break;
			case 22 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:136: BOR
				{
				mBOR(); 

				}
				break;
			case 23 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:140: RNOR
				{
				mRNOR(); 

				}
				break;
			case 24 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:145: BXOR
				{
				mBXOR(); 

				}
				break;
			case 25 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:150: BXNOR
				{
				mBXNOR(); 

				}
				break;
			case 26 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:156: STAR
				{
				mSTAR(); 

				}
				break;
			case 27 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:161: DIV
				{
				mDIV(); 

				}
				break;
			case 28 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:165: MOD
				{
				mMOD(); 

				}
				break;
			case 29 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:169: EQ
				{
				mEQ(); 

				}
				break;
			case 30 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:172: NOT_EQ
				{
				mNOT_EQ(); 

				}
				break;
			case 31 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:179: NOT_EQ_CASE
				{
				mNOT_EQ_CASE(); 

				}
				break;
			case 32 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:191: EQ_CASE
				{
				mEQ_CASE(); 

				}
				break;
			case 33 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:199: LAND
				{
				mLAND(); 

				}
				break;
			case 34 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:204: LOR
				{
				mLOR(); 

				}
				break;
			case 35 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:208: LT
				{
				mLT(); 

				}
				break;
			case 36 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:211: LE
				{
				mLE(); 

				}
				break;
			case 37 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:214: GT
				{
				mGT(); 

				}
				break;
			case 38 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:217: GE
				{
				mGE(); 

				}
				break;
			case 39 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:220: SR
				{
				mSR(); 

				}
				break;
			case 40 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:223: SL
				{
				mSL(); 

				}
				break;
			case 41 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:226: TRIGGER
				{
				mTRIGGER(); 

				}
				break;
			case 42 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:234: PPATH
				{
				mPPATH(); 

				}
				break;
			case 43 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:240: FPATH
				{
				mFPATH(); 

				}
				break;
			case 44 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:246: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 45 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:253: DQUOTE
				{
				mDQUOTE(); 

				}
				break;
			case 46 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:260: BSLASH
				{
				mBSLASH(); 

				}
				break;
			case 47 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:267: EXE_QUOTE
				{
				mEXE_QUOTE(); 

				}
				break;
			case 48 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:277: OR
				{
				mOR(); 

				}
				break;
			case 49 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:280: FPGA_PARAM_START
				{
				mFPGA_PARAM_START(); 

				}
				break;
			case 50 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:297: FPGA_PARAM_STOP
				{
				mFPGA_PARAM_STOP(); 

				}
				break;
			case 51 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:313: MODULE
				{
				mMODULE(); 

				}
				break;
			case 52 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:320: ENDMODULE
				{
				mENDMODULE(); 

				}
				break;
			case 53 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:330: PORT_DIRECTION
				{
				mPORT_DIRECTION(); 

				}
				break;
			case 54 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:345: CONNECTION_IDENTIFIER
				{
				mCONNECTION_IDENTIFIER(); 

				}
				break;
			case 55 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:367: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 56 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:374: ALWAYS
				{
				mALWAYS(); 

				}
				break;
			case 57 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:381: INITIAL
				{
				mINITIAL(); 

				}
				break;
			case 58 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:389: GENERATE
				{
				mGENERATE(); 

				}
				break;
			case 59 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:398: IF
				{
				mIF(); 

				}
				break;
			case 60 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:401: ELSE
				{
				mELSE(); 

				}
				break;
			case 61 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:406: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 62 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:412: END
				{
				mEND(); 

				}
				break;
			case 63 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:416: BASE_DATA_TYPE
				{
				mBASE_DATA_TYPE(); 

				}
				break;
			case 64 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:431: SV_DATA_TYPE
				{
				mSV_DATA_TYPE(); 

				}
				break;
			case 65 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:444: POSEDGE
				{
				mPOSEDGE(); 

				}
				break;
			case 66 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:452: NEGEDGE
				{
				mNEGEDGE(); 

				}
				break;
			case 67 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:460: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 68 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:467: VALUE_BASE
				{
				mVALUE_BASE(); 

				}
				break;
			case 69 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:478: BUS_VALUE
				{
				mBUS_VALUE(); 

				}
				break;
			case 70 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:488: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 71 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:499: EXTENDED_IDENTIFIER
				{
				mEXTENDED_IDENTIFIER(); 

				}
				break;
			case 72 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:519: DOXY
				{
				mDOXY(); 

				}
				break;
			case 73 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:524: DOXYGEN_GROUP_DEF
				{
				mDOXYGEN_GROUP_DEF(); 

				}
				break;
			case 74 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:542: DOXYGEN_GROUP_START
				{
				mDOXYGEN_GROUP_START(); 

				}
				break;
			case 75 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:562: DOXYGEN_GROUP_END
				{
				mDOXYGEN_GROUP_END(); 

				}
				break;
			case 76 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:580: DOXYGEN_PARAM
				{
				mDOXYGEN_PARAM(); 

				}
				break;
			case 77 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:594: PREP_INCLUDE
				{
				mPREP_INCLUDE(); 

				}
				break;
			case 78 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:607: PREP_IFDEF
				{
				mPREP_IFDEF(); 

				}
				break;
			case 79 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:618: PREP_ELSE
				{
				mPREP_ELSE(); 

				}
				break;
			case 80 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:628: PREP_ENDIF
				{
				mPREP_ENDIF(); 

				}
				break;
			case 81 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:639: COMM_BEGIN
				{
				mCOMM_BEGIN(); 

				}
				break;
			case 82 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:650: COMMENTAR_SHORT
				{
				mCOMMENTAR_SHORT(); 

				}
				break;
			case 83 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:666: COMMENTAR_LONG
				{
				mCOMMENTAR_LONG(); 

				}
				break;
			case 84 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:681: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 85 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:689: WS
				{
				mWS(); 

				}
				break;
			case 86 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\full\\SystemVerilogFull.g:1:692: ANY
				{
				mANY(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\1\uffff\1\64\3\uffff\1\71\1\75\1\77\4\uffff\1\105\5\uffff\1\114\1\120"+
		"\1\122\1\124\1\125\1\130\1\133\1\uffff\1\137\1\142\3\uffff\1\146\13\64"+
		"\1\170\1\64\1\174\1\175\2\uffff\3\64\6\uffff\1\u0081\1\u0083\17\uffff"+
		"\1\u0085\35\uffff\1\u008c\5\64\1\u0094\10\64\1\uffff\1\170\1\uffff\1\175"+
		"\2\uffff\2\64\1\u0081\5\uffff\1\u00a0\1\u00a5\5\uffff\2\64\1\u00aa\4\64"+
		"\1\uffff\5\64\1\u00b4\2\64\1\u00b7\2\64\7\uffff\3\64\1\uffff\1\u00c0\7"+
		"\64\1\u00b4\1\uffff\2\64\2\uffff\2\64\2\uffff\3\64\1\uffff\2\u00cf\4\64"+
		"\1\u00d4\1\u00d5\3\64\1\u00cf\1\u00d9\1\64\1\uffff\1\64\1\u00dc\1\u00dd"+
		"\1\64\2\uffff\2\64\1\u00e1\1\uffff\1\64\1\u00e3\2\uffff\1\64\1\u00e5\1"+
		"\64\1\uffff\1\64\1\uffff\1\u00e8\1\uffff\1\u00e9\1\u00ea\3\uffff";
	static final String DFA17_eofS =
		"\u00eb\uffff";
	static final String DFA17_minS =
		"\1\0\1\44\3\uffff\1\44\1\75\1\76\4\uffff\1\52\5\uffff\1\75\2\46\1\174"+
		"\1\176\1\51\1\52\1\uffff\1\74\1\75\3\uffff\1\145\13\44\1\47\1\44\1\12"+
		"\1\11\2\uffff\3\44\6\uffff\1\44\1\75\17\uffff\1\75\15\uffff\1\0\15\uffff"+
		"\1\146\1\154\17\44\1\uffff\1\47\1\142\1\11\2\uffff\3\44\5\uffff\1\11\1"+
		"\0\5\uffff\7\44\1\uffff\10\44\1\60\2\44\1\uffff\1\11\1\144\4\uffff\3\44"+
		"\1\uffff\11\44\1\uffff\2\44\2\uffff\2\44\2\uffff\3\44\1\uffff\16\44\1"+
		"\uffff\4\44\2\uffff\3\44\1\uffff\2\44\2\uffff\3\44\1\uffff\1\44\1\uffff"+
		"\1\44\1\uffff\2\44\3\uffff";
	static final String DFA17_maxS =
		"\1\uffff\1\172\3\uffff\1\172\2\76\4\uffff\1\52\5\uffff\1\75\1\174\1\46"+
		"\1\174\1\176\1\76\1\57\1\uffff\1\75\1\76\3\uffff\1\151\13\172\1\71\1\172"+
		"\1\12\1\40\2\uffff\3\172\6\uffff\1\172\1\75\17\uffff\1\75\15\uffff\1\uffff"+
		"\15\uffff\2\156\17\172\1\uffff\1\71\1\150\1\40\2\uffff\3\172\5\uffff\1"+
		"\175\1\uffff\5\uffff\7\172\1\uffff\13\172\1\uffff\1\175\1\160\4\uffff"+
		"\3\172\1\uffff\11\172\1\uffff\2\172\2\uffff\2\172\2\uffff\3\172\1\uffff"+
		"\16\172\1\uffff\4\172\2\uffff\3\172\1\uffff\2\172\2\uffff\3\172\1\uffff"+
		"\1\172\1\uffff\1\172\1\uffff\2\172\3\uffff";
	static final String DFA17_acceptS =
		"\2\uffff\1\2\1\3\1\4\3\uffff\1\10\1\11\1\12\1\13\1\uffff\1\15\1\16\1\17"+
		"\1\20\1\21\7\uffff\1\34\2\uffff\1\54\1\55\1\56\20\uffff\1\125\1\126\3"+
		"\uffff\1\106\1\107\1\2\1\3\1\4\1\5\2\uffff\1\52\1\6\1\51\1\7\1\10\1\11"+
		"\1\12\1\13\1\61\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\22\1\25\1\27\1"+
		"\31\1\23\1\41\1\24\1\42\1\26\1\30\1\53\1\62\1\32\1\uffff\1\123\1\33\1"+
		"\34\1\44\1\50\1\43\1\46\1\47\1\45\1\54\1\55\1\56\1\57\21\uffff\1\103\3"+
		"\uffff\1\125\1\124\3\uffff\1\66\1\40\1\35\1\37\1\36\2\uffff\1\115\1\116"+
		"\1\117\1\120\1\60\7\uffff\1\73\13\uffff\1\110\2\uffff\1\112\1\113\1\121"+
		"\1\122\3\uffff\1\76\11\uffff\1\77\2\uffff\1\104\1\105\2\uffff\1\111\1"+
		"\114\3\uffff\1\74\16\uffff\1\65\4\uffff\1\75\1\100\3\uffff\1\63\2\uffff"+
		"\1\67\1\70\3\uffff\1\101\1\uffff\1\71\1\uffff\1\102\2\uffff\1\72\1\1\1"+
		"\64";
	static final String DFA17_specialS =
		"\1\0\130\uffff\1\2\55\uffff\1\1\143\uffff}>";
	static final String[] DFA17_transitionS = {
			"\11\60\1\57\1\56\2\60\1\55\22\60\1\57\1\22\1\35\1\16\1\60\1\31\1\24\1"+
			"\34\1\14\1\15\1\27\1\21\1\4\1\7\1\5\1\30\12\53\1\3\1\20\1\32\1\6\1\33"+
			"\1\17\1\2\32\54\1\10\1\36\1\11\1\26\1\54\1\37\1\44\1\46\2\54\1\42\1\54"+
			"\1\45\1\54\1\43\2\54\1\51\1\41\1\52\1\40\1\1\1\54\1\50\4\54\1\47\3\54"+
			"\1\12\1\25\1\13\1\23\uff81\60",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\1\61\15\63\1\62\13\63",
			"",
			"",
			"",
			"\1\65\11\uffff\1\65\1\uffff\12\65\7\uffff\32\72\4\uffff\1\72\1\uffff"+
			"\32\72",
			"\1\73\1\74",
			"\1\76",
			"",
			"",
			"",
			"",
			"\1\104",
			"",
			"",
			"",
			"",
			"",
			"\1\113",
			"\1\115\67\uffff\1\117\35\uffff\1\116",
			"\1\121",
			"\1\123",
			"\1\117",
			"\1\127\24\uffff\1\126",
			"\1\132\4\uffff\1\131",
			"",
			"\1\136\1\135",
			"\1\140\1\141",
			"",
			"",
			"",
			"\1\150\3\uffff\1\147",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\21\63\1\151\2\63\1\152\5\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\16\63\1\153\13\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\13\63\1\155\1\63\1\154\14\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\5\63\1\157\7\63\1\156\14\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\13\63\1\161\6\63\1\160\7\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\162\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\163\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\10\63\1\164\21\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\165\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\16\63\1\166\13\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\167\25\63",
			"\1\172\10\uffff\12\171",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\173",
			"\2\174\2\uffff\1\174\22\uffff\1\174",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\21\63\1\176\10\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\22\63\1\177\7\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0080\11\uffff\1\65\1\uffff\12\u0080\7\uffff\32\u0080\4\uffff\1\u0080"+
			"\1\uffff\32\u0080",
			"\1\u0082",
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
			"",
			"",
			"\1\u0084",
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
			"\57\u0087\1\u0086\uffd0\u0087",
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
			"\1\u0089\7\uffff\1\u0088",
			"\1\u008a\1\uffff\1\u008b",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u008d\6\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\3\63\1\u008e\26\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\3\63\1\u008f\26\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\22\63\1\u0090\7\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\10\63\1\u0093\5\63\1\u0092\1\u0091\12\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\22\63\1\u0095\7\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\26\63\1\u0096\3\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\15\63\1\u0097\14\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u0098\23\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\21\63\1\u0099\10\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u009a\23\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u009b\23\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u009c\23\63",
			"",
			"\1\172\10\uffff\12\171",
			"\1\u009d\1\uffff\1\u009d\3\uffff\1\u009d",
			"\2\174\2\uffff\1\174\22\uffff\1\174",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\1\u009e\31\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u009f\25\63",
			"\1\u0080\11\uffff\1\65\1\uffff\12\u0080\7\uffff\32\u0080\4\uffff\1\u0080"+
			"\1\uffff\32\u0080",
			"",
			"",
			"",
			"",
			"",
			"\2\u00a1\2\uffff\1\u00a1\22\uffff\1\u00a1\37\uffff\1\u00a3\33\uffff"+
			"\1\u00a2\40\uffff\1\u00a4",
			"\0\u00a6",
			"",
			"",
			"",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\17\63\1\u00a7\12\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\24\63\1\u00a8\5\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\14\63\1\u00a9\15\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00ab\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\24\63\1\u00ac\5\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\24\63\1\u00ad\5\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u00ae\6\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\10\63\1\u00af\21\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\1\u00b0\31\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00b1\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\10\63\1\u00b2\21\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00b3\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\10\63\1\u00b5\21\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00b6\25\63",
			"\12\u00b8\7\uffff\32\u00b8\6\uffff\32\u00b8",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\14\63\1\u00b9\15\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\3\63\1\u00ba\26\63",
			"",
			"\2\u00a1\2\uffff\1\u00a1\22\uffff\1\u00a1\37\uffff\1\u00a3\33\uffff"+
			"\1\u00a2\40\uffff\1\u00a4",
			"\1\u00bb\13\uffff\1\u00bc",
			"",
			"",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\24\63\1\u00bd\5\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\13\63\1\u00be\16\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\16\63\1\u00bf\13\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u00c1\6\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u00c2\6\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\10\63\1\u00c3\21\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u00c4\23\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\30\63\1\u00c5\1\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\21\63\1\u00c6\10\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\15\63\1\u00c7\14\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\2\63\1\u00c8\27\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\3\63\1\u00c9\26\63",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00ca\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u00cb\23\63",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u00cc\6\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00cd\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\3\63\1\u00ce\26\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\1\u00d0\31\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\15\63\1\u00d1\14\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\22\63\1\u00d2\7\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\1\u00d3\31\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\6\63\1\u00d6\23\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u00d7\6\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00d8\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\24\63\1\u00da\5\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\13\63\1\u00db\16\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\23\63\1\u00de\6\63",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00df\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00e0\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\13\63\1\u00e2\16\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00e4\25\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\21\63\1\u00e6\10\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\4\63\1\u00e7\25\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\1\63\11\uffff\1\65\1\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
			"\32\63",
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

	protected class DFA17 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__104 | AT | COLON | COMMA | DOT | EQUAL | MINUS | LBRACK | RBRACK | LCURLY | RCURLY | LPAREN | RPAREN | POUND | QUESTION | SEMI | PLUS | LNOT | BNOT | BAND | RNAND | BOR | RNOR | BXOR | BXNOR | STAR | DIV | MOD | EQ | NOT_EQ | NOT_EQ_CASE | EQ_CASE | LAND | LOR | LT | LE | GT | GE | SR | SL | TRIGGER | PPATH | FPATH | SQUOTE | DQUOTE | BSLASH | EXE_QUOTE | OR | FPGA_PARAM_START | FPGA_PARAM_STOP | MODULE | ENDMODULE | PORT_DIRECTION | CONNECTION_IDENTIFIER | ASSIGN | ALWAYS | INITIAL | GENERATE | IF | ELSE | BEGIN | END | BASE_DATA_TYPE | SV_DATA_TYPE | POSEDGE | NEGEDGE | NUMBER | VALUE_BASE | BUS_VALUE | IDENTIFIER | EXTENDED_IDENTIFIER | DOXY | DOXYGEN_GROUP_DEF | DOXYGEN_GROUP_START | DOXYGEN_GROUP_END | DOXYGEN_PARAM | PREP_INCLUDE | PREP_IFDEF | PREP_ELSE | PREP_ENDIF | COMM_BEGIN | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS | ANY );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_0 = input.LA(1);
						s = -1;
						if ( (LA17_0=='p') ) {s = 1;}
						else if ( (LA17_0=='@') ) {s = 2;}
						else if ( (LA17_0==':') ) {s = 3;}
						else if ( (LA17_0==',') ) {s = 4;}
						else if ( (LA17_0=='.') ) {s = 5;}
						else if ( (LA17_0=='=') ) {s = 6;}
						else if ( (LA17_0=='-') ) {s = 7;}
						else if ( (LA17_0=='[') ) {s = 8;}
						else if ( (LA17_0==']') ) {s = 9;}
						else if ( (LA17_0=='{') ) {s = 10;}
						else if ( (LA17_0=='}') ) {s = 11;}
						else if ( (LA17_0=='(') ) {s = 12;}
						else if ( (LA17_0==')') ) {s = 13;}
						else if ( (LA17_0=='#') ) {s = 14;}
						else if ( (LA17_0=='?') ) {s = 15;}
						else if ( (LA17_0==';') ) {s = 16;}
						else if ( (LA17_0=='+') ) {s = 17;}
						else if ( (LA17_0=='!') ) {s = 18;}
						else if ( (LA17_0=='~') ) {s = 19;}
						else if ( (LA17_0=='&') ) {s = 20;}
						else if ( (LA17_0=='|') ) {s = 21;}
						else if ( (LA17_0=='^') ) {s = 22;}
						else if ( (LA17_0=='*') ) {s = 23;}
						else if ( (LA17_0=='/') ) {s = 24;}
						else if ( (LA17_0=='%') ) {s = 25;}
						else if ( (LA17_0=='<') ) {s = 26;}
						else if ( (LA17_0=='>') ) {s = 27;}
						else if ( (LA17_0=='\'') ) {s = 28;}
						else if ( (LA17_0=='\"') ) {s = 29;}
						else if ( (LA17_0=='\\') ) {s = 30;}
						else if ( (LA17_0=='`') ) {s = 31;}
						else if ( (LA17_0=='o') ) {s = 32;}
						else if ( (LA17_0=='m') ) {s = 33;}
						else if ( (LA17_0=='e') ) {s = 34;}
						else if ( (LA17_0=='i') ) {s = 35;}
						else if ( (LA17_0=='a') ) {s = 36;}
						else if ( (LA17_0=='g') ) {s = 37;}
						else if ( (LA17_0=='b') ) {s = 38;}
						else if ( (LA17_0=='w') ) {s = 39;}
						else if ( (LA17_0=='r') ) {s = 40;}
						else if ( (LA17_0=='l') ) {s = 41;}
						else if ( (LA17_0=='n') ) {s = 42;}
						else if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {s = 43;}
						else if ( ((LA17_0 >= 'A' && LA17_0 <= 'Z')||LA17_0=='_'||(LA17_0 >= 'c' && LA17_0 <= 'd')||LA17_0=='f'||LA17_0=='h'||(LA17_0 >= 'j' && LA17_0 <= 'k')||LA17_0=='q'||(LA17_0 >= 's' && LA17_0 <= 'v')||(LA17_0 >= 'x' && LA17_0 <= 'z')) ) {s = 44;}
						else if ( (LA17_0=='\r') ) {s = 45;}
						else if ( (LA17_0=='\n') ) {s = 46;}
						else if ( (LA17_0=='\t'||LA17_0==' ') ) {s = 47;}
						else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\b')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\u001F')||LA17_0=='$'||(LA17_0 >= '\u007F' && LA17_0 <= '\uFFFF')) ) {s = 48;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_135 = input.LA(1);
						s = -1;
						if ( ((LA17_135 >= '\u0000' && LA17_135 <= '\uFFFF')) ) {s = 166;}
						else s = 165;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_89 = input.LA(1);
						s = -1;
						if ( (LA17_89=='/') ) {s = 134;}
						else if ( ((LA17_89 >= '\u0000' && LA17_89 <= '.')||(LA17_89 >= '0' && LA17_89 <= '\uFFFF')) ) {s = 135;}
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
