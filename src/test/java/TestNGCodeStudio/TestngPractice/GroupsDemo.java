package TestNGCodeStudio.TestngPractice;

import org.testng.annotations.*;

public class GroupsDemo {
	
	
	@Test(groups="software company")
	public void infosys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups="software company")
	public void wipro()
	{
		System.out.println("Wipro");
	}
	
	@Test(groups="car company")
	public void maruti()
	{
		System.out.println("Maruti");
	}
	
	@Test(groups="car company")
	public void tata()
	{
		System.out.println("Tata");
	}

}
