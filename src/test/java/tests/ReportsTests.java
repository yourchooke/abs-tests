package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import pages.BeginnerPage;
import pages.ReportsPage;
import pages.SelectPlanPage;
import pages.StartPage;
import pages.WeightSettingsDialog;

public class ReportsTests extends BaseTest{
    private static StartPage startPage;
    private static SelectPlanPage selectPlanPage;
    private static ReportsPage reportsPage;
    @BeforeAll
    public static void init() {
        startPage = new StartPage();
    }

    @BeforeEach
    public void initEach(){
        selectPlanPage = startPage.pressStart();
        BeginnerPage beginnerPage = selectPlanPage.openBeginner();
        reportsPage = beginnerPage.openReports();
    }

    @Description("Negative test")
    @Test
    public void checkWeightValidation(){
        WeightSettingsDialog weightSettings = reportsPage.openWeightSettings();
        weightSettings.setEmptyWeight();
        weightSettings.checkValidation();

    }
}
