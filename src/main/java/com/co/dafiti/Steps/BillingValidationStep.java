package com.co.dafiti.Steps;

import com.co.dafiti.ObjectPage.PurchaseSummaryObjectPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.dafiti.Driver.SeleniumWebDriver.driver;

public class BillingValidationStep {

    @Step

    public void billingValidation() {

        waitForElement(PurchaseSummaryObjectPage.getLblGreeting(), Duration.ofSeconds(10));
        WebElement tableElementLogIn = driver.findElement(PurchaseSummaryObjectPage.getLblGreeting());
        String tableTextLogIn = tableElementLogIn.getText();
        Assert.assertEquals("¡Hola Jeisson!", tableTextLogIn);

        waitForElement(PurchaseSummaryObjectPage.getLblProductBrand(), Duration.ofSeconds(10));
        WebElement tableElementBrand = driver.findElement(PurchaseSummaryObjectPage.getLblProductBrand());
        String tableTextBrand = tableElementBrand.getText();
        Assert.assertEquals("Nike", tableTextBrand);

        waitForElement(PurchaseSummaryObjectPage.getLblShipping(), Duration.ofSeconds(10));
        WebElement tableElementShipping = driver.findElement(PurchaseSummaryObjectPage.getLblShipping());
        String tableTextShipping = tableElementShipping.getText();
        Assert.assertEquals("Envío estándar", tableTextShipping);

        driver.quit();
    }

    public void waitForElement(By element, Duration waitingTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}