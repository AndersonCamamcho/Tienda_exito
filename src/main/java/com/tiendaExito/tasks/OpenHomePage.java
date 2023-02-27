package com.tiendaExito.tasks;

import com.tiendaExito.userInterfaces.HomePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenHomePage implements Task {


private HomePage despensaUserInterfaces;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.getWebdriverManager().getWebdriver().manage().deleteAllCookies();
        actor.attemptsTo(
                Open.browserOn(despensaUserInterfaces)

        );

    }
    public static OpenHomePage despensa (){
        return Tasks.instrumented(OpenHomePage.class);
    }
}
