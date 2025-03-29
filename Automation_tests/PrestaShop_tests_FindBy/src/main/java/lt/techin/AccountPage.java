package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//a[@id='identity-link']//span[@class='link-item']")
    private WebElement linkToInformation;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkToInformation() {
        linkToInformation.click();
    }
}
