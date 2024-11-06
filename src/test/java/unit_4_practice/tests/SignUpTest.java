package unit_4_practice.tests;

import aquality.selenium.browser.AqualityServices;
import org.awaitility.Awaitility;
import org.testng.Assert;
import org.testng.annotations.Test;
import unit_4_practice.pages.LoginPage;
import unit_4_practice.pages.SignUpPage;

import java.time.Duration;

public class SignUpTest extends BaseTest {
      private final SignUpPage signUpPage = new SignUpPage();
      private final LoginPage loginPage = new LoginPage();
      @Test
      public void SignUp(){
            try{
                  Thread.sleep(5000);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }
            loginPage.clickOnSignUpButton();

            String iin = "";
            String first_name = "";
            String last_name = "";
            String email = "";
            String password = "";
            String repeat_password = "";

            signUpPage.inputCredential(iin, first_name, last_name, email, password, repeat_password);

            signUpPage.clickOnSignUpButton();

//            Assert.assertTrue(signUpPage.state().waitForDisplayed(), "Sign Up message isn't displayed");
      }
}
