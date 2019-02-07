package qsp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	public GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public int getCountLinks()
	{
		return allLinks.size();
	}
	

}
