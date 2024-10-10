package seleniumtestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	WebDriver driver;
	String base_url="https://janasya.com/";
	Actions act;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url_launch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(base_url);
		driver.manage().window().maximize();
		
	}
	/*@Test
	public void title_verification() {
		String expected_title="Shop Women's Kurta, Dress, Co-ord Sets, Kurta Sets";
		String actual_title=driver.getTitle();
		System.out.println(expected_title);
		if(actual_title.equals(expected_title)) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
		
	}*/
	/*@Test
	public void verify_logo() throws InterruptedException {
		//Thread.sleep(2000);
		
		boolean logo=driver.findElement(By.xpath("//img[@alt=\"JANASYA-LOGO\"][1]")).isDisplayed();
		
		if(logo) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
	}*/
	@Test
	public void tests_shop() {
		WebElement shp=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[4]/details/summary"));
		 act=new Actions(driver);
		act.moveToElement(shp).perform();
		WebElement krtst=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[4]/details/ul/li[2]/details/summary/div"));
		//krtst.click();
		act=new Actions(driver);
		act.moveToElement(krtst).perform();
		WebElement anrkli=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[4]/details/ul/li[2]/details/ul/li[2]/a"));
		anrkli.click();
		WebElement srt=driver.findElement(By.xpath("//*[@id=\"shopify-section-template--16405615640746__main\"]/div/div/div/height-observer/div/div[2]/button/span"));
		srt.click();
		WebElement prce=driver.findElement(By.xpath("//button[@value=\"price-ascending\"]"));
		prce.click();
		WebElement fltr=driver.findElement(By.xpath("//*[@id=\"shopify-section-template--16405615640746__main\"]/div/div/div/height-observer/div/div[1]/button"));
		fltr.click();
		WebElement sz=driver.findElement(By.xpath("//*[@id=\"facets-drawer\"]/form/div/details[3]/summary/span"));
		sz.click();
		WebElement szsel=driver.findElement(By.xpath("//*[@id=\"checkbox-facets-drawer-1-template--16405615640746__main--filter.v.option.size-xs\"]"));
		szsel.click();
		WebElement vrslt=driver.findElement(By.xpath("//*[@id=\"facets-drawer\"]/div/button"));
		vrslt.click();
		}
	/*@Test
	public void tests_product() {
		WebElement prod=driver.findElement(By.xpath("//img[@alt=\"Pink Georgette Foil Printed Anarkali Kurta Set\"]"));
		prod.click();
		
		boolean prodname=driver.findElement(By.xpath("//*[@id=\"shopify-section-template--16405616394410__main\"]/div/div/div/safe-sticky/div/div[2]/h1")).isDisplayed();
		
		if(prodname) {
			System.out.println("product name is correct");
		}
		else {
			System.out.println("product name is wrong");
		}
		WebElement prodclr=driver.findElement(By.xpath("//*[@id=\"king-linked-options-section\"]/div/div/div[2]/div/div/img"));
		prodclr.click();
		WebElement addcrt=driver.findElement(By.xpath("//*[@id=\"product-form-8011929977002-template--16405616394410__main\"]/div/buy-buttons/button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", addcrt);
		addcrt.click();
		
		WebElement chkout=driver.findElement(By.xpath("//*[@id=\"cart-drawer\"]/form/div[2]/div/button"));
		chkout.click();
		
		WebElement frstimg=driver.findElement(By.xpath("//*[@id=\"677734760857\"]/div[1]/a/picture/img"));
    	frstimg.click();
	}*/
}
