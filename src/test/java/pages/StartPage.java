package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

public class StartPage extends BasePage {
    private SelenideElement startButton = $(MobileBy.id("sixpack.sixpackabs.absworkout:id/tv_start"));

    @Step("Verify start button has text START")
    public void checkStart(){
        startButton.should(Condition.text("START"));
    }

    @Step("Press start button")
    public SelectPlanPage pressStart(){
        startButton.should(Condition.visible).click();
        return new SelectPlanPage();
    }
}
