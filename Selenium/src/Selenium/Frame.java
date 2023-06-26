package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frame extends VerifyTitle{
	
	public void click() {
		By SingleFrameL=By.xpath("//*[text()='Single Iframe ']");
		WebElement SingleFrame=driver.findElement(SingleFrameL);
		SingleFrame.click();
	}
 
	
	public void SetTextINFrame(String data) {
		
		driver.switchTo().frame("singleframe");

        // Find the text field element inside the iframe
        WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
        textField.sendKeys(data);

	}
		
	
	
	}
	
	

