package testNgDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideBlue {

	@DataProvider
	public String[][]  excelData() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		String args[][];
		Workbook w=WorkbookFactory.create(new FileInputStream("./data/ringdata.xlsx"));
		Sheet s=w.getSheet("Sheet1");
		args=new String[4][2];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				args[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return args;
		
	}
	@Test(dataProvider="excelData")
	public void test(String actual,String expected)
	{
		Assert.assertNotEquals( actual,expected);

	}
	
	
	
	
}
