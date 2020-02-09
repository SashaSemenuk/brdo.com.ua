package test.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMethods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;
import static com.codeborne.selenide.Condition.visible;

public class LastNameFormTest extends SelenideSelectors {

    TestMain testMain = new TestMain();

    @BeforeMethod
    public void init() {
        testMain.setupClass();
        testMethods.openUrl();
    }

    @AfterMethod
    public void close(){
        testMain.closeDriver();
    }

    TestMethods testMethods = new TestMethods();

    @Test(dataProvider = "notValidLastNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void validLastNameRegistrationFormNegativeTest(String notValidLastNameRegistrationForm) {
        testMethods.inputLastName(notValidLastNameRegistrationForm);

        errorLastName.shouldBe(visible);
    }

    @Test(dataProvider = "validLastNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void validLastNameRegistrationFormPositiveTest(String notValidLastNameRegistrationForm) {
        testMethods.inputLastName(notValidLastNameRegistrationForm);

        successLastName.shouldBe(visible);
    }

}
