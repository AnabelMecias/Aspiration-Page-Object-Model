package com.techbee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.techbee.configuration.WebDriverSingleton;
import com.techbee.pages.AspirationHomePage;
import com.techbee.pages.AspirationIndividualSolutionsPage;

public class AspirationTestSuite {
    private WebDriver driver;
    private AspirationHomePage homePage;
    private AspirationIndividualSolutionsPage solutionsPage;

    @Before
    public void setUp () {
        driver = WebDriverSingleton.getDriver();
        homePage = new AspirationHomePage(driver);
        solutionsPage =  new AspirationIndividualSolutionsPage(driver);
    }

    @Test
    public void testViewProductsIndividualSolutions () {
        homePage.clickIndividualSolutions();
        assertTrue(solutionsPage.isProductsPageDisplayed());
    }

    @Test
    public void testVerifyCardProducts () {
        homePage.clickIndividualSolutions();
        assertTrue(solutionsPage.isTwoCardsDisplayed());
    }

    @Test
    public void testGetStartedRedirectToSignUpPage () {
        homePage.clickGetStarted();
        assertTrue(homePage.isGetStartedPageDisplayed());
    }

    @Test
    public void testYearlyCostForAspirationPlus () {
        homePage.clickIndividualSolutions();
        assertEquals("5.99", solutionsPage.getYearlyCostAspirationPlus());
    }

    @Test
    public void testMonthlyCostForAspirationPlus () {
        homePage.clickIndividualSolutions();
        assertEquals("7.99", solutionsPage.getMonthlyCostAspirationPlus());
    }

    @Test
    public void testCheckboxesOnCards () {
        homePage.clickIndividualSolutions();
        assertTrue(solutionsPage.areCheckboxesNotVisibleOnAspiration());
        assertTrue(solutionsPage.areCheckboxesCheckedOnAspirationPlus());
    }

    @After
    public void closeUp() {
        WebDriverSingleton.closeDriver();
    }
}
