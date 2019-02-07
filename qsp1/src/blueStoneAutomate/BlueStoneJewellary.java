package blueStoneAutomate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.deploy.uitoolkit.Window;
import com.sun.java.swing.plaf.windows.resources.windows;

import javafx.scene.control.ScrollBar;

public class BlueStoneJewellary {

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
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement error=driver.findElement(By.xpath("//div[@class='formErrorContent' and contains(text(),'* This field is required')]"));
		String errorMsg=error.getText();
		System.out.println(errorMsg);
	}
}
