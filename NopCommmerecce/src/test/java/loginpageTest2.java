

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopcommerce.pages.dashboard;
import com.nopcommerce.pages.loginpage;
import com.nopcommerce.utils.Browser;
import com.nopcommerce.utils.ReadData;
import com.nopcommerce.utils.RetryAnalyzer;

public class loginpageTest2 {

	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public static void setup() throws IOException, InterruptedException {
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

	@Test(enabled = true,dataProvider="logincredentials",retryAnalyzer=RetryAnalyzer.class)
	public void VerifyLoginBtnFunctunalityWithValidData(String email,String password) throws IOException {

		loginpage login = new loginpage(driver);
		login.NopcommerceLogin(email, password);
		dashboard obj = new dashboard(driver);
		boolean status = obj.isDashboardLabelVisible();
		Assert.assertTrue(status, "Test script fail as Dashboard not visible");

	} // End of Method

	@DataProvider(name = "logincredentials")
	public String[][] login() throws Exception {
		String info[][] = ReadData.getdata("login");
		return info;
	}
	
}
