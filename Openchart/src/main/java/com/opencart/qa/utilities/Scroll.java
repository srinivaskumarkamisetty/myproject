package com.opencart.qa.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
public static WebDriver driver;

	public static WebElement ScrollUpTllUpToElemetVisible(WebElement ele) {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]. ScrollIntoView();", ele);// "arguments[0].scrollIntoView();"
		return ele;
	}
}
