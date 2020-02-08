package test.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMethods;
import test.PO.SelenideSelectors;
import test.TestMain;
import static com.codeborne.selenide.Condition.visible;

public class StateAgencyTest extends SelenideSelectors {

    TestMain testMain = new TestMain();

    @BeforeMethod
    public void init() {
        testMain.setupClass();
        testMethods.openUrl();
    }

    @AfterMethod
    public void close() {
        testMain.closeDriver();
    }

    TestMethods testMethods = new TestMethods();

    @Test
    public void notSelectTypeControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency();
        deleteStateAgencyBtn.get(0)
                .click();

        errorTypeStateAgency.shouldBe(visible);
    }

    @Test
    public void clickSelectTypeControlStateAgencyTest() {
        selectStateAgencyBtn.get(0)
                .shouldBe(visible)
                .click();

        stateAgencyList.get(0).
                shouldBe(visible);
    }

    @Test
    public void selectTypeControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency();

        String txt = selectedStateAgencyInput.get(0).getText();
        Assert.assertTrue(txt.contains("Центральний"));

        regulatorBlock.shouldBe(visible);
    }

    @Test
    public void notSelectControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency()
        .selectControlStateAgency();
        deleteStateAgencyBtn.get(1).click();

        errorStateAgency.shouldBe(visible);
    }

    @Test
    public void clickSelectControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency();
        selectStateAgencyBtn.get(1)
                .shouldBe(visible)
                .click();

        stateAgencyList.get(1).shouldBe(visible);
    }

    @Test
    public void selectControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency()
        .selectControlStateAgency();

        String txt = selectedStateAgencyInput.get(1).getText();
        Assert.assertTrue(txt.contains("Міністерство внутрішніх справ України"));
    }

    @Test
    public void selectSpheresControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency()
       .selectControlStateAgency()
        .selectSpheresControlStateAgency();

        textSpheresControl.shouldBe(visible);
    }

    @Test
    public void selectAllSpheresControlStateAgencyTest() {
        testMethods.selectTypeControlStateAgency()
        .selectControlStateAgency()
        .selectAllSpheresControlStateAgency();

        textSpheresControl.shouldBe(visible);
    }

    @Test
    public void registrationUserTest() {
        testMethods.inputEmail("test@gmail.com")
        .inputLastName("Іванов")
        .inputName("Іван")
        .inputPatronymicName("Іванович")
        .inputPosition("начальник відділу")
        .inputPhone("0671234567")
        .inputPassword("12345678")
        .selectTypeControlStateAgency()
        .selectControlStateAgency()
        .selectAllSpheresControlStateAgency();
        recaptchaCheckbox.scrollTo().shouldBe(visible).click();
        submitBan.click();


    }



}