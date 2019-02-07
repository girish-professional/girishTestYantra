package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDuplicate {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/giri26march/Desktop/Notepad%20Files/items2.html");
		WebElement ele=driver.findElement(By.id("slv"));
		Select select=new Select(ele);
		//select.selectByValue("Idly");
		String n=select.getWrappedElement().getText();
		System.out.println(n);
	}

}
