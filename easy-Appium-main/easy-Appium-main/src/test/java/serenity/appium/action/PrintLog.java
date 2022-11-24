package serenity.appium.action;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class PrintLog implements Performable {
    private final String content;

    public PrintLog(String content) {
        this.content = content;
    }

    public static PrintLog withContent(String content) {
        return Tasks.instrumented(PrintLog.class, content);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("[into]... " + content);
    }
}
