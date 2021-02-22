package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelfServicePage extends BasePage {

    @FindBy(xpath = "//div[@class='ytp-chrome-top-buttons']")
    WebElement copyLinkBtn;

    public SelfServicePage(WebDriver driver) {
        super(driver);
    }

    public void clickCopyLinkBtn(){
        copyLinkBtn.click();
    }

}
