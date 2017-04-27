/*
 * 打开浏览器，访问百度首页，搜索“人民的名义”
 */
package browsercontrol;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Search1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://start.firefoxchina.cn/");
		//浏览器管理方法
		dr.manage().window().maximize();
		//启动浏览器后，刷新网络时，需要设置思考时间
		mySleep(1000);
		
		//获取页面元素
		//通过页面按钮来进行搜索
		//dr.findElementById("search-key").sendKeys("人民的名义");
//		dr.findElementByXPath(".//*[@id='search-key']").sendKeys("人民的名义");
//		//dr.findElementById("search-submit").click();
//		dr.findElementByXPath(".//*[@id='search-submit']").click();
//		//dr.findElementByClassName("btn-engine").click();
		
		//输入人民的名义，和利用Keys键盘输入回车键，完成搜索过程
		dr.findElementByXPath(".//*[@id='search-key']").sendKeys("人民的名义"+Keys.ENTER);
		//点击后，访问页面，设置响应时间
		mySleep(2000);
		dr.close();
	}
	static void mySleep(int time)//自定义等待函数
	{
		try {
			Thread.sleep(time); //单位 毫米ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
