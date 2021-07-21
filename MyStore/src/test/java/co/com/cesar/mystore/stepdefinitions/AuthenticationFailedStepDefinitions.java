package co.com.cesar.mystore.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationFailedStepDefinitions {

    @Given("^go to the My Store homepage$")
    public void goToTheMyStoreHomepage() {
        System.out.println("GIVEN");
    }

    @When("^login with invalid credentials$")
    public void loginWithInvalidCredentials() {
        System.out.println("WHEN");
    }

    @Then("^the system does not allow entry$")
    public void theSystemDoesNotAllowEntry() {
        System.out.println("THEN");
    }


}
