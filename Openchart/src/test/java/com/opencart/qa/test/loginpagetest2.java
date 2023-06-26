package com.opencart.qa.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencart.qa.pages.dashboard;
import com.opencart.qa.pages.loginpage;
import com.opencart.qa.utilities.Browser;
import com.opencart.qa.utilities.ReadData;
import com.opencart.qa.utilities.RetryAnalyzer;

public class loginpagetest2 {
public WebDriver driver;

@BeforeMethod
public void setup() throws IOException {
	List<String> browser=ReadData.GetCellValue("browser", 1);
	String browsername=browser.get(0);
	String drivername=browser.get(1);
	String driverpath=browser.get(2);
	String url=browser.get(3);
	
	driver=Browser.launchbrowser(browsername, drivername, driverpath);
	Browser.openUrl(url);
}
@AfterMethod
public void tearDown() {
	Browser.closeBrowser();
}
@Test(dataProvider="login credentials",enabled=true,retryAnalyzer= RetryAnalyzer.class)
public void verifyLoginBtnWithValidDataAndInvalidData(String email, String password) throws IOException {
	
	loginpage login=new loginpage(driver);
	login.openCartLogin(email, password);
	dashboard obj=new dashboard(driver);
	boolean label=obj.verifyDashboardLabelDisplay();
	Assert.assertTrue(label, "testscript fail as dashboardlabel not dispalyed");
}

	@DataProvider(name="login credentials")
	public String[][] login() throws Exception {
	String info[][]=ReadData.getdata("login");
	return info;
	}
}  

