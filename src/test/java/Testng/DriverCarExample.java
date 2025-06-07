package Testng;

import org.testng.annotations.Test;

public class DriverCarExample {
	
	
  @Test(priority=0)
  public void startTheCar() {
	  System.out.println("Start the car");
	  
  }
  
  @Test(priority=1)
  public void SwiftFirstGear() {
	  System.out.println("First Gear");
  }
  
  @Test(priority=2)
  public void swiftSecondGear() {
	  System.out.println("Second Gear");
  }
  @Test(priority=3)

  public void SwiftThirdGear() {
	  System.out.println("Third gear");
  }
  @Test(priority=4)

  public void SwiftFourthGear() {
	  System.out.println("Fourth gear");
  }
  
}