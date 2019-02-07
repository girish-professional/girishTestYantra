package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesHandlingS {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }

public static void main(String[] args) throws Exception{
	

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/giri26march/Desktop/Notepad%20Files/p2.html");
		//driver.switchTo().frame(0);
		WebElement t1=driver.findElement(By.id("t1"));
		Thread.sleep(1000);
		t1.sendKeys("Selenium");
		driver.switchTo().frame(0);
		
		
		
		WebElement t2=driver.findElement(By.id("t2"));
		//t1.clear();
		Thread.sleep(1000);
		t2.sendKeys("bhanuPrakash");
		driver.switchTo().parentFrame();
		t1.clear();
		t1.sendKeys("girish");
		
		
	}

}
