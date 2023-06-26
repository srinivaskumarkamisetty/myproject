package practiceSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClick extends Dropdown {

	public void clickonElemet() throws Exception {
		By Mobiles_L = By.xpath("//*[text()='Mobiles']");
		WebElement Mobiles = driver.findElement(Mobiles_L);

		Actions action = new Actions(driver);
		action.contextClick(Mobiles).perform();

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {
		RightClick rc = new RightClick();
		rc.OpenBrowser();
		rc.openUrl("https://www.amazon.in/ref=nav_logo");
		try {
			rc.clickonElemet();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
