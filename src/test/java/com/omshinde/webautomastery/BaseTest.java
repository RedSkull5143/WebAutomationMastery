package com.omshinde.webautomastery;

import com.omshinde.webautomastery.drivers.BrowserType;
import com.omshinde.webautomastery.drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();
    public static final String URL="https://web-playground.ultralesson.com/";

    @BeforeMethod(alwaysRun = true)
    public synchronized void setUp(){

        driverThreadLocal.set(new DriverManager().create());
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
