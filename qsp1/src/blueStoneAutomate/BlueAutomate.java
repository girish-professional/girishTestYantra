package blueStoneAutomate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueAutomate {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		
		Actions action=new Actions(driver);
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
		
		for(int i=0;i<element.size();i++)
		{
			Thread.sleep(1000);
			
			//System.out.println(mainmenu);
			action.moveToElement(element.get(i)).perform();
			String mainmenu="//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(text(),'"+element.get(i).getText()+"')]/following-sibling::div/descendant::div/div[@class='wh-submenu-header']";
			System.out.println(element.get(i).getText());
		    List<WebElement> subElement=driver.findElements(By.xpath(mainmenu));	
			System.out.println(" sub elment size"+subElement);
		    for(int j=0;j<subElement.size();j++)
			{
		    	Thread.sleep(1000);
		        String submenu="//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(text(),'"+element.get(i).getText()+"')]/following-sibling::div/descendant::div/div[@class='wh-submenu-header'and contains(text(),'"+subElement.get(j).getText()+"')]/parent::div/ul/li";
				System.out.println(subElement.get(j).getText());
				List<WebElement> subMenuElements=driver.findElements(By.xpath(submenu));

				for(int k=0;k<subMenuElements.size();k++)
				{
					Thread.sleep(500);
					System.out.println(subMenuElements.get(k).getText());
					
				}
				
		    	
			}
		}
	
	}
	public static void setExcelData(String  path,String sheetName,int row ,int cell, String value )
	{
		
		Workbook f; 
		try {
			f = WorkbookFactory.create(new FileInputStream(path));
			f.getSheet(sheetName).createRow(row).createCell(cell).setCellValue("                    ");;		
			f.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
			f.write(new FileOutputStream(path));
			
		} catch (EncryptedDocumentException  | InvalidFormatException | IOException e  ) {
			
			e.printStackTrace();
		}
	
	
		
		
	}

}
