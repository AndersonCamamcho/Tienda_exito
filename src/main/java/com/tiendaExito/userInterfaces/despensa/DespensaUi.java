package com.tiendaExito.userInterfaces.despensa;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DespensaUi {
    public static final Target DESPENSA = Target.the( "Subseccion de la seccion de la Mercado")
            .located(By.xpath("//img[@alt='Despensa']"));
    public static final Target BTN_AGREGAR = Target.the( "Boton para gregar producto al carrito")
            .located(By.xpath("//span[contains(text(),'Agregar')]"));
}
