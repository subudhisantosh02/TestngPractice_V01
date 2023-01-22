package TestNGCodeStudio.TestngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNgParameterDemo {
	
	@Test
	@Parameters({"i","j"})
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void substraction(int a, int b)
	{
		System.out.println(a-b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void multiplication(int a, int b)
	{
		System.out.println(a*b);
	}

}
