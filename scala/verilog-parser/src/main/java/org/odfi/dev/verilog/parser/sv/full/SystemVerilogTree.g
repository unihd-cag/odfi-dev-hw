tree grammar SystemVerilogTree;


options {
    tokenVocab=SystemVerilogFull;
    ASTLabelType=CommonTree; 
}

scope ParametersScope {

  HashMap<String,Parameter> parameters;

}

// START:members
@header {

package org.odfi.dev.verilog.parser.sv.full;

import java.util.Map;
import java.util.HashMap;
import java.math.BigInteger;
import org.odfi.dev.verilog.parser.sv.model.*;

}
 

@members {


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
  
  
  
}


verilog 
  returns [Verilog verilog]
  @init {
    verilog = this.verilog;
  }
  : 
 
	^(VERILOG module[null]+) 
	{{
	   System.out.println("Verilog end of rule");
	  
	 
	 }}
;

verilog_module 
  [Module m]
  returns [Verilog verilog]
   @init {
    verilog = this.verilog;
  }
  : 
 
  ^(VERILOG module[m]) 
  {{
     System.out.println("Verilog end of rule");
    
   
   }}
;

   
module 
  [Module sourceModule]
  returns [Module module]
  scope ParametersScope;
  @init {
    if (sourceModule==null) {
      $module = new Module();
    } else {
      $module = sourceModule;
    }
    verilog.getModules().add($module);
    $ParametersScope::parameters = new HashMap<String,Parameter>();
  }
  : 
   ^(MODULE 
      ^(MODULE_NAME IDENTIFIER)
      
      module_parameters[$module]?
      
      ^(MODULE_PORTS module_ports[$module])
      
      (variable_declaration[$module])*
      
      (module_instanciation[$module])*
      
      (initial_declaration)*
      
      (always_declaration)*
      
      (assign_declaration)*
   )
   {
   
    System.out.println("Module set name: "+$IDENTIFIER.text+"module is at: @"+$IDENTIFIER.line+":"+$IDENTIFIER.getCharPositionInLine()+","+$IDENTIFIER.text.length());
    $module.setName($IDENTIFIER.text);
    $module.setParserSourceInformations($IDENTIFIER);
   }
;

// Module Parameters
//-------------------------
module_parameters[Module module]: 
  ^(MODULE_PARAMETERS parameter_declaration[$module]*)
  
  {
   // $module.getPorts().add($port_declaration.port);
  }
;

parameter_declaration[Module module]
  :
  ^(MODULE_PARAMETER
      IDENTIFIER
      value=.)
  {
    Parameter newParameter = new Parameter($IDENTIFIER.text,new SVExpression($value.getText()));
    $ParametersScope::parameters.put($IDENTIFIER.text,newParameter);
    $module.addParameter(newParameter);
  }
;


// Module ports
//-----------------

module_ports[Module module]: 
  port_declaration[$module]* 
  doxygen_group_end?
  {
   // $module.getPorts().add($port_declaration.port);
  }
;


port_declaration[Module module]
  returns [ModulePort port]
  :  ^(MODULE_PORT 
	       PORT_DIRECTION?
	       BASE_DATA_TYPE?
	       data_size?
	       name=IDENTIFIER
	       
	       doxygen_group_end?
	       doxygen_group_def? 
	       doxygen_param*
	       doxygen_group_begin? 
	     )  
	     {
	       //-- Create Port
	       $port = new ModulePort();
	       if ($PORT_DIRECTION.text!=null) $port.setDirection(ModulePort.DIRECTION.valueOf($PORT_DIRECTION.text));
	       if ($BASE_DATA_TYPE.text!=null) $port.setType(ModulePort.TYPE.valueOf($BASE_DATA_TYPE.text));
	       
	       //-- Group
	       if (this.activeGroup!=null) {
	         $port.setGroup(this.activeGroup);
	       }
	       $port.setSize($data_size.size);
	       $port.setName($name.text);
	       $module.getPorts().add($port);
	       
//	       if($name.text.equals("pcie_clk"))
//          System.out.println("Found Port "+$name.text+" --> "+$port.getSize());
	       
//	       System.out.println("Found port: "+$PORT_DIRECTION.text+",s="+$data_size.size+","+$name.text);
	       
	     } 
;




