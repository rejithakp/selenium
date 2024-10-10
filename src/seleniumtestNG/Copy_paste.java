package seleniumtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copy_paste {
	WebDriver driver;
	String base_url="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url_launch() {
		driver.get(base_url);
		driver.manage().window().maximize();
}
	@Test
	public void copy_paste() {
		WebElement name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		name.sendKeys("Rustyn");
		WebElement id=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act=new Actions(driver);
		act.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();		
	}
}