package unit_4_practice.pages;

import unit_4_practice.constants.LocatorConstants;
import unit_4_practice.constants.MainPageNavigation;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
      public MainPage() {
            super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Welcome to the-internet")), "Main Page");
      }
      private ILink getNavigationLink(MainPageNavigation navigation) {
            return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                    navigation.getLabel())), navigation.getLabel());
      }
      private ILink getNavigationLink(String navigation) {
            return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                    navigation)), "Element for navigation");
      }
      public void clickNavigationLink(String navigationLink) {
            getNavigationLink(navigationLink).click();
      }
      public void clickNavigationLink(MainPageNavigation navigation) {
            getNavigationLink(navigation).click();
      }
}