package lt.techin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalorieTests extends BaseTest{
    @Test
    void testPositiveTest() {
        IndexPage indexPage = new IndexPage(driver);

        indexPage.clickButtonConsentToCookies();
        indexPage.enterInputMealItem("Pizza");
        indexPage.enterInputCaloriesItem("300");
        indexPage.clickButtonAddMeal();
        indexPage.enterInputMealItem("Tea");
        indexPage.enterInputCaloriesItem("2");
        indexPage.clickButtonAddMeal();

        assertEquals("Total Calories: 302", indexPage.getTextMessage());

    }

    @Test
    void testNegativeTest() {
        IndexPage indexPage = new IndexPage(driver);

        indexPage.clickButtonConsentToCookies();
        indexPage.enterInputMealItem("Pizza");
        indexPage.enterInputCaloriesItem("-200");
        indexPage.clickButtonAddMeal();
        indexPage.enterInputMealItem("Tea");
        indexPage.enterInputCaloriesItem("2");
        indexPage.clickButtonAddMeal();

        assertEquals("Error: calories cannot be negative, please enter a positive number", indexPage.getTextMessage());

    }
}
