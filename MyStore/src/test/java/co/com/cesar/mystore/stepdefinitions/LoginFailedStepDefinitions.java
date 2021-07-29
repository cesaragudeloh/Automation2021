package co.com.cesar.mystore.stepdefinitions;

import co.com.cesar.mystore.models.User;
import co.com.cesar.mystore.tasks.TryLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.cesar.mystore.userinterfaces.HomePage.*;
import static co.com.cesar.mystore.utils.Constants.ACTOR;

public class LoginFailedStepDefinitions {


    @When("^the user enters the store$")
    public void theUserEntersTheStore(List<User> user) {
        System.out.println("The user is: "+user);
        theActorCalled(ACTOR).wasAbleTo(
                TryLogin.atTheStore(user)
        );
    }


    @Then("^the system does not allow entry and displays the message (.+)$")
    public void theSystemDoesNotAllowEntryAndDisplaysTheMessage(String message){
    theActorInTheSpotlight().attemptsTo(
            Ensure.that(ERROR_LOGIN).text().contains(message)
    );
    }

}
