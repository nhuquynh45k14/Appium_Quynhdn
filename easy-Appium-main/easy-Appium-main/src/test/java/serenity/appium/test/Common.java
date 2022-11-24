package serenity.appium.test;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import serenity.appium.util.AppiumServerController;
import serenity.appium.util.customDriver.CustomAndroidDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

public class Common {

    @Managed()
    public WebDriver webDriver;

    @CastMember(name = "Tester")
    public Actor actor;

    @BeforeAll
    public static void openAppium() {
        AppiumServerController.startAppiumServer();
    }

    @BeforeEach
    public void startConnection() {
        webDriver = CustomAndroidDriver.driver();
        givenThat(actor).can(BrowseTheWeb.with(webDriver));

        AppiumServerController.givePermissionsForAndroid();
    }

    @AfterAll
    public static void closeAppium() {
        AppiumServerController.stopAppiumServer();
    }
}
