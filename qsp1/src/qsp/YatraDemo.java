package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraDemo {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		// WebElement element = driver.switchTo().activeElement();
		//element.sendKeys("B");
		 driver.findElement(By.id("BE_flight_origin_city")).clear();
		 driver.findElement(By.id("BE_flight_origin_city")).sendKeys("b");
		 
		 Thread.sleep(10000);
		 String s="ac_results origin_ac";
		 List<WebElement> e=driver.findElements(By.className(s).linkText("ban"));
		 for(int i=0;i<e.size();i++)
		 {
			 System.out.println(e.get(i));
		 }
	}
}