package bussiness;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import model.Excel;

public interface ExcelService {
	
	public List<Excel> readExcel(String excelFilePath) throws IOException;
	
	public Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException;
	
	
}
