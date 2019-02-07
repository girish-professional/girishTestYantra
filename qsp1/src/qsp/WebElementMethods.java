package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org");
		WebElement un=driver.findElement(By.id("email"));
		String s=un.getAttribute("value");
		System.out.println(s);
		//String s1=un.findElement(By.linkText("presstigers.com")).getAttribute("href");
		///driver.navigate().back();
		//System.out.println(s1);
		WebElement btn=driver.findElement(By.id("user_login_btn"));
		btn.sendKeys(Keys.ENTER); // Keys is a Enumeration 

	}

}
