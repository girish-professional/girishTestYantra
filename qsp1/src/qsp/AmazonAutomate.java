package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomate {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	//	driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.id("ap_email")).sendKeys("giri26march@gmail.com");
	//	driver.findElement(By.id("ap_password")).sendKeys("amazon@123");
	//	driver.findElement(By.id("signInSubmit")).click();
		WebElement w=driver.findElement(By.xpath("//span[text()='Departments']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(w).perform();
		

	}

}
