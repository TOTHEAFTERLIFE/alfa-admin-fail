package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private static final String URL = "https://ivi.ru/";

    @Step("Главная страница")
    public FilmsPage login() {
        open(URL);
        $x("//a[@data-test = 'menu_section_films']").click();
        return page(FilmsPage.class);
    }
}
