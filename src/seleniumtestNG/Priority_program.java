package seleniumtestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority_program {
	@BeforeTest
	public void setUp() {
		System.out.println("browser open");
	}
	@BeforeMethod
	public void setUrl() {
		System.out.println("URL loading ");
	}
	@Test
	public void titleverification() {
		System.out.println("verify title");
	}
	@Test(priority=-1)
	public void mainTest() {
		System.out.println("main 1");
	}
	@Test(priority=3)
	public void getTestVerify() {
		System.out.println("Test");
	}
//	@Test
//	public void getTestverify() {
//		System.out.println("Text");
//	}
	@AfterMethod
	public void closewebsite() {
		System.out.println("page is loading");
	}
	@AfterTest
	public void close_browser() {
		System.out.println("browser is closing");
	}
}
