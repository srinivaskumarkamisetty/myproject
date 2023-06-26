package com.opencart.qa.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.opencart.qa.pages.dashboard;
import com.opencart.qa.pages.loginpage;
import com.opencart.qa.utilities.Browser;
import com.opencart.qa.utilities.ReadData;

public class dashboardTest2 {
	public WebDriver driver;
 
	@BeforeClass
	public void setup() throws IOException {
		List<String> browser = ReadData.GetCellValue("browser", 1);
		String browsername = browser.get(0);
		String drivername = browser.get(1);
		String driverpath = browser.get(2);
		String url = browser.get(3);

		driver = Browser.launchbrowser(browsername, drivername, driverpath);
		Browser.openUrl(url);

	}

	@AfterClass
	public void teardown() {
		Browser.closeBrowser();
	}

	@Test
	public void verifyLoginBtnWithValidData() throws IOException {
		List<String> data = ReadData.GetCellValue("login", 1);
		String email = data.get(0);
		String password = data.get(1);
		loginpage login = new loginpage(driver);
		login.openCartLogin(email, password);
		dashboard obj = new dashboard(driver);
		boolean label = obj.verifyDashboardLabelDisplay();
		Assert.assertTrue(label, "testscript fail as dashboardlabel not dispalyed");
	}

	@Test(dependsOnMethods = "verifyLoginBtnWithValidData")
	public void VerifySeachBoxWithInValidText() throws IOException {
		String searchdata = ReadData.GetCellValue("dashboard", 1, 1);
		dashboard obj = new dashboard(driver);
		obj.setText(searchdata);
		boolean status = obj.verifyValidProduct();
		Assert.assertTrue(status, "TestScript fail as Invalid product msg displayed");
	}



}
