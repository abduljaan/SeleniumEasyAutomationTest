package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	private static XSSFSheet worksheet;

	private static XSSFWorkbook workbook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	public static String path;

	
	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(String path,int sheetNumber,int row, int col) throws Exception {

		try {
			
			
			FileInputStream file = new FileInputStream(path);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet worksheet = workbook.getSheetAt(sheetNumber);
			Cell = worksheet.getRow(row).getCell(col);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}
	
	


	public static void writeXLSXFile(String path,int sheetNumber,int row, int col, String value) throws IOException {
		try {
			//FileInputStream file = new FileInputStream("C:\\Users\\mrahman1\\Documents\\XMLParsingJava\\PageObject\\Books.xlsx");
			
			
			
			FileInputStream file = new FileInputStream(path);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
			Cell cell = null;

			// Retrieve the row and check for null
			XSSFRow sheetrow = sheet.getRow(row);
			if (sheetrow == null) {
				sheetrow = sheet.createRow(row);
			}
			// Update the value of cell
			cell = sheetrow.getCell(col);
			if (cell == null) {
				cell = sheetrow.createCell(col);
			}
			cell.setCellValue(value);

			file.close();

			//FileOutputStream outFile = new FileOutputStream(new File("C:\\Users\\mrahman1\\Documents\\XMLParsingJava\\PageObject\\Books.xlsx"));
			FileOutputStream outFile = new FileOutputStream(new File(path));
			//FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			workbook.write(outFile);
			outFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public static String getExcelCellData(int sheetNumber,int row, int col) throws Exception {

		try {
			
			
			FileInputStream file = new FileInputStream(FilePath.ExcelPath);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet worksheet = workbook.getSheetAt(sheetNumber);
			Cell = worksheet.getRow(row).getCell(col);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}
	
	
	
	public static void writeToXLSXFile(int sheetNumber,int row, int col, String value) throws IOException {
		try {
			
			
			
			
			FileInputStream file = new FileInputStream(FilePath.ExcelPath);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
			Cell cell = null;

			// Retrieve the row and check for null
			XSSFRow sheetrow = sheet.getRow(row);
			if (sheetrow == null) {
				sheetrow = sheet.createRow(row);
			}
			// Update the value of cell
			cell = sheetrow.getCell(col);
			if (cell == null) {
				cell = sheetrow.createCell(col);
			}
			cell.setCellValue(value);

			file.close();
			
			FileOutputStream outFile = new FileOutputStream(new File(FilePath.ExcelPath));
			
			workbook.write(outFile);
			outFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
