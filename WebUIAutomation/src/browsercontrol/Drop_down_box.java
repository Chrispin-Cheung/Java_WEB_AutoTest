/*
 * 卜易居 www.buyiju.com 下拉框
 */
package browsercontrol;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Drop_down_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.buyiju.com/");
		dr.manage().window().maximize();
		
		Tools tls = new Tools();
		//输入 用户尊姓
		dr.findElementByName("xings").sendKeys("张");
		//输入 用户大名
		dr.findElementByName("mingz").sendKeys("平");
		//选择 血型 下拉框 O型血 
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[4]/select/option[3]").click();
		tls.mySleep(2000);
		//选择 下拉框 生日 年
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[5]/select[1]/option[55]").click();
		//选择 下拉框 生日 月
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[5]/select[2]/option[11]");
		//选择 下拉框 生日 日
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[5]/select[3]/option[7]");
		//选择 下拉框 生日 时辰
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[6]/select[1]/option[13]");
		//选择 下拉框 生日 分
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[6]/select[2]/option[12]");
		
		//点击开始算命按钮
		dr.findElementByXPath("html/body/div[2]/div[3]/table/tbody/tr/td[2]/font/div/form/div[7]/div/input").click();
		tls.mySleep(2000);
		dr.quit();
	}

}
