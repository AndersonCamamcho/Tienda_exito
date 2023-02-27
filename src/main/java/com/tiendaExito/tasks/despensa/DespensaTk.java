package com.tiendaExito.tasks.despensa;

import com.tiendaExito.interactions.despensa.LlenarFormularioPedido;
import com.tiendaExito.interactions.despensa.SelectorRandom;
import com.tiendaExito.interactions.despensa.TraerElementoRandom;
import com.tiendaExito.userInterfaces.despensa.DespensaUi;
import com.tiendaExito.userInterfaces.despensa.Mercado;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class DespensaTk implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        // Pasos para llegar a la seccion de despensa
                Scroll.to(Mercado.MERCADO),
                Click.on(Mercado.MERCADO),
                MoveMouse.to(DespensaUi.DESPENSA),
                Click.on(DespensaUi.DESPENSA));
        // Enargado de llenar el modal que aparece en cuanto se ingresa a la seccion de despensa
        actor.attemptsTo(LlenarFormularioPedido.llenarCampos());
        // Se encarga de traer de la pagina 5 productos aleatorios
        actor.attemptsTo(TraerElementoRandom.traerElementoRandom());


    }

    public static DespensaTk despensa() {
        return Tasks.instrumented(DespensaTk.class);
    }
}
