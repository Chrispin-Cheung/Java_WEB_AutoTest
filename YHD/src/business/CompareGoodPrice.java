package business;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utils.Common;

public class CompareGoodPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common tls = new Common();
		tls.openBrowser("http://www.yhd.com/");
		tls.windowMaxmize();
		tls.myWait(2000);
		String str = "AULDEY/奥迪双钻"
				+ "悠悠球儿童玩具 火力少年王5 "
				+ "练习 赤焰战虎s悠悠球溜溜球 "
				+ "男孩益智玩具玉麟蛇-676308均码";
		tls.locatePosition("XPath", ".//*[@id='keyword']").sendKeys(str+Keys.ENTER);
		tls.myWait(5000);
		str = str.substring(0,20);
		//通过链接地址获取id属性的值，以确定商品编号id
		//String gotid = tls.locatePosition("PartialLinkText",str).getAttribute("id");
		//获取链接的部分元素，确定
		List<WebElement> gt1 = tls.dr.findElementsByPartialLinkText(str);
		String gotid1 = gt1.get(0).getAttribute("id");
		System.out.println(gotid1);
		String goodNumber = gotid1.substring(8);
		String goodPrice = tls.locatePosition("XPath", ".//*[@id='price0_"+goodNumber+"']").getText();
		
		System.out.println(goodPrice);
		
		tls.closeBrowser();
	}

}
