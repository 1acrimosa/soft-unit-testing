package unit_4_practice.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import unit_4_practice.constants.LocatorConstants;
import org.openqa.selenium.By;

public class LoginPage extends Form {


    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final static By login_text_xpath = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH,
            "Please sign in to continue."));
    private final By signup_button_xpath = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH,
            "Do not have an account? Sign up."));
    private final By login_button_xpath = By.xpath("//button[contains(text(), 'Log In')]");
    private final By email_field_xpath = By.name("email");
    private final By password_field_xpath = By.name("password");
    private final IButton login_button = elementFactory.getButton(login_button_xpath, "Log In Button");
    private final IButton signup_button = elementFactory.getButton(signup_button_xpath, "Sign Up Button");
    private final ITextBox email_field = elementFactory.getTextBox(email_field_xpath, "Email input field");
    private final ITextBox password_field = elementFactory.getTextBox(password_field_xpath, "Password input field");

    private final By dashboard_xpath = By.xpath("//*[contains(text(), 'Dashboard')]");
    private final ILabel dashboard_text = elementFactory.getLabel(dashboard_xpath, "Dashboard Label");


    public LoginPage() {
        super(login_text_xpath, "Start Page");
    }

    public void clickOnLogInButton() {
        login_button.click();
    }
    public void clickOnSignUpButton() {
        signup_button.state().waitForClickable();
        signup_button.click();
    }
    public void inputCredential(String email, String password){
        email_field.clearAndType(email);
        password_field.clearAndType(password);
    }
    public boolean checkLogin() {
        return dashboard_text.getElement().isDisplayed();
    }
}