package com.co.dafiti.ObjectPage;

import org.openqa.selenium.By;

public class LogInObjectPage {

    private static By txtEmail = By.xpath("//input[@id='username']");
    private static By txtEmailAlternative = By.xpath("//input[@id='inputId__Yl0TD_email']");

    private static By txtPassword = By.xpath("//input[@id='password']");
    private static By txtPasswordAlternative = By.xpath("//input[@id='inputId__Yl0TD_password']");

    private static By btnLogIn = By.xpath("//button[@type='submit' and contains(@class, 'sel-login-submit-button')]");
    private static By btnLogInAlternative = By.xpath("//button[contains(@class, 'styles_buttonPrimary__jRIf8')]");

    public static By getTxtEmailAlternative() {
        return txtEmailAlternative;
    }

    public static By getTxtPasswordAlternative() {
        return txtPasswordAlternative;
    }

    public static By getBtnLogInAlternative() {
        return btnLogInAlternative;
    }

    public static By getTxtEmail() {
        return txtEmail;
    }

    public static By getTxtPassword() {
        return txtPassword;
    }

    public static By getBtnLogIn() {
        return btnLogIn;
    }
}