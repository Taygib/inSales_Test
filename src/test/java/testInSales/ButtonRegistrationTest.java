package testInSales;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ButtonRegistrationPage;

import static io.qameta.allure.Allure.step;

public class ButtonRegistrationTest extends TestBase {

    ButtonRegistrationPage Button = new ButtonRegistrationPage();

    @Test
    @Tag("InSales")
    @Tag("Button")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности кнопки для регистрации в хэдере")
    void buttonInHeaderTest() {

        step("Открыть страницу", () -> {
            Button.openPage("");
        });

        step("Кликнуть по кнопке =Зарегистрироваться=", () -> {
            Button.clickOnButtonInHeader("Зарегистрироваться");
        });

        step("Проверка меню Зарегистрации", () -> {
            Button.checkClickOnButtonInHeader("Регистрация в inSales", "Создать аккаунт");
        });

        step("Закрыть меню Зарегистрации", () -> {
            Button.closeMenuRegistration();
        });
    }

    @Test
    @Tag("InSales")
    @Tag("Button")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности кнопки для регистрации в разделе =Три простых шага=")
    void buttonInThreeSimpleStepsTest() {

        step("Открыть страницу", () -> {
            Button.openPage("");
        });

        step("Кликнуть по кнопке =Зарегистрироваться=", () -> {
            Button.clickOnButtonInThreeSimpleSteps("Зарегистрироваться");
        });

        step("Проверка меню Зарегистрации", () -> {
            Button.checkClickOnButton("Регистрация в inSales", "Создать аккаунт");
        });

        step("Закрыть меню Зарегистрации", () -> {
            Button.closeMenuRegistration();
        });
    }

    @Test
    @Tag("InSales")
    @Tag("Button")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности кнопки для регистрации в разделе =Управление через приложение=")
    void buttonInAppControlTest() {

        step("Открыть страницу", () -> {
              Button.openPage("");
        });

        step("Кликнуть по кнопке =Попробовать бесплатно=", () -> {
            Button.clickOnButtonAppControl("Попробовать бесплатно");
        });

        step("Проверка меню Зарегистрации", () -> {
            Button.checkClickOnButton("Регистрация в inSales", "Создать аккаунт");
        });

        step("Закрыть меню Зарегистрации", () -> {
            Button.closeMenuRegistration();
        });
    }

    @Test
    @Tag("InSales")
    @Tag("Button")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности кнопки для регистрации в разделе =Пользователи платформы=")
    void buttonInPlatformUsersTest() {

        step("Открыть страницу", () -> {
            Button.openPage("");
        });

        step("Кликнуть по кнопке =Зарегистрироваться= в разделе =Пользователи платформы=", () -> {
            Button.clickOnButtonPlatformUsers("Зарегистрироваться");
        });

        step("Проверка меню Зарегистрации", () -> {
            Button.checkClickOnButton("Регистрация в inSales", "Создать аккаунт");
        });

        step("Закрыть меню Зарегистрации", () -> {
            Button.closeMenuRegistration();
        });
    }
    @Test
    @Tag("InSales")
    @Tag("Button")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности кнопки для регистрации в разделе =Попробуйте бесплатно=")
    void buttonInTryFreeTest() {

        step("Открыть страницу", () -> {
            Button.openPage("");
        });

        step("Кликнуть по кнопке =Начать продавать= в разделе =Попробуйте бесплатно!=", () -> {
            Button.clickOnButtonTryFree("Начать продавать");
        });

        step("Проверка меню Зарегистрации", () -> {
            Button.checkClickOnButton("Регистрация в inSales", "Создать аккаунт");
        });

        step("Закрыть меню Зарегистрации", () -> {
            Button.closeMenuRegistration();
        });
    }
}