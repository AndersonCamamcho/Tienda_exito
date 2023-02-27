package com.tiendaExito.interactions.despensa;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.util.List;

public class TraerElementoRandom implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> facades = SelectorRandom.selectorAleatorio(actor);

        for (WebElementFacade facade: facades){
            actor.attemptsTo(
                    MoveMouse.to(facade),
                    Click.on(facade));

            try {
                Thread.sleep(5500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

public static TraerElementoRandom traerElementoRandom (){return Tasks.instrumented(TraerElementoRandom.class);
}
}

