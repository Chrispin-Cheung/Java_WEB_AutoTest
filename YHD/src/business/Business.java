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
		String actValue = locatePosition("XPath",".//*[@id='global_login']/div[1]/a[1]").getText();
		myWait(2000);
		if (actValue.equals(expect))
		{
			System.out.println("login success");
		}
		else{
			System.out.println("login fail");
		}
		
	}
}
