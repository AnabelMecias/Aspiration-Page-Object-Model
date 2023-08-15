package com.techbee.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    private WebDriverSingleton () {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.get("https://aspiration.com/");
        }
        return driver;
    }

    public static void closeDriver () {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
