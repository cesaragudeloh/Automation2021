package co.com.cesar.mystore.tasks;

import co.com.cesar.mystore.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Purchase implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    public static Purchase aProduct() {
        return Instrumented.instanceOf(Purchase.class).withProperties();
    }
}
