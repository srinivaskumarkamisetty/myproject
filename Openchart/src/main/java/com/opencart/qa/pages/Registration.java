package com.opencart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opencart.qa.utilities.ReadData;
import com.opencart.qa.utilities.Utilities;

public class Registration {
	public WebDriver driver;

	public Registration(WebDriver driver) {
		this.driver = driver;
	}

	private void setFirstName(String firstname) throws IOException {
		String firstname_L = ReadData.getlocator("Registration", "firstname_L");
		By firstnameL = By.xpath(firstname_L);
		WebElement Firstname = driver.findElement(firstnameL);
		Firstname.sendKeys(firstname);
	}

	private void setLastName(String lastname) throws IOException {
		String lastname_L = ReadData.getlocator("Registration", "firstname_L");
		By lastnameL = By.xpath(lastname_L);
		WebElement Lastname = driver.findElement(lastnameL);
		Lastname.sendKeys(lastname);

	}

	private void setEmail(String email) throws IOException {
		String email_L = ReadData.getlocator("Registration", "email_L");
		By emailL = By.xpath(email_L);
		WebElement Email = driver.findElement(emailL);
		Email.sendKeys(email+Utilities.emailDatestamp());
	}

	private void setPhonenumber(String mobilenumber) throws IOException {
		String telephone_L = ReadData.getlocator("Registration", "telephone_L");
		By telephoneL = By.xpath(telephone_L);
		WebElement telephone = driver.findElement(telephoneL);
		telephone.sendKeys(mobilenumber);
	}

	private void setPassword(String password) throws IOException {
		String password_L = ReadData.getlocator("Registration", "password_L");
		By passwordL = By.xpath(password_L);
		WebElement Password = driver.findElement(passwordL);
		Password.sendKeys(password);
	}

	private void setConfirmPassword(String confirmpassword) throws IOException {
		String confirmpassword_L = ReadData.getlocator("Registration", "confirmpassword_L");
		By confirmpasswordL = By.xpath(confirmpassword_L);
		WebElement Confirmpassword = driver.findElement(confirmpasswordL);
		Confirmpassword.sendKeys(confirmpassword);
	}

	private void clickOnPrivacy() throws IOException {
		String agree_L = ReadData.getlocator("Registration", "agree_L");
		By agreeL = By.xpath(agree_L);
		WebElement agree = driver.findElement(agreeL);
		agree.click();
	}

	private void clickOnContinueBtn() throws IOException {
		String continue_L = ReadData.getlocator("Registration", "continue_L");
		By continueL = By.xpath(continue_L);
		WebElement continuebtn = driver.findElement(continueL);
		continuebtn.click();
	}

	public void register(String firstname, String lastname, String email, String mobilenumber, String password,
			String confirmpassword) throws IOException {
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setEmail(email);
		this.setPhonenumber(mobilenumber);
		this.setPassword(confirmpassword);
		this.setConfirmPassword(confirmpassword);
		this.clickOnPrivacy();
		this.clickOnContinueBtn();

	}
}
/*
 * firstname_L=//*[@name='firstname'] lastname_L=//*[@name='lastname']
 * email_L=//*[@name='email'] telephone_L=//*[@name='telephone']
 * password_L=//*[@name='password'] confirmpassword_L=//*[@name='confirm']
 * agree_L=//*[@name='agree'] continue_L=//*[@type='submit']
 */