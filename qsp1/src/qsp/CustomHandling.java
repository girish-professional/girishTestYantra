package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomHandling {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		while(true)
		{
			try
			{
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("hi");
				break;
			}
			catch(Exception e)
			{
				
			}
			
		}
		System.out.println("End");
		// TODO Auto-generated method stub

	}

}
