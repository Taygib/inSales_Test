package testInSales;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactsPage;

import static io.qameta.allure.Allure.step;

public class ContactsTest extends TestBase{

    ContactsPage Contacts = new ContactsPage();

    @Test
    @Tag("InSales")
    @Tag("Contacts")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка номера телефонов")
    void checkNumberPhoneTest() {

        step("Открыть страницу", () -> {
            Contacts.openPage("");
        });

        step("Проверка номера телефонов", () -> {
            Contacts.findNumber("8 495 649-83-14", "8 800 555-10-61");
        });
    }

    @Test
    @Tag("InSales")
    @Tag("Contacts")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка электронной почты")
    void checkEmailTest() {

        step("Открыть страницу", () -> {
            Contacts.openPage("");
        });

        step("Проверка электронной почты", () -> {
            Contacts.findEmail("info@insales.ru", "cms@insales.ru");
        });
    }
}