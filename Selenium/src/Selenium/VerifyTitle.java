package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyTitle {
	public WebDriver driver;

	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(options);

	}

	public void OpenUrl(String url) {

		driver.get(url);
	}

	public String GetCurrentTitle() {

		return driver.getTitle();
		
	}
    public boolean CompareTitle(String ExpectedTitle, String ActualTitle) {
    	
    return	ActualTitle.toLowerCase().equals(ExpectedTitle.toLowerCase());
    }
    public void Getstatus(boolean status) {
    	if(status) {
    		System.out.println("Test script pass");
    	}
    	else {
    		System.out.println("Test script fail");
    	}
    }
    public void closebrowser() {
    	driver.close();
    }
}
