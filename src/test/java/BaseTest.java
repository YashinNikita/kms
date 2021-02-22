import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.SignUpPage;

public class BaseTest {


    protected WebDriver driver;
    protected SignUpPage signUpPage;
    protected User user;
    protected Faker faker;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        signUpPage = new SignUpPage(driver);
        faker = new Faker();
        user = User.createRandomUser(faker);
    }

    @AfterClass
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }

}
