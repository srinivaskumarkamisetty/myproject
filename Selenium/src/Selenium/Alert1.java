package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert1 extends VerifyTitle {

	public void ClickonButton(String buttontype) {
		By ButtonL = By.xpath("//*[contains(text(),'" + buttontype + " ')]");
		WebElement Button = driver.findElement(ButtonL);
		Button.click();
		
	}
	public void VerifyAlertWithTextBox(String data) {
		this.ClickonButton("Alert with Textbox");
		this.ClickonButton("click the button to demonstrate the prompt box");
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
	}
	public boolean verifyMessageDisplyedOrNot(String ExpectedMessage) {
		By messageL=By.xpath("//*[@id='demo1']");
		WebElement Message=driver.findElement(messageL);
		String ActualMessage=Message.getText();
		if(ActualMessage.contains(ExpectedMessage)) {
			System.out.println("ok");
			return true;
		}
		else {
			return false;
		}
	}
}
