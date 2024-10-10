package seleniumtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browsing_test {
	WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"})
	
	public void setUp(String browser) {
		
		//System.out.println(browser);
		if
			(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
		}		
	}
	@Test
	public void test_parameters() {
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("rustyn@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("rusty");
		driver.findElement(By.name("login")).click();
	}
}
