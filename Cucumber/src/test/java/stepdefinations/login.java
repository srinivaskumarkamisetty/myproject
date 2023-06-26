package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class login {
public WebDriver driver;

@Given("User should be in homepage")
public void user_should_be_in_homepage() {
	System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
}

@When("User enter Email")
public void user_enter_Email() {
	By Email_L = By.xpath("//*[@name='Email']");
	WebElement Email = driver.findElement(Email_L);
	Email.sendKeys("vasu1234@gmail.com");

	
}

@When("User enter password")
public void user_enter_password() {
	By Password_L = By.xpath("//*[@name='Password']");
	WebElement Password = driver.findElement(Password_L);
	Password.sendKeys("vasu1234");
}

@When("click on loginbutton")
public void click_on_loginbutton() {
	By Register_L = By.xpath("//*[text()='Log in']");
	WebElement Register = driver.findElement(Register_L);
	Actions action = new Actions(driver);
	action.click(Register).build().perform();
}

@Then("Homepage should be displayed")
public void homepage_should_be_displayed() {
	By label_l= By.xpath("//img[@alt='nopCommerce demo store']");
	WebElement label = driver.findElement(label_l);
	boolean condition=label.isDisplayed();
	Assert.assertTrue(condition);
}

@Then("close browser")
public void close_browser() {
   driver.close();
}



}
