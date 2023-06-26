package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test(groups="sanity")
	public void test4() {
		System.out.println("test4");
	}
	
	@Test(groups="smoke")
	public void test5() {
		System.out.println("test5");
	}
	@Test(groups="regression")
	public void test6() {
		System.out.println("test6");
	}
}
