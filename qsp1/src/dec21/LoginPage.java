package dec21;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	// intialization
	public LoginPage(WebDriver driver) throws InterruptedException
	{
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un) throws InterruptedException
	{
		Thread.sleep(2000);
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	public void refresh(WebDriver driver)
	{
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.xpath("//input[@name='pwd']")).clear();
	}
	
	
	

}
