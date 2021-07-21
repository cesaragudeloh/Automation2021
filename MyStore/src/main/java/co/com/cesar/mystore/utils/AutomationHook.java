package co.com.cesar.mystore.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationHook {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }
}
