package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Config;

import java.util.List;

public class MainKmsPage extends BasePage {

    @FindBy(xpath = "//div[@class='product-item item-6']")
    WebElement selfServ;
    @FindBy(xpath = "//a[@id = 'hs-eu-decline-button']")
    WebElement declineBtn;

    public MainKmsPage(WebDriver driver) {
        super(driver);
    }

    public MainKmsPage open() {
        driver.navigate().to(Config.URL_MAIN_KMS);
        return this;
    }

    public SelfServicePage clickSelfService() {
        waiter.wait.until(ExpectedConditions.visibilityOf(declineBtn)).click();
        waiter.wait.until(ExpectedConditions.elementToBeClickable(selfServ)).click();
        return new SelfServicePage(driver);
    }
}
