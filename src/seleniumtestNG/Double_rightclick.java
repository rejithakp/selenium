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

public class Double_rightclick {
	WebDriver driver;
	String base_url="https://demo.guru99.com/test/simple_context_menu.html";
	Actions act;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loadURL() {
		driver.get(base_url);
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	public void right_click() {
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement cl=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		 act=new Actions(driver);
		act.contextClick(cl).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"))).click();
		WebElement edt=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		edt.click();
		driver.switchTo().alert().accept();
	}
	@Test(priority=1)
	public void double_click() throws InterruptedException {
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	    act=new Actions(driver);
		act.doubleClick(dc).perform();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		//dc.click();
		driver.switchTo().alert().accept();
		
	}

}
