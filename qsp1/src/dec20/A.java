package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A {
	private WebElement unTB;
	
	public A(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
	}
	public void setUserName()
	{
		unTB.sendKeys("admin");
	}
	
	

}
