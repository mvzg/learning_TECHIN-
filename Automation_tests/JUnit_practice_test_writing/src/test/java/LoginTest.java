import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    void setDriver() {
        driver.quit();
    }

    @Test
    void testValidLogin() {
        WebElement inputUsername = driver.findElement(By.id("user-name"));
        inputUsername.sendKeys("standard_user");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        String expectedURL = "https://www.saucedemo.com/inventory.html";
        assertEquals(expectedURL, driver.getCurrentUrl());

        WebElement shoppingCartLink = driver.findElement(By.cssSelector(".shopping_cart_link"));
        assertTrue(shoppingCartLink.isDisplayed(), "Shopping cart link is not displayed");
    }

    @Test
    void testInvalidLogin() {
        WebElement inputCorrectUsername = driver.findElement(By.id("user-name"));
        inputCorrectUsername.sendKeys("standard_user");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("wrong_password");

        driver.findElement(By.id("login-button")).click();

        WebElement message = driver.findElement(By.cssSelector(".error-message-container"));
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        assertEquals(expectedMessage, message.getText());
    }

    @Test
    void testLockedOutUser() {
        WebElement inputLockedOutUser = driver.findElement(By.id("user-name"));
        inputLockedOutUser.sendKeys("locked_out_user");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        WebElement message = driver.findElement(By.cssSelector(".error-message-container"));
        String expectedMessage = "Epic sadface: Sorry, this user has been locked out.";
        assertEquals(expectedMessage, message.getText());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/logins.csv", numLinesToSkip = 1)
    void testWithCsv(String userName, String password) {

        WebElement inputUsername = driver.findElement(By.id("user-name"));
        inputUsername.sendKeys(userName);

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys(password);

        driver.findElement(By.id("login-button")).click();

        String expectedURL = "https://www.saucedemo.com/inventory.html";
        assertEquals(expectedURL, driver.getCurrentUrl());
    }

    @Test
    void timeoutNotExceeded() {
        assertTimeout(Duration.ofSeconds(2), () -> {

            WebElement inputUsername = driver.findElement(By.id("user-name"));
            inputUsername.sendKeys("performance_glitch_user");

            WebElement inputPassword = driver.findElement(By.id("password"));
            inputPassword.sendKeys("secret_sauce");

            driver.findElement(By.id("login-button")).click();

            String expectedURL = "https://www.saucedemo.com/inventory.html";
            assertEquals(expectedURL, driver.getCurrentUrl());
        });
    }

}
