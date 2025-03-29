package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage extends BasePage{

    @FindBy(xpath = "//input[@id='field-firstname']")
    private WebElement firstName;

    @FindBy(css = "#field-lastname")
    private WebElement lastName;

    @FindBy(css = "#field-email")
    private WebElement email;

    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstName() {
        return firstName.getAttribute("value");
    }

    public String getLastName() {
        return lastName.getAttribute("value");
    }

    public String getEmail() {
        return email.getAttribute("value");
    }

}
