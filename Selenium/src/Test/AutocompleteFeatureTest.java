package Test;

import Selenium.AutocompleteFeature;

public class AutocompleteFeatureTest {
	public static void main(String[] args) throws InterruptedException {
		
	
	AutocompleteFeature obj=new AutocompleteFeature();
	obj.OpenBrowser();
	obj.OpenUrl("https://www.google.co.in/");
	obj.SetTextInGoogleSearchBox("selenium");
	obj.SelectOptionFromSuggestedList(3);
}
}