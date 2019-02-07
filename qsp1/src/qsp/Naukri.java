package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {
	static
	{
		DriverInterface.setProperty();
		
	}
			public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/");
			Thread.sleep(20000);
			driver.findElement(By.id("geoLocPopUp"));
			driver.findElement(By.id("block")).click();
			
			
	}

}
