package com.tutorials.qa.testcases;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	static WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1,dataProvider="senddata")
	public void verifyloginButtonWithValidCredentials(String email, String pass) {

		By EmailL = By.xpath("//div[@class='form-group']/child::input[@name='email']");
		WebElement Email = driver.findElement(EmailL);
		Email.clear();
		Email.sendKeys(email);

		By passwordL = By.xpath("//div[@class='form-group']/child::input[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.clear();
		password.sendKeys(pass);

		By LoginL = By.xpath("//input[@type='submit']");
		WebElement Login = driver.findElement(LoginL);
		Login.click(); 

		By HomepageLabelL = By.xpath("//*[text()='Qafox.com']");
		WebElement HomepageLabel = driver.findElement(HomepageLabelL);
		boolean status = HomepageLabel.isDisplayed();
		Assert.assertTrue(status, "Test scrpt fail as HomepageLabel not displayed");

	}
	
	@DataProvider
	public Object[][] senddata(){
		Object[][] data= {{"sreevasu709@gmail.com","Vasu1234@"},
				{"sreevasu709@gmail.com","Vasu1234@"},
				{"sreevasu709@gmail.com","Vasu1234@"}};
		return data;
		
	}

	@Test(priority = 2)
	public void VerifyLoginButtonFunctionalityWithInvalidEmailAndPassword() {

		By EmailL = By.xpath("//div[@class='form-group']/child::input[@name='email']");
		WebElement Email = driver.findElement(EmailL);
		Email.clear();
		Email.sendKeys("sree" + generateTimeStamp() + "@gmail.com");

		By passwordL = By.xpath("//div[@class='form-group']/child::input[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.clear();
		password.sendKeys("vasu1234");

		By LoginL = By.xpath("//input[@type='submit']");
		WebElement Login = driver.findElement(LoginL);
		Login.click();

		By ErrorL = By.xpath("//*[text()='Warning: No match for E-Mail Address and/or Password.']");
		WebElement Error = driver.findElement(ErrorL);
		boolean status = Error.isDisplayed();
		Assert.assertTrue(status, "TestScript fail as Error message not displayed");

	}

	@Test
	public String generateTimeStamp() {
		Date date = new Date();
		String datestamp = date.toString();
		String TimestampAndDateStamp = datestamp.replaceAll(" ", "_").replaceAll(":", "_");
		return TimestampAndDateStamp;
	}

	@Test(priority = 3)
	public void verifyLoginButtonFunctionalityWithvalidEmailAndInvalidPassword() throws InterruptedException {

		By EmailL = By.xpath("//div[@class='form-group']/child::input[@name='email']");
		WebElement Email = driver.findElement(EmailL);
		Email.clear();
		Email.sendKeys("sree709@gmail.com");

		By passwordL = By.xpath("//div[@class='form-group']/child::input[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.clear();
		password.sendKeys("vasu1234");

		By LoginL = By.xpath("//input[@type='submit']");
		WebElement Login = driver.findElement(LoginL);
		Login.click();

		By ErrorMsgL = By.xpath("//*[@class='fa fa-exclamation-circle']");
		WebElement ErrorMsg = driver.findElement(ErrorMsgL);
		boolean status = ErrorMsg.isDisplayed();
		Assert.assertTrue(status, "TestScript fail as Error message not displayed");

	}

	@Test(priority = 4)
	public void verifyloginButtonWithEmptyCredentials() throws InterruptedException {

		By EmailL = By.xpath("//div[@class='form-group']/child::input[@name='email']");
		WebElement Email = driver.findElement(EmailL);
		Email.clear();
		Email.sendKeys(" ");

		By passwordL = By.xpath("//div[@class='form-group']/child::input[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.clear();
		password.sendKeys(" ");

		By LoginL = By.xpath("//input[@type='submit']");
		WebElement Login = driver.findElement(LoginL);
		Login.click();

		By ErrorMsgL = By.xpath("//*[@class='fa fa-exclamation-circle']");
		WebElement ErrorMsg = driver.findElement(ErrorMsgL);
		boolean status = ErrorMsg.isDisplayed();
		Assert.assertTrue(status, "TestScript fail as Error message not displayed");

	}
}
