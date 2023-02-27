package com.tiendaExito.userInterfaces.despensa;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioPedidoUi {

    public static final Target SLC_CIUDAD = Target.the( "Campo para escoger entre las ciudades disponibles")
            .located(By.xpath("(//div[@class='css-yiuvdt'])[1]"));

    public static final Target MEDELLIN = Target.the( "Campo en el que se selecciona la ciudad, en este caso, Medellin")
            .located(By.xpath("(//*[text()='Barranquilla'])"));

    public static final Target SLC_ALMACEN = Target.the( "Campo para escoger entre los almacenes disponibles")
            .located(By.xpath("(//div[@class='css-yiuvdt'])[2]"));

    public static final Target EXITO_BARRANQUILLA = Target.the( "Campo en el que se selecciona el almacen, en este caso, Exito Barranquilla")
                        .located(By.xpath("(//*[text()='Exito Barranquilla'])"));

    public static final Target BTN_CONFIRMAR = Target.the( "Con este boton se confirma el pedido")
            .located(By.xpath("//button[text()='Confirmar']"));
}

