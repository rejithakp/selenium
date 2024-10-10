package seleniumtestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ilovepdf_robot {
	WebDriver driver;
	String base_url="https://www.ilovepdf.com/word_to_pdf";
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loadurl() {
		driver.get(base_url);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws AWTException {
		WebElement fl=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		fl.click();
		
		StringSelection strSelection=new StringSelection("C:\\Users\\rejitha\\Downloads\\Resume for Freshers.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
