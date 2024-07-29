package tests;

import appmanager.HelperBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Amazon_stepdefn {
    HelperBase helperBase = new HelperBase();
    @Autowired
    pages.Amazon_page awa1;
    @Given("^launch Amazon$")
    public void launch_Amazon() throws Throwable {
helperBase.launchApplication();
    }

    @When("^pen is in store$")
    public void pen_is_in_store() throws Throwable {
    awa1.search();
    }

    @Then("^add to cart$")
    public void add_to_cart() throws Throwable {
        awa1.cart();
    }
    @Then("^open the cart$")
    public void open_the_cart() throws Throwable {
        awa1.cart1();
    }

}
