package test.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMetods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;

import static com.codeborne.selenide.Condition.visible;

public class PatronymicNameTest extends SelenideSelectors {

    TestMain testMain = new TestMain();

    @BeforeMethod
    public void init() {
        testMain.setupClass();
        testMetods.openUrl();
    }

    @AfterMethod
    public void close(){
        testMain.closeDriver();
    }

    TestMetods testMetods = new TestMetods();

    @Test(dataProvider = "notValidPatronymicNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void notValidSurnameRegistrationFormNegativeTest(String notValidSurnameRegistrationForm) {
        testMetods.inputPatronymicName(notValidSurnameRegistrationForm);

        errorPatronymicName.shouldBe(visible);
    }


    @Test(dataProvider = "validPatronymicNameRegistrationForm", dataProviderClass = DataProviders.class)
    public void validPatronymicNamRegistrationFormPositiveTest(String validPatronymicNameRegistrationForm) {
        testMetods.inputPatronymicName(validPatronymicNameRegistrationForm);

        successPatronymicName.shouldBe(visible);
    }

}
