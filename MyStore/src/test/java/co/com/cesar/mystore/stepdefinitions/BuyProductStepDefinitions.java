package co.com.cesar.mystore.stepdefinitions;

import co.com.cesar.mystore.tasks.Purchase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductStepDefinitions {

    @When("^(.*) make a purchase online$")
    public void cesarMakeAPurchaseOnline(String actor) {
        theActorCalled(actor).attemptsTo(
                Purchase.aProduct()
        );
    }

    @Then("^the order is created correctly$")
    public void theOrderIsCreatedCorrectly() {
        theActorInTheSpotlight().attemptsTo(

        );
    }

}
