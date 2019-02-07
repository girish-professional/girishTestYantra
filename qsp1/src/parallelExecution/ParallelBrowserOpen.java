package parallelExecution;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowserOpen {

	@Parameters({"nodeUrl","browserName"})
	@Test
	public void runBrowser(String node,String bname) throws MalformedURLException
	{
		URL ob=new URL(node);
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName(bname);
		WebDriver driver=new RemoteWebDriver(ob,browser);
		driver.get("http://localhost/login.do");
		
		
		
		
	}
	
	

}
