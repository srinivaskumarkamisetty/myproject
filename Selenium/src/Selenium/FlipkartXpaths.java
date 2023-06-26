package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class FlipkartXpaths {
	static String text="Hom";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		
		By MenubarL=By.xpath("//*[@class='_37M3Pb']/child::div");
		List<WebElement>  Menubar=driver.findElements(MenubarL);
		List<String> Alloptions=new ArrayList<String>();
		
		System.out.println(Menubar.size());
		for (WebElement Element : Menubar) {
			System.out.println(Element.getText());
			Alloptions.add(Element.getText());
	
		}
		if(Alloptions.contains(text)) {
			Assert.assertTrue(true);
			System.out.println("Element found");
		}
		
		
}
}