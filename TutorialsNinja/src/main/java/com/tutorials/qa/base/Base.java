package com.tutorials.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	WebDriver driver;

	public WebDriver initilizeBrowserAndOpenUrl(String browsername) {

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
			
			
		}
		return driver;
	}
	public WebDriver enterUrl(String url) {
		driver.get(url);
		return driver;
	}
	
}