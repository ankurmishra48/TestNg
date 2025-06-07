package Testng;

import org.testng.annotations.Test;

public class DependencyManagement {

  @Test(enabled=true)
  public void highschool() {  // Now it's enabled
    System.out.println("High School");
  }

  @Test(dependsOnMethods="highschool")
  public void highersecondary() {
    System.out.println("Higher secondary");	  
  }    

  @Test(dependsOnMethods="highersecondary")
  public void college() {
    System.out.println("College");
  }
}
