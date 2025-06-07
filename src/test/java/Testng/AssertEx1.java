package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx1 {
  
  @Test
  public void test1() {
      Assert.assertEquals("MIT", "VIT"); // Expected failure
  }
  
  @Test
  public void test2() {
      Assert.assertEquals("MIT", "VIT", "Test to check title"); // Expected failure
  }
  
  @Test
  public void test3() {
      Assert.assertEquals(true, true); // Passes
  }
  
  @Test
  public void test4() {
      Assert.assertEquals(true, false, "Test to check login credentials"); // Expected failure
  }
  
  @Test
  public void test5() {
      Assert.assertTrue(true); // Passes
  }
  
  @Test
  public void test6() {
      Assert.assertTrue(false, "Test to check login credentials"); // Expected failure
  }
  
  @Test
  public void test7() {
      Assert.assertFalse(false); // Passes
  }
  
  @Test
  public void test8() {
      Assert.assertFalse(true, "Test to check login credentials"); // Expected failure
  }
}
