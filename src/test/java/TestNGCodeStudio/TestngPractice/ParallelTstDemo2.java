package TestNGCodeStudio.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTstDemo2 {
	
	

	WebDriver driver;

@Test
public void verifyLogin() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.id("login-button")).submit();
	
	
	Assert.assertEquals(driver.getTitle(), "Swag Labs");
	Thread.sleep(2000);
	driver.quit();
	
}
		
}
