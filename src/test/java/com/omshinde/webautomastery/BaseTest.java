package com.omshinde.webautomastery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();
    private final String URL="https://web-playground.ultralesson.com/";

    @BeforeMethod(alwaysRun = true)
    public synchronized void setUp(){
        driverThreadLocal.set(new ChromeDriver());
        launch();
        driverThreadLocal.get().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public synchronized void tearDown(){
        driverThreadLocal.get().quit();
    }
    protected synchronized void launch(){
        driverThreadLocal.get().get(URL);
    }
    protected synchronized WebDriver getWebDriver(){
        return driverThreadLocal.get();
    }
}
