package co.com.cesar.mystore.tasks;

import co.com.cesar.mystore.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.cesar.mystore.userinterfaces.HomePage.*;

public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class),
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN)
        );
    }

    public static Login atTheStore(String username, String password) {
        return Instrumented.instanceOf(Login.class).withProperties(username, password);
    }
}
