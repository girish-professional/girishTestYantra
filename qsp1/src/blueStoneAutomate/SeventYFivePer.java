package blueStoneAutomate;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeventYFivePer {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public static void maintest() throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/descendant::a[contains(text(),'Offers')]"));
		action.moveToElement(element).perform();
	   WebElement zeroPer=	driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/descendant::a[contains(text(),'Offers')]/following-sibling::div/descendant::span[@class='prcs-d' and contains(text(),'75% off on Making Charge')]"));
		String text=zeroPer.getText().toUpperCase().trim();
		System.out.println(text);
	   zeroPer.click();

	   List<WebElement> list = driver.findElements(By.xpath("//div[@id='search-result']//span[contains(text(),'75% off on making charge')]"));
		System.out.println(list.get(0).getText());
		for(WebElement wb:list)
		{
			Assert.assertEquals(wb.getText().trim(), text);
		}
	}

}
