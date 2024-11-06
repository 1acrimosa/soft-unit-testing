package unit_4_practice.tests;

import unit_4_practice.pages.MainPage;
import unit_4_practice.utils.SettingsTestData;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static io.qameta.allure.Allure.step;

public abstract class BaseTest {
    protected final MainPage mainPage = new MainPage();
    protected Browser browser;
    @BeforeMethod
    public void setup() {
        step("Open the browser");
        browser = AqualityServices.getBrowser();
        step("Maximize the browser window");
        browser.maximize();
        step("Go to the start URL");
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }
    @AfterMethod
    public void teardown() {
        step("Quiting the browser");
        browser.quit();
    }
}