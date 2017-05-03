package BrowserControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//		//
//		options.addArguments("--test-type","--start-maximized");
//		options.addArguments("--test-type","—ignore-certificate-errors");
//		WebDriver dr = new ChromeDriver(options);
//		dr.get("http://www.baidu.com");
//		dr.quit();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=800,600");
		options.addArguments("--test-type","—ignore-certificate-errors");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		      
		driver.get("http://www.baidu.com");
		      
		Thread.sleep(5000);
	    
	    driver.quit();

		
	}

}
