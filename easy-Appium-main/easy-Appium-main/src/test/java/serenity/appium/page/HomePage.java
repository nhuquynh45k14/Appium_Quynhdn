package serenity.appium.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static class Permission {
        public static Target BTN_OK = Target.the("button ok")
                .located(By.id("android:id/button1"));
        public static Target BTN_ALLOW = Target.the("button allow")
                .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    }

    public static Target ICON_MENU = Target.the("icon menu")
            .located(By.xpath("//*[@resource-id='com.apk_devops_apk_dev_free:id/upmenubutton']" +
                    "| //*[@resource-id='com.apk_devops_apk_dev_free:id/menucancal']"));
}
