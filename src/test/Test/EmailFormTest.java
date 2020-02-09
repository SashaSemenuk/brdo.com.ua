package test.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMethods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;
import static com.codeborne.selenide.Condition.visible;

public class EmailFormTest extends SelenideSelectors {

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

    @Test(dataProvider = "notValidEmailRegistrationForm", dataProviderClass = DataProviders.class)
    public void validEmailRegistrationFormNegativeTest(String validEmailLoginForm) {
        testMethods.inputEmail(validEmailLoginForm);

        errorEmail.shouldBe(visible);
    }

    @Test(dataProvider = "validEmailRegistrationForm", dataProviderClass = DataProviders.class)
    public void validEmailRegistrationFormPositiveTest(String validEmailRegistrationForm) {
        testMethods.inputEmail(validEmailRegistrationForm);

        successEmail.shouldBe(visible);
    }

    @Test
    public void inputEmail(){
        testMethods.inputEmail("test@gmail.com");
        successEmail.shouldBe(visible);
    }

}
