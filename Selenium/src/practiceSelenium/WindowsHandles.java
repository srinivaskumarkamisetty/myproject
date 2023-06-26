package practiceSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowsHandles extends Dropdown {

	public void clickonElement() {
		By openNewWindow = By.xpath("//*[@id='newWindowBtn']");
		WebElement window = driver.findElement(openNewWindow);
		window.click();
	}

	public void getWindow() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);

		for (String windows : allwindows) {
			if (!windows.equals(parentWindow)) {
				driver.switchTo().window(windows);
				driver.manage().window().maximize();
				By firstnameL = By.xpath("//*[@id='firstName']");
				WebElement firstname = driver.findElement(firstnameL);
				Thread.sleep(3000);
				firstname.sendKeys("kamisetty");
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		By textL = By.xpath("//*[@id='name']");
		WebElement text = driver.findElement(textL);
		text.sendKeys("vasu");
	}

	public static void main(String[] args) {
		WindowsHandles win = new WindowsHandles();
		win.OpenBrowser();
		win.openUrl("https://www.hyrtutorials.com/p/window-handles-practice.html");
		win.clickonElement();
		try {
			win.getWindow();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		win.closeBrowser();

	}
}
