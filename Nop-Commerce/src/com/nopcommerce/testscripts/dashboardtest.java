package com.nopcommerce.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcommerce.pages.dashboard;
import com.nopcommerce.pages.loginpage;
import com.nopcommerce.utils.Browser;
import com.nopcommerce.utils.ReadData;
import com.nopcommerce.utils.RetryAnalyzer;

public class dashboardtest {
	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public static void setup() throws IOException, InterruptedException {
		List<String> browser = ReadData.GetCellValue("browser", 1);
		String browsername = browser.get(0);
		String drivername = browser.get(1);
		String driverpath = browser.get(2);
		String url = browser.get(3);

		driver = Browser.launchbrowser(browsername, drivername, driverpath);
		Browser.openurl(url);

	}

	@AfterClass
	public void teardown() {
		Browser.closebrowser();
	}

	@Test(priority=1,enabled = true,  retryAnalyzer = RetryAnalyzer.class)
	public void VerifyLoginBtnFunctunalityWithValidData() throws IOException {
		List<String> logindata = ReadData.GetCellValue("login", 1);
		String email = logindata.get(0);
		String password = logindata.get(1);

		loginpage login = new loginpage(driver);
		login.NopcommerceLogin(email, password);
		dashboard obj = new dashboard(driver);
		boolean status = obj.isDashboardLabelVisible();
		Assert.assertTrue(status, "Test script fail as Dashboard not visible");
	}

	@Test(priority=2,dependsOnMethods="VerifyLoginBtnFunctunalityWithValidData")
	public void verifysearchboxwithValidData() throws IOException {
		String data = ReadData.GetCellValue("dashboard", 1, 0);
		dashboard obj = new dashboard(driver);
		obj.setTextInSearchBox(data);
		List result = obj.verifySuggestedList(data.toLowerCase());
		boolean status = (boolean) result.get(0);
		Assert.assertTrue(status, "suggest list does not contain data");

		int size = (int) result.get(1);
		Assert.assertEquals(size, 1, "list contain duplicate values");
	}
}
