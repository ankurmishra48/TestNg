package Testng;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	
  @Test(priority=0)
  public void startTheCar() {
	  System.out.println("Start the Car");
  }
  
  @Test(priority=1)
  public void SwiftFirstGear() {
	  System.out.println("First Gears");
  }
  @Test(priority=2)
  public void SwiftSecondGear() {
	  System.out.println("Second Gears");
  }
  @Test(priority=3)
  public void SwiftThirdGear() {
	  System.out.println("Third Gears");
  }
  @Test(priority=4)
  public void SwiftFourthGear() {
	  System.out.println("Fourth Gears");
  }
  
  @Test(priority=5,enabled=false)
  public void tutnMusicOn() {
	  System.out.println("Music on");
  }
  
  
  
}
