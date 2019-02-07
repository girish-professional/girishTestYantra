package dec24;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlipKart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		FlipkartPage fp=new FlipkartPage(driver);
		int count=fp.countImage();
		System.out.println("No of Image present in WebPage"+count);
		driver.close();

	}

}
