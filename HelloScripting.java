import javax.script.*;

public class HelloScripting {
 public static void main(String[] args){
  ScriptEngineManager manager = new ScriptEngineManager();
  for(ScriptEngineFactory factory : manager.getEngineFactories()){
   System.out.println(factory.getEngineName());
  }
  ScriptEngine engine = manager.getEngineByName("nashorn");
  System.out.println("engine; "+ engine);
  try {
   Object result = engine.eval("print('Hello from JavaScript')");
   System.out.println("result: " + result );
  
  }
  catch(Exception e){
   System.out.println("e " + e);
  }

 }

}
