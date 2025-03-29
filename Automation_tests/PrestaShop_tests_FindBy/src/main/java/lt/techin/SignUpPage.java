package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;


public class SignUpPage extends BasePage {

    @FindBy(xpath = "//input[@id='field-id_gender-1']")
    private WebElement inputSocialTitleMr;

    @FindBy(xpath = "//input[@id='field-id_gender-2']")
    private WebElement inputSocialTitleMrs;

    @FindBy(css = "#field-firstname")
    private WebElement inputFirstName;

    @FindBy(css = "#field-lastname")
    private WebElement inputLastName;

    @FindBy(css = "#field-email")
    private WebElement inputEmail;

    @FindBy(css = "#field-password")
    private WebElement inputPassword;

    @FindBy(css = "#field-birthday")
    private WebElement inputBirthdate;

    @FindBy(xpath = "//input[@name='optin']")
    private WebElement checkBoxReceiveOffers;

    @FindBy(xpath = "//input[@name='psgdpr']")
    private WebElement checkBoxAgreeToConditions;

    @FindBy(xpath = "//input[@name='newsletter']")
    private WebElement checkBoxNewsletter;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement buttonSave;

    @FindBy(xpath = "//li[@class='alert alert-danger']")
    private WebElement errorText;


    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    public void selectSocialTitleMr() {
        inputSocialTitleMr.click();
    }

    public void selectSocialTitleMrs() {
        inputSocialTitleMrs.click();
    }

    public void enterFirstName(String input) {
        inputFirstName.sendKeys(input);
    }

    public void enterLastName(String input) {
        inputLastName.sendKeys(input);
    }

    public void enterEmail(String input) {
        inputEmail.sendKeys(input);
    }

    public void enterPassword(String input) {
      //  String randomPassword = UUID.randomUUID().toString().substring(0, 8);
      //  inputEmail.sendKeys(randomPassword);

        inputPassword.sendKeys(input);
    }

    public void enterBirthDate(String input) {
        inputBirthdate.sendKeys(input);
    }

    public void clickCheckBoxReceiveOffers() {
        checkBoxReceiveOffers.click();
    }

    public void clickCheckBoxAgreeToConditions() {
        checkBoxAgreeToConditions.click();
    }

    public void clickCheckBoxNewsletter() {
        checkBoxNewsletter.click();
    }

    public void clickButtonSave() {
        buttonSave.click();
    }

    public String getErrorText() {
        return errorText.getText();
    }


}
