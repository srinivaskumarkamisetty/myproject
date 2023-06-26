package Test;

import Selenium.AmazonAutoCompleteFeature;

public class AmazonAutoCompleteFeatureTest {
	public static void main(String[] args) {
		
	
	AmazonAutoCompleteFeature obj=new AmazonAutoCompleteFeature();
	obj.OpenBrowser();
	obj.OpenUrl("https://www.amazon.in/");
	obj.SetTextInAmazonSearchBox("smart");
	obj.GetElements();
}
}
// //div[@aria-label='smart watch for men']