package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginButtonFunctionality {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	
   By EmailL=By.xpath("//*[@name='email']");
   WebElement Email=driver.findElement(EmailL);
   Email.sendKeys("sreevasu709@gmail.com");
   Thread.sleep(2000);
   
   By PasswordButtonL=By.xpath("//*[@type='password']");
   WebElement PasswordButton=driver.findElement(PasswordButtonL);
   PasswordButton.sendKeys("vasu1234@");
   Thread.sleep(2000);
   
   By LoginButtonL=By.xpath("//*[@type='submit']");
   WebElement LoginButton=driver.findElement(LoginButtonL);
   LoginButton.click();
   
		
}
}
