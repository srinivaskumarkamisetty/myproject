package com.opencart.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String GetCellValue(String filename, int row, int col) throws IOException {

		String filepath = ".//data//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook book = new XSSFWorkbook(instream);
		XSSFSheet sheet = book.getSheet("sheet1");
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;

	}

	public static List<String> GetCellValue(String filename, int row) throws IOException {
		List<String> rowdata = new ArrayList();
		String filepath = ".//data//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook book = new XSSFWorkbook(instream);
		XSSFSheet sheet = book.getSheet("sheet1");
		int cellscount = sheet.getRow(row).getLastCellNum();
		for (int i = 0; i < cellscount; i++) {
			String data = sheet.getRow(row).getCell(i).getStringCellValue();
			rowdata.add(data);
		}
		return rowdata;
	}

	public static String[][] getdata(String filename) throws Exception {
		String filepath = ".//data//" + filename + ".xlsx";

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

	public static String getlocator(String filename, String key) throws IOException {
		String filepath = ".//locators//" + filename + ".properties";
		FileInputStream instream = new FileInputStream(filepath);
		Properties pro = new Properties();
		pro.load(instream);
 
		return (String) pro.get(key);
	}
}