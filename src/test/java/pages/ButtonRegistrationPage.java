package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ButtonRegistrationPage {

    private SelenideElement navList = $(".refresh-menu-nav-list").$(".refresh-menu-nav-btn"),
            freeStepsButton = $(".free-steps-button"),
            freeBenefits = $(".free-benefits"),
            hideXs = $(".hide-xs").$(".free-reviews-cta"),
            freeTariffBottom = $(".free-tariff-bottom").$(".free-tariff-cta"),
            modalTitle = $("#modal-default-reg").$(".free-modal-title"),
            modalAction = $("#modal-default-reg").$(".free-modal-action"),
            modalFreeTitle = $("#modal-free").$(".free-modal-title"),
            modalFreeAction = $("#modal-free").$(".free-modal-action"),
            close = $(".fancybox-close-small");

    public void openPage(String url) {
        open(url);
        Selenide.executeJavaScript("$('.popup-site-open').remove()");
        Selenide.executeJavaScript("$('.cookies-modal').remove()");
    }

    public void clickOnButtonInHeader(String nameButton) {
        navList.find(byText(nameButton)).click();
    }

    public void checkClickOnButtonInHeader(String title, String action) {
        modalTitle.shouldHave(text(title));
        modalAction.shouldHave(text(action));
    }

    public void clickOnButtonInThreeSimpleSteps(String nameButton) {
        freeStepsButton.find(byText(nameButton)).hover();
        freeStepsButton.find(byText(nameButton)).click();
    }

    public void clickOnButtonAppControl(String nameButton) {
        freeBenefits.find(byText(nameButton)).hover();
        freeBenefits.find(byText(nameButton)).click();
    }

    public void clickOnButtonPlatformUsers(String nameButton) {
        hideXs.find(byText(nameButton)).hover();
        hideXs.find(byText(nameButton)).click();
    }

    public void clickOnButtonTryFree(String nameButton) {
        freeTariffBottom.find(byText(nameButton)).click();
    }

    public void checkClickOnButton(String title, String action) {
        modalFreeTitle.shouldHave(text(title));
        modalFreeAction.shouldHave(text(action));
    }

    public void closeMenuRegistration() {
        close.click();
    }
}