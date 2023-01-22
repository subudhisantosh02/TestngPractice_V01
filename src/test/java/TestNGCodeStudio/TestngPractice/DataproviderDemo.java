package TestNGCodeStudio.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderDemo {
	
/*	@DataProvider(name="searchDataset")
	public Object[][] searchData()
	{
		Object[][] searchKeyword=new Object[3][2];
		searchKeyword[0][0]="Delhi";
			
		searchKeyword[0][1]="QutubMinar";
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="TajMahal";
		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]="Charminar";
		
		return (Object[][]) searchKeyword;
	}*/
	//@Test(dataProvider="searchDataset")
	@Test(dataProvider="searchDataset",dataProviderClass=DataproviderMethod.class)
	public void testCaseGoogleSearch(String city,String monument)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@class='gLFyf']"));//.sendKeys(city +" "+monument);
		searchBox.sendKeys(city +" "+monument);
		WebElement searchButton=driver.findElement(By.xpath("//input[@class='gNO89b']"));  
		searchButton.click();
			
		
	}

}
