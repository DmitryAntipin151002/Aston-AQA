package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LearnMorePage {
    public WebDriver driver;

    public LearnMorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
