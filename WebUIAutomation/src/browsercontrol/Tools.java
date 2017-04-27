/*
 * 常用通用类
 */
package browsercontrol;

import java.util.ArrayList;
//import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tools {
	public void mySleep(int time)//自定义等待函数
	{
		try {
			Thread.sleep(time); //单位 毫米ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void switchToWindows(FirefoxDriver webdriver)
	{
		//获取页面上所有的WindowHandle放入set集合中
//		Set<String> handles = webdriver.getWindowHandles();
		//将 Set集合转换成ArrayList集合
//		ArrayList<String> arrayhandles = new ArrayList<String>(handles);
		
//				//Set集合判断跳转页面
		//1、循环遍历这个集合中的元素
//				for(String s : handles)
//				{
//					//如果和当前窗口的handle一样，跳出本次循环，继续下次一循环
//					if(s.equals(currentHandle))
//					{
//						continue;
//					}
//					else{
//						
//					}
//				}
		
		//
		ArrayList<String> arrayhandles = new ArrayList<String>(webdriver.getWindowHandles());
		
		
		//遍历输出所有WindowHandles
		for(int i = 0; i < arrayhandles.size(); i++)
		{
			System.out.println(arrayhandles.get(i));
		}
		
		int handletotal = arrayhandles.size();
		webdriver.switchTo().window(arrayhandles.get(handletotal - 1 ));	
	}
	public void scollTop(FirefoxDriver webdriver)
	{
		for (int i = 1; i < 50; i++)
		{
			webdriver.executeScript("var p = document.documentElement.scrollTop="+100*i);
			this.mySleep(500);
		}
	}
}
