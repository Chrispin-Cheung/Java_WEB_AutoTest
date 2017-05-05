package testngSuiteFrame;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.testng.TestNG;

import utils.SendEmail;
import utils.ZipCompressor;

public class TestNGSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testNG = new TestNG(); //实例化TestNG
		ArrayList<String> suites = new ArrayList<String>();
		suites.add("src/testng/testngSuiteFrame.xml"); 
		testNG.setTestSuites(suites); //生成测试套
		testNG.run();
		//设置压缩文件路径 
		String projectName = "一号店";
		String currentTime = getCurrentDateStr();
		String pathName = "src/reportZip/"+projectName+"Report"+currentTime+".zip";
		//String pathName = "reportZip.zip";
		ZipCompressor zc = new ZipCompressor(pathName);
		zc.ys();
		mySleep(5000);
		SendEmail semail = new SendEmail();
		try {
			semail.sendEmail(pathName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static String getCurrentDateStr() {
		Date date = new Date();
		String str = null;
		SimpleDateFormat df = new SimpleDateFormat("_yyyyMMdd_HH:mm:ss");
		str = df.format(date);
		return str;
		}
	static void mySleep(int millis)
	{
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
