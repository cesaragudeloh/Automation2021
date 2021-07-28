package co.com.cesar.mystore.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_product.feature",
        glue = {"co.com.cesar.mystore.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BuyProduct {
}
