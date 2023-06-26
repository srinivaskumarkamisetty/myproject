package Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Selenium.AmazonDropdown;

public class AmazonDropdownTest {
	public static void main(String[] args) {

		AmazonDropdown obj = new AmazonDropdown();
		obj.OpenBrowser();
		obj.OpenUrl("https://www.amazon.in/");
		WebElement Dropdown = obj.GetElement();
		List<String> option = obj.SelectOption(Dropdown);
		boolean status = obj.SelectParicularElement(option, "Deals");
		Assert.assertEquals(status, "test scrip fail as element not found");
	}
}