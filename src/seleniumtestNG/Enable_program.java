package seleniumtestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Enable_program {
	@BeforeTest
	public void setUp() {
		System.out.println("launch browser");
	}
	@BeforeMethod
	public void urlSetup() {
		System.out.println("browser is loading");
	}
	@Test(invocationCount=3)
	public void titleVerification() {
		System.out.println("title Verified");
	}
	@Test(dependsOnMethods="titleVerification")
	public void mainTest() {
		System.out.println("main 1");
	}
	@Test(enabled = false)
	public void getTestverified() {
		System.out.println("Test");
	}
	@AfterMethod
	public void closewebsite() {
		System.out.println("page is loading");
	}
	@AfterTest
	public void closebrowser() {
		System.out.println("browser is closing");
	}
}
