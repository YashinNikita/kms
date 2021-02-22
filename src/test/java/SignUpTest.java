import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {

    protected SignUpPage signUpPage;

    @BeforeClass
    public void setUpPage(){
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void fillName() {
        signUpPage.open()
                .fillFirstNameField(user.name)
                .fillLastNameField(user.lastName)
                .fillEmailField(user.email)
                .fillPhoneField(user.phone)
                .fillCompanyField(user.company)
                .clickAcceptCookies()
                .clickSubmit()
                .assertThankYouMessage();
    }
}
