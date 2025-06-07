package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class ParamEx1 {
  @Test
  @Parameters("Name")
  public void displayName(String name) {
	  System.out.println("Name is:"+name);
  }
}
