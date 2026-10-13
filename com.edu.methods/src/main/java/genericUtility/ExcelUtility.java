package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws Exception, IOException 
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
			
	}
	
	public void writeDataToExcel(String sheetName, int rowIndex,int cellIndex, String value) throws IOException 
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet (sheetName);
		Row r = sh.getRow(rowIndex);
		Cell c = r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}
}
