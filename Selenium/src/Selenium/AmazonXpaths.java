package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonXpaths {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in/");

		By SearchBoxL = By.xpath("//*[@placeholder='Search Amazon.in']");
		WebElement SearchBox = driver.findElement(SearchBoxL);
		SearchBox.sendKeys("smart");

		By SuggestListL = By.xpath(
				"//*[@class='s-suggestion-container']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']");
		List<WebElement> SuggestList = driver.findElements(SuggestListL);
		for (WebElement Element : SuggestList) {
			String data=Element.getText();
			System.out.println(data);
		}
	}
}
////*[@class='s-suggestion-container']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']