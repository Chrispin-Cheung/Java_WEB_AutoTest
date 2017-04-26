/*
 * 用户名登录，退登，重登，密码正确
 */
package testcase;

import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Common;

public class Logincase010 {
	public static void main(String[] args)
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.yhd.com");
		Common tool = new Common();
		tool.myWait(2000);
		
		dr.findElementByXPath(".//*[@id='global_unlogin']/a[1]").click();
		
		//页面跳转
		tool.myWait(2000);
		//locate the userName
		dr.findElementByXPath(".//*[@id='un']").sendKeys("18811181160");;
		//locate the Pwd
		dr.findElementByXPath("html/body/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/input[@id = 'pwd']").sendKeys("pk2012114AI");
		//click the logon button
		dr.findElementByXPath(".//*[@id='login_button']").click();
		tool.myWait(6000);
		String gt = dr.findElementByXPath(".//*[@id='global_login']/div[1]/a[1]").getText();
		
		if (gt.equals("iotrookie"))
		{
			System.out.println("登录成功！");
		}
		else
		{
			System.out.println("登录失败！");
		}
		dr.findElementByXPath(".//*[@id='global_login']/div[1]/i").click();
		
		dr.findElementByXPath(".//*[@id='global_login']/div[2]/a");
		tool.myWait(2000);
		
		dr.close();
		
	}
	
}
