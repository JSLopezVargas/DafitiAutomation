package com.co.dafiti.stepDefinitions;

import com.co.dafiti.Driver.SeleniumWebDriver;
import com.co.dafiti.Steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class MakeAPurchaseStepDefinitions {

    @Steps
    SearchProductStep searchProduct = new SearchProductStep();

    @Steps
    SelectProductStep selectProduct = new SelectProductStep();

    @Steps
    AddToCartStep addToCart = new AddToCartStep();

    @Steps
    LogInDafitiStep logInDafiti = new LogInDafitiStep();

    @Steps
    ShippingSelectionStep shippingSelection = new ShippingSelectionStep();

    @Steps
    BillingValidationStep billingValidation = new BillingValidationStep();


    @Given("Dafiti was opened in the main page")
    public void dafitiWasOpenedInTheMainPage() {
        SeleniumWebDriver.chromeDriver("https://dafiti.com.co/");
    }

    @And("product is searched")
    public void productIsSearched() throws InterruptedException, IOException {
        String excelFilePath = "parameters/InputData.xlsx";
        searchProduct.SearchProduct(excelFilePath);
    }

    @And("the product is added to cart")
    public void aProductIsAddedToCart() {
        selectProduct.SelectProduct();
        addToCart.AddToCart();
    }

    @When("log in Dafiti")
    public void LogInDafiti() throws IOException {
        String excelFilePath = "parameters/InputData.xlsx";
        logInDafiti.logInDafiti(excelFilePath);
    }

    @Then("see the purchase summary")
    public void seeThePurchaseSummary() throws InterruptedException {
        shippingSelection.shippingSelection();
        billingValidation.billingValidation();
    }
}