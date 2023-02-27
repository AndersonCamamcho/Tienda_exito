package com.tiendaExito.stepdefinitions;


import com.tiendaExito.tasks.despensa.DespensaTk;
import com.tiendaExito.tasks.OpenHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DespensaStepDefinition {

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());}


    @Given("^Ingreso a la tienda exito$")
    public void ingresoALaTiendaExito() {

        theActorCalled("aspirante").wasAbleTo(OpenHomePage.despensa());
    }

    @When("^Seleciono la categoria$")
    public void selecionoLaCategoria() {
        theActorInTheSpotlight().attemptsTo(DespensaTk.despensa());

    }

    @Then("^Se agrega al carrito de compras$")
    public void seAgregaAlCarritoDeCompras() {

    }
}
