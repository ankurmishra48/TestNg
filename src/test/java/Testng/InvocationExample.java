package Testng;

import org.testng.annotations.Test;

public class InvocationExample {
	
	
  @Test(invocationCount=10)
  public void sample() {
	  System.out.println("Test with invocation method");
  }
  @Test
  public void sample1() {
	  System.out.println("Test with normal method");
  }
  
  
}
