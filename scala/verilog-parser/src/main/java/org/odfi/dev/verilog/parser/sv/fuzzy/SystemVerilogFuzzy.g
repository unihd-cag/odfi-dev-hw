grammar SystemVerilogFuzzy;

options {
  language     = Java;
  //output       = AST;
  //ASTLabelType = CommonTree;
  TokenLabelType = XQToken;
  superClass=XQParser;
}



@header {

package org.odfi.dev.verilog.parser.sv.fuzzy;

import org.odfi.dev.verilog.parser.parsing.*;

import java.util.LinkedList;

}

@lexer::header {

package org.odfi.dev.verilog.parser.sv.fuzzy;

import org.odfi.dev.verilog.parser.parsing.*;
import org.odfi.dev.verilog.parser.parsing.Lexer;

}




/*
This grammar offers a few rules to fast extract simple data from System Verilog, like module name

*/



@members {
protected Object recoverFromMismatchedToken(IntStream input,
                                            int ttype,
                                            BitSet follow)
    throws RecognitionException
{   
    throw new MismatchedTokenException(ttype, input);
}   
}




module_name returns [String name]
  :
  .* MODULE IDENTIFIER
                     {
                      $name = $IDENTIFIER.text;
                     }
  ;
  
 // Module Instanciations
//-----------

// Get all module instanciations
module_instanciations 
  returns [List<String> instances]
  options {greedy=false;}
  @init {
    $instances= new LinkedList<String>();
  }
  : (
    .* 
    mi=module_instanciation[$instances]
    )* 
;
 
// Get only the various instaciated types
// That means only one result per type 
module_instanciations_types
  returns [List<String> instances]
  @init {
    $instances= new LinkedList<String>();
    LinkedList<String> filteredInstances= new LinkedList<String>();
  }
  :
    (
    .* 
    mi=module_instanciation[filteredInstances]
    )*
  {
    // Filter result
    for (String instance: filteredInstances) {
      if (!$instances.contains(instance))
        $instances.add(instance);
    }
  }
;  

module_instanciation 
  [List<String> instances]
  //options {greedy=false;}
  : 
   // (SEMI|END|BEGIN|RPAREN) 
    type=IDENTIFIER
    (POUND LPAREN parameter_connections RPAREN)?
    name=IDENTIFIER 
    LPAREN port_connections RPAREN SEMI
    {
       System.out.println("In module instanciation "+$type.text+" at "+$type.line);
       $instances.add($type.text); 
    }
                       
;

//type=~(BASE_DATA_TYPE|SV_DATA_TYPE|AL)

port_connections: port_connection? (COMMA port_connection)*;

port_connection : DOT port_name=IDENTIFIER LPAREN concatenable_expression RPAREN 
;

parameter_connections: parameter_connection? (COMMA parameter_connection)*;
parameter_connection: DOT param_name=IDENTIFIER LPAREN expression RPAREN;


concatenable_expression: 
  (LCURLY expression (COMMA expression)* RCURLY) 
  | expression
  ;
expression: 
  ((LPAREN expression RPAREN) | expression_operand )? (expression_operator expression)?
;

expression_operand : (IDENTIFIER (LBRACK NUMBER RBRACK)?) | NUMBER | typed_value;

expression_operator: LAND | BOR | BAND | PLUS | BNOT | MINUS | STAR | BXOR | BXNOR | LNOT ;

// A typed value is one of size'typenumber
typed_value: NUMBER SQUOTE VALUE_BASE NUMBER;

//----------------------------------------------------------------------------
// The Verilog scanner $direction $type $name
//----------------------------------------------------------------------------


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
LT_         : '<'   ;
LE          : '<='  ;
GT          : '>'   ;
GE          : '>='  ;
SR          : '>>'  ;
SL          : '<<'  ;
TRIGGER     : '->'  ;
PPATH       : '=>'  ;
FPATH       : '*>'  ;
SQUOTE      : '\''  ;
BSLASH      : '\\'  ;
EXE_QUOTE   : '`'   ;

// Module
MODULE: 'module';
PORT_DIRECTION : 'input' | 'output';

// Structures
//------------------
ASSIGN      : 'assign';
ALWAYS      : 'always';
INITIAL     : 'initial';

GENERATE    : 'generate';
END_GENERATE    : 'endgenerate';

// Control keywords
//---------------------
IF          :'if';
ELSE        :'else';
ELSEIF      : 'else WS* if';
BEGIN       : 'begin';
END         : 'end';

// Data definitions
BASE_DATA_TYPE : 'wire' | 'reg';
SV_DATA_TYPE:  'logic';

// Global
//------------
NUMBER      : ('0'..'9')+;

// Base of a value : h b d ...
VALUE_BASE: ('h'|'b'|'d');

IDENTIFIER
      options {greedy=false;}
    :
        ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')*
        ;

// To be ignored
COMMENTAR_SHORT: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
COMMENTAR_LONG: '/*' .* '*/' {$channel=HIDDEN;} ;     
NEWLINE:'\r'?'\n' {$channel=HIDDEN;};
WS  :   (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ;        
