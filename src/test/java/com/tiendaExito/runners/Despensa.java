package com.tiendaExito.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/tiendaExito/stepdefinitions",
        features = "src/test/resources/features/despensa.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false )
public class Despensa {
}
