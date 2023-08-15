package com.techbee.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AspirationHomePage {
    private WebDriver driver;

    public AspirationHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickIndividualSolutions () {
        WebElement individualSolution = driver.findElement(By.cssSelector("a[data-testid='nav-bar-get-account']")); 
        individualSolution.click();
    }

    public void clickGetStarted () {
        WebElement element = driver.findElement(By.xpath("//button[@data-id='open-account-button']"));
        element.click();
    }

    public boolean isGetStartedPageDisplayed () {
        return driver.findElement(By.className("ReactModal__Content")).isDisplayed();
    }
}
