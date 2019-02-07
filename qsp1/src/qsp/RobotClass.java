package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class RobotClass {

	static 
	{
		   System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		/*Robot r=new Robot();
		int j=10;
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			r.mouseMove(j, 50);
			j=j+10;
			Thread.sleep(500);
		}*/
		// control notepad
	/*	Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_B);
		*/
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org.download");
		driver.findElement(By.linkText("3.141.59")).click();
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		

	}

}
