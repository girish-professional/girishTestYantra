package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String xp1="(//input[@type='text'])[2]";
		driver.findElement(By.xpath(xp1)).sendKeys("giri26march@gmail.com");
		Thread.sleep(1000);
		String xp2="(//button)[2]";
		driver.findElement(By.xpath(xp2)).click();
	}

}
