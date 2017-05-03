package BrowserControl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		
		dr.get("http://www.baidu.com");
		
		dr.manage().window().maximize();
		
		Thread.sleep(10000);
	
		
		dr.close();

	}

}
