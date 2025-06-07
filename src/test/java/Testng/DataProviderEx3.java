package Testng;

import org.testng.annotations.Test;

public class DataProviderEx3 {
  @Test(dataProvider="mydata",dataProviderClass=DataProviderEx2.class)
  public void login(String user,String password) {
  
  System.out.println("Login Credentials");
  System.out.println(user);
  System.out.print(password);
  
  }
}
