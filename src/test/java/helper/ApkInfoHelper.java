package helper;

import config.ConfigReader;
import groovyjarjarpicocli.CommandLine;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static helper.DeviceHelper.*;

/**
 * Gets info from Apk file by bash commands
 */
public class ApkInfoHelper {
    /**
     * AndroidManifest.xml
     */
    private String apkInfo;

    /**
     * Constructor with apkInfo initialization
     */
    public ApkInfoHelper() {
        String app = ConfigReader.emulatorConfig.app();
        if(app == null || app.isEmpty()){
            throw new RuntimeException("No value for key 'app' providing apk path in emulator.properties");
        }
        try {
            String command = "aapt dumb badging " + ConfigReader.emulatorConfig.app();
            apkInfo = executeSh("aapt dumb badging " + ConfigReader.emulatorConfig.app());
        } catch (IOException | InterruptedException | ExecutionException e){
            throw new RuntimeException(e);
        }
    }


    /**
     * Get AppPackage from apk
     * @return
     */
    public String getAppPackageFromApk() {
        return findGroup1ValueFromString(apkInfo,"package: name='\\s*([^']+?)\\s*'");
    }

    /**
     * Get MainActivity from apk
     * @return
     */
    public String getAppMainActivity()  {
        return findGroup1ValueFromString(apkInfo, "launchable-activity: name='\\s*([^']+?)\\s*'");
    }

    private static String findGroup1ValueFromString(String text, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            return matcher.group(1);
        }
        return null;
    }
}
