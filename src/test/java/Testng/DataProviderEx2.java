package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProviderEx2 {
  @Test(dataProvider="mydata")
  public void Login(String user,String password) {
	  System.out.println("Login credentials");
	  System.out.println(user);
	  System.out.println(password);
	  
  }
  
  @DataProvider(name="mydata")
  public Object[][] getdata(){
	  Object[][] data=new Object[3][2];
	  data[0][0]="User One";
	  data[0][1]="VIT1@";
	  data[1][0]="User Two";
	  data[1][1]="VIT2@";
	  data[2][0]="User Three";
	  data[2][1]="VIT3@";
	  return data;
 
	  
	  
  }
}
