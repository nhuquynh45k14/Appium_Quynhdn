package appium.task;

import appium.page.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Permission implements Performable {
    private final Boolean status;

    public Permission(Boolean status) {
        this.status = status;
    }

    public static Performable allow() {
        return Tasks.instrumented(Permission.class, true);
    }

    public static Performable deny() {
        return Tasks.instrumented(Permission.class, false);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (status) { // allow permission
            actor.attemptsTo(
                    Check.whether(the(HomePage.Permission.BTN_OK), isVisible())
                            .andIfSo(
                                    Click.on(HomePage.Permission.BTN_OK.waitingForNoMoreThan(Duration.ofSeconds(10))),
                                    Click.on(HomePage.Permission.BTN_ALLOW.waitingForNoMoreThan(Duration.ofSeconds(10)))
                            )
            );
        } else { // deny permission
            // something code
        }
    }
}
