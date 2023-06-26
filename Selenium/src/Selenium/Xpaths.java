package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpaths {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		// All Rows And Colomns
		By RowL = By.xpath("//*[@style='box-sizing: inherit;']");
		WebElement row = driver.findElement(RowL);
		System.out.println(row.getText());

		// Using Ancestor
		By RowsAndColomnsL = By.xpath("//*[text()='Francisco Chang']/ancestor::tr");
		WebElement RowsAndColomns = driver.findElement(RowsAndColomnsL);
		System.out.println("Using Ancestor:" + RowsAndColomns.getText());

		// Using Descendent
		By DescendentXpath = By.xpath("//*[text()='Island Trading']/ancestor::tr/descendant::td");
		List<WebElement> DescendentXpathL = driver.findElements(DescendentXpath);
		// System.out.println("Using DescendentXpathL: "+DescendentXpathL.getText());

		for (WebElement Element : DescendentXpathL) {
			String data = Element.getText();
			System.out.println("Printing using DescendentXpath:     " + data);
		}

		
		System.out.println("------------------------------");
		//Using following
		By FollowingXpath = By.xpath("//tbody[@style='box-sizing: inherit;']//following::*");
		List<WebElement> FollowingXpathL = driver.findElements(FollowingXpath);
		 System.out.println("Using FollowingXpathL: "+FollowingXpathL.size());

		 
		 System.out.println("-----------------------------");
		//Using following
			By FollowingsiblingXpath = By.xpath("//tr[@style='box-sizing: inherit;']/following-sibling::*");
			List<WebElement> FollowingsiblingXpathL = driver.findElements(FollowingsiblingXpath);
			 System.out.println("Using FollowingsiblingXpathL: "+FollowingsiblingXpathL.size());
		
	}
}
////*[@class='s-suggestion-container']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']
