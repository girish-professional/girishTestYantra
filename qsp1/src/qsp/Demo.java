package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://pcs.d2h.com:8383/Terminals/login.aspx");
       Thread.sleep(2000);
       driver.findElement(By.tagName("a")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.id("a1")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.name("n1")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.className("c1")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.linkText("Qsp")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       driver.findElement(By.partialLinkText("Qs")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       driver.findElement(By.cssSelector("a[id='a1'")).click();
       //cssSelector DO NOT support text
	}

}
