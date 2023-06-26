package Test;

import Selenium.BrowserAuthenticatinAlert;

public class BrowserAuthenticatinAlertTest {
public static void main(String[] args) {
	BrowserAuthenticatinAlert alert=new BrowserAuthenticatinAlert();
	alert.OpenBrowser();
	alert.OpenUrl("https://admin:admin@the-internet.herokuapp.com/");
	alert.GetElement();
	//alert.driver.switchTo().alert();
	
}
}
