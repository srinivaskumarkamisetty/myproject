package com.tutorials.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorials.qa.utilities.Utilities;

public class RegisterAccount {
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyRegistrationByProvidingMandatoryFields() {
		By firstNameL = By.xpath("//*[@name='firstname']");
		WebElement firstName = driver.findElement(firstNameL);
		firstName.sendKeys("srinivaskumar");

		By lastNameL = By.xpath("//*[@name='lastname']");
		WebElement lastName = driver.findElement(lastNameL);
		lastName.sendKeys("kumar");

		By emailL = By.xpath("//*[@name='email']");
		WebElement email = driver.findElement(emailL);
		email.sendKeys(Utilities.emailDatestamp());

		By telephoneL = By.xpath("//*[@name='telephone']");
		WebElement telephone = driver.findElement(telephoneL);
		telephone.sendKeys("1234567891");

		By passwordL = By.xpath("//*[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.sendKeys("vasu123");

		By confirmpasswordL = By.xpath("//*[@name='confirm']");
		WebElement confirmpassword = driver.findElement(confirmpasswordL);
		confirmpassword.sendKeys("vasu123");

		By privacyAndPolicyL = By.xpath("//*[@name='agree']");
		WebElement privacyAndPolicy = driver.findElement(privacyAndPolicyL);
		privacyAndPolicy.click();

		By continuebtnL = By.xpath("//*[@type='submit']");
		WebElement continuebtn = driver.findElement(continuebtnL);
		continuebtn.click();

		By homePageLabelL = By.xpath("//*[text()='Qafox.com']");
		WebElement homePageLabel = driver.findElement(homePageLabelL);
		boolean status = homePageLabel.isDisplayed();
		Assert.assertTrue(status, "Test script fail as label not displayed");

	}

	@Test(priority = 2)
	public void verifyRegistrationByProvidingAllFields() {

		By firstNameL = By.xpath("//*[@name='firstname']");
		WebElement firstName = driver.findElement(firstNameL);
		firstName.sendKeys("srinivaskumar");

		By lastNameL = By.xpath("//*[@name='lastname']");
		WebElement lastName = driver.findElement(lastNameL);
		lastName.sendKeys("kumar");

		By emailL = By.xpath("//*[@name='email']");
		WebElement email = driver.findElement(emailL);
		email.sendKeys(Utilities.emailDatestamp());

		By telephoneL = By.xpath("//*[@name='telephone']");
		WebElement telephone = driver.findElement(telephoneL);
		telephone.sendKeys("1234567891");

		By passwordL = By.xpath("//*[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.sendKeys("vasu123");

		By confirmpasswordL = By.xpath("//*[@name='confirm']");
		WebElement confirmpassword = driver.findElement(confirmpasswordL);
		confirmpassword.sendKeys("vasu123");

		By privacyAndPolicyL = By.xpath("//*[@name='agree']");
		WebElement privacyAndPolicy = driver.findElement(privacyAndPolicyL);
		privacyAndPolicy.click();

		By newsletterL = By.xpath("//*[@value='0']");
		WebElement newsletter = driver.findElement(newsletterL);
		newsletter.click();

		By continuebtnL = By.xpath("//*[@type='submit']");
		WebElement continuebtn = driver.findElement(continuebtnL);
		continuebtn.click();

		By homePageLabelL = By.xpath("//*[text()='Qafox.com']");
		WebElement homePageLabel = driver.findElement(homePageLabelL);
		boolean status = homePageLabel.isDisplayed();
		Assert.assertTrue(status, "Test script fail as label not displayed");

	}

	@Test(priority = 3)
	public void verifyRegistrationByProvidingExistingEmailAccount() {
		By firstNameL = By.xpath("//*[@name='firstname']");
		WebElement firstName = driver.findElement(firstNameL);
		firstName.sendKeys("srinivaskumar");

		By lastNameL = By.xpath("//*[@name='lastname']");
		WebElement lastName = driver.findElement(lastNameL);
		lastName.sendKeys("kumar");

		By emailL = By.xpath("//*[@name='email']");
		WebElement email = driver.findElement(emailL);
		email.sendKeys("sreevasu709@gmail.com");

		By telephoneL = By.xpath("//*[@name='telephone']");
		WebElement telephone = driver.findElement(telephoneL);
		telephone.sendKeys("1234567891");

		By passwordL = By.xpath("//*[@name='password']");
		WebElement password = driver.findElement(passwordL);
		password.sendKeys("vasu123");

		By confirmpasswordL = By.xpath("//*[@name='confirm']");
		WebElement confirmpassword = driver.findElement(confirmpasswordL);
		confirmpassword.sendKeys("vasu123");

		By privacyAndPolicyL = By.xpath("//*[@name='agree']");
		WebElement privacyAndPolicy = driver.findElement(privacyAndPolicyL);
		privacyAndPolicy.click();

		By newsletterL = By.xpath("//*[@value='0']");
		WebElement newsletter = driver.findElement(newsletterL);
		newsletter.click();

		By continuebtnL = By.xpath("//*[@type='submit']");
		WebElement continuebtn = driver.findElement(continuebtnL);
		continuebtn.click();

		By warningMsgL = By.xpath("//*[text()='Warning: E-Mail Address is already registered!']");
		WebElement warningMsg = driver.findElement(warningMsgL);
		boolean status = warningMsg.isDisplayed();
		Assert.assertTrue(status);
	}
	@Test
	public void verifyRegistrationByWithoutProvidingAllDetails() {
		By continuebtnL = By.xpath("//*[@type='submit']");
		WebElement continuebtn = driver.findElement(continuebtnL);
		continuebtn.click();
		
		By errorL=By.xpath("//*[text()='Warning: You must agree to the Privacy Policy!']");
		WebElement error=driver.findElement(errorL);
		String Actualmsg=error.getText();
		String expectedmsg="Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(Actualmsg, expectedmsg);
		
		By firstnameErrormsgL=By.xpath("//*[text()='First Name must be between 1 and 32 characters!']");
		WebElement firstnameErrormsg=driver.findElement(firstnameErrormsgL);
		boolean status=firstnameErrormsg.isDisplayed();
		Assert.assertTrue(status, "Test script fail error msg not displayed");
		
		
		By lastnameErrormsgL=By.xpath("//*[text()='Last Name must be between 1 and 32 characters!']");
		WebElement lastnameErrormsg=driver.findElement(lastnameErrormsgL);
		boolean lastnameErrormsgstatus=lastnameErrormsg.isDisplayed();
		Assert.assertTrue(lastnameErrormsgstatus, "Test script fail error msg not displayed");
		

		By emailErrormsgL=By.xpath("//*[text()='E-Mail Address does not appear to be valid!']");
		WebElement emailErrormsg=driver.findElement(emailErrormsgL);
		boolean emailErrormsgstatus=emailErrormsg.isDisplayed();
		Assert.assertTrue(emailErrormsgstatus, "Test script fail error msg not displayed");
		
		By telephoneErrormsgL=By.xpath("//*[text()='Telephone must be between 3 and 32 characters!']");
		WebElement telephoneErrormsg=driver.findElement(telephoneErrormsgL);
		boolean telephoneErrormsgstatus=telephoneErrormsg.isDisplayed();
		Assert.assertTrue(telephoneErrormsgstatus, "Test script fail error msg not displayed");
		
		By passwordErrormsgL=By.xpath("//*[text()='Password must be between 4 and 20 characters!']");
		WebElement passwordErrormsg=driver.findElement(passwordErrormsgL);
		boolean passwordErrormsgstatus=passwordErrormsg.isDisplayed();
		Assert.assertTrue(passwordErrormsgstatus, "Test script fail error msg not displayed");
		
	}
}
