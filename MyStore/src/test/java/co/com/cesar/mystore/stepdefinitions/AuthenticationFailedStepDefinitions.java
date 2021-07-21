package co.com.cesar.mystore.stepdefinitions;

import co.com.cesar.mystore.models.LoginData;
import co.com.cesar.mystore.questions.GetText;
import co.com.cesar.mystore.tasks.Go;
import co.com.cesar.mystore.tasks.Sign;
import cucumber.api.java.en.*;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.cesar.mystore.utils.Constants.*;
import static co.com.cesar.mystore.userinterfaces.HomePage.*;

public class AuthenticationFailedStepDefinitions {

    @Given("^go to the My Store homepage$")
    public void goToTheMyStoreHomepage() {
        theActorCalled(ACTOR_NAME).wasAbleTo(
                Go.toMyStore()
        );
    }

    @When("^login with invalid credentials$")
    public void loginWithInvalidCredentials(List<LoginData> data) {
        theActorCalled(ACTOR_NAME).attemptsTo(
                Sign.inMyStore(data)
        );
    }

    @Then("^the system does not allow entry$")
    public void theSystemDoesNotAllowEntry(List<LoginData> data) {
        theActorInTheSpotlight().should(
                seeThat(ERROR_LOGIN_LABEL, GetText.ofTarget(ERROR_LOGIN), containsString(data.get(0).getMessageError()))
        );
    }


}
