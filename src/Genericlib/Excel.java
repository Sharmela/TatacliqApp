package Genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Constatnt
{
	public static String ExcelData(String path,String Sheet,int row,int cell)
	{
		String s="";
		try
		{
		FileInputStream file = new FileInputStream(epath);
		Workbook wb = WorkbookFactory.create(file);
		s = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log("fail");
		}
		return s;
	}
}
