package TestNGCodeStudio.TestngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterSoftware {
	
	@Parameters({"SoftwareName"})
	@Test
	public void testcase1(String name) {
		System.out.println(name);
	}

}
