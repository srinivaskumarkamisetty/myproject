package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathwithAxes {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		By SearchboxL=By.xpath("//*[@type='text']");
		WebElement Searchbox=driver.findElement(SearchboxL);
		Searchbox.sendKeys("laptop");
		
		//By SuggestedListL=By.xpath("//*[@class='Y5N33s']");
		By SuggestedListL=By.xpath("*[@class='Y5N33s']/descendant::*");
		List<WebElement> SuggestedList=driver.findElements(SuggestedListL);
		System.out.println(SuggestedList.size());
		
		for (WebElement List : SuggestedList) {
			String text=List.getText();
			System.out.println(text);
			
		}
	}
}
