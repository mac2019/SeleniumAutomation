package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAutomationScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/maralcharyeva/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver= new ChromeDriver();
        driver.get("http://cybertekSchool.com");

    }

}
