package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelTestCase {
	static String path="./data/testdoc.xlsx";
	static String sheetName="TestData";
	static Workbook w;
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
	
		excelData(path,sheetName,"Result","TC3");
		
	}
		public static void excelData(String path,String sheetName,String column,String cValue) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
		{
			w=WorkbookFactory.create(new FileInputStream(path));
			Sheet sheet=w.getSheet("TestData");
			int row=sheet.getPhysicalNumberOfRows();
			int rowIndex=0;
			int colIndex=0;
			Row rows;
			int i,j,k;
			for(i=0,k=0;i<row;i++)
			{
				String value=getExcelData(path, sheetName, i, k);
				if(value.equals(cValue))
				{		
					rowIndex=i;
					// System.out.println("row index "+i);
				}
			}
			for(i=0;i<row;i++)
			{
				rows=sheet.getRow(i);
			
				for( j=1;j<rows.getLastCellNum();j++)
				{
					String resul=getExcelData(path,sheetName,i,j);
					if(resul.equals(column))
					{
						colIndex=j;
						//System.out.println("col index "+j);
						System.out.println(getExcelData(path,sheetName,rowIndex,colIndex));
						
					}
				}
			}
		}
	
		
	
	
	
	
	public static String getExcelData(String path,String book, int r,int c) 
		{
		  System.out.println();
			String p="";
			try
			{
				
				p=w.getSheet(book).getRow(r).getCell(c).toString();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return p;
		}
		
	
}
