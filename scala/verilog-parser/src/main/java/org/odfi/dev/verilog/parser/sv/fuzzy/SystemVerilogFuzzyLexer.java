// $ANTLR 3.5.2 E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g 2014-09-16 17:59:47


package org.odfi.dev.verilog.parser.sv.fuzzy;

import org.odfi.dev.verilog.parser.parsing.*;
import org.odfi.dev.verilog.parser.parsing.Lexer;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SystemVerilogFuzzyLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SystemVerilogFuzzyLexer() {} 
	public SystemVerilogFuzzyLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SystemVerilogFuzzyLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g"; }

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:149:13: ( '@' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:149:15: '@'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:150:13: ( ':' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:150:15: ':'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:151:13: ( ',' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:151:15: ','
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:152:13: ( '.' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:152:15: '.'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:153:13: ( '=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:153:15: '='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:154:13: ( '-' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:154:15: '-'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:155:13: ( '[' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:155:15: '['
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:156:13: ( ']' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:156:15: ']'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:157:13: ( '{' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:157:15: '{'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:158:13: ( '}' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:158:15: '}'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:159:13: ( '(' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:159:15: '('
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:160:13: ( ')' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:160:15: ')'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:161:13: ( '#' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:161:15: '#'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:162:13: ( '?' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:162:15: '?'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:163:13: ( ';' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:163:15: ';'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:164:13: ( '+' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:164:15: '+'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:165:13: ( '!' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:165:15: '!'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:166:13: ( '~' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:166:15: '~'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:167:13: ( '&' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:167:15: '&'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:168:13: ( '~&' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:168:15: '~&'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:169:13: ( '|' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:169:15: '|'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:170:13: ( '~|' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:170:15: '~|'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:171:13: ( '^' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:171:15: '^'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:172:13: ( '~^' | '^~' )
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:172:15: '~^'
					{
					match("~^"); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:172:22: '^~'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:173:13: ( '*' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:173:15: '*'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:174:13: ( '/' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:174:15: '/'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:175:13: ( '%' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:175:15: '%'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:176:13: ( '==' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:176:15: '=='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:177:13: ( '!=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:177:15: '!='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:178:13: ( '!==' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:178:15: '!=='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:179:13: ( '===' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:179:15: '==='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:180:13: ( '&&' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:180:15: '&&'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:181:13: ( '||' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:181:15: '||'
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

	// $ANTLR start "LT_"
	public final void mLT_() throws RecognitionException {
		try {
			int _type = LT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:182:13: ( '<' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:182:15: '<'
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
	// $ANTLR end "LT_"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:183:13: ( '<=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:183:15: '<='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:184:13: ( '>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:184:15: '>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:185:13: ( '>=' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:185:15: '>='
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:186:13: ( '>>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:186:15: '>>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:187:13: ( '<<' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:187:15: '<<'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:188:13: ( '->' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:188:15: '->'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:189:13: ( '=>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:189:15: '=>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:190:13: ( '*>' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:190:15: '*>'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:191:13: ( '\\'' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:191:15: '\\''
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

	// $ANTLR start "BSLASH"
	public final void mBSLASH() throws RecognitionException {
		try {
			int _type = BSLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:192:13: ( '\\\\' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:192:15: '\\\\'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:193:13: ( '`' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:193:15: '`'
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

	// $ANTLR start "MODULE"
	public final void mMODULE() throws RecognitionException {
		try {
			int _type = MODULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:196:7: ( 'module' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:196:9: 'module'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:197:16: ( 'input' | 'output' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='i') ) {
				alt2=1;
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:197:18: 'input'
					{
					match("input"); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:197:28: 'output'
					{
					match("output"); 

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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:201:13: ( 'assign' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:201:15: 'assign'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:202:13: ( 'always' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:202:15: 'always'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:203:13: ( 'initial' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:203:15: 'initial'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:205:13: ( 'generate' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:205:15: 'generate'
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

	// $ANTLR start "END_GENERATE"
	public final void mEND_GENERATE() throws RecognitionException {
		try {
			int _type = END_GENERATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:206:17: ( 'endgenerate' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:206:19: 'endgenerate'
			{
			match("endgenerate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_GENERATE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:210:13: ( 'if' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:210:14: 'if'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:211:13: ( 'else' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:211:14: 'else'
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

	// $ANTLR start "ELSEIF"
	public final void mELSEIF() throws RecognitionException {
		try {
			int _type = ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:212:13: ( 'else WS* if' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:212:15: 'else WS* if'
			{
			match("else WS* if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:213:13: ( 'begin' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:213:15: 'begin'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:214:13: ( 'end' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:214:15: 'end'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:217:16: ( 'wire' | 'reg' )
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:217:18: 'wire'
					{
					match("wire"); 

					}
					break;
				case 2 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:217:27: 'reg'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:218:13: ( 'logic' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:218:16: 'logic'
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

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:222:13: ( ( '0' .. '9' )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:222:15: ( '0' .. '9' )+
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:222:15: ( '0' .. '9' )+
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
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:225:11: ( ( 'h' | 'b' | 'd' ) )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:
			{
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

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:229:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:230:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:230:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='$'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:
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
					break loop5;
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

	// $ANTLR start "COMMENTAR_SHORT"
	public final void mCOMMENTAR_SHORT() throws RecognitionException {
		try {
			int _type = COMMENTAR_SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:234:16: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:234:18: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:234:23: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:
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
					break loop6;
				}
			}

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:234:37: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:234:37: '\\r'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:235:15: ( '/*' ( . )* '*/' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:235:17: '/*' ( . )* '*/'
			{
			match("/*"); 

			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:235:22: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:235:22: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:236:8: ( ( '\\r' )? '\\n' )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:236:9: ( '\\r' )? '\\n'
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:236:9: ( '\\r' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\r') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:236:9: '\\r'
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
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:237:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:237:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:237:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:8: ( AT | COLON | COMMA | DOT | EQUAL | MINUS | LBRACK | RBRACK | LCURLY | RCURLY | LPAREN | RPAREN | POUND | QUESTION | SEMI | PLUS | LNOT | BNOT | BAND | RNAND | BOR | RNOR | BXOR | BXNOR | STAR | DIV | MOD | EQ | NOT_EQ | NOT_EQ_CASE | EQ_CASE | LAND | LOR | LT_ | LE | GT | GE | SR | SL | TRIGGER | PPATH | FPATH | SQUOTE | BSLASH | EXE_QUOTE | MODULE | PORT_DIRECTION | ASSIGN | ALWAYS | INITIAL | GENERATE | END_GENERATE | IF | ELSE | ELSEIF | BEGIN | END | BASE_DATA_TYPE | SV_DATA_TYPE | NUMBER | VALUE_BASE | IDENTIFIER | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS )
		int alt11=66;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:10: AT
				{
				mAT(); 

				}
				break;
			case 2 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:13: COLON
				{
				mCOLON(); 

				}
				break;
			case 3 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:19: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 4 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:25: DOT
				{
				mDOT(); 

				}
				break;
			case 5 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:29: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 6 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:35: MINUS
				{
				mMINUS(); 

				}
				break;
			case 7 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:41: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 8 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:48: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 9 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:55: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 10 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:62: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 11 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:69: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 12 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:76: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 13 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:83: POUND
				{
				mPOUND(); 

				}
				break;
			case 14 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:89: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 15 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:98: SEMI
				{
				mSEMI(); 

				}
				break;
			case 16 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:103: PLUS
				{
				mPLUS(); 

				}
				break;
			case 17 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:108: LNOT
				{
				mLNOT(); 

				}
				break;
			case 18 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:113: BNOT
				{
				mBNOT(); 

				}
				break;
			case 19 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:118: BAND
				{
				mBAND(); 

				}
				break;
			case 20 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:123: RNAND
				{
				mRNAND(); 

				}
				break;
			case 21 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:129: BOR
				{
				mBOR(); 

				}
				break;
			case 22 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:133: RNOR
				{
				mRNOR(); 

				}
				break;
			case 23 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:138: BXOR
				{
				mBXOR(); 

				}
				break;
			case 24 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:143: BXNOR
				{
				mBXNOR(); 

				}
				break;
			case 25 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:149: STAR
				{
				mSTAR(); 

				}
				break;
			case 26 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:154: DIV
				{
				mDIV(); 

				}
				break;
			case 27 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:158: MOD
				{
				mMOD(); 

				}
				break;
			case 28 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:162: EQ
				{
				mEQ(); 

				}
				break;
			case 29 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:165: NOT_EQ
				{
				mNOT_EQ(); 

				}
				break;
			case 30 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:172: NOT_EQ_CASE
				{
				mNOT_EQ_CASE(); 

				}
				break;
			case 31 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:184: EQ_CASE
				{
				mEQ_CASE(); 

				}
				break;
			case 32 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:192: LAND
				{
				mLAND(); 

				}
				break;
			case 33 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:197: LOR
				{
				mLOR(); 

				}
				break;
			case 34 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:201: LT_
				{
				mLT_(); 

				}
				break;
			case 35 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:205: LE
				{
				mLE(); 

				}
				break;
			case 36 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:208: GT
				{
				mGT(); 

				}
				break;
			case 37 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:211: GE
				{
				mGE(); 

				}
				break;
			case 38 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:214: SR
				{
				mSR(); 

				}
				break;
			case 39 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:217: SL
				{
				mSL(); 

				}
				break;
			case 40 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:220: TRIGGER
				{
				mTRIGGER(); 

				}
				break;
			case 41 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:228: PPATH
				{
				mPPATH(); 

				}
				break;
			case 42 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:234: FPATH
				{
				mFPATH(); 

				}
				break;
			case 43 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:240: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 44 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:247: BSLASH
				{
				mBSLASH(); 

				}
				break;
			case 45 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:254: EXE_QUOTE
				{
				mEXE_QUOTE(); 

				}
				break;
			case 46 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:264: MODULE
				{
				mMODULE(); 

				}
				break;
			case 47 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:271: PORT_DIRECTION
				{
				mPORT_DIRECTION(); 

				}
				break;
			case 48 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:286: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 49 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:293: ALWAYS
				{
				mALWAYS(); 

				}
				break;
			case 50 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:300: INITIAL
				{
				mINITIAL(); 

				}
				break;
			case 51 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:308: GENERATE
				{
				mGENERATE(); 

				}
				break;
			case 52 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:317: END_GENERATE
				{
				mEND_GENERATE(); 

				}
				break;
			case 53 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:330: IF
				{
				mIF(); 

				}
				break;
			case 54 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:333: ELSE
				{
				mELSE(); 

				}
				break;
			case 55 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:338: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 56 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:345: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 57 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:351: END
				{
				mEND(); 

				}
				break;
			case 58 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:355: BASE_DATA_TYPE
				{
				mBASE_DATA_TYPE(); 

				}
				break;
			case 59 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:370: SV_DATA_TYPE
				{
				mSV_DATA_TYPE(); 

				}
				break;
			case 60 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:383: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 61 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:390: VALUE_BASE
				{
				mVALUE_BASE(); 

				}
				break;
			case 62 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:401: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 63 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:412: COMMENTAR_SHORT
				{
				mCOMMENTAR_SHORT(); 

				}
				break;
			case 64 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:428: COMMENTAR_LONG
				{
				mCOMMENTAR_LONG(); 

				}
				break;
			case 65 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:443: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 66 :
				// E:\\Common\\Projects\\git\\odfi-dev-hw\\scala\\verilog-parser\\src\\main\\java\\org\\odfi\\dev\\verilog\\parser\\sv\\fuzzy\\SystemVerilogFuzzy.g:1:451: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\5\uffff\1\60\1\62\12\uffff\1\64\1\70\1\72\1\74\1\75\1\77\1\102\1\uffff"+
		"\1\105\1\110\3\uffff\6\52\1\123\3\52\1\uffff\1\123\1\uffff\1\55\1\127"+
		"\1\uffff\1\131\4\uffff\1\133\25\uffff\2\52\1\137\7\52\1\uffff\3\52\5\uffff"+
		"\3\52\1\uffff\4\52\1\162\3\52\1\166\11\52\1\uffff\1\u0081\1\52\1\166\1"+
		"\uffff\2\52\1\u0085\6\52\2\uffff\1\u008c\1\u008d\1\u008e\1\uffff\1\52"+
		"\1\u0085\1\u0090\1\u0091\2\52\3\uffff\1\u0094\2\uffff\2\52\1\uffff\1\u0097"+
		"\1\52\1\uffff\2\52\1\u009b\1\uffff";
	static final String DFA11_eofS =
		"\u009c\uffff";
	static final String DFA11_minS =
		"\1\11\4\uffff\1\75\1\76\12\uffff\1\75\2\46\1\174\1\176\1\76\1\52\1\uffff"+
		"\1\74\1\75\3\uffff\1\157\1\146\1\165\1\154\1\145\1\154\1\44\1\151\1\145"+
		"\1\157\1\uffff\1\44\1\uffff\1\12\1\11\1\uffff\1\75\4\uffff\1\75\25\uffff"+
		"\1\144\1\151\1\44\1\164\1\163\1\167\1\156\1\144\1\163\1\147\1\uffff\1"+
		"\162\2\147\5\uffff\2\165\1\164\1\uffff\1\160\1\151\1\141\1\145\1\44\1"+
		"\145\1\151\1\145\1\44\1\151\1\154\1\164\1\151\1\165\1\147\1\171\1\162"+
		"\1\145\1\uffff\1\40\1\156\1\44\1\uffff\1\143\1\145\1\44\1\141\1\164\1"+
		"\156\1\163\1\141\1\156\2\uffff\3\44\1\uffff\1\154\3\44\1\164\1\145\3\uffff"+
		"\1\44\2\uffff\1\145\1\162\1\uffff\1\44\1\141\1\uffff\1\164\1\145\1\44"+
		"\1\uffff";
	static final String DFA11_maxS =
		"\1\176\4\uffff\2\76\12\uffff\1\75\1\174\1\46\1\174\1\176\1\76\1\57\1\uffff"+
		"\1\75\1\76\3\uffff\1\157\1\156\1\165\1\163\1\145\1\156\1\172\1\151\1\145"+
		"\1\157\1\uffff\1\172\1\uffff\1\12\1\40\1\uffff\1\75\4\uffff\1\75\25\uffff"+
		"\1\144\1\160\1\172\1\164\1\163\1\167\1\156\1\144\1\163\1\147\1\uffff\1"+
		"\162\2\147\5\uffff\2\165\1\164\1\uffff\1\160\1\151\1\141\1\145\1\172\1"+
		"\145\1\151\1\145\1\172\1\151\1\154\1\164\1\151\1\165\1\147\1\171\1\162"+
		"\1\145\1\uffff\1\172\1\156\1\172\1\uffff\1\143\1\145\1\172\1\141\1\164"+
		"\1\156\1\163\1\141\1\156\2\uffff\3\172\1\uffff\1\154\3\172\1\164\1\145"+
		"\3\uffff\1\172\2\uffff\1\145\1\162\1\uffff\1\172\1\141\1\uffff\1\164\1"+
		"\145\1\172\1\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
		"\1\17\1\20\7\uffff\1\33\2\uffff\1\53\1\54\1\55\12\uffff\1\74\1\uffff\1"+
		"\76\2\uffff\1\102\1\uffff\1\51\1\5\1\50\1\6\1\uffff\1\21\1\24\1\26\1\30"+
		"\1\22\1\40\1\23\1\41\1\25\1\27\1\52\1\31\1\77\1\100\1\32\1\43\1\47\1\42"+
		"\1\45\1\46\1\44\12\uffff\1\75\3\uffff\1\101\1\37\1\34\1\36\1\35\3\uffff"+
		"\1\65\22\uffff\1\71\3\uffff\1\72\11\uffff\1\67\1\66\3\uffff\1\57\6\uffff"+
		"\1\70\1\73\1\56\1\uffff\1\60\1\61\2\uffff\1\62\2\uffff\1\63\3\uffff\1"+
		"\64";
	static final String DFA11_specialS =
		"\u009c\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\55\1\54\2\uffff\1\53\22\uffff\1\55\1\21\1\uffff\1\15\1\uffff\1\30"+
			"\1\23\1\33\1\13\1\14\1\26\1\20\1\3\1\6\1\4\1\27\12\50\1\2\1\17\1\31\1"+
			"\5\1\32\1\16\1\1\32\52\1\7\1\34\1\10\1\25\1\52\1\35\1\41\1\44\1\52\1"+
			"\51\1\43\1\52\1\42\1\51\1\37\2\52\1\47\1\36\1\52\1\40\2\52\1\46\4\52"+
			"\1\45\3\52\1\11\1\24\1\12\1\22",
			"",
			"",
			"",
			"",
			"\1\56\1\57",
			"\1\61",
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
			"\1\63",
			"\1\65\67\uffff\1\67\35\uffff\1\66",
			"\1\71",
			"\1\73",
			"\1\67",
			"\1\76",
			"\1\101\4\uffff\1\100",
			"",
			"\1\104\1\103",
			"\1\106\1\107",
			"",
			"",
			"",
			"\1\111",
			"\1\113\7\uffff\1\112",
			"\1\114",
			"\1\116\6\uffff\1\115",
			"\1\117",
			"\1\121\1\uffff\1\120",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\122\25"+
			"\52",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\54",
			"\2\55\2\uffff\1\55\22\uffff\1\55",
			"",
			"\1\130",
			"",
			"",
			"",
			"",
			"\1\132",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\134",
			"\1\136\6\uffff\1\135",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"",
			"",
			"",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\161\23"+
			"\52",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"",
			"\1\u0080\3\uffff\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52",
			"\1\u0082",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"",
			"",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u008f",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0092",
			"\1\u0093",
			"",
			"",
			"",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u0095",
			"\1\u0096",
			"",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0098",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AT | COLON | COMMA | DOT | EQUAL | MINUS | LBRACK | RBRACK | LCURLY | RCURLY | LPAREN | RPAREN | POUND | QUESTION | SEMI | PLUS | LNOT | BNOT | BAND | RNAND | BOR | RNOR | BXOR | BXNOR | STAR | DIV | MOD | EQ | NOT_EQ | NOT_EQ_CASE | EQ_CASE | LAND | LOR | LT_ | LE | GT | GE | SR | SL | TRIGGER | PPATH | FPATH | SQUOTE | BSLASH | EXE_QUOTE | MODULE | PORT_DIRECTION | ASSIGN | ALWAYS | INITIAL | GENERATE | END_GENERATE | IF | ELSE | ELSEIF | BEGIN | END | BASE_DATA_TYPE | SV_DATA_TYPE | NUMBER | VALUE_BASE | IDENTIFIER | COMMENTAR_SHORT | COMMENTAR_LONG | NEWLINE | WS );";
		}
	}

}