// Module instanciations
//--------------------------
module_instanciations [Module m] : module_instanciation[m]*;
module_instanciation [Module m]
  returns [ModuleInstance mi]:
  
  ^(MODULE_INSTANCE type=IDENTIFIER name=IDENTIFIER port_connection*) 
  
  {
    $mi = new ModuleInstance($type.text,$name.text); 
    $m.getModuleInstances().add($mi);
  }
  ;
port_connection: ^(MODULE_INSTANCE_CONNECTION port_name=CONNECTION_IDENTIFIER local_connection=IDENTIFIER?);



// Variable Instanciations
//-------------------------------------
variable_declaration [Module m]:
  ^(MODULE_VARIABLE data_type size_def? IDENTIFIER )
;

// Control Structures
//-----------------------
initial_declaration : INITIAL  ;
      
always_declaration: ALWAYS  ;
      
assign_declaration: ASSIGN   ;

// Common definitions
//----------------------------
data_type: BASE_DATA_TYPE | SV_DATA_TYPE;

data_size
  returns [SVExpression size]
  :

  ^(DATA_SIZE size_def)
  {
    $size=$size_def.size;
  }

;

size_def
  returns [SVExpression size]
  @init{
    $size = new SVExpression();
  }
  : 
  
    ^(EXPRESSION expression[$size] ^(TEXT txt=.))
    {
      $size.setExpression($txt.getText());
//      System.out.println("Found Size def in tree: "+$txt.getText());
    }
;

expression 
  [SVExpression expression]
  : 
  ((LPAREN expression[$expression] RPAREN) 
  | expression_operand[$expression] )? (expression_operator expression[$expression])?
;
expression_operand 
  [SVExpression expression]
  : 
  (IDENTIFIER (LBRACK NUMBER RBRACK)?)  {$expression.addParameter($ParametersScope::parameters.get($IDENTIFIER.text));}
  | NUMBER 
  | (EXE_QUOTE IDENTIFIER)
  | typed_value ;
  
expression_operator: DIV | PLUS  | MINUS | LAND | BOR | BAND |  BNOT | STAR | BXOR | BXNOR | LNOT | EQ | QUESTION | COLON | LOR | LT | LE | GT | GE ;

// A typed value is one of size'typenumber
typed_value: BUS_VALUE;


// Doxy things
//---------------------------
doxygen_group_def: 
   (IDENTIFIER )
   {
    //-- Get from Map
    ModulePortGroup group = this.portGroups.get($IDENTIFIER.getText());
    if (group==null) {
      //-- Create if non-existent
      group = new ModulePortGroup($IDENTIFIER.getText());
      this.portGroups.put($IDENTIFIER.getText(),group);
      this.lastAddedGroup = group;
    }
   

   
   }
;
doxygen_group_begin:
   (DOXY_GROUP_START)
   {
      //-- If there is no last added group, create an anonymous one (not mapped)
      if (this.lastAddedGroup==null) {
        this.lastAddedGroup = new ModulePortGroup();     
      }
   
      //-- Activate last group
      this.activeGroup = this.lastAddedGroup;
      
      
      
   }
;
doxygen_group_end:
  (DOXY_GROUP_STOP)
  {
  

      // Deactivate active group
      this.activeGroup = null;
      this.lastAddedGroup = null;
      
      
      
   }
    
;

doxygen_param:
  ^(DOXY_PARAM EXTENDED_IDENTIFIER short_long_identifier?)
  {

    //-- If there is no last added group, create an anonymous one (not mapped)
     if (this.lastAddedGroup==null) {
       this.lastAddedGroup = new ModulePortGroup();
     }
     
    // System.out.println("Found Param: "+$EXTENDED_IDENTIFIER.text+" => "+($short_long_identifier.s!=null?$short_long_identifier.s:"true"));
  
    //-- Add Param to last defined Group if there is one
    if (this.lastAddedGroup!=null) {
      this.lastAddedGroup.addParameter($EXTENDED_IDENTIFIER.text,$short_long_identifier.s!=null?$short_long_identifier.s:"true");
    }
  
  }
;


// Base Components
//--------------------------

/// An identifier than can be normal (short), or in " " capsed
short_long_identifier 
  returns [String s] : 
  IDENTIFIER 
  {
    $s = $IDENTIFIER.text;
  }
  | 
  DQUOTE (IDENTIFIER content=(WS+ IDENTIFIER)*)  DQUOTE  
  {
    $s = $content.text;
  }
;

