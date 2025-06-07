package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProviderEx1 {
  @Test(dataProvider="getData")
  public void Login(String user,String password) {
	  System.out.println("Loging Credentials");
	  System.out.println(user);
	  System.out.println(password);
	  
  }
  
  @DataProvider
  public Object[][] getData(){
	  Object[][] data=new Object[3][2];
	  data[0][0]="User One";
	  data[0][1]="Vit1@";
	  data[1][0]="User two";
	  data[1][1]="Vit12@";
	  data[2][0]="User three";
	  data[2][1]="Vit123@";
	  
	  return data;

	  
  }
}
