package com.omshinde.webautomastery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private ThreadLocal<WebDriver> driverThreadLocal;
    private final String URL="https://web-playground.ultralesson.com/";

    @BeforeMethod
    public void setUp(){
        driverThreadLocal=new ThreadLocal<>();
        driverThreadLocal.set(new ChromeDriver());
        launch();
        driverThreadLocal.get().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driverThreadLocal.get().quit();
    }
    protected void launch(){
        driverThreadLocal.get().get(URL);
    }
    protected WebDriver getWebDriver(){
        return driverThreadLocal.get();
    }
}
