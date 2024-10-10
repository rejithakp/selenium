package seleniumtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sendkeys_upload {
	WebDriver driver;
	String base_url="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void load_irl() {
		driver.get(base_url);
		driver.manage().window().maximize();
	}
	@Test
	public void sendkeys() {
		WebElement fl=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		fl.sendKeys("C:\\Users\\rejitha\\Pictures\\img.jpg");
		WebElement chk=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		chk.click();
		WebElement sub=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		sub.click();
	}
}
