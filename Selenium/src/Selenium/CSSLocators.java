package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSLocators {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		By.cssSelector("#searchDropdownBox");

		/*
		 * By Tag and ID WebElement
		 * searchbox=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		 * searchbox.click();
		 */

		/*
		 * By Id WebElement
		 * searchbox=driver.findElement(By.cssSelector("#searchDropdownBox"));
		 * searchbox.click();
		 */

		/*
		 * By class WebElement
		 * searchbox=driver.findElement(By.cssSelector(".nav-search-dropdown"));
		 * searchbox.click();
		 */

		/*
		 * By Tag & class WebElement
		 * searchbox=driver.findElement(By.cssSelector("select.nav-search-dropdown"));
		 * searchbox.click();
		 */

		/*
		 * By Tag & Attribute WebElement
		 * searchbox=driver.findElement(By.cssSelector("select[name='url']"));
		 * searchbox.click();
		 */

		/*
		 * By Attribute WebElement
		 * searchbox=driver.findElement(By.cssSelector("[name='url']"));
		 * searchbox.click();
		 */

		// By Tag, Class & Attribute
		WebElement searchbox = driver.findElement(By.cssSelector("select.nav-search-dropdown[name='url']"));
		searchbox.click();

	}
}
