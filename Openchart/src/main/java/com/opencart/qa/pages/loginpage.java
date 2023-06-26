package com.opencart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opencart.qa.utilities.ReadData;

public class loginpage {
public WebDriver driver;

public loginpage(WebDriver driver) {
	this.driver=driver;
}
private void setEmail(String email) throws IOException {
	String email_L=ReadData.getlocator("login", "email_L");
	By emailL=By.xpath(email_L);
	WebElement Email=driver.findElement(emailL);
	Email.clear();
	Email.sendKeys(email);
}
private void setPassword(String password) throws IOException {
	String password_L=ReadData.getlocator("login", "password_L");
	By passwordL=By.xpath(password_L);
	WebElement Password=driver.findElement(passwordL);
	Password.clear();
	Password.sendKeys(password);
}
private void clickOnLogin() throws IOException {
	String loginbtn_L=ReadData.getlocator("login", "loginbtn_L");
	By loginbtnL=By.xpath(loginbtn_L);
	WebElement loginbtn=driver.findElement(loginbtnL);
	Actions Action=new Actions(driver);
	Action.click(loginbtn).build().perform();
	
}
public void openCartLogin(String email,String password) throws IOException {
	loginpage login=new loginpage(driver);
	this.setEmail(email);
	this.setPassword(password);
	login.clickOnLogin();
}
public boolean verifyAlertMsg() throws IOException {
	String alert_L=ReadData.getlocator("login", "alert_L");
	By alertL=By.xpath(alert_L);
	WebElement alert=driver.findElement(alertL);
	boolean alertmsg=alert.isDisplayed();
	return alertmsg;
	
}
}