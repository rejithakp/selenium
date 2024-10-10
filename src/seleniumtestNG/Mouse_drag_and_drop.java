package seleniumtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_drag_and_drop {
WebDriver driver;
String base_url="https://demo.guru99.com/test/drag_drop.html";
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
public void drag_n_drop() {
	//debt
	WebElement ft=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement acnt=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement bnk=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement amt=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	Actions act=new Actions(driver);
	act.dragAndDrop(bnk,acnt).perform();
	act.dragAndDrop(ft,amt).perform();
	//credit
	WebElement sls=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement accnt=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	
	//WebElement mfh=driver.findElement(By.xpath("//*[@id=\"credit0\"]/a"));
	WebElement amnt=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
	Actions act1=new Actions(driver);
	act.dragAndDrop(sls,accnt).perform();
	//act.dragAndDrop(mfh,amnt).perform();
	act.dragAndDrop(ft,amnt).perform();	
	
}
@Test
public void verify_text() throws InterruptedException {
	String txt=driver.getPageSource();
	if(txt.contains("Perfect!")){
		System.out.println("pass");
		}
	else {
		System.out.println("failed");
	}
	Thread.sleep(2000);
	}
}
