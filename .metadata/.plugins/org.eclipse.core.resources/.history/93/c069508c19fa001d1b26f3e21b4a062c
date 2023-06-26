package com.nopcommerce.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.nopcommerce.utils.ReadData;

public class loginpage {
	public WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	private void setEmail(String email) throws IOException {
		String Email_L=ReadData.getlocator("loginpage", "Email_L");
		By emailL=By.xpath(Email_L);
		WebElement Email=driver.findElement(emailL);
		Email.clear();
		Email.sendKeys(email);
	}
	private void setPassword(String password) throws IOException {
		String Password_L=ReadData.getlocator("loginpage", "Password_L");
		By PasswordL=By.xpath(Password_L);
		WebElement Password=driver.findElement(PasswordL);
		Password.clear();
		Password.sendKeys(password);
	}
	private void clickonlogin() throws IOException {
		String Login_L=ReadData.getlocator("loginpage", "Login_L");
		By LoginL=By.xpath(Login_L);
		WebElement Login=driver.findElement(LoginL);
		Login.click();
		
	}
	public void NopcommerceLogin(String email, String password) throws IOException {
		this.setEmail(email);
		this.setPassword(password);
		this.clickonlogin();
		Reporter.log("element clicked");
	}
	public boolean VerifyErrormsg(String msg1,String msg2) throws IOException {
		String errormsg_L=ReadData.getlocator("loginpage", "errormsg_L");
		By errormsgL=By.xpath(errormsg_L);
		WebElement errormsg=driver.findElement(errormsgL);
		String errormsgs=errormsg.getText();
		String error[]=errormsgs.split("\n");
		boolean status1=msg1.equals(error[0]);
		boolean status2=msg2.equals(error[1]);
		return status1&&status2;
	}
}
