/*
 * 切换页面frame&&屏蔽弹窗 调查网登录
 */
package cn;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver open = new FirefoxDriver();
		Tools tls = new Tools();
		
		open.manage().window().maximize();
		
		//visit the diaochawang
		open.get("http://www.diaochaquan.cn");
		tls.mySleep(2000);
		
		//locate the "会员登录"
		open.findElementByXPath(".//*[@id='main1']/div[1]/a/div/div").click();
		
		open.switchTo().frame("TB_iframeContent");
		tls.mySleep(2000);
		
		open.findElementByXPath(".//*[@id='txtUsername']").sendKeys("iotrookie");
		open.findElementByXPath(".//*[@id='txtPassword']").sendKeys("pk2012114AI");
		open.findElementByXPath(".//*[@id='btnLogin']").click();
		tls.mySleep(2000);
		
		open.quit();
	}

}
