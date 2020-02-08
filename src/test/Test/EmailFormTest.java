package test.Test;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Metods.TestMetods;
import test.PO.DataProviders;
import test.PO.SelenideSelectors;
import test.TestMain;

import static com.codeborne.selenide.Condition.visible;

public class EmailFormTest extends SelenideSelectors {

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

    @Test(dataProvider = "notValidEmailRegistrationForm", dataProviderClass = DataProviders.class)
    public void validEmailRegistrationFormNegativeTest(String validEmailLoginForm) {
        testMetods.inputEmail(validEmailLoginForm);

        errorEmail.shouldBe(visible);
    }

    @Test(dataProvider = "validEmailRegistrationForm", dataProviderClass = DataProviders.class)
    public void validEmailRegistrationFormPositiveTest(String validEmailRegistrationForm) {
        testMetods.inputEmail(validEmailRegistrationForm);

        successEmail.shouldBe(visible);
    }

    @Test
    public void inputEmail(){
        testMetods.inputEmail("test@gmail.com");
        successEmail.shouldBe(visible);
    }

}
