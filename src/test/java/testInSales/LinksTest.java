package testInSales;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LinksPage;

import static io.qameta.allure.Allure.step;

public class LinksTest extends TestBase {

    LinksPage Links = new LinksPage();

    @Test
    @Tag("InSales")
    @Tag("Links")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка перехода по ссылке =Смотреть все шаблоны=")
    void checkTemplatesTest() {

        step("Открыть страницу", () -> {
            Links.openPage("");
        });

        step("Кликнуть по ссылке =Смотреть все шаблоны=", () -> {
            Links.clickOnLinkTemplates("Смотреть все шаблоны");
        });

        step("Проверка перехода по ссылке =Смотреть все шаблоны=", () -> {
            Links.checkClickOnLinkTemplates("Готовые шаблоны интернет-магазинов");
        });
    }

    @Test
    @Tag("InSales")
    @Tag("Links")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка перехода по ссылке =Смотреть все интеграции=")
    void checkIntegrationTest() {

        step("Открыть страницу", () -> {
            Links.openPage("");
        });

        step("Кликнуть по ссылке =Смотреть все интеграции=", () -> {
            Links.clickOnLinkIntegration("Смотреть все интеграции");
        });

        step("Проверка перехода по ссылке =Смотреть все интеграции=", () -> {
            Links.checkClickOnLinkIntegration("Магазин расширений inSales");
        });
    }
}