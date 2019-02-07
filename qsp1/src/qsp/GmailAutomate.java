package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailAutomate {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
	
		
		driver.findElement(By.id("identifierId")).sendKeys("girish.professional@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("madhuri143");
		driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Inbox"));
		if(driver.getTitle().contains("Inbox"))
				{
					System.out.println(" VALIDATION IS SUCCESSFULL ");
				}
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3' or contains(text(),'Compose')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("premashine@gmail.com");
		driver.findElement(By.cssSelector("input[name='subjectbox']")).sendKeys("Hellooooo");
		driver.findElement(By.cssSelector("div[aria-label='Message Body']")).sendKeys(" GoodMorning/GoodEvening/GoodNight");
		driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();

		Thread.sleep(5000);
	    driver.close();
	}
;
} 
