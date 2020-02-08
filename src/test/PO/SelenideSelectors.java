package test.PO;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SelenideSelectors {

    //Email Form
    protected SelenideElement inputEmail =  $x("//*[@id ='signupform-email']");
    protected SelenideElement successEmail =  $x("//*[@class='form-group highlight-addon field-signupform-email required has-success']");
    protected SelenideElement errorEmail =  $x("//*[@class='form-group highlight-addon field-signupform-email required has-error']");

    //Last Name Form
    protected SelenideElement inputLastName =  $x("//*[@id='signupform-last_name']");
    protected SelenideElement errorLastName =  $x("//*[@class='form-group highlight-addon field-signupform-last_name required has-error']");
    protected SelenideElement successLastName =  $x("//*[@class='form-group highlight-addon field-signupform-last_name required has-success']");

    //Name Form
    protected SelenideElement inputName =  $x("//*[@id='signupform-first_name']");
    protected SelenideElement errorName =  $x("//*[@class='form-group highlight-addon field-signupform-first_name required has-error']");
    protected SelenideElement successName =  $x("//*[@class='form-group highlight-addon field-signupform-first_name required has-success']");

    //Surname Form
    protected SelenideElement inputPatronymicName =  $x("//*[@id='signupform-patronymic_name']");
    protected SelenideElement errorPatronymicName =  $x("//*[@class='form-group highlight-addon field-signupform-patronymic_name required has-error']");
    protected SelenideElement successPatronymicName =  $x("//*[@class='form-group highlight-addon field-signupform-patronymic_name required has-success']");

    //Surname Position
    protected SelenideElement inputPosition =  $x("//*[@id='signupform-position']");
    protected SelenideElement errorPosition =  $x("//*[@class='form-group highlight-addon field-signupform-position required has-error']");
    protected SelenideElement successPosition =  $x("//*[@class='form-group highlight-addon field-signupform-position required has-success']");

    //Phone
    protected SelenideElement inputPhone =  $x("//*[@id='signupform-phone']");

    //Password
    protected SelenideElement inputPassword =  $x("//*[@id='signupform-password']");
    protected SelenideElement errorPassword =  $x("//*[@class='form-group highlight-addon field-signupform-password required has-error']");
    protected SelenideElement successPassword =  $x("//*[@class='form-group highlight-addon field-signupform-password required has-success']");

    //StateAgency


    protected SelenideElement errorTypeStateAgency =  $x("//*[@class='form-group highlight-addon field-signupform-regulator_type required has-error']");
    protected SelenideElement errorStateAgency =  $x("//*[@class='form-group highlight-addon field-signupform-regulator_id required has-error']");
    protected SelenideElement regulatorBlock =  $x("//*[@id='regulator-block']");
    protected SelenideElement textSpheresControl =  $x("//*[@class='select2-selection__choice']");
    protected SelenideElement selectAllTextSpheresControl =  $x("//*[@class='s2-select-label']");
    protected SelenideElement recaptchaCheckbox =  $x("//*[@id=\"signupform-recaptcha-recaptcha-form-signup\"]//iframe");
    protected SelenideElement submitBan =  $x("//*[@class='btn btn-primary btn-block']");
    protected ElementsCollection deleteStateAgencyBtn =  $$x("//*[@class='select2-selection__clear']");
    protected ElementsCollection stateAgencyList =  $$x("//*[@class='select2-results__options']//li");
    protected ElementsCollection selectStateAgencyBtn =  $$x("//*[@class='select2-selection__arrow']");
    protected ElementsCollection selectedStateAgencyInput =  $$x("//*[@class='select2-selection__rendered']");
}
