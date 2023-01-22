package TestNGCodeStudio.TestngPractice;

import org.testng.annotations.*;

public class TestNgParamaterAutomobile {
	@Parameters({"AutomobileName"})
	@Test
	public void testcase1(String name) {
		System.out.println(name);
	}

}
