package com.UI_Automation.Listeners.retry_mechanism;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
    private static int retryCount = 0;

    public boolean retry(ITestResult result) {
        int maxRetryCount=0;
        if(System.getProperty("retrycount")!=null)
            maxRetryCount= Integer.parseInt(System.getProperty("retrycount"));
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}