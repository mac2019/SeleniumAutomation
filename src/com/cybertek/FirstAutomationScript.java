package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "/Users/maralcharyeva/Documents/selenium dependencies/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");

    }
}
