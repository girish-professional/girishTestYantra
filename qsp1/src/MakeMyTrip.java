import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeMyTrip {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testDate() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input' and @id='hp-widget__sTo']")).sendKeys("Mysore");
		driver.findElement(By.xpath("//span[@class='autoCompleteItem__label' and contains(text(),'Mysore')]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement currDate=driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a"));
		String currDatetext=currDate.getText();
		System.out.println(currDatetext);
		WebElement currYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-month' and contains(text(),'February')]/following-sibling::span"));
		String currYearText=currYear.getText();
		System.out.println(currYearText);
		WebElement currMon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month' and contains(text(),'February')]"));
		String currMonthtext=currMon.getText();
		System.out.println(currMonthtext);
	     String am = currMonthtext.substring(0,1)+currMonthtext.substring(0,3).substring(1).toLowerCase();
	    
		LocalDate parse = LocalDate.parse(am+" "+currDatetext+","+currYearText, DateTimeFormatter.ofPattern("MMM d,yyyy"));
		System.out.println(parse);
		Assert.assertEquals(parse, LocalDate.now());
		 LocalDate ld=LocalDate.now().plusDays(30);
		 
		WebElement bookMonthHtml= driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']"));
		System.out.println(bookMonthHtml.getText());
		
		driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td[@data-handler='selectDay']/a[text()='"+ld.getDayOfMonth()+"']")).click();
	     LocalDate arrDate=ld.plusDays(30);
		js.executeScript("window.scrollBy(100,0)");
		driver.findElement(By.id("hp-widget__return")).click();
		driver.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/descendant::td[@data-handler='selectDay']/a[text()='"+arrDate.getDayOfMonth()+"']")).click();
		driver.findElement(By.id("searchBtn")).click();
	}

}
