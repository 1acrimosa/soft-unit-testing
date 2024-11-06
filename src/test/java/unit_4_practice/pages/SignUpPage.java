package unit_4_practice.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import unit_4_practice.constants.LocatorConstants;
import org.openqa.selenium.By;

public class SignUpPage extends Form {

      String signup_messages = "Create your account to get started and explore all the features.";

      private final IElementFactory elementFactory = AqualityServices.getElementFactory();
      private final static By sign_up_text_xpath = By.xpath("//*[contains(text(), '')]");
      private final By signup_button_xpath = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, "Sign Up"));
      private final By login_button_xpath = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, "Log In"));
      private final IButton login_button = elementFactory.getButton(login_button_xpath, "Log In Button");
      private final IButton signup_button = elementFactory.getButton(signup_button_xpath, "Sign Up Button");

      private final By iin_field_xpath = By.name("IIN");
      private final By first_name_field_xpath = By.name("firstName");
      private final By last_name_field_xpath = By.name("lastName");
      private final By email_field_xpath = By.name("email");
      private final By password_field_xpath = By.name("password");
      private final By repeat_password_field_xpath = By.name("repeat_password");

      private final ITextBox iin_field = elementFactory.getTextBox(iin_field_xpath, "IIN input field");
      private final ITextBox first_name_field = elementFactory.getTextBox(first_name_field_xpath, "First name input field");
      private final ITextBox last_name_field = elementFactory.getTextBox(last_name_field_xpath, "Last name input field");
      private final ITextBox email_field = elementFactory.getTextBox(email_field_xpath, "Email input field");
      private final ITextBox password_field = elementFactory.getTextBox(password_field_xpath, "Password input field");
      private final ITextBox repeat_password_field = elementFactory.getTextBox(repeat_password_field_xpath, "Repeat password input field");


      public SignUpPage() {
            super(sign_up_text_xpath, "Start Page");
      }

      public void inputCredential
              (String iin, String first_name, String last_name, String email, String password, String repeat_password){
            iin_field.clearAndType(iin);
            first_name_field.clearAndType(first_name);
            last_name_field.clearAndType(last_name);
            email_field.clearAndType(email);
            password_field.clearAndType(password);
            repeat_password_field.clearAndType(repeat_password);
      }

      public void clickOnLogInButton() {
            login_button.click();
      }
      public void clickOnSignUpButton() {
            signup_button.click();
      }

      public void filInBoxes() {

      }


}