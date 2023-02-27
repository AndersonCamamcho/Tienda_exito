package com.tiendaExito.interactions.despensa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tiendaExito.userInterfaces.despensa.DespensaUi;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;


public class SelectorRandom {
    WaitUntilTargetIsReady actor;

    {
        actor = WaitUntil.the(DespensaUi.BTN_AGREGAR, WebElementStateMatchers.isVisible());
    }

    public static List<WebElementFacade> selectorAleatorio(Actor actor) {
        List<WebElementFacade> facadees = new ArrayList<>();
        ArrayList<Integer> numerosSeleccionados = new ArrayList<>();
        Random random = new Random();
        List<WebElementFacade> elementoRandom = DespensaUi.BTN_AGREGAR.resolveAllFor(actor);
        int size = elementoRandom.size();
        boolean flag = true;
        while(flag){
            int index = random.nextInt(size);
            if (!numerosSeleccionados.contains(index)){
                numerosSeleccionados.add(index);
                facadees.add(elementoRandom.get(index));
            }
            if(facadees.size() == 5){
                flag = false;
            }
        }

        return facadees;
    }


}