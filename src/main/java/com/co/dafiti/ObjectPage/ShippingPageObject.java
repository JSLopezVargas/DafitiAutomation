package com.co.dafiti.ObjectPage;

import org.openqa.selenium.By;

public class ShippingPageObject {


    private static By btnAddressContinue = By.xpath("//button[contains(@class, 'sel-nextstep-button')]");

    private static By btnGoToPayment = By.xpath("//button[contains(@class, 'sel-nextstep-button')]");

    private static By btnPaymentMethod = By.id("AddiPayment");

    private static By btnUnderstood = By.xpath("//div[contains(@class, 'acc-button-desktop') and text()='Entendido']");

    public static By getBtnGoToPayment() {
        return btnGoToPayment;
    }

    public static By getBtnAddressContinue() {
        return btnAddressContinue;
    }

    public static By getBtnPaymentMethod() {
        return btnPaymentMethod;
    }

    public static By getBtnUnderstood() {
        return btnUnderstood;
    }
}