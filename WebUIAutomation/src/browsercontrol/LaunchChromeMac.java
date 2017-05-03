package browsercontrol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeMac {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设置webdriver.chrome.driver属性
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		//声明chromeoptions,主要是给chrome设置参数
		ChromeOptions options = new ChromeOptions();
		//
		options.addArguments("--test-type","--start-maximized");
		options.addArguments("--test-type","—ignore-certificate-errors");
		WebDriver dr = new ChromeDriver(options);
		dr.get("http://www.baidu.com");
		dr.quit();
	}
}
