package testNGReporter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest{
	@Test
	public void test1()
	{
		Reporter.log("test1", true);
	}

}
