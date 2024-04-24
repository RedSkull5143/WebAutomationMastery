package com.omshinde.webautomastery.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextBox extends WebActions{
    public TextBox(WebDriver webDriver) {
        super(webDriver);
    }

    public void typing(WebElement element,String value){
        webDriverWait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
    }
//    public void typing(WebElement element,String value, int timeout){
//
//    }
    public void typing(By by, String value){

    }
}
