package TestNGCodeStudio.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGCodeStudio.TestngPractice.ListenerClass.class)
public class ListenerDemo {

	//Username : Admin
	//Password : admin123
	
	WebDriver driver;
	
	@Test
	public void logIn() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
				
	}
	
	@Test
	public void testFail()
	{
		System.out.println("failed testcase");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testSkipped() 
	{
		System.out.println("skipped testcase");
		throw new SkipException("skip exception thrown");
		
	}
	
	
	
}
