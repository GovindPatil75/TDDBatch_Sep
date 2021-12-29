package Com.Uitlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException {
		String pathExcel="C:\\Users\\Dell\\eclipse-workspace\\TDD_BatchSEP\\TestData\\Data.xlsx";
		
		File src=new File(pathExcel);
		FileInputStream file=new FileInputStream(src);
		wb=new XSSFWorkbook(file);	
	}
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public double getNumericData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	}
}
