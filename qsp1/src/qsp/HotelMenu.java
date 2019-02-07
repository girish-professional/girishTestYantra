package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelMenu {
	static 
	{
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/giri26march/Desktop/Notepad%20Files/items.html");
		WebElement ele=driver.findElement(By.id("slv"));
		Select select=new Select(ele);
		
		boolean b=select.isMultiple();
		System.out.println(b);
		
		List<WebElement> ls=select.getAllSelectedOptions();
		int count=ls.size();
		System.out.println(count);
		
		for(int i=0;i<ls.size();i++)
		{
			WebElement e1=ls.get(i);
			String text=e1.getText();
			System.out.println(text);
			
		}

		WebElement e2=select.getFirstSelectedOption();
		System.out.println("\n First Selected"+e2.getText());
		
		 List<WebElement> ls2 = select.getOptions();
		 ArrayList<String> ls3=new ArrayList<String>();
		 
		 for(int i=0;i<ls2.size();i++)
			{
				WebElement e3=ls2.get(i);
				String text=e3.getText();
				ls3.add(text);	
			}
		
		 Collections.sort(ls3);
		 System.out.println("****************************************");
	/*	for(String text:ls3)
		 {
			 System.out.println(text);
		 }*/
		 Set<String> rd=new TreeSet<String>(ls3);
		 ArrayList<String> ls4=new ArrayList<String>();
		 for(String text:rd)
		 {
			 int c=0;
			for(int j=0;j<ls3.size();j++)
			{
				
				if(text.equals(ls3.get(j)))
				{
					++c ;
					if(c>1)
					{
						ls4.add(text);
					}
				}
			}
		 }
		 System.out.println("****************************************");
		 System.out.println("Duplicate Element are");
		 for(String text:ls4)
		 {
			 System.out.println(text);
		 }
		 
		driver.close();
		}
	


	}


