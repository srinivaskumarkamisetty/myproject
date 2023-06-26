package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Functions {
	public WebDriver driver;

	@Given("User should be in NopCommerce page")
	public void user_should_be_in_NopCommerce_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	}

	@When("User Enter all fields")
	public void user_Enter_all_fields() {
		By Gender_L = By.xpath("//*[@class='male']");
		WebElement Gender = driver.findElement(Gender_L);
		Gender.click();

		By FirstName_L = By.xpath("//*[@name='FirstName']");
		WebElement FirstName = driver.findElement(FirstName_L);
		FirstName.sendKeys("srinivaskumar");

		By LastName_L = By.xpath("//*[@name='LastName']");
		WebElement LastName = driver.findElement(LastName_L);
		LastName.sendKeys("kamisetty");

		By Date_L = By.xpath("//*[@name='DateOfBirthDay']");
		WebElement Date = driver.findElement(Date_L);
		Select select = new Select(Date);
		select.selectByValue("1");

		By Month_L = By.xpath("//*[@name='DateOfBirthMonth']");
		WebElement Month = driver.findElement(Month_L);
		Select select1 = new Select(Month);
		select1.selectByVisibleText("January");

		By Year_L = By.xpath("//*[@name='DateOfBirthYear']");
		WebElement Year = driver.findElement(Year_L);
		Select select2 = new Select(Year);
		select2.selectByValue("1996");

		By Email_L = By.xpath("//*[@name='Email']");
		WebElement Email = driver.findElement(Email_L);
		Email.sendKeys(utilities.emailDatestamp());

		By Password_L = By.xpath("//*[@name='Password']");
		WebElement Password = driver.findElement(Password_L);
		Password.sendKeys("vasu1234");

		By ConfirmPassword_L = By.xpath("//*[@name='ConfirmPassword']");
		WebElement ConfirmPassword = driver.findElement(ConfirmPassword_L);
		ConfirmPassword.sendKeys("vasu1234");

	}

	@When("Click on Register button")
	public void click_on_Register_button() {
		By Register_L = By.xpath("//*[@id='register-button']");
		WebElement Register = driver.findElement(Register_L);
		Actions action = new Actions(driver);
		action.click(Register).build().perform();
	}

	@Then("Homepage label should be visible")
	public void homepage_label_should_be_visible() {
		By RegistrationCompleted_L = By.xpath("//*[text()='Your registration completed']");
		WebElement RegistrationCompleted = driver.findElement(RegistrationCompleted_L);
		boolean successMsg = RegistrationCompleted.isDisplayed();
		Assert.assertTrue(successMsg);
	}

	@Then("Close The Browser")
	public void close_The_Browser() {
		driver.close();
	}
	@When("User click on login without entering any fields")
	public void user_click_on_login_without_entering_any_fields() {
		By Register_L = By.xpath("//*[@id='register-button']");
		WebElement Register = driver.findElement(Register_L);
		Actions action = new Actions(driver);
		action.click(Register).build().perform();
	}

	@Then("Error Messages should be displayed")
	public void error_Messages_should_be_displayed() {
	 By firstnameError_L= By.xpath("//*[text()='First name is required.']");
	WebElement firstnameError= driver.findElement(firstnameError_L);
	String ExpectedText=firstnameError.getText();
	String ActualText="First name is required.";
	Assert.assertEquals(ExpectedText, ActualText);
	}
	@When("User only mandatory fields")
	public void user_only_mandatory_fields() {
		By FirstName_L = By.xpath("//*[@name='FirstName']");
		WebElement FirstName = driver.findElement(FirstName_L);
		FirstName.sendKeys("srinivaskumar");

		By LastName_L = By.xpath("//*[@name='LastName']");
		WebElement LastName = driver.findElement(LastName_L);
		LastName.sendKeys("kamisetty");
		
		By Email_L = By.xpath("//*[@name='Email']");
		WebElement Email = driver.findElement(Email_L);
		Email.sendKeys(utilities.emailDatestamp());

		By Password_L = By.xpath("//*[@name='Password']");
		WebElement Password = driver.findElement(Password_L);
		Password.sendKeys("vasu1234");

		By ConfirmPassword_L = By.xpath("//*[@name='ConfirmPassword']");
		WebElement ConfirmPassword = driver.findElement(ConfirmPassword_L);
		ConfirmPassword.sendKeys("vasu1234");

	}
	@When("User enters {string} and {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and_and(String firstname, String lastname, String email, String password, String confirmpassword) {
		By FirstName_L = By.xpath("//*[@name='FirstName']");
		WebElement FirstName = driver.findElement(FirstName_L);
		FirstName.sendKeys(firstname);

		By LastName_L = By.xpath("//*[@name='LastName']");
		WebElement LastName = driver.findElement(LastName_L);
		LastName.sendKeys(lastname);
		
		By Email_L = By.xpath("//*[@name='Email']");
		WebElement Email = driver.findElement(Email_L);
		Email.sendKeys(email);

		By Password_L = By.xpath("//*[@name='Password']");
		WebElement Password = driver.findElement(Password_L);
		Password.sendKeys(password);

		By ConfirmPassword_L = By.xpath("//*[@name='ConfirmPassword']");
		WebElement ConfirmPassword = driver.findElement(ConfirmPassword_L);
		ConfirmPassword.sendKeys(confirmpassword);
	}

	@When("User enter InvalidEmail")
	public void user_enter_InvalidEmail() {
		By Email_L = By.xpath("//*[@name='Email']");
		WebElement Email = driver.findElement(Email_L);
		Email.sendKeys("vasu@gmail.com");
	}

	@Then("Login was unsuccessful. Please correct the errors and try again.No customer account found message should display.")
	public void login_was_unsuccessful_Please_correct_the_errors_and_try_again_No_customer_account_found_message_should_display() {
		By unsuccessful_L=By.xpath("//*[@class='message-error validation-summary-errors']");
		WebElement unsuccessful=driver.findElement(unsuccessful_L);
		boolean msg= unsuccessful.isDisplayed();
		Assert.assertTrue(msg);
	}





}
