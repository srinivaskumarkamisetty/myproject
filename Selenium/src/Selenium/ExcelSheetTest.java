package Selenium;

import java.util.List;

public class ExcelSheetTest {

	public static void main(String[] args) throws Exception {
		String cellvalue = Excelsheet.getdata("info", 4, 1);
		System.out.println(cellvalue);

		List<String> info = Excelsheet.getdata("info", 1);
		System.out.println(info);

		String[][] info1 = Excelsheet.getdata("info");
		System.out.println("Data");
		for (int i = 0; i < info1.length; i++) {
			for (int j = 0; j < info1[i].length; j++) {
				System.out.print(info1[i][j] + " ");
			}
			System.out.println();

		}
	}

}
