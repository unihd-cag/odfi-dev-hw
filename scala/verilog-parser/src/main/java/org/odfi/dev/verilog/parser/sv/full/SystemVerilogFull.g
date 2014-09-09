grammar SystemVerilogFull;

options {
  language= Java;
  output=AST;
  ASTLabelType=CommonTree;
}

//import SystemVerilogLexer;

tokens {
  VERILOG;
	MODULE;
	MODULE_NAME;
	MODULE_PARAMETERS;
	MODULE_PARAMETER;
	MODULE_PORTS;
	MODULE_PORT;
	MODULE_VARIABLE;
	MODULE_INSTANCE;
	MODULE_INSTANCE_CONNECTION;
	PORT_DIRECTION;
	DATA_SIZE;
	EXPRESSION;
	TEXT;
	DOXY_GROUP_START;
	DOXY_GROUP_STOP;
	DOXY_PARAM;
}




@header {
package org.odfi.dev.languages.antlr.sv.full;

//import uni.hd.cag.languages.parsing.*;
}

@lexer::header {
package org.odfi.dev.languages.antlr.sv.full;
//import uni.hd.cag.languages.parsing.*;
//import uni.hd.cag.languages.parsing.Lexer;
}

@members {

  /**
   * Groups
   */
   private String currentGroup = null;
   private boolean currentGroupActive = false;
   
   /**
    * Params map for current active section
    */
    private HashMap<String,String> doxyParams = new HashMap<String,String>();
   
}

// Preprocessor
//--------------------



// COMMON
//---------------

verilog : 
  module+ -> ^(VERILOG module+) ;

//-----------------------------------------------
//	MODULE
//-----------------------------------------------

/*module :
  .*
	('module')
	IDENTIFIER
	(POUND LPAREN module_parameters  NEWLINE? RPAREN)?
	(LPAREN module_ports NEWLINE? RPAREN)?
	SEMI
	

	(
		variable_declaration
		| module_instanciation
		| initial_declaration
		| always_declaration
		| assign_declaration
	)*
	('endmodule') -> ^(MODULE ^(MODULE_NAME IDENTIFIER) module_parameters? module_ports? variable_declaration* module_instanciation* )
;*/

module :
  .*
  fpga_param*
  ('module')
  IDENTIFIER
  (POUND LPAREN module_parameters  NEWLINE? RPAREN)?
  (LPAREN module_ports NEWLINE? RPAREN)?
  SEMI
  
  (
    .
  )*
  ('endmodule') -> ^(MODULE ^(MODULE_NAME IDENTIFIER) module_parameters? module_ports? )
;

module_hierarchical :
  .*
  ('module')
  IDENTIFIER
  (POUND LPAREN module_parameters  NEWLINE? RPAREN)?
  (LPAREN module_ports NEWLINE? RPAREN)?
  SEMI
  
  /*.*
  (
   (variable_declaration)
   | module_instanciation
  )+*/
  (
   module_instanciation
  )*
  ('endmodule') -> ^(MODULE ^(MODULE_NAME IDENTIFIER) module_parameters? module_ports? module_instanciation* )
;



// Parameters
//-----------------
module_parameters : 
    parameter_declaration ((',')! parameter_declaration )* -> ^(MODULE_PARAMETERS parameter_declaration* )
;

parameter_declaration:
  'parameter' IDENTIFIER EQUAL parameter_value -> ^(MODULE_PARAMETER IDENTIFIER parameter_value)
;

/*parameter_value:

  NUMBER -> ^( {new CommonTree(new CommonToken(0,$NUMBER.text))})
  | typed_value -> ^( {new CommonTree(new CommonToken(0,$typed_value.text))})
  | short_long_identifier -> ^( {new CommonTree(new CommonToken(0,$short_long_identifier.text))})
  | expression -> ^( {new CommonTree(new CommonToken(0,$expression.text))})
  
;*/

parameter_value:

  expression -> ^( {new CommonTree(new CommonToken(0,$expression.text))})
  | long_identifier -> ^( {new CommonTree(new CommonToken(0,$long_identifier.text))})
