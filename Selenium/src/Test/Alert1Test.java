package Test;

import org.testng.Assert;

import Selenium.Alert1;

public class Alert1Test {
public static void main(String[] args) throws InterruptedException {
	Alert1 alert=new Alert1();
	alert.OpenBrowser();
	alert.OpenUrl("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(3000);
	alert.VerifyAlertWithTextBox("welcome");
	boolean status=alert.verifyMessageDisplyedOrNot("welcome");
	Assert.assertTrue(status,"Testscript fail as message not displayed in label");
}
}
