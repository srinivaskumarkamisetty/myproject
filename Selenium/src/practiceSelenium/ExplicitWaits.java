package practiceSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	

		By searchBoxL = By.xpath("//*[@name='q']");
		WebElement searchbox = driver.findElement(searchBoxL);
		wait.until(ExpectedConditions.visibilityOf(searchbox));
		searchbox.sendKeys("vasu");

		
	}
}
