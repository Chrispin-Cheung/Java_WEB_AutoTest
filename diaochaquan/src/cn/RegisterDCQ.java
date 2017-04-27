/*
 * 调查网注册
 */
package cn;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterDCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver firefoxdr = new FirefoxDriver();
		Tools tls = new Tools();
		
		firefoxdr.manage().window().maximize();
		
		firefoxdr.get("http://www.diaochaquan.cn");
		
		firefoxdr.findElementByXPath(".//*[@id='survey_menu']/li[3]/a").click();
		tls.mySleep(1000);
		
		firefoxdr.switchTo().frame("TB_iframeContent");
		
		firefoxdr.findElementByXPath(".//*[@id='svReg']/div[3]/div/div/div/a/img").click();
		tls.mySleep(1000);
		
		firefoxdr.findElementByXPath(".//*[@id='txtUsername']").sendKeys("iotrookie1");;
		
		firefoxdr.findElementByName("strPassword").sendKeys("pk2012114AI");
		
		firefoxdr.findElementByName("strRePassword").sendKeys("pk2012114AI");
		
		firefoxdr.findElementById("strEmail").sendKeys("rsmb2008@163.com");
		
		firefoxdr.findElementByXPath(".//*[@id='btnLogin']").click();
		
		tls.mySleep(6000);
		firefoxdr.quit();
	}

}
