package testng;

import org.testng.annotations.Test;

import business.Business;

import utils.DataReadXML;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestMethod1 {
	Business bn;
	DataReadXML result1;
	@Test //标志测试用例情况
	public void f0() throws Exception {
		String username = result1.dataReadXML("src/data/yhd.xml", "login", "username0");
		String password = result1.dataReadXML("src/data/yhd.xml", "login", "password0");
		String expect = result1.dataReadXML("src/data/yhd.xml", "login", "expect0");
		String actValue = bn.Login(username, password);
		Assert.assertEquals(actValue, expect);
		bn.myWait(2000);  
	  }
	@Test //标志测试用例情况
	public void f1() throws Exception {
		String username = result1.dataReadXML("src/data/yhd.xml", "login", "username3");
		String password = result1.dataReadXML("src/data/yhd.xml", "login", "password3");
		String expect = result1.dataReadXML("src/data/yhd.xml", "login", "expect3");
		Assert.assertEquals(bn.Login(username, password),expect);
		bn.myWait(2000);  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  bn = new Business();
	  result1 = new DataReadXML();
	  bn.openBrowser("http://www.yhd.com");
	  bn.windowMaxmize();
	  bn.myWait(2000);
	  bn.switchToLoginPage();
	  bn.myWait(6000);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  bn.closeBrowser();
  }

}
