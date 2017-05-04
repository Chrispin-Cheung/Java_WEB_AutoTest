package testng;

import org.testng.annotations.Test;

import business.Business;
import utils.DataReadXML;
//import utils.ReadXML;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestMethod1 {
	Business bn;
//	ReadXML result;
	DataReadXML result1;
		
//  public void f() throws Exception {
//		String str = result.readxml();
//		String res[] = str.split(" ");
//		for(int i = 0; i < res.length; i++)
//		{
//			System.out.println(res[i]);
//		}
//		bn.Login(res[0], res[1], res[2]);
//		bn.myWait(2000);
//	}
	@Test //标志测试用例情况
	  public void f0() throws Exception {
			String username = result1.dataReadXML("src/data/yhd.xml", "login", "username0");
			String password = result1.dataReadXML("src/data/yhd.xml", "login", "password0");;
//			try{
//				password = result1.dataReadXML("src/data/yhd.xml", "login", "password1");
//			}catch(Exception e)
//			{
//				password = "";
//		}
			String expect = result1.dataReadXML("src/data/yhd.xml", "login", "expect0");
			System.out.println(username);
			System.out.println(password);
			System.out.println(expect);
			bn.Login(username, password, expect);
			bn.myWait(2000);  
	  }
	@Test //标志测试用例情况
  public void f1() throws Exception {
		String username = result1.dataReadXML("src/data/yhd.xml", "login", "username3");
		String password = result1.dataReadXML("src/data/yhd.xml", "login", "password3");;
//		try{
//			password = result1.dataReadXML("src/data/yhd.xml", "login", "password1");
//		}catch(Exception e)
//		{
//			password = "";
//	}
		String expect = result1.dataReadXML("src/data/yhd.xml", "login", "expect3");
		System.out.println(username);
		System.out.println(password);
		System.out.println(expect);
		bn.Login(username, password, expect);
		bn.myWait(2000);  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  bn = new Business();
//	  result = new ReadXML();
	  result1 = new DataReadXML();
	  bn.openBrowser("http://www.yhd.com");
	  bn.windowMaxmize();
	  bn.myWait(2000);
	  bn.switchToLoginPage();
	  bn.myWait(2000);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  bn.closeBrowser();
  }

}
