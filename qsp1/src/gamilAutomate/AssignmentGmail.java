package gamilAutomate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AssignmentGmail {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("girish.professional@gmail.com");
		Actions action=new Actions(driver);
		
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("girish.professional@gmail.com");

		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("madhuri143");
		driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
		String verify=driver.findElement(By.className("aKz")).getCssValue("color");
		System.out.println(verify);
		if(verify.equals("rgba(217, 48, 37, 1)"))
		{
			System.out.println("color is verfied and it is red ");
		}
		else
		{
			driver.findElement(By.className("akz")).click();
		}
		Thread.sleep(1000);
		String emailCount=driver.findElement(By.xpath("//div[@id=':iy']/descendant::span[@class='Dj' and contains(text(),'of')]/span/following-sibling::span")).getText();
		System.out.println(emailCount);
	}
}
