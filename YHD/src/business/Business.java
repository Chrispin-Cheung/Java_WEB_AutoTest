package business;
import utils.Common;

public class Business extends Common{
	public void Login(String username,String password,String expect)
	{
		myWait(2000);		
		locatePosition("XPath",".//*[@id='un']").sendKeys(username);
		locatePosition("XPath",".//*[@id='pwd']").sendKeys(password);
		locatePosition("XPath",".//*[@id='login_button']").click();
		myWait(2000);
		String actValue;
		try{
			actValue = locatePosition("XPath",".//*[@id='global_login']/div[1]/a[1]").getText();
			myWait(2000);
		}
		catch(Exception e) 
		{
			actValue = locatePosition("XPath","//*[@id='error_tips']").getText();
		}
		
		if (actValue.equals(expect))
		{
			System.out.println("TestCase Pass");
		}
		else{
			System.out.println("TestCase fail");
		}
		
	}
}
