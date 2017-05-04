package testcase;

import org.openqa.selenium.Keys;

import utils.Common;

public class AddToShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common dr = new Common();
		dr.openBrowser("http://www.yhd.com/");
		dr.windowMaxmize();
		dr.myWait(2000);
		String str = "维达倍韧系列2层150抽抽取式面纸 3包(中规格)";
		dr.locatePosition("XPath", ".//*[@id='keyword']").sendKeys(str+Keys.ENTER);
		dr.myWait(2000);
		
		
	}

}
