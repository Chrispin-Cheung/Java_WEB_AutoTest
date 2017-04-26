/*
 * "用户名登录，用户名为空，密码随机"
 */

package testcase;

import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Common;

public class Logincase003 {
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
		dr.findElementByXPath(".//*[@id='un']").sendKeys("");;
		//locate the Pwd
		dr.findElementByXPath("html/body/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/input[@id = 'pwd']").sendKeys("pk2012114AI");
		//click the logon button
		dr.findElementByXPath(".//*[@id='login_button']").click();
		tool.myWait(6000);
		String gt = dr.findElementByXPath(".//*[@id='error_tips']").getText();
		
		if (gt.equals("请输入账号"))
		{
			System.out.println("测试成功！");
		}
		else
		{
			System.out.println("测试失败！");
		}
		dr.close();
		
	}
	
}
