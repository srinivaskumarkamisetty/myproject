package Test;

import Selenium.VerifyTitle;

public class VerifyTitleTest {
	public static void main(String[] args) throws InterruptedException {
		
	
	VerifyTitle obj=new VerifyTitle();
	obj.OpenBrowser();
	obj.OpenUrl("https://www.google.co.in/");
	String ActualTitle=obj.GetCurrentTitle();
	System.out.println(ActualTitle);
	boolean status=obj.CompareTitle("Google", ActualTitle);
	obj.Getstatus(status);
	Thread.sleep(3000);
	obj.closebrowser();
	
}
}