package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    public WebDriver driver;

    @Parameters("browsername")
    @BeforeTest
    public void openBrowser(String browsername) {
        switch (browsername.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // ... other methods ...

   

//sure that you have the appropriate dependencies configured and the necessary classes imported correctly to resolve the error.






	

	public void setEmail() {
		By email_L = By.xpath("//*[@name='username']");
		WebElement email = driver.findElement(email_L);
		email.sendKeys("admin");
	}

	public void setPassword() {
		By password_L = By.xpath("//*[@name='password']");
		WebElement password = driver.findElement(password_L);
		password.sendKeys("admin123");
	}

	public void login() {
		By login_L = By.xpath("//*[@Type='submit']");
		WebElement login = driver.findElement(login_L);
		login.click();

	}

	@Test
	public void loginwithvaliddata() {
		FirstTest log = new FirstTest();
		log.setEmail();
		log.setPassword();
		log.login();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
