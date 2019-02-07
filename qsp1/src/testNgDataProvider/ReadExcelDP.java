package testNgDataProvider;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

;


public class ReadExcelDP {
	@DataProvider
public String[][] createUser() throws Exception
{
		String[][] arr;
		FileInputStream fis=new FileInputStream("./data/alldata.xlsx"); 
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		arr=new String[s.getPhysicalNumberOfRows()-1][s.getRow(0).getLastCellNum()];
		for(int i=1;i<s.getPhysicalNumberOfRows();i++)
		{
			for(int j=0;j<s.getRow(i).getLastCellNum();j++)
			{
				arr[i-1][j]= s.getRow(i).getCell(j).toString();
			
			}
		}
		return arr;
}		
		 
}


