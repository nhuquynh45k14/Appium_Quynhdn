package appium.test;

import appium.action.PrintLog;
import appium.action.WaitABit;
import appium.page.ARCodeExamplePage;
import appium.page.HomePage;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import java.time.Duration;

@ExtendWith(SerenityJUnit5Extension.class)
public class DemoTests extends Common {

    @Test
    public void test1() {
        actor.attemptsTo(
                PrintLog.withContent("start"),
                Click.on(HomePage.ICON_MENU.waitingForNoMoreThan(Duration.ofSeconds(30))),
                Click.on(HomePage.LBL_ITEM("Code Examples")),
                Click.on(HomePage.LBL_ITEM("Containers")),
                Click.on(HomePage.LBL_ITEM("Add / Remove items from GridView")),
                Enter.theValue("Singapore").into(ARCodeExamplePage.TXT_VALUE),
                Click.on(ARCodeExamplePage.BTN_ADD),
                WaitABit.inSeconds(10)
        );
    }
    @Test
    public void test2() {
        actor.attemptsTo(
                PrintLog.withContent("start"),
                Click.on(HomePage.ICON_MENU.waitingForNoMoreThan(Duration.ofSeconds(30))),
                Click.on(HomePage.LBL_ITEM("Code Examples")),
                Click.on(HomePage.LBL_ITEM("Containers")),
                Click.on(HomePage.LBL_ITEM("Add / Remove items from GridView")),
                Enter.theValue("Singapore").into(ARCodeExamplePage.TXT_VALUE),
                Click.on(ARCodeExamplePage.BTN_REMOVE),
                WaitABit.inSeconds(10)
        );
    }
    @Test
    public void test3() {
        actor.attemptsTo(
                PrintLog.withContent("start"),
                Click.on(HomePage.ICON_MENU.waitingForNoMoreThan(Duration.ofSeconds(30))),
                Click.on(HomePage.LBL_ITEM("Code Examples")),
                Click.on(HomePage.LBL_ITEM("Containers")),
                Click.on(HomePage.LBL_ITEM("Add / Remove items from GridView")),
                Click.on(HomePage.LBL_ITEM("Turkey")),
                WaitABit.inSeconds(10)
        );
    }
}
