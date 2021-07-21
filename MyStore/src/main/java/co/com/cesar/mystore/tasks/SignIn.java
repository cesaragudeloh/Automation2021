package co.com.cesar.mystore.tasks;

import co.com.cesar.mystore.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.cesar.mystore.userinterfaces.HomePage.*;

public class SignIn implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN),
                Click.on(SUBMIT_BUTTON)
        );
    }

    public static SignIn inMyStore() {
        return Instrumented.instanceOf(SignIn.class).withProperties();
    }
}
