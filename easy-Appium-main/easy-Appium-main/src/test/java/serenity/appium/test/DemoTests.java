package serenity.appium.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import serenity.appium.action.PrintLog;
import serenity.appium.action.WaitABit;
import serenity.appium.page.HomePage;

import java.time.Duration;

@ExtendWith(SerenityJUnit5Extension.class)
public class DemoTests extends Common {

    @Test
    public void test1() {
        actor.attemptsTo(
                PrintLog.withContent("start"),
                Click.on(HomePage.ICON_MENU.waitingForNoMoreThan(Duration.ofSeconds(30))),
                WaitABit.inSeconds(10)
        );
    }
}
