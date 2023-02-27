package com.tiendaExito.userInterfaces.despensa;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Mercado {
    public static final Target MERCADO = Target.the( "Subseccion de la seccion principal")
            .located(By.xpath("//img[@alt='Mercado']"));
}
