package seleniumtestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstprgrm {
	@BeforeTest
	public void browser_launch(){
		System.out.println("launch the browser");
		
	}
	@Test
	public void test1() {
		System.out.println("first test");
	}
	@Test
	public void test2() {
		System.out.println("second test");
	}
	@Test
	public void test3() {
		System.out.println("third test");
	}
	@AfterTest
	public void tear_down() {
		System.out.println("close the browser");
	}
}
