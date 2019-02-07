package dec28;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AutoBrowser {
	@Parameters({"nodeUrl","browserName"})
	@Test
	public void testA(String n,String b) throws MalformedURLException, InterruptedException, AWTException{
	URL node=new URL(n);
	DesiredCapabilities browser=new DesiredCapabilities();
	browser.setBrowserName(b);
	WebDriver driver=new RemoteWebDriver(node, browser);
	driver.get("http://www.google.com");
	driver.switchTo().activeElement().sendKeys("Happy New Year");;
    Thread.sleep(1000);
	String s="//span[contains(text(),'happy new year')]";
	Thread.sleep(1000);
	List<WebElement> all = driver.findElements(By.xpath(s));
	
	for(int i=0;i<all.size();i++)
	{
		if(i==1)
		{
			Thread.sleep(1000);
			all.get(i).click();
		break;}
	}
	driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-imb'][1]/a")).click();
	driver.findElement(By.id("t13aiN3tqlAbaM:")).click();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_S);
	
	robot.keyPress(KeyEvent.VK_ALT);
	robot.keyPress(KeyEvent.VK_S);
	
	
	}

}
