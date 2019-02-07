package dec24;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {
@FindBy(xpath="//img")
private List<WebElement> noOfImage;

public FlipkartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public int countImage()
{
	return noOfImage.size();
}
	
}
