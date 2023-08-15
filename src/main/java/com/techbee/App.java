package com.techbee;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.aspiration.com");
        // WebElement individualSolution = driver.findElement(By.cssSelector("a[data-testid='nav-bar-get-account']")); 
        // individualSolution.click();

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.Text-sc-1yqq6iv-0.jahYLK.atom-text")));
        driver.findElement(By.xpath("//button[@data-id='open-account-button']")).click();


        // System.out.println(aspitationPlus.getText());
        // System.out.println(aspitationPlus.isDisplayed());

        System.out.println( "Hello World!" );
    }
}
