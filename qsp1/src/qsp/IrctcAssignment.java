package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcAssignment {
	static
	{
		DriverInterface.setProperty();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		//driver.findElement(By.id("closeme")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']/a/i")).click();
		String xp1="(//span[text()='AGENT LOGIN'])[2]";
        driver.findElement(By.xpath(xp1)).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
       
        String xp2="loginbutton";
        driver.findElement(By.id(xp2)).click();
        String s=driver.switchTo().alert().getText();
        System.out.println(s);
        driver.switchTo().alert().accept();
	}

}
