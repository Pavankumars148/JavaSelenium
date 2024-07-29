package tests;

import appmanager.HelperBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Nopcommerce_stepdefn {
    HelperBase hb = new HelperBase();

    @Autowired
    pages.Nopcommerce_page1 Nopcommerce_page;

    @Given("^user login to the application:\"([^\"]*)\"$")
    public void auser_login_to_the_application(String arg1) throws Throwable {
        hb.checkLogInUser(arg1);
    }

    @Then("^user validate all the components$")
    public void user_validate_all_the_components() throws Throwable {
        Nopcommerce_page.validateAllTheComponentsInHomePage();
    }



}