;

// Port
//--------------

//-- Ports might me grouped using doxygen syntax
module_ports : 
  
	  port_declaration 
	   
	   ((',')! 
	   
	   port_declaration )*
	   
	   // Eventual last group closing
	   doxygen_group_end? 
  
  -> ^(MODULE_PORTS port_declaration* )  ;

port_declaration: 
  
  doxygen_group_end?
  doxygen_group_def?
  doxygen_param*
  doxygen_group_begin?
  
  
  PORT_DIRECTION?
  BASE_DATA_TYPE?
  data_size? 
  IDENTIFIER 
  
  {
//    if($IDENTIFIER.text.equals("pcie_clk"))
//      System.out.println("Found Port "+$data_size.text);
  
//    System.out.println("Found Port "+$IDENTIFIER.text+" With active group: "+currentGroup);

      //-- Prepare the stack of params a a node
  //^(DOXY_GROUP {new CommonTree(new CommonToken(0,currentGroupActive?currentGroup:null))})
  }  
  -> ^(MODULE_PORT 
        PORT_DIRECTION? 
        BASE_DATA_TYPE? 
        (data_size)? 
        IDENTIFIER 
        doxygen_group_end? 
        doxygen_group_def? 
        doxygen_param* 
        doxygen_group_begin? )
;





// Module Instanciations
//-----------
module_instanciation:  
    type=IDENTIFIER 
    (POUND LPAREN parameter_connections RPAREN)?
    name=IDENTIFIER 
    LPAREN port_connections RPAREN SEMI 
                       {System.out.println("Found a module instanciation");}
                       -> ^(MODULE_INSTANCE $type $name port_connections) 
;

port_connections: port_connection? (COMMA port_connection)*;

port_connection : DOT 
                  port_name=IDENTIFIER 
                  (
      
                   (LPAREN local_connection=concatenable_expression RPAREN )
                  ) 
                  /*(
                    ( (LPAREN RPAREN) => LPAREN RPAREN )
                    | (LPAREN local_connection=concatenable_expression RPAREN )
                  ) */
                  ->  ^(MODULE_INSTANCE_CONNECTION $port_name $local_connection?)
;
parameter_connections: parameter_connection? (COMMA parameter_connection)*;
parameter_connection: DOT param_name=IDENTIFIER LPAREN concatenable_expression RPAREN;

// Variable declarations
//------------------------
variable_declaration: data_type data_size? (IDENTIFIER (COMMA IDENTIFIER)* ) assign_expression? SEMI -> ^(MODULE_VARIABLE data_type data_size? IDENTIFIER+ );


// Control structures
//----------------------

initial_declaration: 
  INITIAL ( ( logic_content ) |  logic_instruction )
;
always_declaration: 

  //'always' (AT LPAREN nokeywords RPAREN)? ( logic_instruction | ( logic_content )  )
  //'always' (AT LPAREN expression RPAREN)? ( logic_instruction | ( logic_content )  )
  ALWAYS (AT LPAREN (sensitivity_list) RPAREN)?
  (
     ( logic_instruction | ( logic_content )  )
  )
;
assign_declaration: 

  ASSIGN IDENTIFIER assign_expression SEMI

;

// = expression;
assign_expression: 
 ( EQUAL | LE)
  ( 
   //   (expression QUESTION) => expression_ternary
    //| 
      concatenable_expression 
  );


// Logic content (if else, assignements)
//-----------------------------
logic_content:
  BEGIN
    logic_instruction*
  END
;

//-- A simple logic instruction
// Can be a control structure, or an instruction
logic_instruction
: 
  single_instruction
  | decision_ifelse
  
;



// Single instruction line
single_instruction: IDENTIFIER assign_expression SEMI;

// Ifelse
decision_if:
  IF LPAREN expression RPAREN 
  (
    (decision_if) => decision_if
    | single_instruction
    | (
        BEGIN 
          (
            (decision_if) => decision_if
            | single_instruction
          )+
        END
      ) 
  )
