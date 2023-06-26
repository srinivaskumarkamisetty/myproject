package com.nopcommerce.testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcommerce.pages.dashboard;
import com.nopcommerce.pages.loginpage;
import com.nopcommerce.utils.Browser;
import com.nopcommerce.utils.ReadData;

public class loginpageTest {

	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public static void setup() throws IOException {
		List<String> browser = ReadData.GetCellValue("browser", 1);
		String browsername = browser.get(0);
		String drivername = browser.get(1);
		String driverpath = browser.get(2);
		String url = browser.get(3);

		driver = Browser.launchbrowser(browsername, drivername, driverpath);
		Browser.openurl(url);
	}

	@AfterMethod
	public void teardown() {
		Browser.closebrowser();
	}

	@Test(enabled = true)
	public void VerifyLoginBtnFunctunalityWithValidData() throws IOException {
		List<String> logindata = ReadData.GetCellValue("login", 1);
		String email = logindata.get(0);
		String password = logindata.get(1);

		loginpage login = new loginpage(driver);
		login.NopcommerceLogin(email, password);
		dashboard obj = new dashboard(driver);
		boolean status = obj.isDashboardLabelVisible();
		Assert.assertTrue(status, "Test script fail as Dashboard not visible");

	} // End of Method
	@Test(enabled = true)
	public void VerifyLoginBtnFunctunalityWithInValidData() throws IOException {
		List<String> login = ReadData.GetCellValue("login", 5);
		String email = login.get(0);
		String password = login.get(1);

		loginpage log = new loginpage(driver);
		log.NopcommerceLogin(email, password);
		boolean errormsg = log.VerifyErrormsg("Login was unsuccessful. Please correct the errors and try again.",
				"No customer account found");
       Assert.assertTrue(errormsg);
	}// End of method
}
