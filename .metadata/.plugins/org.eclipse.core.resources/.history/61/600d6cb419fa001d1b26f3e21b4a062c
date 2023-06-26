package com.nopcommerce.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	
	private int retrycount =0;
	private static int maxcount=3;
	@Override
	public boolean retry(ITestResult result) {
		if(retrycount<maxcount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
