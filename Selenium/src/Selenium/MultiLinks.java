package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultiLinks {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		

		By AllLinks = By.tagName("a");
		List<WebElement> Alllinks = driver.findElements(AllLinks);

		for (WebElement links : Alllinks) {
			if (links.isDisplayed()) {
				System.out.println(links.getText());
				Actions action = new Actions(driver);
				action.contextClick(links).build().perform();

				// Open link in new tab
				Robot robo = new Robot();
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyRelease(KeyEvent.VK_DOWN);

				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);

				// Switching windows
				String Parentwindow = driver.getWindowHandle();
				System.out.println(Parentwindow);

				Set<String> Allwin = driver.getWindowHandles();
				System.out.println(Allwin);

				for (String window : Allwin) {
					if (!Parentwindow.equals(window)) {
						driver.switchTo().window(window);
						Thread.sleep(3000);
						driver.close();
					}
				}
				driver.switchTo().window(Parentwindow);
				Thread.sleep(3000);
				driver.close();

			}
		}

	}
}