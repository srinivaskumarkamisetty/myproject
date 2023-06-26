package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AutocompleteFeature extends VerifyTitle {
	WebElement GoogleSearchBox;
	public void SetTextInGoogleSearchBox(String Text) {
		
		//Writing Relative xpath
		By GoogleSearchBoxL=By.xpath("//*[@name='q']");
		 GoogleSearchBox=driver.findElement(GoogleSearchBoxL);
		GoogleSearchBox.sendKeys(Text);
	}
	public void SelectOptionFromSuggestedList(int position) throws InterruptedException {
		Thread.sleep(3000);
		for(int i=1;i<=position;i++) {
			GoogleSearchBox.sendKeys(Keys.ARROW_DOWN);
			
		}
		GoogleSearchBox.sendKeys(Keys.ENTER);
	}

}
