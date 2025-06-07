package Testng;

import org.testng.annotations.Test;

public class GroupingExample {
  @Test(groups= {"Apple"})
  public void apple1() {
	  System.out.println("Testing Apple Phone One");
  }
  @Test(groups= {"Apple"})
  public void apple2() {
	  System.out.println("Testing Apple Phone Two");
  }
  @Test(groups= {"Vivo"})
  public void vivo1() {
	  System.out.println("Testing Vivo Phone One");
  }
  @Test(groups= {"Vivo"})
  public void vivo2() {
	  System.out.println("Testing Vivo Phone Two");
  }
  
  @Test(groups= {"Moto"})
  public void moto1() {
	  System.out.println("Testing moto Phone One");
  }
  @Test(groups= {"Moto"})
  public void moto2() {
	  System.out.println("Testing lenevo Phone one");
  }
  @Test(groups= {"Lenevo"})
  public void lenevo1() {
	  System.out.println("Testing lenevo Phone two");
  }
}
