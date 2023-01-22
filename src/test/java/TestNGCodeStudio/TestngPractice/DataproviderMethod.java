package TestNGCodeStudio.TestngPractice;

import org.testng.annotations.DataProvider;

public class DataproviderMethod {
	
	@DataProvider(name="searchDataset")
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
	}

}
