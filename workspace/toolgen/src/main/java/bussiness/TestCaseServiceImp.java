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
import model.InputValue;
import model.OutputValue;
import model.TestCase;
import untils.BaseConstant;

public class TestCaseServiceImp extends ExcelServiceImp implements BaseConstant, TestCaseService {


	public List<TestCase> getTestCase() throws IOException {
		// get excel
		List<Excel> excels = readExcel(INPUT_TESTCASE);
		for(Excel excel: excels) {
			TestCase TestCase = (model.TestCase) excel;
			System.out.println(TestCase.toString());
		}
		return null;
	}

	public List<Excel> readExcel(String excelFilePath) throws IOException {
		// list excels
		List<Excel> excels = new ArrayList<Excel>();

		// Get file
		InputStream inputStream = new FileInputStream(new File(excelFilePath));

		// Get workbook
		Workbook workbook = getWorkbook(inputStream, excelFilePath);

		// Get sheet
		Sheet sheet = workbook.getSheetAt(0);

		// Get all rows
		Iterator<Row> iterator = sheet.iterator();

		// Create Test case
		TestCase testCase = new TestCase();

		// Create list input values and output values
		List<InputValue> inputValues = new ArrayList<InputValue>();
		List<OutputValue> outputValues = new ArrayList<OutputValue>();

		boolean isInput = true;
		boolean isOutput = false;

		// Check is created test case
		boolean isCreatedTestcase = false;

		while (iterator.hasNext()) {
			Row nextRow = iterator.next();

			// Get all cells
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			// init inputValue and outputValue
			InputValue inputValue = new InputValue();
			OutputValue outputValue = new OutputValue();

			while (cellIterator.hasNext()) {
				// Read cell
				Cell cell = cellIterator.next();

				// get cell value
				Object cellValue = getCellValue(cell);

				if (cellValue == null || cellValue.toString().isEmpty()) {
					continue;
				}
	
				// Set id test case
				if (cell.getColumnIndex() == COLUMN_INDEX_ID && !cellValue.toString().isEmpty() && !isCreatedTestcase) {
					testCase.setId(cellValue.toString());
					isCreatedTestcase = true;

					// insert testCase into list results
				} else if (cell.getColumnIndex() == COLUMN_INDEX_ID && !cellValue.toString().isEmpty() && isCreatedTestcase) {
					testCase.setInputValues(inputValues);
					testCase.setOutputValues(outputValues);

					excels.add(testCase);

					testCase = new TestCase();
					testCase.setId(cellValue.toString());
					inputValues = new ArrayList<InputValue>();
					outputValues = new ArrayList<OutputValue>();
					isCreatedTestcase = false;
					isInput = true;
					isOutput = false;
				}

				// set name input
				if (cell.getColumnIndex() == COLUMN_INDEX_NAME && !cellValue.toString().isEmpty()) {
					testCase.setName(cellValue.toString());
				}

				// change value input
				if (cell.getColumnIndex() == COLUMN_INDEX_INPUT_OR_OUTPUT && !cellValue.toString().isEmpty() && cellValue.toString().equals("O")) {
					isInput = false;
					isOutput = true;
				}

				// insert input or output
				// Current is insert input
				if (cell.getColumnIndex() == COLUMN_INDEX_VALUE_INPUT_OR_OUTPUT && !cellValue.toString().isEmpty() && isInput) {
					inputValue.setValue(cellValue.toString());

					// Current is insert output
				} else if (cell.getColumnIndex() == COLUMN_INDEX_VALUE_INPUT_OR_OUTPUT && !cellValue.toString().isEmpty() && isOutput) {
					outputValue.setValue(cellValue.toString());
				}

				// insert type
				// Current is insert input
				if (cell.getColumnIndex() == COLUMN_INDEX_TYPE_VALUE && !cellValue.toString().isEmpty() && isInput) {
					inputValue.setDataType(cellValue.toString());

					// Current is insert output
				} else if (cell.getColumnIndex() == COLUMN_INDEX_TYPE_VALUE && !cellValue.toString().isEmpty() && isOutput) {
					outputValue.setDataType(cellValue.toString());
				}
				
				// insert method type
				if (cell.getColumnIndex() == COLUMN_INDEX_METHOD_TYPE && !cellValue.toString().isEmpty()) {
					testCase.setMethodType(cellValue.toString());
				}  
				
				// insert input value
				if(inputValue.getValue() != null &&inputValue.getValue().length() > 0) {
					inputValues.add(inputValue);
				}
				
				// insert output value
				if(outputValue.getValue() != null && outputValue.getValue().length() > 0) {
					outputValues.add(outputValue);
				}
			}
		}
		
		// insert last data
		testCase.setInputValues(inputValues);
		testCase.setOutputValues(outputValues);
		excels.add(testCase);

		return excels;
	}

}
