package appium.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ARCodeExamplePage {
    public static Target TXT_VALUE = Target.the("textbox enter value")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/editText1']"));

    public static Target BTN_ADD = Target.the("btn add")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/button1']"));
    public static Target BTN_REMOVE = Target.the("btn add")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/button2']"));
}
