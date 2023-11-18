package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.MobileBy;
import tests.BaseTest;

public class LevelPage extends BasePage {
    protected final SelenideElement title = $(MobileBy.id("sixpack.sixpackabs.absworkout:id/tv_des"));
    protected final SelenideElement reportsTab = $(MobileBy.id("sixpack.sixpackabs.absworkout:id/tv_report"));

    public ReportsPage openReports(){
        reportsTab.click();
        return new ReportsPage();
    }
}
