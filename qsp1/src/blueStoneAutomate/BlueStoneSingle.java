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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneSingle {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws IOException,InterruptedException {
			// TODO Auto-generated method stub
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com");
			Actions action=new Actions(driver);
			String sheetName="Sheet1";
			String path="./data/ringdata.xlsx";
			WebElement element=driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
			action.moveToElement(element).perform();
			String mainmenu="//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(text(),'Rings')]/following-sibling::div/descendant::div/div[@class='wh-submenu-header']";
		    WebElement subElement=driver.findElement(By.xpath(mainmenu));
		    driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(text(),'Rings')]/following-sibling::div/descendant::div/div[@class='wh-submenu-header'and contains(text(),'Popular Ring Types')]/parent::div/ul/li/a[contains(text(),'Diamond')]")).click();
			List<WebElement> priceVal=driver.findElements(By.xpath("//div[@class='inner pd-gray-bg']/descendant::span[@id='bst-discounted-price']"));
			for(int i=0;i<priceVal.size();i++)
			{
				String s=priceVal.get(i).getText();
				System.out.println(s);
				setExcelData(path, sheetName, i, 0,s );
				
			}
			Thread.sleep(1000);
			WebElement sort=driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,150)");
			action.moveToElement(sort).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='view-sort-by']/div/a[text()='Price Low to High ']")).click();
			Thread.sleep(2000);
			List<WebElement> priceVal2=driver.findElements(By.xpath("//div[@class='inner pd-gray-bg']/descendant::span[@id='bst-discounted-price']"));
			int count=priceVal.size();
			for(int i=0;i<priceVal2.size();i++,count++)
			{
				String s=priceVal2.get(i).getText();
				System.out.println(s);
				setExcelData(path, sheetName,i, 1,s );
				
			}
			
		}
		public static void setExcelData(String  path,String sheetName,int row ,int cell, String value )
		{
			
			Workbook f; 
			try {
				f = WorkbookFactory.create(new FileInputStream(path));
				if(f.getSheet(sheetName).getPhysicalNumberOfRows()==0)
				{
					f.getSheet(sheetName).createRow(row).createCell(cell).setCellValue("");
				}
				else
				{
					f.getSheet(sheetName).getRow(row).createCell(cell).setCellValue("");
					f.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
					f.write(new FileOutputStream(path));
				}
				
				
			} catch (EncryptedDocumentException  | InvalidFormatException | IOException e  ) {
				
				e.printStackTrace();
			}
		
		
			
			
		}
}
