package stepdefinations;

import java.util.Date;

import org.junit.Test;

public class utilities {
@Test

public static String emailDatestamp() {
	Date date = new Date();
	String Timestamp = date.toString().replace(" ", "_").replace(":", "_");
	//System.out.println(Timestamp);
	return "srinu"+Timestamp+"@gmail.com";
}
}
