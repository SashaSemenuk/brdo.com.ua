package test.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMethods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;

import static com.codeborne.selenide.Condition.visible;

public class PatronymicNameTest extends SelenideSelectors {

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

    @Test(dataProvider = "notValidPatronymicNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void notValidSurnameRegistrationFormNegativeTest(String notValidSurnameRegistrationForm) {
        testMethods.inputPatronymicName(notValidSurnameRegistrationForm);

        errorPatronymicName.shouldBe(visible);
    }


    @Test(dataProvider = "validPatronymicNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void validPatronymicNamRegistrationFormPositiveTest(String validPatronymicNameRegistrationForm) {
        testMethods.inputPatronymicName(validPatronymicNameRegistrationForm);

        successPatronymicName.shouldBe(visible);
    }

}
