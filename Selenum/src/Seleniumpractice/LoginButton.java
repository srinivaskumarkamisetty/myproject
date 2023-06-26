package Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	}
}
