package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindGoogleSearch {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		 WebElement element = driver.switchTo().activeElement();
		 element.sendKeys("java");
		 String s="//span[contains(text(),'java')]";
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 List<WebElement> e=driver.findElements(By.xpath(s));
		for (int i = 0; i < args.length; i++) {
			WebElement we=e.get(i);
			String text=we.getText();
			System.out.println(text);	
		}
		e.get(0).click();	 

	}

}
