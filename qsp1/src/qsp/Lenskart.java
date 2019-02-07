package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lenskart {

	static
	{
		DriverInterface.setProperty();
	}
	public static void main(String[] args) {
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com");
		WebElement we= driver.findElement(By.xpath("//span[text()='Shop']"));
		Actions a=new Actions(driver);
		a.moveToElement(we).perform();

	}
	}

}
