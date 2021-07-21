package co.com.cesar.mystore.tasks;

import co.com.cesar.mystore.models.LoginData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.cesar.mystore.userinterfaces.HomePage.*;

public class Sign implements Task {

    private LoginData data;

    public Sign(LoginData data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN),
                Enter.theValue(data.getEmailAddress()).into(EMAIL),
                Enter.theValue(data.getPassword()).into(PASSWORD),
                Click.on(SUBMIT_BUTTON)
        );
    }

    public static Sign inMyStore(List<LoginData> data) {
        return Instrumented.instanceOf(Sign.class).withProperties(data.get(0));
    }
}
