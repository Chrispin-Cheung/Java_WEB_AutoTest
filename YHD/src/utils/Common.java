package utils;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Common {
	public FirefoxDriver dr;
	public Common()
	{
		dr = new FirefoxDriver();
	}
	//open Browser and visit the specified URL
	public void openBrowser(String URL)
	{
		dr.get(URL);
		
	}
	// Maximize the Browser Window
	public void windowMaxmize()
	{
		dr.manage().window().maximize();
	}
	// close the Browser window and page
	public void closeBrowser()
	{
		ArrayList<String> handles = new ArrayList<String>(dr.getWindowHandles());
		if (handles.size() > 0 )
		{
			dr.quit();
			System.out.println("quit");
		}	
		else
		{
			dr.close();
			System.out.println("close");
		}		
	}
	// WebElement Location
	public WebElement locatePosition(String elementType,String elementValue)
	{	
		WebElement Item = null;
		switch(elementType)
		{
		case "Id":
			Item = dr.findElementById(elementValue);
			break;
		case "Name":
			Item = dr.findElementByName(elementValue);
			break;
		case "XPath":
			Item = dr.findElementByXPath(elementValue);
			break;
		case "ClassName":
			Item = dr.findElementByClassName(elementValue);
			break;
		case "LinkText":
			Item = dr.findElementByLinkText(elementValue);
			break;
		case "PartialLinkText":
			Item = dr.findElementByPartialLinkText(elementValue);
			break;
		case "CssSelector":
			Item = dr.findElementByCssSelector(elementValue);
		default:
			System.out.println("error");
		}
		return Item;
	}
	public void switchToAlert()
	{
		dr.switchTo().alert().accept();
		//dr.switchTo().alert().dismiss();
	}
	public void swtichToFrame(WebElement myframe)
	{
		dr.switchTo().frame(myframe);
	}
	public void switchToWindow()
	{
		ArrayList<String> handles = new ArrayList<String>(dr.getWindowHandles());
		dr.switchTo().window(handles.get(handles.size()-1));
	}
	//浏览器滚动条，按次滚动
	public void scollTop()
	{
		for (int i = 1; i < 50; i++)
		{
			dr.executeScript("var p = document.documentElement.scrollTop="+100*i);
			this.myWait(500);
		}
	}
	public void scrollToMyLink(WebElement myLink)
	{
		JavascriptExecutor scroll = (JavascriptExecutor) dr;
        scroll.executeScript("arguments[0].scrollIntoView();", myLink);
        
	}
	public void openLinkInNewWindow(WebElement myLink)
	{
		// open link in a new windows press shift when you click
        Actions actions = new Actions(dr);
        actions.keyDown(Keys.SHIFT).click(myLink).perform();
	}
	public void MouseSelector(WebElement item)
	{
		Actions actions = new Actions(dr);
		//移动鼠标到页面元素，以便弹窗下拉选项
		actions.moveToElement(item).perform();
	}
	public void GetGoodPrice()
	{
		
	}
	public void myWait(int MilliSeconds)
	{
		try {
			Thread.sleep(MilliSeconds);//MilliSeconds 毫秒ms
			//Thread.sleep(Seconds * 1000); //sleep函数的参数单位为 毫米ms，故乘以1000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
