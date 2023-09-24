package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactsPage {

    private SelenideElement blockContacts = $(".main-block-contacts-apps");

    public void openPage(String url) {
        open(url);
        Selenide.executeJavaScript("$('.popup-site-open').remove()");
        Selenide.executeJavaScript("$('.cookies-modal').remove()");
    }

    public  void findNumber(String firstNumber, String secondNumber) {
        blockContacts.hover();
        blockContacts.shouldHave(text(firstNumber), text(secondNumber));
    }

    public  void findEmail(String firstEmail, String secondEmail) {
        blockContacts.hover();
        blockContacts.shouldHave(text(firstEmail), text(secondEmail));
    }
}