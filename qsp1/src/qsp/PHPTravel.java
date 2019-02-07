package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PHPTravel {
	
	static
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/free-version/");
		driver.findElement(By.className("mc-closeModal")).click();
	}
}
