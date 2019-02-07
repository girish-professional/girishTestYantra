package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/giri26march/Desktop/Notepad%20Files/jspro1.html");
	//	driver.findElement(By.id("t2")).sendKeys("coming");
	JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<2;i++)
		{	js.executeScript("window.scrollBy(0,5000)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0;i<2;i++)
		{
			js.executeScript("window.scrollBy(0,-5000)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// if you used sendKeys in Invalid are  get InvalidElementStateException
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		
	
		js2.executeScript("document.getElementById('t2').value='qsp'");
		
		}
	}

}
