package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test(invocationCount=2) // invocationCount=2,priority=1
	public void register()
	{
		char c=19999;
		boolean a;
		
		
		Reporter.log("register",true);

		System.out.println();
	 
	}
	final int i=1;
	@Test(priority=i)
	public void login()
	{
		Reporter.log("login", true);
	}
}
