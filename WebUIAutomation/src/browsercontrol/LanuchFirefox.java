package browsercontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("about:cehome");
		
		dr.manage().window().maximize();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		dr.manage().window().setSize(null);;
		dr.quit();
		
	}

}
