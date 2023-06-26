package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Title {
	public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	 driver = new ChromeDriver(options);
	 
	 driver.get("https://www.amazon.in/ref=nav_logo");
	 String ActualTitle=driver.getTitle();
	 String ExpectedTitle="Amazon";
	 
	 
	
}
}
