package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Waiters;

public class BasePage {

    protected WebDriver driver;
    protected Waiters waiter;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.waiter = new Waiters(driver);
    }
}
