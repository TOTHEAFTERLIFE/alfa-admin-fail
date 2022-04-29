package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class From2021Page {

    @Step("Фильмы 2021")
    public void openFirst() {
        $x("//li[@class = 'gallery__item gallery__item_virtual'][@index = '0']").click();
    }
}
