package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover extends VerifyTitle {
	
	public void MouseoverOnAccounts(String Locator) {
		By AccountsL=By.xpath("//*[text()='"+Locator+"']");
		WebElement Accounts=driver.findElement(AccountsL);
		Actions action=new Actions(driver);
		action.moveToElement(Accounts).build().perform();
		
	}
	
	public WebElement GetLocator(String locatorvalue) {
		By ElementL=By.xpath("//*[text()='"+locatorvalue+"']");
		WebElement Element=driver.findElement(ElementL);
		return Element;
		
	}
	public boolean IsElementDisplayed(WebElement Element){
		return Element.isDisplayed();
		
	}
	public void Click(WebElement Element) {
		Element.click();
	}
	public String GetText() {
		By DiscoverstyleL=By.xpath("//*[text()='Discover Your Product Style']");
		WebElement Discoverstyle=driver.findElement(DiscoverstyleL);
		return Discoverstyle.getText();
	}


}
