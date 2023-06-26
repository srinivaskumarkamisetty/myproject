package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {

	public static String getdata(String filename, int row, int col) throws Exception {
		String filepath = ".//resources//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook Workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		return sheet.getRow(row).getCell(col).getStringCellValue();

	}

	public static List<String> getdata(String filename, int row) throws Exception {
		String filepath = ".//resources//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int cellcount = sheet.getRow(row).getLastCellNum();
		List<String> rowdata = new ArrayList<String>();
		for (int i = 0; i < cellcount; i++) {
			String data = sheet.getRow(row).getCell(i).getStringCellValue();
			rowdata.add(data);
		}

		return rowdata;
	}

	public static String[][] getdata(String filename) throws Exception {
		String filepath = ".//resources//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();

		String info[][] = new String[row][cellcount];
		int k = 0, l = 0;
		for (int i = 1; i < row; i++) {
			l = 0;

			for (int j = 0; j < cellcount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				info[k][l] = data;
				l++;
			}
			k++;
		}
		return info;
	}

	public static String getLocators(String filename, String key) throws Exception {
		String filepath = ".//resources//" + filename + ".properties";
		FileInputStream instream = new FileInputStream(filepath);
		Properties pro = new Properties();
		pro.load(instream);
		return pro.getProperty(key);

	}
}
