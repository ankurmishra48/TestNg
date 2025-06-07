package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class ParamExample1 {
  @Test
  @Parameters({"Username","Password"})
  public void sample1(String name,String password) {
	  System.out.println("The User name is"+name);
	  System.out.println("The password is"+password);
  }
  
  
}
