package dec21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp=new LoginPage(driver) ;
		
		lp.setUserName("aadkj");
		lp.setPassword("meneger");
		lp.clickLogin();
		try
		{
		
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
		}
		

	}

	
	
	
}
