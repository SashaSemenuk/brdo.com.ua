package test.Metods;


import test.PO.SelenideSelectors;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class TestMetods extends SelenideSelectors {

    public void openUrl() {
        open("http://inspections.staging.brdo.com.ua/site/signup");
    }

    public void inputEmail(String value) {
        inputEmail.shouldBe(visible).setValue(value).pressEnter();
    }

    public void inputLastName(String value) {
        inputLastName.shouldBe(visible)
                .setValue(value)
                .pressEnter();
    }

    public void inputName(String value) {
        inputName.shouldBe(visible)
                .setValue(value)
                .pressEnter();
    }

    public void inputPatronymicName(String value) {
        inputPatronymicName.shouldBe(visible)
                .setValue(value)
                .pressEnter();
    }

    public void inputPhone(String value) {
        inputPhone.shouldBe(visible)
                .setValue(value)
                .pressEnter();
    }

    public void inputPassword(String value) {
        inputPassword.shouldBe(visible)
                .setValue(value)
                .pressEnter();
    }

    public void inputPosition(String value) {
        inputPosition.shouldBe(visible)
                .setValue(value);
        inputPatronymicName.click();
    }

    public void selectControlStateAgency() {
        selectStateAgencyBtn.shouldBe(visible).click();
        stateAgencyList.get(0).scrollTo().click();
    }




}
