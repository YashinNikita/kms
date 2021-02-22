import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainKmsPage;
import pages.SelfServicePage;

public class SelfServiceTest extends BaseTest {

    private SelfServicePage selfServicePage;
    private MainKmsPage mainKmsPage;

    @BeforeClass
    public void setUpPage(){
        selfServicePage = new SelfServicePage(driver);
        mainKmsPage = new MainKmsPage(driver);
    }

    @Test
    public void checkLinkOnSelfServicePage(){
        mainKmsPage.open();
        mainKmsPage.clickSelfService();
        selfServicePage.clickCopyLinkBtn();
        //TODO open youtube and CTRL-V, check name of the video;
    }
}
