package test.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMethods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;
import static com.codeborne.selenide.Condition.visible;

public class NameFormTest extends SelenideSelectors {

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

    @Test(dataProvider = "notValidNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void NotValidNameRegistrationFormNegativeTest(String notValidNameRegistrationForm) {
        testMethods.inputName(notValidNameRegistrationForm);

        errorName.shouldBe(visible);
    }


    @Test(dataProvider = "validNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void validNameRegistrationFormPositiveTest(String validNameRegistrationForm) {
        testMethods.inputName(validNameRegistrationForm);

        successName.shouldBe(visible);
    }

}