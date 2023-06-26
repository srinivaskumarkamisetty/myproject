package practiceSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {
	static WebDriver driver;
	Select select;

	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
	   
	}

	public void openUrl(String url) {
		driver.navigate().to(url);
	}

	public WebElement selectDropdown() {
		By dropdown_L = By.xpath("//*[@id='course']");
		WebElement dropdown = driver.findElement(dropdown_L);

		return dropdown;
	}

	public List<String> getAllOptions(WebElement dropdown) {

		select = new Select(dropdown);

		List<WebElement> alloptions = select.getOptions();
		List<String> Alloptionsvalue = new ArrayList<String>();

		for (WebElement options : alloptions) {
			System.out.println(options.getText());
			Alloptionsvalue.add(options.getText());
		}
        return Alloptionsvalue;
	}
	
	public void isElementPresent(List<String> Alloptionsvalue, String value) {
		
		if(Alloptionsvalue.contains(value)) {
			select.selectByVisibleText(value);
		}
	}
	public void closeBrowser() {
		driver.close();
		
	}

	public static void main(String[] args) {
		Dropdown d = new Dropdown();
		d.OpenBrowser();
		d.openUrl("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dropdown = d.selectDropdown();
		List<String> options=d.getAllOptions(dropdown);
		d.isElementPresent(options, "Java");
	}
}
