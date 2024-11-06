package unit_4_practice.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementFactory;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AppointmentsPage extends Form {

      private final IElementFactory elementFactory = AqualityServices.getElementFactory();
      private final static By input_xpath = By.xpath("//*[@placeholder='Search...']");
      private final ITextBox input = elementFactory.getTextBox(input_xpath, "Input Label");

      private final static By appointment_xpath = By.xpath("//a[@href='/dashboard/appointments']");
      private final ILabel appointment = elementFactory.getLabel(appointment_xpath, "Appointment");

      public AppointmentsPage() {
            super(input_xpath, "Input Page");
      }

      public void search(String data) {
            input.clearAndType(data);
      }

      public void goToAppointment() {
            appointment.state().waitForClickable();
            appointment.click();
      }

}
