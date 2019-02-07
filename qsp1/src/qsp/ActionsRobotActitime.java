package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRobotActitime {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do;jsessionid=F1735289EBF55511AF9DE382589DEE91");
		WebElement link=driver.findElement(By.linkText("actiTIME Inc."));
		Actions action=new Actions(driver);
		action.contextClick(link).perform();
		
	/*	Robot r=new Robot();
		Thread.sleep(10000);
		r.keyPress(KeyEvent.VK_T); */
		
	}
}
