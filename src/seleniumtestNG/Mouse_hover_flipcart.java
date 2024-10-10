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

public class Mouse_hover_flipcart {
	WebDriver driver;
	String base_url="https://www.flipkart.com/";
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
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement sc=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[4]/div/div/span/span[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(sc).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/object/a[6]"))).click();
	}
}
