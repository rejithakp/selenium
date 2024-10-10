package seleniumtestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping_program {
	@BeforeTest(alwaysRun=true)
	public void setUp() {
		System.out.println("launch browser");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void urlSetup() {
		System.out.println("browser is loading");
	}
	@Test(groups= {"sanity"})
	public void main1() {
		System.out.println("this is main1");
	}
	@Test(groups= {"sanity","smoke"})
	public void main2() {
		System.out.println("this is main2");
	}
	@Test(groups= {"regression"})
	public void main3() {
		System.out.println("this is main3");
	}
	@Test(groups= {"sanity","regression"})
	public void main4() {
		System.out.println("this is main4");
	}
	@Test(groups= {"smoke"})
	public void main5() {
		System.out.println("this is main5");
	}
	@Test
	public void main6() {
		System.out.println("this is main 6");
	}
	@AfterMethod
	public void browserClose() {
		System.out.println("browser is closing");
	}
}
