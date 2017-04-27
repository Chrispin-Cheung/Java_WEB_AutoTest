/*
 * 弹窗处理，鼠标页面滚动
 */
package browsercontrol;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchtoAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.buyiju.com/");
		dr.manage().window().maximize();
		
		Tools tls = new Tools();
		//用户信息不输入，点击开始算命按钮，页面出现弹出框
		//点击开始算命按钮
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[7]/div/input").click();;
		tls.mySleep(2000);
		
		//
		dr.switchTo().alert().accept();
		tls.mySleep(5000);
		
		//页面滚动操作
		//dr.executeScript(" var q = document.documentElement.scrollTop = 500");
		//自定义的页面向上翻动方法
		//tls.scollTop(dr);
		
		dr.quit();
	}

}
