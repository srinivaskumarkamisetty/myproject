package com.tutorials.qa.utilities;
import java.util.Date;

import org.testng.annotations.Test;

public class Utilities {
	@Test
	public static String emailDatestamp() {
		Date date = new Date();
		String Timestamp = date.toString().replace(" ", "_").replace(":", "_");
		//System.out.println(Timestamp);
		return "srinu"+Timestamp+"@gmail.com";
	}
}
