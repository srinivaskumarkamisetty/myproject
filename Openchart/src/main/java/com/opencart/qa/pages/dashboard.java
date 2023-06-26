package com.opencart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opencart.qa.utilities.ReadData;

public class dashboard {
	public WebDriver driver;

	public dashboard(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyDashboardLabelDisplay() throws IOException {
		String dashboardlabel_L = ReadData.getlocator("dashboard", "dashboardlabel_L");
		By dashboardlabelL = By.xpath(dashboardlabel_L);
		WebElement dashboardlabell = driver.findElement(dashboardlabelL);
		boolean status = dashboardlabell.isDisplayed();
		return status;
	}

	public void setText(String data) throws IOException {
		String searchbox_L = ReadData.getlocator("dashboard", "searchbox_L");
		By searchboxL = By.xpath(searchbox_L);
		WebElement searchbox = driver.findElement(searchboxL);
		searchbox.sendKeys(data);
		searchbox.click();
	}

	public boolean verifyValidProduct() throws IOException {
		String validdataL = ReadData.getlocator("dashboard", "validdataL");
		By validdatal = By.xpath(validdataL);
		WebElement validdata = driver.findElement(validdatal);
		boolean status = validdata.isDisplayed();
		return status;
	}

	public boolean VeifyInvalidProduct() throws IOException, InterruptedException {
		String invaliddataL = ReadData.getlocator("dashboard", "invaliddataL");
		By invaliddatal = By.xpath(invaliddataL);
		WebElement invaliddata = driver.findElement(invaliddatal);
		boolean status = invaliddata.isDisplayed();
		return status;
	}
}
