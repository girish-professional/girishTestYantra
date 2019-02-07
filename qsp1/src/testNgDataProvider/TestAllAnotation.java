package testNgDataProvider;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(AllAnotation.class)
public class TestAllAnotation {
	@Parameters("browser")
	@Test(priority=1,groups="chrome")
	public void run (String bname)
	{
		System.out.println(bname+" Running Test in run method ");
	}
	@Parameters("browser1")
	@Test(invocationCount=3,priority=2,groups="firefox")
	public void secondRun()
	{
		System.out.println(" Running Test in secondRun method ");
	}
	@Test(priority=3)
		public void thirdRun()
		{
		
			System.out.println(" Runnning Test in thirdRun method ");
			Assert.fail();
			System.out.println(" Assert fail ");
		}
	}


