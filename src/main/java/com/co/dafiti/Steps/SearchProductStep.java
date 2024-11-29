package com.co.dafiti.Steps;

import com.co.dafiti.ObjectPage.MainObjectPage;
import com.co.dafiti.Utils.ExcelData;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.co.dafiti.Driver.SeleniumWebDriver.driver;

public class SearchProductStep {

    @Step

    public void SearchProduct(String ExcelPath) throws InterruptedException, IOException {

        ArrayList<Map<String, String>> excelData = ExcelData.readExcelData(ExcelPath, "Parameters");

        String product = excelData.get(0).get("Product");

        waitForElement(MainObjectPage.getTxtSearchBar(), Duration.ofSeconds(10));
        selectClick(MainObjectPage.getTxtSearchBar());
        fillField(MainObjectPage.getTxtSearchBar(), product);
        Thread.sleep(2000);
        pressEnter(MainObjectPage.getTxtSearchBar());

        if (isElementPresent(MainObjectPage.getLblSuggestions(), Duration.ofSeconds(10))) {

            pressEnter(MainObjectPage.getTxtSearchBar());

        }

    }

    public void selectClick(By element) {
        driver.findElement(element).click();
    }

    public void fillField(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void pressEnter(By element) {
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public void waitForElement(By element, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, duration);
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