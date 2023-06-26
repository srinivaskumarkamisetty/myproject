package practiceSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts extends Dropdown {


	public void ClickElement(String locator) {
		By Button_L = By.xpath("//*[normalize-space()='"+locator+"']");
		WebElement button = driver.findElement(Button_L);
		button.click();
	}

	public void VerifyAlert() {
		this.ClickElement("Alert with OK & Cancel");
		this.ClickElement("click the button to display a confirm box");

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public void setText() {
		this.ClickElement("Alert with Textbox");
		this.ClickElement("click the button to demonstrate the prompt box");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("vasu");
		alert.accept();
	}
	public static void main(String[] args) {
		Alerts alert=new Alerts();
		alert.OpenBrowser();
		alert.openUrl("https://demo.automationtesting.in/Alerts.html");
		alert.setText();
	}
}
//*[@normalize-space(text()='Alert with OK & Cancel ')]
//a[normalize-space()='click the button to display a confirm box ']