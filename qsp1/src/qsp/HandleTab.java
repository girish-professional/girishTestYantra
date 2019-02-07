package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTab {
	static
	{
		DriverInterface.setProperty();
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc")).click();
		Set<String> allWHS=driver.getWindowHandles();
		int count=allWHS.size();
		System.out.println(count);
		
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
