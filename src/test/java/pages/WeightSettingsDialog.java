package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import static io.appium.java_client.MobileCommand.pressKeyCodeCommand;

import io.appium.java_client.CommandExecutionHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand.*;
import io.qameta.allure.Step;

public class WeightSettingsDialog {
    private final SelenideElement weightField = $(MobileBy.id("sixpack.sixpackabs.absworkout:id/editTextWeight"));
    private final SelenideElement validation = $(MobileBy.id("sixpack.sixpackabs.absworkout:id/textinput_error"));
    @Step("Tiny weight value")
    public void setEmptyWeight(){
        weightField.clear();
        System.out.println("hh");
    }

    @Step("Check validation")
    public void checkValidation(){
        validation.text().equals("The number you entered is invalid.");
    }
}
