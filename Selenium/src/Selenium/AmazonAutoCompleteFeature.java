package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonAutoCompleteFeature extends VerifyTitle {

	public void SetTextInAmazonSearchBox(String data) {
		By SearchBoxL = By.xpath("//*[@type='text']");
		WebElement SearchBox = driver.findElement(SearchBoxL);
		SearchBox.sendKeys(data);

	}

	public void GetElements() {
		System.out.println("hello");
		By SuggestedListL = By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']//div[contains(@aria-label,'smart')]");
		List<WebElement> SuggestedList = driver.findElements(SuggestedListL);
		//WebElement SuggestedList = driver.findElement(SuggestedListL);
		System.out.println(SuggestedList.size());
		/*
		 * for(int i=0;i<=SuggestedList.size()-1;i++) {
		 * 
		 * System.out.println(SuggestedList.get(i).getText());
		 * 
		 * }
		 */

	}
}
