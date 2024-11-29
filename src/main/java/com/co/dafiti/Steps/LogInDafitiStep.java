package com.co.dafiti.Steps;

import com.co.dafiti.ObjectPage.CartObjectPage;
import com.co.dafiti.ObjectPage.LogInObjectPage;
import com.co.dafiti.Utils.ExcelData;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.co.dafiti.Driver.SeleniumWebDriver.driver;

public class LogInDafitiStep {

    @Step

    public void logInDafiti(String ExcelPath) throws IOException {


        ArrayList<Map<String, String>> excelData = ExcelData.readExcelData(ExcelPath, "Parameters");

        String username = excelData.get(0).get("Username");
        String password = excelData.get(0).get("Password");

        waitForElement(CartObjectPage.getBtnGoToPay(), Duration.ofSeconds(10));
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
        jsExecutor1.executeScript("arguments[0].click();", driver.findElement(CartObjectPage.getBtnGoToPay()));

        if (isElementPresent(LogInObjectPage.getTxtEmail(), Duration.ofSeconds(10))) {

            waitForElement(LogInObjectPage.getTxtEmail(), Duration.ofSeconds(10));
            fillField(LogInObjectPage.getTxtEmail(), username);

            waitForElement(LogInObjectPage.getTxtPassword(), Duration.ofSeconds(10));
            fillField(LogInObjectPage.getTxtPassword(), password);

            pressEnter(LogInObjectPage.getTxtPassword());

        } else {

            waitForElement(LogInObjectPage.getTxtEmailAlternative(), Duration.ofSeconds(10));
            fillField(LogInObjectPage.getTxtEmailAlternative(), username);

            waitForElement(LogInObjectPage.getTxtPasswordAlternative(), Duration.ofSeconds(10));
            fillField(LogInObjectPage.getTxtPasswordAlternative(), password);

            pressEnter(LogInObjectPage.getTxtPasswordAlternative());
        }
    }

    public static void waitForElement(By element, Duration waitingTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static boolean isElementPresent(By element, Duration waitingTimeSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, waitingTimeSeconds);
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void pressEnter(By element) {
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public static void fillField(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

}