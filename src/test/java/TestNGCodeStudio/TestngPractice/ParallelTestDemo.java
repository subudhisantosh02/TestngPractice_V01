package TestNGCodeStudio.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTestDemo {
	
	WebDriver driver;
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Thread.sleep(2000);
		driver.quit();
		
		
			
	}
	
	@Test
	public void verifyLogo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(2000);
		driver.quit();
			
	}

}
