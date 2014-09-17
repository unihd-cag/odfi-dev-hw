package parser

import org.scalatest.FunSuite
import org.odfi.dev.verilog.parser.sv.fuzzy.SystemVerilogFuzzyModel
import org.odfi.dev.verilog.parser.sv.full.SystemVerilogModel
import org.odfi.dev.verilog.parser.sv.model.ModulePort

class ParserSimpleTest extends FunSuite {

  test("Module I/O Port test") {

    // Module Definition
    //---------------------
    var module = """
module example (
  input wire clk,
  input wire res_n,
  output reg [12:0] hello
);

endmodule

"""
    // Create Parser
    //--------------
    var parser = new SystemVerilogModel(module)
      
    // Parse Calls Preprocessor parser to resolve "IFDEF" and "DEFINES", and normal parser then
    //-------------------------
    parser.parse()
    
    // Results
    //-------------
    
    var moduleModel = parser.getModule()
    
    //-- module name
    assertResult("example")(moduleModel.getName())
    
    //-- I/O (Ports)
    //----------------
    assertResult(3)(moduleModel.getPorts().size())
    
    //-- clk
    assert(moduleModel.getPort("clk")!=null)
    assertResult(ModulePort.DIRECTION.input)(moduleModel.getPort("clk").getDirection())
    
    //-- res_n
    assert(moduleModel.getPort("res_n")!=null)
    assertResult(ModulePort.DIRECTION.input)(moduleModel.getPort("res_n").getDirection())
    
    //-- hello
    assert(moduleModel.getPort("hello")!=null)
    assertResult(ModulePort.DIRECTION.output)(moduleModel.getPort("hello").getDirection())
    assertResult(ModulePort.TYPE.reg)(moduleModel.getPort("hello").getType())
    
    //!! Warning, the size information needs a brush up to return an integer in all cases, and not loose the actual bus definition format. It Might not work for complex definitions with parameters
    assertResult(13)(moduleModel.getPort("hello").getSize().toInt())
    //println(s"Size: "+moduleModel.getPort("hello").getSize())
  }
  
  test("Module Instance") {

    // Module Definition
    //---------------------
    var module = """
module example (
  input wire clk,
  input wire res_n,
  output wire [12:0] hello,
  output wire [12:0] hello2
);

reg a;

 velo velo_I (
  .clk(clk),
  .res_n(res_n),
  .hello(hello)
  );

velo velo_I (
  .clk(clk),
  .res_n(res_n),
  .hello(hello2)
  );

endmodule

"""
    // Create Parser
    //--------------
    var parser = new SystemVerilogModel(module)
      
    // Parse Calls Preprocessor parser to resolve "IFDEF" and "DEFINES", and normal parser then
    //-------------------------
    parser.parse()
    
    // Results
    //-------------
    
    var moduleModel = parser.getModule()
    
    //-- module name
    assertResult("example")(moduleModel.getName())
    
   // Instances
    //----------------
    var instances = moduleModel.getModuleInstances()
    assertResult(2)(instances.size())
    
    //-- First Instance
    assertResult("velo_I")(instances.get(0).getName())
    
  }

}