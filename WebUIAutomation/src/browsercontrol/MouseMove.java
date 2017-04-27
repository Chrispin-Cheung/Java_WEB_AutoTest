package browsercontrol;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://start.firefoxchina.cn/");
		dr.manage().window().maximize();
		
		Tools tls = new Tools();
		tls.mySleep(1000);
		
		// visit the FirefoxHomePage
		dr.findElementByLinkText("火狐主页").click();
		tls.mySleep(1000);
		//下拉框选择
		Actions at = new Actions(dr);
		//页面元素
		WebElement item = dr.findElementByXPath(".//*[@id='site-my-list']/ul/li[4]/a");
		//移动鼠标到页面元素，以便弹窗下拉选项
		at.moveToElement(item).perform();
		tls.mySleep(1000);
		
		dr.findElementByXPath(".//*[@id='site-my-list']/ul/li[4]/div/a[2]").click();
		tls.mySleep(1000);
		
	}

}
