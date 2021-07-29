package co.com.cesar.mystore.stepdefinitions;

import co.com.cesar.mystore.tasks.Login;
import co.com.cesar.mystore.tasks.Purchase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.cesar.mystore.utils.Constants.ACTOR;

public class BuyProductStepDefinitions {


    @Given("^the user enters the store with username (.*) and password (.*)$")
    public void theUserEntersTheStore(String username, String password) {
        theActorCalled(ACTOR).wasAbleTo(
                Login.with().username(username).andPassword(password)
        );
    }


    @When("^he make a purchase online$")
    public void heMakeAPurchaseOnline() {
        theActorInTheSpotlight().attemptsTo(
                Purchase.aProduct()
        );
    }

    @Then("^the order is created correctly$")
    public void theOrderIsCreatedCorrectly() {
        theActorInTheSpotlight().attemptsTo(

        );
    }

}
