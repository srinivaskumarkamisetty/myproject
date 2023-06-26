package com.nopcommerec.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	public static WebDriver driver;
	
	public static WebDriver  launchbrowser(String browsername, String drivername,String driverpath) {
		System.setProperty(drivername, driverpath);
		
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
		return driver;
	}
	
	public static void openurl(String url) {
		driver.navigate().to(url);
	}
	
	public static void closebrowser() {
		driver.close();
	}

}
