package com.co.dafiti.ObjectPage;

import org.openqa.selenium.By;

public class PurchaseSummaryObjectPage {

    private static By lblProductBrand = By.xpath("//div[text()='Nike']");

    private static By lblGreeting = By.xpath("//div[text()='¡Hola Jeisson!']");

    private static By lblShipping = By.xpath("//div[text()='Envío estándar']");

    public static By getLblProductBrand() {
        return lblProductBrand;
    }

    public static By getLblGreeting() {
        return lblGreeting;
    }

    public static By getLblShipping() {
        return lblShipping;
    }
}