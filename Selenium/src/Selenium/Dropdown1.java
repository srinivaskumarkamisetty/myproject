package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 extends VerifyTitle {
	Select select;

	public WebElement GetElement() {
		By DropdownL = By.xpath("//*[@title='Search in']");
		WebElement Dropdown = driver.findElement(DropdownL);
		return Dropdown;
	}

	public List<String> GetAllOptions(WebElement Dropdown) {
		select = new Select(Dropdown);

		List<WebElement> options = select.getOptions();
		List<String> Alloptionsvalue = new ArrayList<String>();
		for (WebElement Alloptions : options) {
			System.out.println(Alloptions.getText());
            Alloptionsvalue.add(Alloptions.getText());
		}
		return Alloptionsvalue;

	}
	public boolean GetParticularOptionExistsorNot(List<String> alloptionsvalue,String value) {
		if(alloptionsvalue.contains(value)) {
			System.out.println("Element found");
			return true;
		}else
		return false;
	}

	public void SelectElements(WebElement Dropdown) throws InterruptedException {
		select.selectByIndex(5);
		Thread.sleep(3000);
		select.selectByVisibleText("Beauty");

	}
	////body//div//div//div//div//div//div//form
}
