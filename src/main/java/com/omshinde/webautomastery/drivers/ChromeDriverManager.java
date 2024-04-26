package com.omshinde.webautomastery.drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.omshinde.webautomastery.drivers.FeatureToggle.HEADLESS;
import static com.omshinde.webautomastery.drivers.FeatureToggle.RESPONSIVE;

public class ChromeDriverManager {

    public WebDriver create() {
        WebDriver driver;

        if(HEADLESS.isOff()){
            return new ChromeDriver();
        }
        if ((RESPONSIVE.isOff())){
            return new ChromeDriver();
        }
        return new ChromeDriver(getHeadlessOptions());

    }

    private ChromeOptions getHeadlessOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("disable-gpu");
        chromeOptions.addArguments("--window-size=1300,1000");
        return chromeOptions;
    }
}