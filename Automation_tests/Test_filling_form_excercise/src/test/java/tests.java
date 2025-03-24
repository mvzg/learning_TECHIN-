import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Set;

public class tests {
    static WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form?classId=672fd27a-83d7-44cc-9e33-1abb45b3e5b8&assignmentId=f69410e7-908d-40f5-9ae4-f7e6d2f91b8e&submissionId=e94fc4d6-cfb3-0ca0-84c4-b03e90538569");
    }

    @AfterAll
    static void setDriver() {
        driver.quit();
    }

    @Test
    void fillAllInputs() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        Set<String> windowHandles = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();

        for (String handle : windowHandles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);


        driver.findElement(By.id("firstName")).sendKeys("Jane");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("Jane.Doe@techin.lt");

        WebElement genderRadio = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("label[for='gender-radio-2']")));
        genderRadio.click();

        driver.findElement(By.id("userNumber")).sendKeys("3706707108");

        WebElement inputDateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        inputDateOfBirth.sendKeys("12 Dec 1899");
        inputDateOfBirth.sendKeys(Keys.TAB);

        WebElement inputSubjects = driver.findElement(By.id("subjectsInput"));
        inputSubjects.sendKeys("Computer Science");
        inputSubjects.sendKeys(Keys.ENTER);
        inputSubjects.sendKeys("History");
        inputSubjects.sendKeys(Keys.ENTER);

       WebElement readingHobby = wait.until(ExpectedConditions.elementToBeClickable(
               By.cssSelector("label[for='hobbies-checkbox-2']")));
       readingHobby.click();

       WebElement musicHobby = wait.until(ExpectedConditions.elementToBeClickable(
               By.cssSelector("label[for='hobbies-checkbox-3']")));
       musicHobby.click();

        String filePath = "C:\\Users\\rutka\\OneDrive\\Desktop\\IMG_0522.JPG";
        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
        uploadElement.sendKeys(filePath);

        driver.findElement(By.id("currentAddress")).sendKeys("Adreso g. 5-12");

        //Select selectState = new Select(driver.findElement(By.id("state")));
        //selectState.selectByVisibleText("Haryana");

        //Select selectCity = new Select(driver.findElement(By.id("city")));
        //selectCity.selectByVisibleText("Karnal");

        driver.findElement(By.id("submit")).click();
    }
}
