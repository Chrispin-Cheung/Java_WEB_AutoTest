/*
 * 浏览器多窗口切换 跳转到网易邮箱登录页面，登录邮箱
 */

package browsercontrol;


import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindows2 {

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
		
		//search  网易邮箱 
		open.findElementByXPath("html/body/div/div[3]/div/div[6]/div/div[2]/div[1]/div[1]/div[1]/div[1]/ul/li[5]/a").click();
		//open.findElementByLinkText("网易").click();
		tls.mySleep(5000);
		
		tls.switchToWindows(open);
		
			
		//visit the email.163.com		
		open.findElementByLinkText("网易邮箱").click();
		tls.mySleep(5000);
		
		tls.switchToWindows(open);
		
		tls.mySleep(2000);
		
		
		open.quit();
	}

}
