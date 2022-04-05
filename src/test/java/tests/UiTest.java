package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RatePage;
import pages.SuccessPage;

public class UiTest extends BaseTest{

    @Test(description = "Login test")
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2, "different");

    }

    @Test(description = "Mood posting test")
    public void postUpdateTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        MainPage mainPage = new MainPage();
        mainPage.postUpdate();
        RatePage ratePage = new RatePage();
        Assert.assertTrue(ratePage.isTitleVisible());

    }

    @Test(description = "'Rate the mood' test")
    public void rateTheMoodTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        MainPage mainPage = new MainPage();
        mainPage.postUpdate();
        RatePage ratePage = new RatePage();
        ratePage.rateMood();
        SuccessPage successPage = new SuccessPage();
        Assert.assertTrue(successPage.isUpdatedTitleVisible());

    }
}
