package co.com.cesar.mystore.stepdefinitions;

import co.com.cesar.mystore.models.User;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;


public class CommonStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @DataTableType
    public User userEntry(Map<String, String> entry){
        return new User(entry.get("username"), entry.get("password"));
    }

}
