package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown extends VerifyTitle{
	Select select;

	public WebElement GetElement() {
		
		By DropdownL=By.xpath("//*[@id='searchDropdownBox']");
		WebElement Dropdown=driver.findElement(DropdownL);
		return Dropdown;
	}
	
	public List<String> SelectOption(WebElement Dropdown) {
		 select=new Select(Dropdown);
		 List<WebElement> options=select.getOptions();
		 List<String> option=new ArrayList<String>();
		 for (WebElement AllOptions : options) {
			System.out.println(AllOptions.getText());
			option.add(AllOptions.getText());
			
		}
		return option;
	}
	public boolean SelectParicularElement(List<String> option,String value) {
		if(option.contains(value)) {
			return true;
		}else {
			return false;
		}
		
	}
}
