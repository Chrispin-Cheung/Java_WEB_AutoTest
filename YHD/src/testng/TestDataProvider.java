package testng;

import org.testng.annotations.Test;

import business.Business;
import utils.DataReadXML;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
  Business bn;
  @Test(dataProvider = "dp")
  public void f(String n, String s,String t) {
	  bn.Login(n, s, t);
	  bn.myWait(2000);  
  }
  @BeforeMethod
  public void beforeMethod() {
	  bn = new Business();
	  bn.openBrowser("http://www.yhd.com");
	  bn.windowMaxmize();
	  bn.myWait(2000);
	  bn.switchToLoginPage();
	  bn.myWait(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  bn.closeBrowser();
  }

////  TestNG框架自动生成的方法的改造，
//	  @DataProvider
//	  public Object[][] dp() throws Exception {
//		  DataReadXML res = new DataReadXML();
//	  // 返回赋值给二维数组
//		  return new Object[][] {
//	      new Object[] {res.dataReadXML("src/data/yhd.xml", "login", "username"), 
//	    		  		res.dataReadXML("src/data/yhd.xml", "login", "password"),
//	    		  		res.dataReadXML("src/data/yhd.xml", "login", "expect")
//	      				},
//	      new Object[] {res.dataReadXML("src/data/yhd.xml", "login", "username1"), 
//			  			res.dataReadXML("src/data/yhd.xml", "login", "password1"),
//			  			res.dataReadXML("src/data/yhd.xml", "login", "expect1")
//					},
//	     
//	    };
//	  }
	@DataProvider
	public Object[][] dp() throws Exception {
		  DataReadXML res = new DataReadXML();
	// 初始化Object[][]二维数组
		  Object[][] datapool  = new Object[5][];
		  for(int i = 0; i < 5; i ++)
		  {
			  //初始化object[][]数组每行,并赋值
			  datapool[i] = new Object[] {res.dataReadXML("src/data/yhd.xml", "login", "username"+i), 
			  			res.dataReadXML("src/data/yhd.xml", "login", "password"+i),
			  			res.dataReadXML("src/data/yhd.xml", "login", "expect"+i)
					};
		  }
		  return  datapool;
	}
  
}
