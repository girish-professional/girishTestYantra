package qsp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
		WebElement w=driver.findElement(By.xpath("//a[@id='nav-orders']"));
		String s = w.getAttribute("id");
		System.out.println(s);
		String cssValue = w.getCssValue("color");
		System.out.println(cssValue);
		int x=w.getLocation().getX();
		int y=w.getLocation().getY();
		System.out.println("x and y value   "+x+"  "+y);
		
		String text=w.getText().toLowerCase();
		
		System.out.println("Get Text value = "+text);
		
		int h=w.getRect().height;
		int width=w.getRect().width;
		System.out.println(" Height "+h+" Width "+width);
		
		Dimension dimension = w.getSize();
		System.out.println(" Dimension "+dimension);
		
		System.out.println(" Is displayed "+w.isDisplayed());
		
		System.out.println("is enabled "+w.isEnabled());
		
		System.out.println(" is selected "+w.isSelected());
		
	   File t= w.getScreenshotAs(OutputType.FILE); // It will take screenshot of element 
	   File f=new File("./photo/nikita.png");
	   FileUtils.copyFile(t, f);  
	 
	}

}
