package com.co.dafiti.ObjectPage;

import org.openqa.selenium.By;

public class ProductObjectPage {

    private static By btnProduct = By.xpath("//div[@class='card-description']//h3[@class='itm-title description']");

    private static By btnAcceptCookies = By.xpath("//div[@id='btn-accept-cookies']\n");

    private static By dropdownSizeOption = By.xpath("//span[contains(@class, 'rfloat') and contains(@class, 'icon-arrow-down')]");

    private static By btnSize = By.xpath("//li[@class='prd-option-item opt-item-5']");

    private static By btnAddToCart = By.id("AddToCart");

    private static By btnCart = By.id("cart-head");

    private static By lblCartEmpty = By.xpath("//p[contains(@class, 'cartTitleEmpty') and contains(text(), 'Tu carro está vacío...')]");


    public static By getBtnProduct() {
        return btnProduct;
    }

    public static By getBtnSize() {
        return btnSize;
    }

    public static By getDropdownSizeOption() {
        return dropdownSizeOption;
    }

    public static By getBtnAddToCart() {
        return btnAddToCart;
    }

    public static By getBtnCart() {
        return btnCart;
    }

    public static By getBtnAcceptCookies() {
        return btnAcceptCookies;
    }

    public static By getLblCartEmpty() {
        return lblCartEmpty;
    }
}