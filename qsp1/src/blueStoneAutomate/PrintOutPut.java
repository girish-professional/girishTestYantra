package blueStoneAutomate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintOutPut {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.bluestone.com");
	    Thread.sleep(1000);
	    driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.xpath("//div[@id='contentDiv']/descendant::span[text()='×']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("livechat-compact-view");
		driver.findElement(By.id("open-label")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		driver.switchTo().activeElement().sendKeys("girishkumar");
		driver.findElement(By.id("email")).sendKeys("girish.prdofessi9onal@gmail.com");
		driver.findElement(By.id("container_4_4")).sendKeys("0022556677");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		try {
			driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys("free gold");
			driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys(Keys.ENTER);
		}
		catch(Exception e) {}
		
		Thread.sleep(5000);
		List<WebElement> chatMsg = driver.findElements(By.xpath("//div[@id='body']/descendant::span[@class='msg-text']"));
		for(WebElement wb:chatMsg)
		{
			System.out.println(wb.getText());
		}
		
	}

}
