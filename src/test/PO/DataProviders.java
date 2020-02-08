package test.PO;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "notValidEmailRegistrationForm")
    public Object[] notValidEmailRegistrationForm() {
        return new Object[][]{
                {" "},
                {"testgmail.com"},
                {"Tes t@gmail.com"},
                {"test@gma il.com"},
                {"@gmail.com"},
                {"test@"},
                {"test@@gmail.com"},
                {"test@gmail_ua.com"},
                {"test@gmail,com"},
                {"Test,t@gmail.com"},
                {"test@gmail%:№.com"},
                {"test123@gma_il.com"},
        };
    }

    @DataProvider(name = "validEmailRegistrationForm")
    public Object[] validEmailRegistrationForm() {
        return new Object[][]{
                {"test@gmail.com"},
                {"TEST@GMAIL.COM"},
                {"test123@gmail.com"},
                {"test@gmail.com123"},
                {"test-test@gmail.com"},
                {"ttest-test@gmail.com-ua"},
                {"test_123@gmail.com"},
                {"test.123@gmail.com"},
                {"test123@gmail.com.ua"},
        };
    }

    @DataProvider(name = "notValidLastNameRegistrationForm")
    public Object[] notValidLastNameRegistrationForm() {
        return new Object[][]{
                {"aа"},
                {" "},
                //{"ivanov"},
                //{"123456"},
                // {"@#$%^&;.?,>|\\/№\"!()_{}[<~"},
                //{"І4в2ар0в"},
        };
    }

    @DataProvider(name = "validLastNameRegistrationForm")
    public Object[] validLastNameRegistrationForm() {
        return new Object[][]{
                {"Іванов"},
                {"ІВАНОВ"},
                {"ІвАнОв"},
                {"Іванов-Петров"},
                {"Іва'нов"},
        };
    }

    @DataProvider(name = "notValidNameRegistrationForm")
    public Object[] notValidNameRegistrationForm() {
        return new Object[][]{
                {"aа"},
                {" "},
                //{"ivan"},
                //{"123456"},
                // {"@#$%^&;.?,>|\\/№\"!()_{}[<~"},
                //{"І4в2ан"},
        };
    }

    @DataProvider(name = "validNameRegistrationForm")
    public Object[] validNameRegistrationForm() {
        return new Object[][]{
                {"Іван"},
                {"ІВАН"},
                {"ІвАн"},
                {"Іванов-Петро"},
                {"Іва'н"},
        };
    }


    @DataProvider(name = "notValidPatronymicNameRegistrationForm")
    public Object[] notValidPatronymicNameRegistrationForm() {
        return new Object[][]{
                {"aа"},
                {" "},
                //{"ivan"},
                //{"123456"},
                // {"@#$%^&;.?,>|\\/№\"!()_{}[<~"},
                //{"І4в2ан"},
        };
    }

    @DataProvider(name = "validPatronymicNameRegistrationForm")
    public Object[] validPatronymicNameRegistrationForm() {
        return new Object[][]{
                {"Іванович"},
                {"ІВАНОВИЧ"},
                {"ІвАнОвИч"},
                {"Іва'нович"},
        };
    }


@DataProvider(name = "notValidPositionRegistrationForm")
    public Object[] notValidPositionRegistrationForm() {
        return new Object[][]{
                {"aаaa"},
                {" "},
                //{"nachalnik viddilu"},
                //{"123456"},
                // {"@#$%^&;.?,>|\\/№\"!()_{}[<~"},
        };
    }

    @DataProvider(name = "validPositionRegistrationForm")
    public Object[] validPositionRegistrationForm() {
        return new Object[][]{
                {"начальник відділу"},
                {"НАЧАЛЬНИК ВІДДІЛУ"},
                {"НаЧаЛьНиК ВіДдіЛу"},
                {"начальн'ик відділ'у"},
        };
    }

    @DataProvider(name = "validPhoneRegistrationForm")
    public Object[] validPhoneRegistrationForm() {
        return new Object[][]{
                {"0671234567"},
                {"06712345"},
                {" "},
        };
    }

    @DataProvider(name = "validPasswordRegistrationForm")
    public Object[] validPasswordRegistrationForm() {
        return new Object[][]{
                {"1234567"},
                {"аааа1234"},
                {"@#$%^&;.?,>|\\/№\"!()_{}[<~"},
        };
    }

    @DataProvider(name = "notValidPasswordRegistrationForm")
    public Object[] notValidPasswordRegistrationForm() {
        return new Object[][]{
                {" "},
                {"аааа1"},
        };
    }

}
