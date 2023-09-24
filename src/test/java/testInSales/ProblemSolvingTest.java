package testInSales;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ProblemSolvingPage;

import static io.qameta.allure.Allure.step;

public class ProblemSolvingTest {

    ProblemSolvingPage Problems = new ProblemSolvingPage();

    @Test
    @Tag("InSales")
    @Tag("Problems")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Проверка раздела =Проблемы, которые решает inSales=")
    void problemsTest() {

        step("Открыть страницу", () -> {
            Problems.openPage("");
        });

        step("Кликнуть по проблеме =Масштабирование=", () -> {
            Problems.clickOnScaling("Масштабирование");
        });

        step("Проверка кликабельности по =Масштабирование=", () -> {
            Problems.checkClickOnScaling("Масштабирование каналов продаж");
        });

        step("Кликнуть по проблеме =Автоматизация=", () -> {
            Problems.clickOnAutomation("Автоматизация");
        });

        step("Проверка кликабельности по =Автоматизация=", () -> {
            Problems.checkClickOnAutomation("Автоматизация работы и процессов");
        });

        step("Кликнуть по проблеме =Экономия=", () -> {
            Problems.clickOnSaving("Экономия");
        });

        step("Проверка кликабельности по =Экономия=", () -> {
            Problems.checkClickOnSaving("Экономия на разработке сайта");
        });

        step("Кликнуть по проблеме =Инструменты продаж=", () -> {
            Problems.clickOnSalesTools("Инструменты продаж");
        });

        step("Проверка кликабельности по =Инструменты продаж=", () -> {
            Problems.checkClickOnSalesTools("Все инструменты продаж уже внутри");
        });
    }
}