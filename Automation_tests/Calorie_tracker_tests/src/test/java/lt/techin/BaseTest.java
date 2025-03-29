package lt.techin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.expandtesting.com/tracalorie/?classId=672fd27a-83d7-44cc-9e33-1abb45b3e5b8&assignmentId=545ad04a-04d6-4696-9b35-b9e565281828&submissionId=cb22bf85-cae5-21b2-6ae2-e1b5bcdb2cc5");
    }

    @AfterEach
    void setDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
