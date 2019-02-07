package readExcel;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelFile {
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
				// get value present in clel and print it
				//String s=c.getStringCellValue();
				String s=c.toString();
				System.out.println(s);
			}
		}
		// close the file
		book1.close();
	}
}
