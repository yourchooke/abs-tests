package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import static driver.EmulatorHelper.androidScrollToAnElementByText;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

public class SelectPlanPage extends BasePage {
    private final SelenideElement title = $(MobileBy.xpath("//*[contains(@text, 'Select Training Plan' )]"));
    private final SelenideElement beginner = $(MobileBy.xpath("//*[contains(@text, 'Beginner' )]"));
    private final SelenideElement beginnerStart = $(MobileBy.xpath("(//android.widget.TextView[@resource-id=\"sixpack.sixpackabs.absworkout:id/tv_start\"])[1]"));
    private final SelenideElement intermediate = $(MobileBy.xpath("//*[contains(@text, 'Intermediate' )]"));
    private final SelenideElement advanced = $(MobileBy.xpath("//*[contains(@text, 'Advanced' )]"));

    private SelenideElement howToButton =
            $(MobileBy.id("sixpack.sixpackabs.absworkout:id/tv_choose_plan"));


    @Step("Check names of levels {texts}")
    public void checkBlocksHaveTexts() {
        title.exists();
        beginner.exists();
        intermediate.exists();
        advanced.exists();
    }

    @Step
    public BeginnerPage openBeginner(){
        beginnerStart.click();
        return new BeginnerPage();
    }

}
