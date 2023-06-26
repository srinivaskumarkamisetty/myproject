package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.cacert.org/");
	}
}
