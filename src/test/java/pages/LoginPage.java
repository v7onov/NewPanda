package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import staticdata.WebUrls;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Configuration.baseUrl;

/**
 * LoginPage class it is Page Object realisation of login page
 *
 * @author v7onov
 */



public class LoginPage {

    private static final String EMAIL = "v7onov@gmail.com";
    private static final String PASSWORD = "P20030011p";

    /**
     * Email input field
     */
    public SelenideElement emailInput = $(By.xpath("//input[@placeholder='MoodPanda registered email ']"));
    private SelenideElement passwordInput = $(By.name("password"));
    private SelenideElement loginButton = $(By.xpath("//button[contains(., 'Login')]"));

    public void openLoginPage() {
        open(baseUrl.concat(WebUrls.LOGIN_URL));
    }


    public void login() {
        loginButton.shouldBe(enabled);
        emailInput.sendKeys(EMAIL);
        passwordInput.sendKeys(PASSWORD);
        loginButton.click();
    }
}
