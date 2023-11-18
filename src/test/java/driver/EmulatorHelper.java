package driver;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

/**
 * Helper for Pages
 */
public class EmulatorHelper extends EmulatorDriver{

    /**
     * Press Back
     */
    public static void goBack(){
        driver.navigate().back();
    }

    /**
     * Scroll to element by text
     * @param text
     */
    public static void androidScrollToAnElementByText(String text){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
                        ".instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))")
                .click();
    }

    /**
     * Close keyboard
     */
    public static void closeKeyBoard(){
        if(driver.isKeyboardShown()){
            driver.hideKeyboard();
        }
    }

    /**
     * Enter text and press Enter
     * @param element input field
     * @param text
     */
    public static void sendKeysAndFind(SelenideElement element, String text){
        element.sendKeys(text);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

}
