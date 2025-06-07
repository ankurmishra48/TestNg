package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name="VIT";
  @Test
  public void checkequal() {
	  Assert.assertEquals(name, "VIT");
  }
}
