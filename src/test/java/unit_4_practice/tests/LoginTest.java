package unit_4_practice.tests;

import aquality.selenium.browser.AqualityServices;
import org.awaitility.Awaitility;
import org.testng.Assert;
import org.testng.annotations.Test;
import unit_4_practice.pages.LoginPage;

import java.time.Duration;

import static io.qameta.allure.Allure.step;

public class LoginTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();

    @Test
    public void unsusccessfulLoginTest() {
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        loginPage.inputCredential("220107146@stu.sdu.edu.kz", "password");
        loginPage.clickOnLogInButton();
    }
}