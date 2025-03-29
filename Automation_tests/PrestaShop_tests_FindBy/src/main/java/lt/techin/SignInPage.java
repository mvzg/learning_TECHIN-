package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='No account? Create one here']")
    private WebElement linkToSignUpPage;

    @FindBy(xpath = "//input[@id='field-email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='field-password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement buttonSignIn;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkToSignUpPage() {
        linkToSignUpPage.click();
    }

    public void enterEmail(String input) {
        inputEmail.sendKeys(input);
    }

    public void enterPassword(String input) {
        inputPassword.sendKeys(input);
    }

    public void clickSignInButton() {
        buttonSignIn.click();
    }
}
