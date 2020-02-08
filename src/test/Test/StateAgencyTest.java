package test.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMetods;
import test.PO.SelenideSelectors;
import test.TestMain;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class StateAgencyTest extends SelenideSelectors {

    TestMain testMain = new TestMain();

    @BeforeMethod
    public void init() {
        testMain.setupClass();
        testMetods.openUrl();
    }

    @AfterMethod
    public void close() {
        testMain.closeDriver();
    }

    TestMetods testMetods = new TestMetods();

    @Test
    public void notSelectTypeControlStateAgencyTest() {
        testMetods.selectControlStateAgency();
        deleteStateAgencyBtn.click();

        errorStateAgency.shouldBe(visible);
    }

    @Test
    public void selectTypeControlStateAgencyTest() {
        testMetods.selectControlStateAgency();

        String txt = selectedStateAgencyInput.getText();
        Assert.assertTrue(txt.contains("Центральний"));

        regulatorBlock.shouldBe(visible);
    }

    @Test
    public void selectControlStateAgencyTest()


}