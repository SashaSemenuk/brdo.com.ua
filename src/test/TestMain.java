package test;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Configuration.*;

public class TestMain {

    public void setupClass() {
        baseUrl = "http://inspections.staging.brdo.com.ua/site/signup";
        headless = true;
        browserSize = "1920x1080";
        browser = "chrome";
        timeout = 8000;
        browserSize = "1920x1080";
        reopenBrowserOnFail = true;
    }

    public void closeDriver() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }

}
