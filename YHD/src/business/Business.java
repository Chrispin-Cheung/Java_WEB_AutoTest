package business;
import utils.Common;

public class Business extends Common{
	public void Login(String username,String password,String expect)
	{	
		locatePosition("XPath",".//*[@id='un']").sendKeys(username);
		locatePosition("XPath",".//*[@id='pwd']").sendKeys(password);
		locatePosition("XPath",".//*[@id='login_button']").click();
		myWait(5000);
		String actValue;
		try{
			actValue = locatePosition("XPath",".//*[@id='global_login']/div[1]/a[1]").getText();
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
	public void switchToLoginPage()
	{
		locatePosition("XPath", ".//*[@id='global_unlogin']/a[1]").click();
	}
}
