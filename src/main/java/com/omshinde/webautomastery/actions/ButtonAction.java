package com.omshinde.webautomastery.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ButtonAction extends WebActions{
    public ButtonAction(WebDriver webDriver) {
        super(webDriver);
    }
    public void click(WebElement element){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
