package tests;

import appmanager.HelperBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Testlab_Stepdef {

    HelperBase helperBase = new HelperBase();

    @Autowired
    pages.TestLab_page TestLab_page;
    @Given("^the user launchss the application$")
    public void the_user_launchss_the_application() throws Throwable {
        helperBase.launchApplication();
    }

    @When("^user enters proper credentials$")
    public void user_enters_proper_credentials() throws Throwable {
        TestLab_page.userlogin();
    }

    @Then("^user will add a product to cart$")
    public void user_will_add_a_product_to_cart() throws Throwable {
        TestLab_page.useraddtocart();
    }

    @Then("^user should purchase a product$")
    public void user_should_purchase_a_product() throws Throwable {
        TestLab_page.userorderpro();
    }
}
