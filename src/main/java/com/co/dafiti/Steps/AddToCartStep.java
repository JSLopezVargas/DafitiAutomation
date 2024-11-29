package com.co.dafiti.Steps;

import com.co.dafiti.ObjectPage.ProductObjectPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.dafiti.Driver.SeleniumWebDriver.driver;
import static com.co.dafiti.ObjectPage.ProductObjectPage.getLblCartEmpty;


public class AddToCartStep {

    @Step

    public void AddToCart() {

        selectClick(ProductObjectPage.getBtnAddToCart());
        waitForElement(ProductObjectPage.getBtnCart(), Duration.ofSeconds(10));
        selectClick(ProductObjectPage.getBtnCart());

        if (isElementPresent(getLblCartEmpty(), Duration.ofSeconds(10))) {
            driver.navigate().refresh();
        }
    }

    public void selectClick(By element) {
        driver.findElement(element).click();
    }

    public void waitForElement(By element, Duration waitingTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public boolean isElementPresent(By element, Duration waitingTimeSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}