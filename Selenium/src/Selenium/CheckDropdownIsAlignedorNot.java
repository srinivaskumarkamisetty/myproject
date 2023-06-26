package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckDropdownIsAlignedorNot extends VerifyTitle {
	public Select select;

	public void VerifyDropdown() {
		By MyAccounts_L = By
				.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select");
		WebElement MyAccounts = driver.findElement(MyAccounts_L);
		select = new Select(MyAccounts);

		List originallist = new ArrayList();
		List templist = new ArrayList();

		List<WebElement> options = select.getOptions();
		for (WebElement Element : options) {
			String Actualorder = Element.getText();
			originallist.add(Actualorder);
			templist.add(Actualorder);
		}
		//System.out.println("Before sorting originallist" + originallist);
		System.out.println("Before sorting templist" + templist);

		Collections.sort(templist);

		//System.out.println("after sorting originallist" + originallist);
		System.out.println("after sorting templist" + templist);

		if (originallist == templist) {
			System.out.println("Sorted in order");
		} else {
			System.out.println("not sorted in order");
		}

	}

	public static void main(String[] args) {
		CheckDropdownIsAlignedorNot obj = new CheckDropdownIsAlignedorNot();
		obj.OpenBrowser();
		obj.OpenUrl("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		obj.VerifyDropdown();

	}

}
