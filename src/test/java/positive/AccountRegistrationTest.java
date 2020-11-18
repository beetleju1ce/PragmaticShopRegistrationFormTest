package positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PragmaticShopHomePage;
import pages.RegistrationPage;
import util.Browser;
import util.CommonVerification;
import util.DataProviderClass;


public class AccountRegistrationTest {

    @BeforeMethod
    public void setUp(){
        Browser.open("chrome");
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "userData")
    public void registerAccount(String firstName, String lastName, String email, String telephone, String password){
        PragmaticShopHomePage.goTo();
        PragmaticShopHomePage.selectRegisterAccount();
        CommonVerification.verifyTitle("Register Account", "The expected page was not displayed!");
        RegistrationPage.completeRegistration(firstName, lastName, email, telephone, password);
        CommonVerification.verifyTitle("Your Account Has Been Created!", "Unsuccessful registration");
    }

    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }

}
