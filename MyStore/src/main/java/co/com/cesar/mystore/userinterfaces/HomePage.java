package co.com.cesar.mystore.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target USERNAME = Target.the("Username").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target LOGIN = Target.the("Login").located(By.id("login-button"));
    public static final Target ERROR_LOGIN = Target.the("Error Login").locatedBy("//h3[@data-test='error']");


}
