/*
 * "用户名登录，密码正确，勾选自动登录",测试失败，目前无法验证
 */

package testcase;

import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Common;

public class Logincase008 {
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
		dr.findElementByXPath(".//*[@id='un']").sendKeys("iotrookie");;
		//locate the Pwd
		dr.findElementByXPath("html/body/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/input[@id = 'pwd']").sendKeys("pk2012114AI");
		//locate the autologin
		dr.findElementByXPath(".//*[@id='check_agreement']").click();
		
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
		//关闭浏览器
		dr.close();
//		tool.myWait(6000);
//		//
//		FirefoxDriver dt = new FirefoxDriver();
//		tool.myWait(6000);
//		dt.get("http://www.yhd.com");
//		tool.myWait(6000);
//		if (gt.equals("iotrookie"))
//		{
//			System.out.println("测试成功！");
//		}
//		else
//		{
//			System.out.println("测试失败！");
//		}
//		dt.close();
	}
	
}
