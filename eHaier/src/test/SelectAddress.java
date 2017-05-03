/*
 * 多下拉框同时选择，使用下拉框内滚动条定位元素，或使用select控件来获取其对应的元素值
 * 问题：使用select能够定位第一个select下拉框，并选定值，
 * 		定位第二个下拉框时，报错无法定位到页面元素
 */
package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.ehaier.com/product/13643.html");
		dr.manage().window().maximize();
		
		mySleep(2000);
		
		Actions act = new Actions(dr);
		WebElement wlt= dr.findElementByXPath(".//*[@id='location']");
		Action mouserOver = act.moveToElement(wlt).build();
		mouserOver.perform();
		
		//选择四川省
		mySleep(2000);
		selectorChoose(dr,".//*[@id='product_info']/div[2]/p[2]/select[1]","四川");
		mySleep(2000);
		
		//选择达州市
		//mouseOver(dr);
		selectorChoose(dr,".//*[@id='product_info']/div[2]/p[2]/select[2]","达州");
		mySleep(2000);
		
		//选择宣汉县
		//mouseOver(dr);
		selectorChoose(dr,".//*[@id='product_info']/div[2]/p[2]/select[3]","宣汉县");
		//等待时间稍长
		mySleep(5000);
		
		//选择天生镇
		//mouseOver(dr);
		selectorChoose(dr,".//*[@id='product_info']/div[2]/p[2]/select[4]","天生镇");
		mySleep(2000);
		
		String Address = dr.findElementByXPath(".//*[@id='location']").getText();
		
		System.out.println(Address);
				
//		
//		
//		滚轴滑动，获取页面元素
//		dr.executeScript("var container = $('select[1]');container.scrollTop(100);");
//	    dr.findElementByXPath(".//*[@id='product_info']/div[2]/p[2]/select[1]/option[17]").click();
//	    mySleep(1000);
		mySleep(20000);
		dr.quit();
		
	}
	static void mySleep(int Second)
	{
		try {
			Thread.sleep(Second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void  mouseOver(FirefoxDriver dr)
	{
		Actions act = new Actions(dr);
		WebElement wlt= dr.findElementByXPath(".//*[@id='location']");
		Action mouserOver = act.moveToElement(wlt).build();
		mouserOver.perform();
	}
	static void selectorChoose(FirefoxDriver dr,String XPath,String AttriValue)
	{
		WebElement select = dr.findElementByXPath(XPath);
		Select Provinces = new Select(select);//省或直辖市
		//Provinces.selectByIndex(22);
		Provinces.selectByVisibleText(AttriValue);
		//Citys.selectByIndex(15);
		mySleep(5000);
	}

}
