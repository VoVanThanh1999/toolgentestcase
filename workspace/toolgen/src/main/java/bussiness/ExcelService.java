package bussiness;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;

public interface ExcelService {
	
	Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException;
	
	public Object getCellValue(Cell cell);
	
}