;




decision_elseif: 
  ELSE IF LPAREN expression RPAREN 
  (
    (decision_if) => decision_if
    | single_instruction
    | (
        BEGIN 
          (
            (decision_if) => decision_if
            | single_instruction
          )+
        END
      ) 
  )
;

decision_else: 
  ELSE 
    ( (BEGIN logic_instruction* END) | single_instruction)
    
;

decision_ifelse:
  decision_if
  decision_elseif*
  decision_else?
;


// Common declarations
//-------------
data_type: BASE_DATA_TYPE | SV_DATA_TYPE;

data_size : (LBRACK size_def COLON NUMBER RBRACK) -> ^(DATA_SIZE size_def) ;

size_def : 
        expression 
        {
          //System.out.println("Found Expression in parser: "+$expression.text);
        
        }
        -> ^(EXPRESSION expression ^(TEXT {new CommonTree(new CommonToken(0,$expression.text))}))
;

// Expression
//--------------------

concatenable_expression: 
  (LCURLY expression (COMMA expression)* RCURLY) 
  | expression
  ;
expression: 
  ((LPAREN expression RPAREN) | expression_operand )? (expression_operator expression)?
;
expression_operand : (IDENTIFIER (LBRACK NUMBER RBRACK)?) | (EXE_QUOTE IDENTIFIER) |NUMBER | typed_value ;
expression_operator: DIV | PLUS  | MINUS | LAND | BOR | BAND |  BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE ;

//expression_ternary: expression QUESTION expression COLON expression;

// A typed value is one of size'typenumber
typed_value: BUS_VALUE;

// Sensitivity list
//--------------------------

// A list of sensitivity like "posedge clk or negedge res_n"
sensitivity_list: 

  sensitivity ( (OR) sensitivity)*

;

// A single sensitivity like "posedge clk", "negedge res_n"
sensitivity:
  (POSEDGE|NEGEDGE) IDENTIFIER
;




nokeywords: ~(BEGIN|END|SEMI);


// FPGA PARAM Things
//-------------------------------
fpga_param:

  FPGA_PARAM_START IDENTIFIER EQUAL DQUOTE (~DQUOTE)* DQUOTE FPGA_PARAM_STOP
;

// Doxygen
//-------------------------
doxygen_group_def: 
  DOXYGEN_GROUP_DEF IDENTIFIER 
  {
//    System.out.println("Defined Group: "+$IDENTIFIER.text);
    //this.currentGroup = new ModulePortGroup($IDENTIFIER.text);
    this.currentGroup = $IDENTIFIER.text;
  } 
  -> ^(IDENTIFIER)
;
doxygen_group_begin:
  DOXYGEN_GROUP_START
  {

    this.currentGroupActive = true;
  } 
  
  -> ^(DOXY_GROUP_START)
;
doxygen_group_end:
  DOXYGEN_GROUP_END
  {
    
    this.currentGroupActive = false;
    this.currentGroup = null;
    
    //-- Clean Params stack
    this.doxyParams.clear();
  } 
  -> ^(DOXY_GROUP_STOP)
;

doxygen_param:
  DOXYGEN_PARAM EXTENDED_IDENTIFIER short_long_identifier?
  {
    //-- Stack parameter for active section
    //this.doxyParams.put($doxygen_param_name.text,$short_long_identifier.text.replaceAll("\"",""));
    
    //-- Add to group if we are in one
  }
  -> ^(DOXY_PARAM EXTENDED_IDENTIFIER short_long_identifier?)
;


// Base Components
//--------------------------

/// An identifier than can be normal (short), or in " " capsed
short_long_identifier : IDENTIFIER | DQUOTE (IDENTIFIER (WS+ IDENTIFIER)*) DQUOTE  ;
long_identifier : DQUOTE (IDENTIFIER (WS+ IDENTIFIER)*) DQUOTE  ;
//-----------------------------------------------//
// Lexer                                         //
//-----------------------------------------------//

