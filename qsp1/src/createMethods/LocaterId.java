package createMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocaterId {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
     public static WebElement  getValueId(String path,String val,WebDriver driver)
     {
    	 
    	 if(path.equals("id"))
    	 {
    		return driver.findElement(By.id(val));
    	 }
    	 else if(path.equals("name"))
    	 {
    		return driver.findElement(By.name(val));
    	 }
    	 else if(path.equals("cssSelector"))
    	 {
    		return driver.findElement(By.cssSelector(val));
    	 }
    	 else if(path.equals("linkText"))
    	 {
    		return driver.findElement(By.linkText(val));
    	 }
    	 else if(path.equals("partialLinkText"))
    	 {
    		return driver.findElement(By.partialLinkText(val));
    	 }
    	 else if(path.equals("xpath"))
    	 {
    		return driver.findElement(By.xpath(val));
    	 }
    	 else if(path.equals("tagName"))
    	 {
    		return driver.findElement(By.tagName(val));
    	 }
    	return null;
    	 
    	
    	 
     }
}
