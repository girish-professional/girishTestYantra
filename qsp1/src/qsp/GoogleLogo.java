package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement link=driver.findElement(By.id("hplogo"));
		String s=link.getTagName();
		if(s.equals("img"))
		{
			System.out.println(" Pass , Its a Image ");
		}
		else
		{
			System.out.println(" Fail , Its not Image");
		}

	}

}
