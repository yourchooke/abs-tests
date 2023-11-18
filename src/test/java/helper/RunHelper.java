package helper;

import config.ConfigReader;
import driver.EmulatorDriver;

/**
 * AndroidDriver
 */
public class RunHelper {

    private RunHelper() {
    }

    public static RunHelper runHelper() {
        return new RunHelper();
    }

    public Class<?> getDriverClass() {
        String deviceHost = ConfigReader.testConfig.deviceHost();

        switch (deviceHost) {
            case "browserstack":
            case "selenoid":
            case "emulator":
                return EmulatorDriver.class;
            case "real":
             default:
                throw new RuntimeException("There is no deviceHost in config: " +
                        "browserstack/selenoid/emulator/real");
        }
    }
}
