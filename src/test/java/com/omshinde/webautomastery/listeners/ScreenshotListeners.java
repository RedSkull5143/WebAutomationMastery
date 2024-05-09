package com.omshinde.webautomastery.listeners;

import com.omshinde.webautomastery.BaseTest;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Running Test - "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        captureScreenshot(result.getTestName());
    }
    @Attachment(value = "{0}", type = "images/png")
    public byte[] captureScreenshot(String testName){
        byte[] screenshotAs = ((TakesScreenshot) BaseTest.driverThreadLocal.get()).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

}
