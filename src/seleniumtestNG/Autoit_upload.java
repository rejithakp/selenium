package seleniumtestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit_upload {
	WebDriver driver;
	String base_url="https://www.ilovepdf.com/word_to_pdf";
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
    public void test1() throws IOException, InterruptedException {
    	WebElement fl=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
    	fl.click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\rejitha\\automation\\selenium\\File_upload.exe");
    	}
    
}
