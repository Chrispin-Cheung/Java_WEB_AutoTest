package utils;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		default:
			System.out.println("error");
		}
		return Item;
	}
	public void switchToAlert()
	{
		dr.switchTo().alert().accept();
	}
	public void myWait(int time)
	{
		try {
			Thread.sleep(time); //单位 毫米ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
