package com.omshinde.webautomastery.pages;

import com.omshinde.webautomastery.components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.network.Header;

public class HomePage extends BasePage{
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderComponent getHeader() {
        return new HeaderComponent(webDriver);
    }
}
