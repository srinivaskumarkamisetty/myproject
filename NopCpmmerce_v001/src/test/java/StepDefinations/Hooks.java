package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
public static WebDriver driver;

@Before
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
}
@After
public void closeBrowser() {
	driver.close();
}
}
