package day1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Urbanladder {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.linkText("Close")).click();
		Actions action=new Actions(driver);
	     List<WebElement> firstMenu = driver.findElements(By.className("topnav_itemname"));
	     
	     for(int i=0;i<firstMenu.size();i++)
			{
					String items=firstMenu.get(i).getText();
					String locate="//div[@class='subnavlist lt' and contains(text(),'"+items+"')]";
					System.out.println(items);
					Thread.sleep(1000);
					action.moveToElement(firstMenu.get(i)).perform();
					Thread.sleep(1000);
					List<WebElement> saleElements = driver.findElements(By.xpath(locate));
					
						for(int j=0;j<saleElements.size();j++)
						{
							String subitems=firstMenu.get(i).getText();
							String locatesub="//a[@class='inverted' and contains(text(),'"+subitems+"')]";
							System.out.println(subitems);
							List<WebElement> subSaleElements = driver.findElements(By.xpath(locatesub));
							
							for(int k=0;k<subSaleElements.size();k++)
							{
								if((saleElements.get(j).getText().length())!=0)
								{ 
									Thread.sleep(1000);
									String path="./data/menu.xlsx";
									String sName="menu";
									String value=saleElements.get(j).getText();
									System.out.println(saleElements.get(j).getText());
									
								}
							}
							
						}
			}
			


	}
	

}
