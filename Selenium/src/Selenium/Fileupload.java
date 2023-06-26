package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("https://www.sejda.com/pdf-editor");
		
		
		By fileuploadL=By.xpath("//*[@id='fileUploadForm']/child::*[@type='file']");
		WebElement fileupload=driver.findElement(fileuploadL);
		
		Actions action=new Actions(driver);
		action.click(fileupload).build().perform();
		/*Using send keys (It will work when Type=file present in html)
		fileupload.sendKeys("E:\\Certificates\\Srinivaskumar_Kamisetty.pdf");*/
		
		
		//using Robot class
		Robot robo=new Robot();
		robo.delay(3000);
		
		StringSelection sc=new StringSelection("E:\\Certificates\\Srinivaskumar_Kamisetty.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