// Operators
AT          : '@'   ;
COLON       : ':'   ;
COMMA       : ','   ;
DOT         : '.'   ;
EQUAL       : '='   ;
MINUS       : '-'   ;
LBRACK      : '['   ;
RBRACK      : ']'   ;
LCURLY      : '{'   ;
RCURLY      : '}'   ;
LPAREN      : '('   ;
RPAREN      : ')'   ;
POUND       : '#'   ;
QUESTION    : '?'   ;
SEMI        : ';'   ;
PLUS        : '+'   ;
LNOT        : '!'   ;
BNOT        : '~'   ;
BAND        : '&'   ;
RNAND       : '~&'  ;
BOR         : '|'   ;
RNOR        : '~|'  ;
BXOR        : '^'   ;
BXNOR       : '~^' | '^~' ;
STAR        : '*'   ;
DIV         : '/'   ;
MOD         : '%'   ;
EQ          : '=='  ;
NOT_EQ      : '!='  ;
NOT_EQ_CASE : '!==' ;
EQ_CASE     : '===' ;
LAND        : '&&'  ;
LOR         : '||'  ;
LT          : '<'   ;
LE          : '<='  ;
GT          : '>'   ;
GE          : '>='  ;
SR          : '>>'  ;
SL          : '<<'  ;
TRIGGER     : '->'  ;
PPATH       : '=>'  ;
FPATH       : '*>'  ;
SQUOTE      : '\''  ;
DQUOTE      : '"'   ;
BSLASH      : '\\'  ;
EXE_QUOTE   : '`'   ;
OR          : 'or'  ;

//-- FPGA param
FPGA_PARAM_START : '(*';
FPGA_PARAM_STOP: '*)';
//-- Module
MODULE: 'module';
PORT_DIRECTION : 'input' | 'output' | 'inout';

//-- Structures
ASSIGN      : 'assign';
ALWAYS      : 'always';
INITIAL     : 'initial';
GENERATE    : 'generate';

//-- Control keywords
IF          :'if';
ELSE        :'else';

BEGIN       : 'begin';
END         : 'end';

//-- Data definitions
BASE_DATA_TYPE : 'wire' | 'reg';
SV_DATA_TYPE:  'logic';

//-- Sensitivity
POSEDGE     : 'posedge';
NEGEDGE     : 'negedge';

// Global
//------------
NUMBER      : ('0'..'9')+;

// Base of a value : h b d ...
VALUE_BASE: NUMBER SQUOTE ('h'|'b'|'d');

BUS_VALUE: VALUE_BASE (NUMBER | ('a'..'z'|'A'..'Z') )+ ;


IDENTIFIER
      options {greedy=true;}
    :
        ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')*
        ;

EXTENDED_IDENTIFIER: 
  ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'$'|'0'..'9')*
;

// Doxygen Things
//----------------------
DOXY  : '///' ;
DOXYGEN_GROUP_DEF: 
  DOXY  WS* BSLASH 'defgroup'
;
DOXYGEN_GROUP_START:
  DOXY WS* '@{'
;
DOXYGEN_GROUP_END:
  DOXY WS* '}@'
;
DOXYGEN_PARAM:
  DOXY WS* BSLASH 'param'
;


// Preprocessor instructions
//-------------
PREP_INCLUDE: EXE_QUOTE 'include' {$channel=HIDDEN;};
PREP_IFDEF: EXE_QUOTE 'ifdef' IDENTIFIER {$channel=HIDDEN;}; 
PREP_ELSE: EXE_QUOTE ELSE {$channel=HIDDEN;};
PREP_ENDIF: EXE_QUOTE 'endif' {$channel=HIDDEN;};






// To be ignored
//----------------------
COMM_BEGIN     : '//' ~(DIV);
COMMENTAR_SHORT: COMM_BEGIN ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
COMMENTAR_LONG: '/*' .* '*/' {$channel=HIDDEN;} ;     
NEWLINE:'\r'?'\n' {$channel=HIDDEN;};
WS  :   (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ; 