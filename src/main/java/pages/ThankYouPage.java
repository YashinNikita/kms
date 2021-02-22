package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ThankYouPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'elementor-widget-container']//h1")
    WebElement thankYouMessage;

    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    public void assertThankYouMessage() {
        waiter.longWait.until(ExpectedConditions.visibilityOf(thankYouMessage));
        Assert.assertTrue(thankYouMessage.isDisplayed());
    }
}
