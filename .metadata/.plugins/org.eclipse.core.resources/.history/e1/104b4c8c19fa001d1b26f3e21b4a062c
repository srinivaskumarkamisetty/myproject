package com.nopcommerce.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.nopcommerce.utils.ReadData;

public class dashboard {
	public WebDriver driver;
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
	}

	public boolean isDashboardLabelVisible() throws IOException {
		String dashboard_L = ReadData.getlocator("dashboard", "dashboard_L");
		By dashboardL = By.xpath(dashboard_L);
		WebElement dashboard = driver.findElement(dashboardL);
		return dashboard.isDisplayed();
	}

	public void setTextInSearchBox(String data) throws IOException {
		String searchbox_L = ReadData.getlocator("dashboard", "searchbox_L");
		By searchboxL = By.xpath(searchbox_L);
		WebElement searchbox = driver.findElement(searchboxL);
		searchbox.sendKeys(data);

	}

	public String getErrorMsg() throws IOException {
		String invalidErrormsg_L = ReadData.getlocator("dashboard", "invalidErrormsg_L");
		By invalidErrormsgl = By.xpath(invalidErrormsg_L);
		WebElement invalidErrormsg = driver.findElement(invalidErrormsgl);
		return invalidErrormsg.getText();
	}
	public List verifySuggestedList(String expecteddata) throws IOException {
		boolean status=true;
		String suggestedlist_L=ReadData.getlocator("dashboard", "suggestedlist_L");
		By suggestedlistL=By.xpath(suggestedlist_L);
		List<WebElement> suggestedlist=driver.findElements(suggestedlistL);
		for (WebElement Element : suggestedlist) {
			String actualdata=Element.getText();
			actualdata=actualdata.toLowerCase();
			expecteddata=expecteddata.toLowerCase();
			
			if(!actualdata.contains(expecteddata)) {
				status=false;
				break;
			}
		}
		List results=new ArrayList();
		results.add(status);
		results.add(suggestedlist.size());
		return results;
	}
}
