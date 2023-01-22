package TestNGCodeStudio.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNgParamaterGoogleSearch {
	
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String serachdata)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		searchbox.sendKeys(serachdata);
		
		Assert.assertEquals(serachdata, searchbox.getAttribute("value"));
		
		driver.quit();
		
		
	}

}
