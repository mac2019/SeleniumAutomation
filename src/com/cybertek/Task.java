package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/maralcharyeva/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.get("https://www.cybertekschool.com");


        System.setProperty("webdriver.gecko.driver",
                "/Users/maralcharyeva/Documents/selenium dependencies/drivers/geckodriver");

        WebDriver driver2 = new FirefoxDriver();

        driver2.get("https://google.com");
        driver2.get("https://cybertekschool.com/apply.php");
    }
}
