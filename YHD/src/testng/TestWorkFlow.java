package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestWorkFlow {
  int i = 0; 
	@Test
  public void testFunction() {
		 i=i+1;
		  System.out.println("testFunction"+i);
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  i=i+1;
	  System.out.println("BeforeMethod"+i);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  i=i+1;
	  System.out.println("afterMethod"+i);
  }

  @BeforeClass
  public void beforeClass() {
	  i=i+1;
	  System.out.println("beforeClass"+i);
  }

  @AfterClass
  public void afterClass() {
	  i=i+1;
	  System.out.println("afterClass"+i);
  }

  @BeforeTest
  public void beforeTest() {
	  i=i+1;
	  System.out.println("beforeTest"+i);
  }

  @AfterTest
  public void afterTest() {
	  i=i+1;
	  System.out.println("afterTest"+i);
  }

  @BeforeSuite
  public void beforeSuite() {
	  i=i+1;
	  System.out.println("beforeSuite"+i);
  }

  @AfterSuite
  public void afterSuite() {
	  i=i+1;
	  System.out.println("afterSuite"+i);
  }

}
