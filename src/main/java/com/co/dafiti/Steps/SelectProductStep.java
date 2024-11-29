package com.co.dafiti.Steps;


import com.co.dafiti.ObjectPage.ProductObjectPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.dafiti.Driver.SeleniumWebDriver.driver;

public class SelectProductStep {

    @Step
    public void SelectProduct() {
        waitForElement(ProductObjectPage.getBtnAcceptCookies(), Duration.ofSeconds(10));
        selectClick(ProductObjectPage.getBtnAcceptCookies());
        waitForElement(ProductObjectPage.getBtnProduct(), Duration.ofSeconds(10));
        selectClick(ProductObjectPage.getBtnProduct());
        waitForElement(ProductObjectPage.getDropdownSizeOption(), Duration.ofSeconds(10));
        selectClick(ProductObjectPage.getDropdownSizeOption());
        waitForElement(ProductObjectPage.getBtnSize(), Duration.ofSeconds(10));
        selectClick(ProductObjectPage.getBtnSize());

    }

    public void selectClick(By element) {
        driver.findElement(element).click();
    }

    public void waitForElement(By element, Duration waitingTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}