package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.w3schools.com/");
	By ExerciseL=By.xpath("/html/body/div[3]/a[4]");
	WebElement Exercise=driver.findElement(ExerciseL);
	Exercise.click();
}
}
