package co.com.cesar.mystore.runners;


import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/authentication_failed.feature",
        glue = {"co.com.cesar.mystore.stepdefinitions", "co.com.cesar.mystore.utils"},
        snippets = SnippetType.CAMELCASE
)



public class AuthenticationFailed {
}
