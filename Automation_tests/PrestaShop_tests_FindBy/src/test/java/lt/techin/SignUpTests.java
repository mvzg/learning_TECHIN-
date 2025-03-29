package lt.techin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignUpTests extends BaseTest {

    @Test
    void testSucessfullSignUp() {

       IndexPage indexPage = new IndexPage(driver);
       indexPage.clickButtonSignIn();

       SignInPage signInPage = new SignInPage(driver);
       signInPage.clickLinkToSignUpPage();


        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.selectSocialTitleMrs();
        signUpPage.enterFirstName("Jane");
        signUpPage.enterLastName("Doe");
        signUpPage.enterEmail("JaneDoe47@email.com");
        signUpPage.enterPassword("PassWord5@");
        signUpPage.enterBirthDate("12/12/2015");
        signUpPage.clickCheckBoxReceiveOffers();
        signUpPage.clickCheckBoxAgreeToConditions();
        signUpPage.clickCheckBoxNewsletter();
        signUpPage.clickButtonSave();

        assertEquals("Jane Doe", indexPage.textOnMyAccount());

        indexPage.clickButtonSignOut();
        indexPage.clickButtonSignIn();
        signInPage.enterEmail("JaneDoe47@email.com");
        signInPage.enterPassword("PassWord5@");
        signInPage.clickSignInButton();
        indexPage.clickAccountLink();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickLinkToInformation();

        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);

        assertEquals("Jane", personalInformationPage.getFirstName());
        assertEquals("Doe", personalInformationPage.getLastName());
        assertEquals("JaneDoe47@email.com", personalInformationPage.getEmail());

    }

    @Test
    void testRegistrationWithEmptyRequiredFields() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickButtonSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLinkToSignUpPage();

        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.selectSocialTitleMrs();
        signUpPage.enterBirthDate("12/12/2015");
        signUpPage.clickCheckBoxReceiveOffers();
        signUpPage.clickCheckBoxAgreeToConditions();
        signUpPage.clickCheckBoxNewsletter();
        signUpPage.clickButtonSave();

        String expectedURL = "https://teststore.automationtesting.co.uk/index.php?controller=registration";
        assertEquals(expectedURL, driver.getCurrentUrl());

    }

    @Test
    void testRegistrationWithInvalidEmail() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickButtonSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLinkToSignUpPage();


        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.enterFirstName("Jane");
        signUpPage.enterLastName("Doe");
        signUpPage.enterEmail("user@com");
        signUpPage.enterPassword("PassWord5@");
        signUpPage.clickButtonSave();

        String expectedURL = "https://teststore.automationtesting.co.uk/index.php?controller=registration";
        assertEquals(expectedURL, driver.getCurrentUrl());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/invalid_formats.csv", numLinesToSkip = 1)
    void testWithCsv(String testCase, String firstName, String lastName, String email, String password, String expectedError) {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickButtonSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLinkToSignUpPage();


        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.enterFirstName(firstName);
        signUpPage.enterLastName(lastName);
        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);
        signUpPage.clickButtonSave();

        assertEquals(expectedError, signUpPage.getErrorText());
    }
}
