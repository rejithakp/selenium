package seleniumtestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Noukri_autoit {
	WebDriver driver;
	String base_url="https://www.naukri.com/registration/CreateAccount?";
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
	public void test1() throws InterruptedException, IOException {
		WebElement exp=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]"));
		exp.click();
		Thread.sleep(2000);
		WebElement res=driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]"));
		res.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\rejitha\\automation\\selenium\\Noukri_fileupload.exe");
	}
		

}
