package co.com.cesar.mystore.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class Purchase implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static Purchase aProduct() {
        return Instrumented.instanceOf(Purchase.class).withProperties();
    }
}
