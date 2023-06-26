package com.opencart.qa.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencart.qa.pages.Registration;
import com.opencart.qa.pages.dashboard;
import com.opencart.qa.utilities.Browser;
import com.opencart.qa.utilities.ReadData;

public class Registrationtest {
public WebDriver driver;
@BeforeClass
public void setup() throws IOException {
	List<String> browser=ReadData.GetCellValue("Registrationlogin", 1);
	String browsername = browser.get(0);
	String drivername = browser.get(1);
	String driverpath = browser.get(2);
	String url = browser.get(3);

	driver=Browser.launchbrowser(browsername, drivername, driverpath);
	Browser.openUrl(url);

}
@AfterClass
public void teardown() {
	Browser.closeBrowser();
}
@Test
public void RegisterWithValidData() throws IOException {
	List<String> registerdata=ReadData.GetCellValue("registration", 1);
	String firstname=registerdata.get(0);
	String lastname=registerdata.get(1);
	String email=registerdata.get(2);
	String mobilenumber=registerdata.get(3);
	String password=registerdata.get(4);
	String confirmpassword=registerdata.get(5);
	
	Registration obj=new Registration(driver);
	obj.register(firstname, lastname, email, mobilenumber, password, confirmpassword);
	
	dashboard obj1=new dashboard(driver);
	boolean status=obj1.verifyDashboardLabelDisplay();
	Assert.assertTrue(status);
	
}
}

