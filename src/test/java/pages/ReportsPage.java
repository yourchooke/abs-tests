package pages;

import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ReportsPage extends BasePage{
    private final SelenideElement addWeightButton = $(MobileBy.id("sixpack.sixpackabs.absworkout:id/add_weight"));

    @Step("Open Weight settings")
    public WeightSettingsDialog openWeightSettings(){
        addWeightButton.click();
        return new WeightSettingsDialog();
    }
}
