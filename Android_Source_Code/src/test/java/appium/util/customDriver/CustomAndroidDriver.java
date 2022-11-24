package appium.util.customDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CustomAndroidDriver {

    public static AndroidDriver driver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "24081FDF6004S5");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("autoAcceptAlerts", true);
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("newCommandTimeout", "600");
            capabilities.setCapability("appPackage", "com.apk_devops_apk_dev_free");
            capabilities.setCapability("appActivity", "com.apk_devops_apk_dev_free.splash_screen");

            UiAutomator2Options uiAutomator2Options = new UiAutomator2Options()
                    .merge(capabilities);

            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            return new AndroidDriver(url, uiAutomator2Options);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
