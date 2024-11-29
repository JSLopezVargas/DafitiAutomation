package com.co.dafiti.Steps;

import com.co.dafiti.ObjectPage.ShippingPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.dafiti.Driver.SeleniumWebDriver.driver;

public class ShippingSelectionStep {

    @Step

    public void shippingSelection() throws InterruptedException {

        Thread.sleep(3000);
        waitForElement(ShippingPageObject.getBtnUnderstood(), Duration.ofSeconds(10));
        selectClick(ShippingPageObject.getBtnUnderstood());
        scrollDown(driver);
        waitForElement(ShippingPageObject.getBtnAddressContinue(), Duration.ofSeconds(10));
        selectClick(ShippingPageObject.getBtnAddressContinue());
        waitForElement(ShippingPageObject.getBtnGoToPayment(), Duration.ofSeconds(10));
        selectClick(ShippingPageObject.getBtnGoToPayment());
        waitForElement(ShippingPageObject.getBtnPaymentMethod(), Duration.ofSeconds(10));
        selectClick(ShippingPageObject.getBtnPaymentMethod());
    }

    public void selectClick(By element) {
        driver.findElement(element).click();
    }

    public void waitForElement(By element, Duration waitingTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
    }
}
