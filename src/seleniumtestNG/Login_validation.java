package seleniumtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_validation {
	WebDriver driver;
	String base_url="https://practicetestautomation.com/practice-test-login/";
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void load_url() {
		driver.get(base_url);
		driver.manage().window().maximize();	
		}
	@Test
	public void verification() {
		WebElement mail=driver.findElement(By.name("username"));
		mail.sendKeys("student");
		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys("Password123");
		WebElement lgn=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		lgn.click();
		
		String actual_current_url=driver.getCurrentUrl();
		System.out.println("current url="+actual_current_url);
		String exp="https://practicetestautomation.com/logged-in-successfully/";
		//String exp1="https://practicetestautomation.com/practice-test-login/";
		if(exp.equalsIgnoreCase(actual_current_url)) {
			System.out.println("url verification pass");
		}
		else {
			System.out.println(" url verification failed");
		}
		
		String actual_current_title=driver.getTitle();
		System.out.println("current title="+actual_current_title);
		String exp_title="Logged In Successfully | Practice Test Automation";
		if(exp_title.equalsIgnoreCase(actual_current_title)) {
			System.out.println("title verification passed");
		}
		else {
			 System.out.println("title verification failed");
		}
	}
}
