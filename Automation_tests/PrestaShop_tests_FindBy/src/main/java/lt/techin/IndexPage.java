package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    private WebElement buttonSignIn;

    @FindBy(css = "a[title='View my customer account'] span[class='hidden-sm-down']")
    private WebElement accountIconOnceLoggedIn;

    @FindBy(xpath = "//a[@class='logout hidden-sm-down']")
    private WebElement buttonSignOut;


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonSignIn() {
        buttonSignIn.click();
    }

    public String textOnMyAccount() {
        return accountIconOnceLoggedIn.getText();
    }

    public void clickButtonSignOut() {
        buttonSignOut.click();
    }

    public void clickAccountLink() {
        accountIconOnceLoggedIn.click();
    }

}
