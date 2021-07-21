package co.com.cesar.mystore.stepdefinitions;

import co.com.cesar.mystore.questions.GetText;
import co.com.cesar.mystore.tasks.Go;
import co.com.cesar.mystore.tasks.SignIn;
import cucumber.api.java.en.*;

import static org.hamcrest.Matchers.containsString;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.cesar.mystore.utils.Constants.*;
import static co.com.cesar.mystore.userinterfaces.HomePage.*;

public class AuthenticationFailedStepDefinitions {

    @Given("^go to the My Store homepage$")
    public void goToTheMyStoreHomepage() {
        theActorCalled("").wasAbleTo(
                Go.toMyStore()
        );
    }

    @When("^login with invalid credentials$")
    public void loginWithInvalidCredentials() {
        theActorCalled("").attemptsTo(
                SignIn.inMyStore()
        );
    }

    @Then("^the system does not allow entry$")
    public void theSystemDoesNotAllowEntry() {
        theActorInTheSpotlight().should(
                seeThat("Error login", GetText.ofTarget(ERROR_LOGIN), containsString(ERROR_LOGIN_LABEL))
        );
    }


}
