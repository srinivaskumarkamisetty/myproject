package com.opencart.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	public static WebDriver driver;

	public static WebDriver launchbrowser(String browsername, String drivername, String browserpath) {
		System.setProperty(drivername, browserpath);

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}
		return driver;
	}// End of launchbrowser method

	public static void openUrl(String url) {
		driver.get(url);
	}//End of openurl Method
	
	public static void closeBrowser() {
		driver.close();
	}
}
