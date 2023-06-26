package practiceSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javascriptExecutor {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		
		/* JavascriptExecutor Using Id
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = (WebElement) js.executeScript("return document.getElementById('input-email')");
		element.clear();
		Thread.sleep(5000);
		element.sendKeys("vasu");
		
		
		WebElement elements = (WebElement) js.executeScript("return document.querySelector('#input-password')");
		elements.clear();
		Thread.sleep(5000);
		elements.sendKeys("7674");

	
		//WebElement elementss = (WebElement) js.executeScript("return document.evaluate(\"//*[@type='submit']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;​");
		//elementss.click();*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(" document.getElementById('input-email').style.border='10px red solid");
	    Thread.sleep(3000);
	    js.executeScript(" document.getElementById('input-email').style.background='10px yellow solid");
		

	}
}
    