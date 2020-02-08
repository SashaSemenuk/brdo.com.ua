package test.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMethods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;

import static com.codeborne.selenide.Condition.visible;

public class PositionTest extends SelenideSelectors {

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

    @Test(dataProvider = "notValidPositionRegistrationForm", dataProviderClass = DataProviders.class)
    public void notValidNameRegistrationFormNegativeTest(String notValidPositionRegistrationForm) {
        testMethods.inputPosition(notValidPositionRegistrationForm);

        errorPosition.shouldBe(visible);
    }


    @Test(dataProvider = "validPositionRegistrationForm", dataProviderClass = DataProviders.class)
    public void validNameRegistrationFormPositiveTest(String validPositionRegistrationForm) {
        testMethods.inputPosition(validPositionRegistrationForm);

        successPosition.shouldBe(visible);
    }

}