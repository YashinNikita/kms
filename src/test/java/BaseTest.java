import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {


    protected WebDriver driver;
    protected User user;
    protected Faker faker;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        faker = new Faker();
        user = User.createRandomUser(faker);
    }

    @AfterSuite
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }

}
