/*
 * Browser’s back and forward
 */

package browsercontrol;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 实例化 instantiation of used class
		//浏览器驱动
		FirefoxDriver open = new FirefoxDriver();
		//常用工具类
		Tools tls = new Tools();
		
		//MaxSize the browser window size
		open.manage().window().maximize();
		
		// visit the FirefoxStartPage
		open.get("http://start.firefoxchina.cn/");
		tls.mySleep(1000);
		//get the title of current page
		String startPage = open.getTitle(); 
		
		//visit the FirefoxHomePageIndex
		//function 
		open.findElementByLinkText("火狐主页").click();
		tls.mySleep(1000);
		//get the title of current page
		String first = open.getTitle();
		
		//back up to lately visited Page
		open.navigate().back();
		tls.mySleep(1000);
		//get the title of current page
		String second = open.getTitle();
		//assert : is the lately visited Page 
		if (second.equals(startPage))
		{
			//forward to the lately visited Page
			System.out.println("页面：后退测试成功");
			open.navigate().forward();
			tls.mySleep(1000);
			String third = open.getTitle();
			//assert
			if (third.equals(first))
			{
				System.out.println("页面：前进测试成功");		
			}
			else
			{
				System.out.println("页面：前进测试失败");
			}
		}else
		{
			System.out.println("页面：后退测试失败");
		}
		
		open.navigate().refresh();
		tls.mySleep(2000);
		open.quit();
	}

}
