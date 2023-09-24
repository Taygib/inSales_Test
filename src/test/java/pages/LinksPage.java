package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LinksPage {

    private SelenideElement sliderDesktop = $(".free-slider-desktop"),
            textCenter = $(".text-center"),
            reviewsContent = $(".free-reviews-content");

    public void openPage(String url) {
        open(url);
        Selenide.executeJavaScript("$('.popup-site-open').remove()");
        Selenide.executeJavaScript("$('.cookies-modal').remove()");
    }

    public void clickOnLinkTemplates(String viewTemplates) {
        sliderDesktop.find(byText(viewTemplates)).click();
    }

    public void checkClickOnLinkTemplates(String templates) {
        switchTo().window(1);
        textCenter.shouldHave(text(templates));
    }

    public void clickOnLinkIntegration(String viewIntegration) {
        reviewsContent.find(byText(viewIntegration)).click();
    }

    public void checkClickOnLinkIntegration(String viewIntegration) {
        switchTo().window(1);
        textCenter.shouldHave(text(viewIntegration));
    }
}