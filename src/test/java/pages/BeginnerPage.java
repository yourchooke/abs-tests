package pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

public class BeginnerPage extends LevelPage {

    @Step("Verify title of opened page")
    public void checkTitle(){
        title.text().equals("Lose Belly Fat");
    }

}
