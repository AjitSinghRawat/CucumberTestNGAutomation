package automation.actions;

import automation.locators.HomePageLocators;
import automation.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {

    public HomePageLocators homePageLocators =  null;

    public HomePageActions(){
        this.homePageLocators  = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
    }

    public String getDashboardName(){
        return homePageLocators.dashboard.getText();
    }

}
