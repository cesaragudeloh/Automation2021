package co.com.cesar.mystore.tasks;

import co.com.cesar.mystore.models.User;
import co.com.cesar.mystore.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.cesar.mystore.userinterfaces.HomePage.*;

public class TryLogin implements Task {

    private User user;

    public TryLogin(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class),
                Enter.theValue(user.getUsername()).into(USERNAME),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                Click.on(LOGIN)
        );
    }

    public static Performable atTheStore(List<User> users){
        User user = users.get(0);
        return Instrumented.instanceOf(TryLogin.class).withProperties(user);
    }

}
