package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {
   static {
	DriverInterface.setProperty(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");	
		//	driver.close(); // close only parent
		Set<String> allWHS=driver.getWindowHandles();
		// To Close all child except parent
		/*for(String wh:allWHS)
		{
			System.out.println(driver.getTitle());
			driver.switchTo().window(wh);
			if((driver.getTitle()).equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
			{  }
			else
				driver.close();
		} */                    
	
	/*	
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh); 
			System.out.println(driver.getTitle());
			driver.close();                  // one by one close all
		} */
	}

}
