package test.Metods;


import test.PO.SelenideSelectors;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class TestMethods extends SelenideSelectors {

    public void openUrl() {
        open("http://inspections.staging.brdo.com.ua/site/signup");
    }

    public TestMethods inputEmail(String value) {
        inputEmail.shouldBe(visible)
                .setValue(value)
                .pressEnter();
        return this;
    }

    public TestMethods inputLastName(String value) {
        inputLastName.shouldBe(visible)
                .setValue(value)
                .pressEnter();
        return this;
    }

    public TestMethods inputName(String value) {
        inputName.shouldBe(visible)
                .setValue(value)
                .pressEnter();
        return this;
    }

    public TestMethods inputPatronymicName(String value) {
        inputPatronymicName.shouldBe(visible)
                .setValue(value)
                .pressEnter();
        return this;
    }

    public TestMethods inputPhone(String value) {
        inputPhone.shouldBe(visible)
                .setValue(value)
                .pressEnter();
        return this;
    }

    public TestMethods inputPassword(String value) {
        inputPassword.shouldBe(visible)
                .setValue(value)
                .pressEnter();
        return this;
    }

    public TestMethods inputPosition(String value) {
        inputPosition.shouldBe(visible)
                .setValue(value);
        inputPatronymicName.click();
        return this;
    }

    public TestMethods selectTypeControlStateAgency() {
        selectStateAgencyBtn.get(0)
                .shouldBe(visible)
                .click();
        stateAgencyList.get(0)
                .scrollTo()
                .click();
        return this;
    }

    public TestMethods selectControlStateAgency() {
        selectStateAgencyBtn.get(1)
                .shouldBe(visible)
                .click();
        stateAgencyList.get(1)
                .scrollTo()
                .click();
        return this;
    }

    public TestMethods selectSpheresControlStateAgency() {
        selectedStateAgencyInput.get(2)
                .shouldBe(visible)
                .click();
        stateAgencyList.get(0)
                .scrollTo()
                .click();
        return this;
    }

    public TestMethods selectAllSpheresControlStateAgency() {
        selectedStateAgencyInput.get(2)
                .shouldBe(visible).
                click();
        selectAllTextSpheresControl.shouldBe(visible)
                .click();
        return this;
    }




}
