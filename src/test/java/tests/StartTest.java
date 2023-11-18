package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import pages.StartPage;


public class StartTest extends BaseTest{
    private static StartPage startPage;

    @BeforeAll
    public static void init() {
        startPage = new StartPage();
    }

    @Description("Check button Start")
    @Test
    public void testStartTitleAndButton(){
        startPage.checkStart();
    }
}
