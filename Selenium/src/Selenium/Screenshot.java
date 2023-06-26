package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

public static void TakeScreenShot(WebDriver driver,String Imagename) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	File s=new File("E:\\Screenshots\\"+Imagename+".png");
	FileUtils.copyFile(f, s);
}
}
