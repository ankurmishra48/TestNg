package Testng;

import org.testng.annotations.Test;
import org.testng.SkipException;


public class aSkipTest {
  @Test
  public void askipTest() {
	  String condition="Welcome";
	  if(condition.equals("Welcome")){
		  throw new SkipException("Skipping-This is not ready for testing");
	  }
	  else {
		  System.out.println("Inside else condition");
	  }
	  System.out.println("Out of the if else condition");
  }
	  @Test
	  public void nonSkipTest(){
		  System.out.println("No need to skip this test");
	  
  }
}
