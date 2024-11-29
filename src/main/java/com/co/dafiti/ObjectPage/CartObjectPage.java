package com.co.dafiti.ObjectPage;

import org.openqa.selenium.By;

public class CartObjectPage {

    private static final By btnGoToPay = By.xpath("//a[contains(text(), 'Proceder al pago')]\n");

    private static final By lblPurchaseCart = By.xpath("//p[contains(@class, 'mtl') and contains(@class, 'cartTitle') and contains(@class, 'productDafiti') and text()='Carrito de compras - Productos Dafiti']\n");


    public static By getBtnGoToPay() {
        return btnGoToPay;
    }

    public static By getLblPurchaseCart() {
        return lblPurchaseCart;
    }

}