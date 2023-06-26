package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserAuthenticatinAlert extends VerifyTitle{

	public void GetElement() {
		By BasicAuthL=By.xpath("//*[text()='Basic Auth']");
		WebElement BacicAuth=driver.findElement(BasicAuthL);
		BacicAuth.click();
	}
}
