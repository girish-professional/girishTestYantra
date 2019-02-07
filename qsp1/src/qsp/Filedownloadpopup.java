package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownloadpopup {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='mainContent']/table/tbody/tr/td[1]/../td[4]")).click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}
		
	

}
