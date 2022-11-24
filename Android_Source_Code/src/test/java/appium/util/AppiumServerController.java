package appium.util;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import static io.appium.java_client.service.local.AppiumDriverLocalService.buildService;

public class AppiumServerController {
    public final static AppiumDriverLocalService service;

    static {
        System.out.println("Print Default Data");
        service = buildService(
                new AppiumServiceBuilder()
                        .withIPAddress("0.0.0.0")
                        .usingPort(Integer.parseInt("4723"))
                        .withArgument(() -> "--base-path", "/wd/hub/")
        );
    }

    public static void startAppiumServer() {
        try {
            service.start();
            System.out.println("[bellFace] start appium server");
        } catch (Exception e) {
            service.start(); // restart appium
            System.out.println("[bellFace] restart appium server");
        }
    }

    public static void stopAppiumServer() {
        try {
            if (service.isRunning()) {
                service.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void givePermissionsForAndroid() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(System.getProperty("user.dir") + "/src/test/resources/givePermissionsAndroid.bat");
        Process process = null;
        int exitCode = 0;
        try {
            process = processBuilder.start();
            exitCode = process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Giving Permissions for Android ExitCode .Bat: " + exitCode);
    }
}
