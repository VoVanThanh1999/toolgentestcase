package bussiness;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.Excel;
import model.TestCase;
import untils.BaseConstant;

public class TestCaseServiceImp implements BaseConstant, TestCaseService, ExcelService {

	public static final int COLUMN_INDEX_ID = 0;
	public static final int COLUMN_INDEX_NAME = 1;
	public static final int COLUMN_INDEX_INPUT_OR_OUTPUT = 2;
	public static final int COLUMN_INDEX_VALUE_INPUT_OR_OUTPUT = 3;

	public List<TestCase> getTestCase() throws IOException {
		// get excel
		List<Excel> excels = readExcel(INPUT_TESTCASE);
		
		return null;
	}

	public void createTestCase() {

	}

	@Override
	public List<Excel> readExcel(String excelFilePath) throws IOException {
		List<Excel> excels = new ArrayList();

		// Get file
		InputStream inputStream = new FileInputStream(new File(excelFilePath));

		// Get workbook
		Workbook workbook = getWorkbook(inputStream, excelFilePath);

		// Get sheet
		Sheet sheet = workbook.getSheetAt(0);

		// Get all rows
		Iterator<Row> iterator = sheet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("1");
			
		}
		
		return excels;
	}

	@Override
	public Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
		Workbook workbook = null;
		if (excelFilePath.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (excelFilePath.endsWith("xls")) {
			workbook = new HSSFWorkbook(inputStream);
		} else {
			throw new IllegalArgumentException("The specified file is not Excel file");
		}
		return workbook;
	}

}
