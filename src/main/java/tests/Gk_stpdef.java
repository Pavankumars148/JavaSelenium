package tests;

import appmanager.HelperBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Gk_stpdef  {
    HelperBase helperBase = new HelperBase();

    @Autowired
    pages.Gkpage Gkpage1;
    @Given("^user launch the GreenKart App$")
    public void user_launch_the_GreenKart_App() throws Throwable {
        helperBase.launchApplication();
    }

    @When("^user click on fruits and vegetables$")
    public void user_click_on_fruits_and_vegetables() throws Throwable {
        Gkpage1.userclickfv();
    }

    @When("^user will click on cart$")
    public void user_will_click_on_cart() throws Throwable {
        Gkpage1.userclickoncart();
    }

    @Then("^conformation message should be displayed$")
    public void conformation_message_should_be_displayed() throws Throwable {
        Gkpage1.userclickonplace();
    }

}
