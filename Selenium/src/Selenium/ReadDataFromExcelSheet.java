package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws IOException {

		String filepath = "D:\\SeleniumPractice\\ReadData\\info.xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int coloumcount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <= coloumcount; j++) {
				String value = row.getCell(j).toString();
				System.out.print(value);
			}
			System.out.println();
		}

	}

}
