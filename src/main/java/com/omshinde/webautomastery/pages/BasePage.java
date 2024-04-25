package com.omshinde.webautomastery.pages;

import com.omshinde.webautomastery.actions.ButtonAction;
import com.omshinde.webautomastery.actions.TextBox;
import com.omshinde.webautomastery.actions.WebActions;
import com.omshinde.webautomastery.components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver webDriver;
    protected ButtonAction buttonAction;
    protected TextBox textBox;
    protected WebActions webActions;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
        this.buttonAction=new ButtonAction(webDriver);
        this.textBox=new TextBox(webDriver);
        this.webActions=new WebActions(webDriver);
    }

    public HeaderComponent getHeader() {
        return new HeaderComponent(webDriver);
    }
}
