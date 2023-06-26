package com.opencart.qa.utilities;


import org.testng.*;

public class RetryAnalyzer implements IRetryAnalyzer{

	public  int normalcount=0;
	public static int maxcount=3;
	
	@Override
	public boolean retry(ITestResult result) {
	if(normalcount<=maxcount) {
		normalcount++;
		return true;
	}
		return false;
	}

}
