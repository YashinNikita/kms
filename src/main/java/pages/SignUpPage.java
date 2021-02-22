package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Config;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'firstname-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id = 'lastname-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id = 'email-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id = 'phone-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    private WebElement phoneField;
    @FindBy(xpath = "//input[@id = 'company-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    private WebElement companyField;
    @FindBy(xpath = "//div[@class = 'actions']")
    private WebElement submitBtn;
    @FindBy(xpath = "//a[@id = 'hs-eu-confirmation-button']")
    private WebElement acceptCookiesBtn;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage open() {
        driver.navigate().to(Config.URL);
        return this;
    }

    public SignUpPage fillFirstNameField(String name) {
        firstNameField.sendKeys(name);
        return this;
    }

    public SignUpPage fillLastNameField(String name) {
        lastNameField.sendKeys(name);
        return this;
    }

    public SignUpPage fillEmailField(String name) {
        emailField.sendKeys(name);
        return this;
    }

    public SignUpPage fillPhoneField(String name) {
        phoneField.sendKeys(name);
        return this;
    }

    public SignUpPage fillCompanyField(String name) {
        companyField.sendKeys(name);
        return this;
    }

    public SignUpPage clickAcceptCookies() {
        waiter.wait.until(ExpectedConditions.visibilityOf(acceptCookiesBtn)).click();
        return this;
    }

    public ThankYouPage clickSubmit() {
        waiter.wait.until(ExpectedConditions.visibilityOf(submitBtn)).click();
        return new ThankYouPage(driver);
    }


}
