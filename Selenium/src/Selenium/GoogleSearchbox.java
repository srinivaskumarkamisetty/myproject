package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GoogleSearchbox {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get("https://www.google.co.in/");
		By SearchBoxL = By.xpath("//div[@class='YacQv']/following::textarea[@type='search']");
		WebElement SearchBox = driver.findElement(SearchBoxL);
		SearchBox.sendKeys("selenium");
		Thread.sleep(3000);

		/*
		 * for(int i=0;i<=3;i++) { SearchBox.sendKeys(Keys.ARROW_DOWN);
		 * Thread.sleep(2000); } SearchBox.sendKeys(Keys.ENTER);
		 */

		By SuggestedList = By.xpath("//*[contains(@class,'wM6W7d')]");
		List<WebElement> SuggestedListL = driver.findElements(SuggestedList);

		/*
		 * boolean status = true; for (WebElement Element : SuggestedListL) { String
		 * data = Element.getText(); System.out.println(data); if (!(data.isBlank() ||
		 * data.isEmpty())){ if (!data.contains("selenium")) { status = false; break; }
		 * } } Assert.assertTrue(status);
		 */

		for (int i = 0; i < SuggestedListL.size(); i++) {
			WebElement ele = SuggestedListL.get(i);
			// System.out.println(ele);
			String data = ele.getText();
			SearchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			if (data.equals("selenium testing")) {
				SearchBox.sendKeys(Keys.ENTER);
				break;
			}

		}
		SearchBoxL = By.xpath("//*[@class='gLFyf']");
		SearchBox = driver.findElement(SearchBoxL);
		String ActualTitle = SearchBox.getAttribute("value");
		System.out.println(ActualTitle);

		Assert.assertEquals(ActualTitle, "selenium testing");
	}
}