package com.techbee.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AspirationIndividualSolutionsPage {
    private WebDriver driver;

    public AspirationIndividualSolutionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductsPageDisplayed () {
        WebElement productList = driver.findElement(By.xpath("(//ul[@class='Flex-sc-1kj10zc-0 List-sc-2nbxm-0 bmswRS dqpPSu'])[1]"));
        return productList.isDisplayed();
    }

    public boolean isTwoCardsDisplayed () {
        WebElement aspitation = driver.findElement(By.xpath("//span[text()='Aspiration']"));
        WebElement aspitationPlus = driver.findElement(By.xpath("//span[text()='Aspiration Plus']"));
        return aspitation.isDisplayed() && aspitationPlus.isDisplayed();
    }

    

    public String getYearlyCostAspirationPlus () {
        String priceYearly = driver.findElement(By.cssSelector("[data-testid='spend-and-save-yearly-price']")).getText().split(" ")[0].replace("/mo", "").replace("$", "");
        return priceYearly;
    }

    public String getMonthlyCostAspirationPlus () {
        String priceMonthly = driver.findElement(By.cssSelector("[data-testid='spend-and-save-monthly-price']")).getText().replace("/mo", "").replace("$", "");
        return priceMonthly;
    }

    public boolean areCheckboxesNotVisibleOnAspiration () {
        int count = 0;
        List<WebElement> cellAspiration = driver.findElements(By.cssSelector("div.Flex-sc-1kj10zc-0.ckGXCh"));
        for (WebElement cell : cellAspiration) {
            List<WebElement> childElements = cell.findElements(By.xpath("./*"));
            if (childElements.isEmpty()) {
                count ++;
            }
        }
        return count == 3;
    }

    public boolean areCheckboxesCheckedOnAspirationPlus () {
        int count = 0;
        List<WebElement> cellAspirationPlus = driver.findElements(By.cssSelector("div.Flex-sc-1kj10zc-0.jceVYu"));
        for (WebElement cell : cellAspirationPlus) {
            List<WebElement> childElements = cell.findElements(By.xpath("./*"));
            if (childElements.isEmpty()) {
                count ++;
            }
        }
        return count == 0;
    }
}
