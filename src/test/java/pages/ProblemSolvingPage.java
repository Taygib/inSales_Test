package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProblemSolvingPage {

    private SelenideElement tabContainer = $(".present-tab__tab-container"),
            freeTabs = $(".free-tabs");

    public void openPage(String url) {
        open(url);
        Selenide.executeJavaScript("$('.popup-site-open').remove()");
        Selenide.executeJavaScript("$('.cookies-modal').remove()");
    }

    public void clickOnScaling(String scaling) {
        tabContainer.hover();
        freeTabs.find(byText(scaling)).click();
    }

    public void checkClickOnScaling(String scaling) {
        tabContainer.shouldHave(text(scaling));
    }

    public void clickOnAutomation(String automation) {
        tabContainer.hover();
        freeTabs.find(byText(automation)).click();
    }

    public void checkClickOnAutomation(String automation) {
        tabContainer.shouldHave(text(automation));
    }

    public void clickOnSaving(String saving) {
        tabContainer.hover();
        freeTabs.find(byText(saving)).click();
    }

    public void checkClickOnSaving(String saving) {
        tabContainer.shouldHave(text(saving));
    }

    public void clickOnSalesTools(String salesTools) {
        tabContainer.hover();
        freeTabs.find(byText(salesTools)).click();
    }

    public void checkClickOnSalesTools(String salesTools) {
        tabContainer.shouldHave(text(salesTools));
    }
}