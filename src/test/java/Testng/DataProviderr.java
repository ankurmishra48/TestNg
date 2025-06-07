package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderr {
  @Test(dataProvider="getData")
  public void Login(String username,String password) {
	  System.out.println("Login credentials");
	  System.out.println(username);
	  System.out.println(password);
	  
  }
  
  
  @DataProvider(name="getData")
  public Object[][]getData(){
	  Object[][]data=new Object[3][2];
	  data[0][0]="userone";
	  data[0][1]="pass1";
	  data[1][0]="usertwo";
	  data[1][1]="pass2";
	  data[2][0]="userthree";
	  data[2][1]="pass3";
	return data;
  }
  
}
