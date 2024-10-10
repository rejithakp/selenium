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

public class Robot_upload {
	WebDriver driver;
	String base_url="https://www.naukri.com/registration/CreateAccount?";
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
	public void test() throws InterruptedException, AWTException {
		WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("Rustyn");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("Rustyn@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("Rustyn.123");
		WebElement mob=driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		mob.sendKeys("8139805036");
		WebElement exp=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]"));
		exp.click();
		Thread.sleep(2000);
		WebElement res=driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]"));
		res.click();
		
		/*StringSelection strSelection= new StringSelection("C:\\Users\\rejitha\\Documents\\My Resume (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	*/
		fileupload("C:\\Users\\rejitha\\Documents\\My Resume (1).pdf");
		}
	
	
	
		public void fileupload(String file) throws AWTException{
		StringSelection strSelection= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
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