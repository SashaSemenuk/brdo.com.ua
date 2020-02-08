package test;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import static com.codeborne.selenide.Configuration.*;

public class TestMain {


    public void setupClass() {
        baseUrl = "http://inspections.staging.brdo.com.ua/site/signup";
        //headless = true;
        startMaximized = true;
        browser = "chrome";
        timeout = 8000;
        browserSize = "1920x1080";
        reopenBrowserOnFail = true;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    public void closeDriver() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }

}
