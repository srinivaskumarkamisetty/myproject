package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover extends Dropdown {
	static Actions actions;

	public WebElement mouseOverOnElement(String locator) {
		By element_L = By.xpath("//*[text()='" + locator + "']");
		WebElement element = driver.findElement(element_L);
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		return element;

	}

	public static void main(String[] args) {
		Mouseover mo = new Mouseover();
		mo.OpenBrowser();
		mo.openUrl("https://www.amazon.in/");
		driver.manage().window().maximize();
		mo.mouseOverOnElement("Account & Lists");
		mo.mouseOverOnElement("Discover Your Style");
		WebElement bluetooth = mo.mouseOverOnElement("Your Orders");
		actions.click(bluetooth).build().perform();

	}
}
