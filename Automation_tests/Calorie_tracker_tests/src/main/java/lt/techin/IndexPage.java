package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{
    @FindBy(xpath = "//input[@id='item-name']")
    private WebElement inputMealItem;

    @FindBy(css = "#item-calories")
    private WebElement inputCaloriesItem;

    @FindBy(xpath = "//button[normalize-space()='Add Meal']")
    private WebElement buttonAddMeal;

    @FindBy(xpath = "//h3[@class='center-align']")
    private WebElement textMessage;

    @FindBy(css = ".fc-button-label")
    private WebElement buttonConsentToCookies;



    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void enterInputMealItem(String input) {
        inputMealItem.sendKeys(input);
    }

    public void enterInputCaloriesItem(String input) {
        inputCaloriesItem.sendKeys(input);
    }

    public void clickButtonAddMeal() {
        buttonAddMeal.click();
    }

    public String getTextMessage() {
        return textMessage.getText();
    }

    public void clickButtonConsentToCookies() {
        buttonConsentToCookies.click();
    }

}
