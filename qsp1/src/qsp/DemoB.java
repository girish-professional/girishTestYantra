package qsp;

import java.io.File;
import java.io.IOException;

import com.codingcatholic.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubdr
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.whatsapp.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./photo/Girish.png"); // portable network graphics
		FileUtils.copyFile(src, des);
	}

}
