package com.tutorials.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.tutorials.qa.base.Base;

public class SearchProduct extends Base {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = initilizeBrowserAndOpenUrl("edge");
		driver=enterUrl("https://tutorialsninja.com/demo/ ");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifySearchWithValidProduct() {
		By searchBoxL = By.xpath("//*[@class='col-sm-5']/descendant::input");
		WebElement searchBox = driver.findElement(searchBoxL);
		searchBox.sendKeys("HP");

		By BtnL = By.xpath("//*[@class='input-group-btn']/child::button");
		WebElement Btn = driver.findElement(BtnL);
		Btn.click();

		By productL = By.xpath("//*[text()='HP LP3065']");
		WebElement product = driver.findElement(productL);
		boolean status = product.isDisplayed();
		Assert.assertTrue(status, "product not displayed");
	}

	@Test(priority = 2)
	public void verifySearchWithInValidProduct() {
		By searchBoxL = By.xpath("//*[@class='col-sm-5']/descendant::input");
		WebElement searchBox = driver.findElement(searchBoxL);
		searchBox.sendKeys("bajaj");

		By BtnL = By.xpath("//*[@class='input-group-btn']/child::button");
		WebElement Btn = driver.findElement(BtnL);
		Btn.click();

		By productL = By.xpath("//*[text()='There is no product that matches the search criteria.']");
		WebElement product = driver.findElement(productL);
		boolean status = product.isDisplayed();
		Assert.assertTrue(status, "product not displayed");
	}
     @Test(priority=3)
	public void verifySearchWithoutEnteringAnyProduct() {

		By BtnL = By.xpath("//*[@class='input-group-btn']/child::button");
		WebElement Btn = driver.findElement(BtnL);
		Btn.click();

		By productL = By.xpath("//*[text()='There is no product that matches the search criteria.']");
		WebElement product = driver.findElement(productL);
		boolean status = product.isDisplayed();
		Assert.assertTrue(status, "product not displayed");
	}
}
