package Testng;

import org.testng.annotations.Test;

public class ParallelEx2 {
  @Test
  public void ParrentLogin() {
	  System.out.println("Parent Login");
  }
  
  public void ParentDetails() {
	  System.out.println("Parent Details");
  }
}
