package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Dropdown {

	public WebElement setTextInTextbox(String name) {
		By text_L = By.xpath("//*[@id='name']");
		WebElement text = driver.findElement(text_L);
		text.sendKeys(name);
		return text;

	}

	public void swithtoFrame() {
		By frame = By.xpath("//*[@id='frm1']");
		WebElement iframe = driver.findElement(frame);
		driver.switchTo().frame(iframe);
	}

	public WebElement selecdropdown() {
		By dropdown_L = By.xpath("//*[@id='selectnav1']");
		WebElement dropdown = driver.findElement(dropdown_L);
		return dropdown;
	}

	public void setDefaultframeAndClearText(WebElement text) {
		driver.switchTo().defaultContent();
		text.clear();
	}

	public static void main(String[] args) {
		Frames frame = new Frames();
		frame.OpenBrowser();
		driver.manage().window().maximize();
		frame.openUrl("https://www.hyrtutorials.com/p/frames-practice.html");
		Screenshot.takeScreenshot(driver, "image1");
		WebElement text = frame.setTextInTextbox("vasu");
		frame.swithtoFrame();
		WebElement dropdown = frame.selecdropdown();
		List<String> options = frame.getAllOptions(dropdown);
		frame.isElementPresent(options, "-- Selenium");
		Screenshot.takeScreenshot(driver, "image2");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		frame.setDefaultframeAndClearText(text);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.closeBrowser();
	}
}