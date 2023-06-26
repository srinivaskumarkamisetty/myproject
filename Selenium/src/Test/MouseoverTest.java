package Test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Selenium.Mouseover;  

public class MouseoverTest {
public static void main(String[] args) {
	Mouseover obj=new Mouseover();
	obj.OpenBrowser();
	obj.OpenUrl("https://www.amazon.in/");
	obj.MouseoverOnAccounts("Account & Lists");
	WebElement Element=obj.GetLocator("Discover Your Style");
	Assert.assertTrue(obj.IsElementDisplayed(Element));
	obj.Click(Element);
	Assert.assertEquals(obj.GetText(), "Discover Your Product Style");
	obj.closebrowser();
	
   
	
	
	
	//obj.Mouseover("Account & Lists");
	//obj.ClickOnElement("Baby Wishlist");

}
}