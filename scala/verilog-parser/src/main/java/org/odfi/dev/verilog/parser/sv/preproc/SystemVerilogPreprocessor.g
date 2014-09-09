grammar SystemVerilogPreprocessor;

options {
  language = Java;
  output = template;
  rewrite = true;
}


@header {
package org.odfi.dev.languages.antlr.sv.preproc;

}

@lexer::header {
package org.odfi.dev.languages.antlr.sv.preproc;
}


// Preprocess everything
/*preprocess
options {greedy=false;}
: 
    (
    .*
	  EXE_QUOTE {System.out.println("FOUND Exe Quote: ");}
	  
	 )*


;*/
preprocess
: 
  //.* 'module' IDENTIFIER {System.out.println("Module name: "+$IDENTIFIER.text);}
  //.* PREP_IFDEF IDENTIFIER {System.out.println("Ifdef  "+$IDENTIFIER.text);}
  (.* (ifdef|ignore))*
;


ifdef: 
  
  ifdef_if ifcontent=content
  (
  
    
    ef=PREP_ENDIF 
    
    {
//      System.out.println("`ifdef has content: "+$ifcontent.text+"//"+$ef.text);
    }
    
    -> template(content={$ifcontent.text}) "<content>"
    | 
    
    ifdef_else
   elsecontent= content
    PREP_ENDIF 
    {
//      System.out.println("`ifdef : "+$ifdef_if.text);
//      System.out.println("else has content: "+$elsecontent.text+"("+$ifdef_else.text+")");
    }
    -> template(content={$elsecontent.text}) "<content>"
  )
;

ifdef_if:
  (PREP_IFDEF|PREP_IFNDEF) WORD
//  {
//    System.out.println("FOUND IFDEF "+$IDENTIFIER.text+" at line: "+$PREP_IFDEF.line+" with content: "+$ifcontent.text);
//   } 
//   -> template() "" 
;

ifdef_else: 
  PREP_ELSE
//  {
//    System.out.println("else has content: "+$elsecontent);
//  } 
//  -> template(content={$elsecontent.text}) "<content>" 
;

content: ( content_text  | include)*;

content_text: (~(PREP_ENDIF|PREP_ELSE|PREP_INCLUDE|PREP_DEFAULT_NETTYPE))+;

include: PREP_INCLUDE '"' WORD '"' -> template() ""  ;


ignore: PREP_DEFAULT_NETTYPE WORD -> template() "";


//-----------------------------------------------//
// Lexer                                         //
//-----------------------------------------------//
// Operators
//EXE_QUOTE   : '`'   ;




// Preprocessor instructions
//-------------
PREP_INCLUDE          : '`include';
PREP_IFDEF            : '`ifdef'; 
PREP_IFNDEF           : '`ifndef'; 
PREP_ELSE             : '`else';
PREP_ENDIF            : '`endif';
PREP_DEFAULT_NETTYPE  : '`default_nettype';


WORD

    :
        ('a'..'z'|'A'..'Z'|'_'|'$'|'.'|'0'..'9')+
        ;



// To be ignored
COMMENTAR_SHORT: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
COMMENTAR_LONG: '/*' .* '*/' {$channel=HIDDEN;} ;     
NEWLINE:'\r'?'\n' {$channel=HIDDEN;};
WS  :   (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ;

CONTENT: .;
