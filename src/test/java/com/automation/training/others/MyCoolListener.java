package com.automation.training.others;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyCoolListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult arg0){
        System.out.println("test passed");
    }
    @Override
    public void onTestStart(ITestResult arg0){
        //
    }
    @Override
    public void onTestSkipped(ITestResult arg0){
        //
    }
    @Override
    public void onTestFailure(ITestResult arg0){
        System.out.println("test failed");
    }
}
