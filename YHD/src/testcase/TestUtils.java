package testcase;

import business.Business;

public class TestUtils {
	public static void main(String[] args)
	{
		Business a = new Business();
		a.openBrowser("http://start.firefoxchina.cn/");
		a.windowMaxmize();
		a.myWait(1000);
		a.openBrowser("http://www.yhd.com");
		a.myWait(1000);
		a.locatePosition("XPath", ".//*[@id='global_unlogin']/a[1]").click();
		a.myWait(1000);
		a.Login("iotrookie", "pk2012114AI", "iotrookie");
		a.myWait(1000);
		a.closeBrowser();
	}	
}
