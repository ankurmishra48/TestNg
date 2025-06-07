package Testng;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;



public class ParallelEx4 {
  @Test
  public void openGoogle() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
  }
  
  @Test
  public void openUniversity() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vit.ac.in/");
	  
  }
  @Test
  public void openHrm() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
}
