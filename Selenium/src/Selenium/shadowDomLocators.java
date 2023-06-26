package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class shadowDomLocators {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get("https://books-pwakit.appspot.com/");

		By book_appL = By.tagName("book-app");
		WebElement root = driver.findElement(book_appL);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowDom1=(WebElement) js.executeScript("return arguments[0].shadowRoot", root);
		
		By app_header=By.tagName("app-header");
		WebElement app_headerL=shadowDom1.findElement(app_header);
		
		By app_toolbar=By.cssSelector("app-toolbar.toolbar-bottom");
		WebElement app_toolbarL=app_headerL.findElement(app_toolbar);
		
		By book_input_decorator=By.tagName("book-input-decorator");
		WebElement book_input_decoratorL=app_toolbarL.findElement(book_input_decorator);
		
		By input=By.tagName("input");
		WebElement inputL=book_input_decoratorL.findElement(input);
		inputL.sendKeys("testing");

	}
}
