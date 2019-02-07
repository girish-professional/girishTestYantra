package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.handler.AllowSymLinkAliasChecker;

public class manyLinks {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/giri26march/Desktop/Notepad%20Files/manyLink.html");
		List<WebElement> allLink=driver.findElements(By.tagName("a"));
		//WebElement w=allLink.get(1);
		//w.click();
		int count=allLink.size();
		System.out.println(" count of all line "+count);
		for(int i=0;i<allLink.size();i++)
		{
			WebElement w=allLink.get(i);
			System.out.println(w.getText());;
		}
		//  driver.findElement(By.xpath("(//a)[2]")).click();
	}
}
