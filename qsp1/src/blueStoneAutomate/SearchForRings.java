package blueStoneAutomate;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchForRings {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions action=new Actions(driver);
	    driver.findElement(By.xpath("//form[@id='searchbox_elastic_search']/descendant::input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//form[@id='searchbox_elastic_search']/descendant::input[@type='submit']")).submit();
		action.moveToElement(driver.findElement(By.xpath("//div[@id='top-filter']/descendant::section[@id='Price-form']"))).perform();
		String val=driver.findElement(By.xpath("//div[@id='top-filter']/descendant::span[@data-displayname='below rs 10000']/descendant::span[@class='items-count']")).getText();
		System.out.println(val);
	
	}	
	
}
