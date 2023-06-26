package Selenium;

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

	public static String[][] GetCellValue(String filename) throws IOException {
		List<String> rowdata = new ArrayList();
		String filepath = "D:\\SeleniumPractice\\selenium\\ReadData\\" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook book = new XSSFWorkbook(instream);
		XSSFSheet sheet = book.getSheet("sheet1");
		int LastRow = sheet.getLastRowNum();
		int cellscount = sheet.getRow(0).getLastCellNum();

		String data[][] = new String[LastRow][cellscount];
		int k = 0, l;
		for (int i = 1; i < LastRow; i++) {

			l = 0;
			for (int j = 1; j <= cellscount; j++) {
				String data1 = sheet.getRow(i).getCell(j).getStringCellValue();
				data[k][l] = data1;
				l++;
			}
			k++;
		}
		return data;
	}
    public static Object getlocator(String filename, String key) throws IOException {
    	String filepath = ".//locators//" + filename + "properties";
    	FileInputStream instream = new FileInputStream(filepath);
    	Properties pro=new Properties();
    	pro.load(instream);
    	return pro.get(key);
	
    	
    }
	public static void main(String[] args) throws IOException {
		String data = ReadData.GetCellValue("info", 1, 0);
		System.out.println(data);
		List<String> data1 = ReadData.GetCellValue("info", 2);
		System.out.println(data1);
		String data2[][] = ReadData.GetCellValue("info");
		for (int i = 0; i < data2.length; i++) {

			for (int j = 0; j > data2[i].length; j++) {
             System.out.print(data2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
