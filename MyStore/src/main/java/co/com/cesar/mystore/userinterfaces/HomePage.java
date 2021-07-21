package co.com.cesar.mystore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target SIGN_IN = Target.the("Sign In option").locatedBy("//a[contains(text(),'Sign in')]");
    public static final Target EMAIL = Target.the("Email option").located(By.id("email"));
    public static final Target PASSWORD = Target.the("Password option").located(By.id("passwd"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit option").located(By.id("SubmitLogin"));
    public static final Target ERROR_LOGIN = Target.the("Label Error Loguin").locatedBy("//div/ol/li[contains(text(),'An email address required')]");

}
