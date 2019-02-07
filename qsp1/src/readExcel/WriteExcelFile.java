package readExcel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class WriteExcelFile {
	@Test
	public void testA() throws Exception
	{
		
		String p="./data/B1.xlsx";
		// open the work book 
		Workbook book1=WorkbookFactory.create(new FileInputStream(p));
		// go to sheet1-> 1st row ->1st cell
		for(int i=0;i<4;i++) 
		{
			for(int j=0;j<2;j++)
			{
				Cell c=book1.getSheet("Sheet1").getRow(i).getCell(j);
				c.setCellValue("English");
				
			}
		}
	      
		String p2="./data/Book2.xlsx";
		book1.write(new FileOutputStream(p2));
		// close the file
		book1.close();
	}
}