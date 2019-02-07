package blueStoneAutomate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectBanlgeSize {
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
		WebElement jewellary=driver.findElement(By.xpath("//li/descendant::a[@title='Jewellery' and contains(text(),'All Jewellery')]"));
		action.moveToElement(jewellary).perform();
		driver.findElement(By.xpath("//li/descendant::a[@title='Jewellery' and contains(text(),'All Jewellery')]/following-sibling::div/descendant::span[@class='prcs-d' and contains(text(),\"Men's Jewellery\")]/parent::div/following-sibling::ul/li/following-sibling::li/a[contains(text(),'Kadas')]")).click();;
		
		driver.findElement(By.xpath("//div[@id='grid-view-result']/descendant::li/div/div/div/a")).click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement sel=driver.findElement(By.xpath("//select[@id='ringselect']"));
		Select s=new Select(sel);
		s.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement valueOfSize;
		try
		{
		valueOfSize=driver.findElement(By.xpath("//div[@class='item-properties-inner']/div[@class='row line-separator size-row']/div[contains(text(),'Size')]/following-sibling::div"));
		}
		catch(Exception e)
		{
			valueOfSize=driver.findElement(By.xpath("//div[@class='row line-separator']/div[contains(text(),'Size')]/following-sibling::div"));
		}
	    System.out.println(valueOfSize.getText());
	    
		
	}

}
