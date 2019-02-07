package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class DemoA {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" My First Selenium Script ");
		//String key="webdriver.chrome.driver";
		//String value="./driver/chromedriver.exe"; // "." dot specifies Current Project
		//System.setProperty(key, value);
		WebDriver driver=new ChromeDriver(); // open the browser 
	   // WebDriver driver1=new FirefoxDriver();
	    testScript(driver);
	  //  testScript(driver1);
		
	    /*
	    String url=driver.getCurrentUrl();
		
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String d=driver.getWindowHandle();
		System.out.println(d);




		WebDriver wd;
		
		JavascriptExecutor s;
		TakesScreenshot se;
		
	*/
	   By b = By.id("un");

	}
	public static void testScript(WebDriver driver)
	{
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
	}
	

}
