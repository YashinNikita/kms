import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

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
