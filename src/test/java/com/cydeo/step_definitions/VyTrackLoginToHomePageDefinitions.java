package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VyTrackLoginToHomePageDefinitions  {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();

    @Given("Link to VyTrack page")
    public void link_to_vy_track_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
    }
    @When("user enters  {string}")
    public void user_enters(String userName) {
        vyTrackLoginPage.loginUserName.sendKeys(userName);
    }
    @When("user enters UserUser123")
    public void user_enters_user_user123() {
        vyTrackLoginPage.inputPassword.sendKeys("UserUser123");
    }
    @When("user clicks login btn")
    public void user_clicks_login_btn() throws InterruptedException {
        vyTrackLoginPage.logInBtn.click();
        Thread.sleep(4000);
    }

    @Then("user sees page title as Dashboard")
    public void user_sees_page_title_as_dashboard() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);
    }

}
