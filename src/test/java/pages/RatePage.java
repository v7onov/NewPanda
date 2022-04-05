package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RatePage {


    private SelenideElement rateTitle = $(By.xpath("//p[text()='Rate your happiness']"));
    private ElementsCollection rate9Button = $$(By.xpath("//button[text()=' 9 ']"));
    private SelenideElement noReasonButton = $(By.xpath("//button[text()=' no reason ']"));
    private SelenideElement updateButton = $(By.xpath("//a[contains(text(), 'Update to ')]"));



    public boolean isTitleVisible(){
        rateTitle.shouldBe(visible);
        return rateTitle.isDisplayed();
    }

    public void rateMood(){
        rate9Button.get(1).shouldBe(visible);
        rate9Button.get(1).click();
        noReasonButton.shouldBe(visible).click();
        updateButton.shouldBe(visible).click();
    }
}
