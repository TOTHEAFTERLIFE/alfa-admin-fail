package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class FilmsPage {

    @Step("Фильмы 2021")
    public From2021Page open2021() {
        $x("//span[text() = '2021 год']").click();
        return page(From2021Page.class);
    }

    @Step("Фильмы 2020")
    public From2020Page open2020() {
        $x("//span[text() = '2021 год']").click();
        return page(From2020Page.class);
    }

    @Step("Фильмы 2019")
    public From2019Page open2019() {
        $x("//span[text() = '2021 год']").click();
        return page(From2019Page.class);
    }
}
