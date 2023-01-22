package TestNGCodeStudio.TestngPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationAttributes {

	
	
	//@Test(description="This 1st test case")
	//@Test(dependsOnMethods= {"testcase2"})
	
	@Test(enabled=false)
	public void testcase1()
	
	{
		System.out.println("Mobile login testcase");
	}
	
	//@Test//(timeOut=200)
	//@Test(priority=1)
	@Test
	public void testcase2() throws InterruptedException
	
	{	//Thread.sleep(400);
		System.out.println("Web login testcase");
		Assert.assertTrue(false);
	}
	
	
	//@Test(description="This sis 3rd test case")
	//@Test(priority=2)
	@Test
	public void testcase3()
	
	{
		System.out.println("API login testcase");
	}
	
	
	
}
