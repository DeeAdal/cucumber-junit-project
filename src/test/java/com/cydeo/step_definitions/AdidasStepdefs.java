package com.cydeo.step_definitions;

import com.cydeo.pages.AdidasPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdidasStepdefs {

    AdidasPage adidasPage = new AdidasPage();
    @Given("User go to demo online shop")
    public void userGoToDemoOnlineShop() {
        Driver.getDriver().get("https://www.demoblaze.com/index.html");
    }

    @When("User navigation through product categories: Phones, Laptops and Monitors")
    public void userNavigationThroughProductCategoriesPhonesLaptopsAndMonitors() {
        adidasPage.laptopsBtn.click();
    }


    @And("Navigate to Laptop → Sony vaio i5 and click on Add to cart. Accept pop up confirmation.")
    public void navigateToLaptopSonyVaioIAndClickOnAddToCartAcceptPopUpConfirmation() {
    }

    @And("Navigate to Laptop → Dell i7 8gb and click on Add to cart. Accept pop up confirmation.")
    public void navigateToLaptopDellIGbAndClickOnAddToCartAcceptPopUpConfirmation() {
    }

    @And("Navigate to Cart → Delete Dell i7 8gb from cart.")
    public void navigateToCartDeleteDellIGbFromCart() {
    }

    @And("Click on Place order.")
    public void clickOnPlaceOrder() {
    }

    @And("Fill in all web form fields.")
    public void fillInAllWebFormFields() {
    }

    @And("Click on Purchase")
    public void clickOnPurchase() {
    }

    @When("Capture and log purchase Id and Amount.")
    public void captureAndLogPurchaseIdAndAmount() {
    }

    @Then("Assert purchase amount equals expected.")
    public void assertPurchaseAmountEqualsExpected() {
    }

    @And("Click on Ok")
    public void clickOnOk() {
    }
}
