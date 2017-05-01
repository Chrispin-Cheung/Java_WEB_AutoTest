/*
 * 浏览器多窗口切换
 */

package browsercontrol;


import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver open = new FirefoxDriver();
		//常用工具类
		Tools tls = new Tools();
		
		//MaxSize the browser window size
		open.manage().window().maximize();
		
		// visit the FirefoxStartPage
		open.get("http://start.firefoxchina.cn/");
		tls.mySleep(1000);
		
		// visit the FirefoxHomePage
		open.findElementByLinkText("火狐主页").click();
		tls.mySleep(1000);
		
		//获取当前窗口的handle
		//String currentHandle = open.getWindowHandle();
		//System.out.println(currentHandle);
		
		//visit the www.163.com
		//火狐主页点击网易
		//open.findElementByCssSelector("a[title = '网易']").click();
		//open.findElementByXPath(".//*[@id='site-my-list']/ul/li[5]/a").click();
		//open.findElementByLinkText("网易").click();
		
		//火狐主页搜索网易邮箱
		open.findElementByXPath(".//*[@id='search-key']").sendKeys("网易邮箱"+Keys.ENTER);
		
		tls.mySleep(5000);
		
		tls.switchToWindows(open);
		
			
		//visit the email.163.com		
		//open.findElementByLinkText("网易邮箱").click();
		//open.findElementByXPath(".//*[@id='js_index2017_wrap']/div[2]/div[2]/div[4]/div[2]/div[1]/div/div[2]/div[1]/div/h3/a").click();
		
		//搜索结果页，访问 email.163.com
		open.findElementByXPath(".//*[@id='2']/h3/a").click();
		System.out.println("success");
		//
		//跳转到网易免费邮箱登陆页
		tls.switchToWindows(open);
		
		//输入用户登录信息，进行登陆
		open.findElementByCssSelector("#userNameIpt").sendKeys("rsmb2008");
		open.findElementByCssSelector("#pwdInput").sendKeys("kpNOVA9293AI1314");
		open.findElementByCssSelector("#btnSubmit").click();
		
		tls.mySleep(5000);
		
		
		tls.mySleep(2000);
		
		
		open.quit();
	}

}
