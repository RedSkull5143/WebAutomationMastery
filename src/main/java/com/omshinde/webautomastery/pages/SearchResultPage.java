package com.omshinde.webautomastery.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(id = "ProductCountDesktop")
    private WebElement resultCountEle;

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getResultsCount(){
        return resultCountEle.getText();
    }

}
