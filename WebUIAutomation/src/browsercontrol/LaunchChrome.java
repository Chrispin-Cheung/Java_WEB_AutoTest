package browsercontrol;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Browser...");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium2\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}

}
