package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SuccessPage {

    private SelenideElement updatedTitle = $(By.xpath("//p[text()='Mood updated']"));

    public boolean isUpdatedTitleVisible(){
        updatedTitle.shouldBe(visible);
        return updatedTitle.isDisplayed();
    }
}
