package Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DatePicker extends VerifyTitle {

	public void scroll(WebElement ele) {

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollInToView(true)", ele);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public WebElement GetElement(String Locatorvalue) {
		By ElementL = By.xpath("//*[text()='" + Locatorvalue + "']");
		WebElement Element = driver.findElement(ElementL);
		return Element;
	}

	public void clickTextBox() {
		By TextL = By.cssSelector("input#datepicker");
		WebElement Text = driver.findElement(TextL);
		Text.click();
	}

	public void clickonElement(int n) throws InterruptedException {
		
		for (int i = 1; i <= n; i++) {
			WebElement NextL = this.GetElement("Next");
			NextL.click();
			Thread.sleep(3000);
		}

	}
	public void Getdata(String date) {
		By TableL=By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a");
		List<WebElement> Table=driver.findElements(TableL);
		
		for (WebElement Element : Table) {
			String data=Element.getText();
			
			if(data.equals(date)) {
				Element.click();
			}
		}
		
	}

	public static void main(String[] args) throws  IOException, InterruptedException{
		DatePicker obj = new DatePicker();
		obj.OpenBrowser();
		obj.OpenUrl("https://jqueryui.com/datepicker/");
		Screenshot.TakeScreenShot(obj.driver,"Img4");
		obj.driver.manage().window().maximize();
		WebElement Examples = obj.GetElement("Examples");
		obj.scroll(Examples);
		obj.driver.switchTo().frame(0);
		obj.clickTextBox();
		Screenshot.TakeScreenShot(obj.driver, "Img2");
		obj.clickonElement(5);
		obj.Getdata("7");
		Screenshot.TakeScreenShot(obj.driver,"Img3");
	}
}