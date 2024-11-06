package unit_4_practice.tests;

import org.testng.annotations.Test;
import unit_4_practice.pages.AppointmentsPage;
import unit_4_practice.pages.LoginPage;

public class AppointmentsTest extends BaseTest {
      private final AppointmentsPage appointmentsPage = new AppointmentsPage();
      private final LoginPage loginPage = new LoginPage();

      @Test
      public void checkDoctors() {
            try{
                  Thread.sleep(5000);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }

            loginPage.inputCredential("220107146@stu.sdu.edu.kz", "password");
            loginPage.clickOnLogInButton();
            appointmentsPage.state().waitForDisplayed();
            appointmentsPage.goToAppointment();

            try{
                  Thread.sleep(2000);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }

            appointmentsPage.search("Arsenbergen");

            try{
                  Thread.sleep(2000);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }
      }

}
