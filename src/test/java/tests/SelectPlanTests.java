package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import io.qameta.allure.Description;
import pages.BeginnerPage;
import pages.SelectPlanPage;
import pages.StartPage;

public class SelectPlanTests extends BaseTest {
    private static StartPage startPage;
    private static SelectPlanPage selectPlanPage;
    @BeforeAll
    public static void init() {
        startPage = new StartPage();
    }

    @BeforeEach
    public void initEach(){
        selectPlanPage = startPage.pressStart();
    }

    @Description("Check levels")
    @Test
    public void checkLevelsList(){
        selectPlanPage.checkBlocksHaveTexts();
    }

    @Description("Open beginner level")
    @Test
    public void openBeginnerLevel(){
        BeginnerPage beginnerPage = selectPlanPage.openBeginner();
        beginnerPage.checkTitle();
    }

}
