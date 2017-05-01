package testcase;

import org.openqa.selenium.Keys;

import utils.Common;

public class TestSwitchToWindows {
	public static void main(String[] args)
	{
		//常用工具类
		Common tls = new Common();
		// visit the FirefoxStartPage
		
		tls.openBrowser("http://start.firefoxchina.cn/");
		//MaxSize the browser window size
		tls.windowMaxmize();
		tls.myWait(1000);
		
		// visit the FirefoxHomePage
		tls.locatePosition("LinkText", "火狐主页").click();
		tls.myWait(1000);
		
		//火狐主页搜索网易邮箱
		tls.locatePosition("XPath", ".//*[@id='search-key']").sendKeys("网易邮箱"+Keys.ENTER);
		
		tls.myWait(5000);
		
		tls.switchToWindow();
		
		//搜索结果页，访问 email.163.com
		tls.locatePosition("XPath", ".//*[@id='2']/h3/a").click();
		System.out.println("success");
		//
		//跳转到网易免费邮箱登陆页
		tls.switchToWindow();
		
		//输入用户登录信息，进行登陆
		//会输出error？
		tls.locatePosition("CssSelector","#userNameIpt").sendKeys("rsmb2008");
		tls.locatePosition("CssSelector","#pwdInput").sendKeys("kpNOVA9293AI1314");
		tls.locatePosition("CssSelector","#btnSubmit").click();
		
		tls.myWait(5000);
		tls.closeBrowser();
	}
}
