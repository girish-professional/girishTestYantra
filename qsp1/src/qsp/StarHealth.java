package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StarHealth {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
		driver.findElement(By.id("nqame2")).sendKeys("1234556");
		driver.findElement(By.id("cust-dob")).click();
		driver.findElement(By.linkText("20")).click();
		driver.findElement(By.id("proceed")).click();

	}

}
