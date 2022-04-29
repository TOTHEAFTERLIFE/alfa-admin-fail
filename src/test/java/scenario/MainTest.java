package scenario;

import common.BaseTest;
import org.testng.annotations.Test;
import pages.FilmsPage;
import pages.From2021Page;
import pages.MainPage;

public class MainTest extends BaseTest {

    @Test
    public void test1() {
        System.out.println("test1");
        MainPage mainPage = new MainPage();
        mainPage.login();
    }

    @Test
    public void test2() {
        System.out.println("test2");
        FilmsPage filmsPage = new FilmsPage();
        filmsPage.open2021();
    }

    @Test
    public void test3() {
        System.out.println("test3");
        FilmsPage filmsPage = new FilmsPage();
        filmsPage.open2020();
    }

    @Test
    public void test4() {
        System.out.println("test4");
        FilmsPage filmsPage = new FilmsPage();
        filmsPage.open2019();
    }

    @Test
    public void test5() {
        System.out.println("test5");
        From2021Page from2021Page = new From2021Page();
        from2021Page.openFirst();
    }
}
