package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FacebookAuto {
	static 
	{
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com"); // It will open html page 
		//driver.findElement(By.tagName("a")).click();// find the element by using tag name then click on that
		// String a = driver.findElement(By.tagName("div")).getText();

		// driver.findElement(By.tagName("img")).click();
		driver.findElement(By.id("email")).sendKeys("giri26march@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dddDDD@2");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		//System.out.println(a);
		//driver.navigate().back();
		
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		Thread.sleep(20000);
		driver.close();

		
	}

}
