package StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Functions {
	public WebDriver driver;
	
	public Functions(Hooks hook) {
		driver=hook.driver;
	}

	@Given("^User Should be in Homepage$")
	public void user_Should_be_in_Homepage() throws Throwable {

		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("^User Should enter Invalid email Format$")
	public void user_Should_enter_Invalid_email_Format() throws Throwable {
		By Email_L = By.xpath("//*[@type='email']");
		WebElement Email = driver.findElement(Email_L);
		Email.clear();
		Email.sendKeys("abc");
		Email.sendKeys(Keys.ENTER);
	}

	@Then("^Wrong email message should be visible$")
	public void wrong_email_message_should_be_visible() throws Throwable {
		By WrongEmail_L = By.xpath("//*[text()='Wrong email']");
		WebElement WrongEmail = driver.findElement(WrongEmail_L);
		boolean condition = WrongEmail.isDisplayed();
		Assert.assertTrue(condition);
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();
	}

	@When("User leaving the Email text field as blank")
	public void user_leaving_the_Email_text_field_as_blank() {
		By Email_L = By.xpath("//*[@type='email']");
		WebElement Email = driver.findElement(Email_L);
		Email.clear();
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		By Login_L = By.xpath("//*[@type='submit']");
		WebElement Login = driver.findElement(Login_L);
		Login.click();

	}

	@Then("Please Enter your Email message should be visible")
	public void please_Enter_your_Email_message_should_be_visible() {
		By EnterEmailmsg_L = By.xpath("//*[text()='Please enter your email']");
		WebElement EnterEmail = driver.findElement(EnterEmailmsg_L);
		boolean message = EnterEmail.isDisplayed();
		Assert.assertTrue(message);

	}

	@When("User Enter Email {string}")
	public void user_Enter_Email(String email) {
		By Email_L = By.xpath("//*[@type='email']");
		WebElement Email = driver.findElement(Email_L);
		Email.clear();
		Email.sendKeys(email);
	}

	@When("User Enter Password")
	public void user_Enter_Password(DataTable datatable) {
		List<List<String>> data = datatable.asLists();
		String password = data.get(2).get(0);
		By Password_L = By.xpath("//*[@type='password']");
		WebElement Password=driver.findElement(Password_L);
		Password.clear();
		Password.sendKeys(password);
		
	}

	@Then("Dashboard label should be displayed")
	public void dashboard_label_should_be_displayed() {
		By Dashboard_L=By.xpath("//*[normalize-space()='Dashboard']");
		WebElement Dashboard=driver.findElement(Dashboard_L);
		boolean label=Dashboard.isDisplayed();
		Assert.assertTrue(label);
	}
	@When("User Enter NopCommerce Email {string}")
	public void user_Enter_NopCommerce_Email(String email) {
		By Email_L = By.xpath("//*[@type='email']");
		WebElement Email = driver.findElement(Email_L);
		Email.clear();
		Email.sendKeys(email);
	   
	}

	@When("User Enter NopCommerce Password {string}")
	public void user_Enter_NopCommerce_Password(String password) {
		By Password_L = By.xpath("//*[@type='password']");
		WebElement Password=driver.findElement(Password_L);
		Password.clear();
		Password.sendKeys(password);
	}


}
