package seleniumtestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_hover {
	WebDriver driver;
	String base_url="https://www.ebay.com/";
	
	@BeforeTest
	public void setUp() {
		
		driver=new ChromeDriver();	
}
	@BeforeMethod
	public void loadURL() {
		driver.get(base_url);
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		 
	}
}