package com.tiendaExito.interactions.despensa;


import com.tiendaExito.userInterfaces.despensa.FormularioPedidoUi;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class LlenarFormularioPedido implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

                actor.attemptsTo(
                WaitUntil.the(FormularioPedidoUi.SLC_CIUDAD, WebElementStateMatchers.isVisible()),
                Click.on(FormularioPedidoUi.SLC_CIUDAD),
                Click.on(FormularioPedidoUi.MEDELLIN),
                Click.on(FormularioPedidoUi.SLC_ALMACEN),
                Click.on(FormularioPedidoUi.EXITO_BARRANQUILLA),
                Click.on(FormularioPedidoUi.BTN_CONFIRMAR)

        );

    }
    public static LlenarFormularioPedido llenarCampos (){return Tasks.instrumented(LlenarFormularioPedido.class);
    }
}
