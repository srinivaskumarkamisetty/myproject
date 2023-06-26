package Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Selenium.Dropdown1;

public class Dropdown1Test {
	public static void main(String[] args) throws InterruptedException {
		
	
	Dropdown1 obj=new Dropdown1();
	obj.OpenBrowser();
	obj.OpenUrl("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement dropdown=obj.GetElement();
	Thread.sleep(3000);
	List<String> Alloptionsvalue= obj.GetAllOptions(dropdown);
	Thread.sleep(3000);
	obj.SelectElements(dropdown);
	Thread.sleep(3000);
	boolean status=obj.GetParticularOptionExistsorNot(Alloptionsvalue, "Baby");
	Thread.sleep(3000);
	Assert.assertTrue(status,"Test script fail as no Element exists");
	

	
	
}
}