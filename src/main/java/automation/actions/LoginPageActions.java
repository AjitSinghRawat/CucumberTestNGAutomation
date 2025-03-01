package automation.actions;

import automation.locators.LoginPageLocators;
import automation.utils.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageActions {
    private static final Logger log = LoggerFactory.getLogger(LoginPageActions.class);
    LoginPageLocators loginPageLocators =null;

    public LoginPageActions(){
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }
    public String getMissingUserNameError(){
        return loginPageLocators.missingUsernmeErrorMessage.getText();
    }
    public String getMisingPasswordError(){
        return loginPageLocators.missingPasswordErrorMessage.getText();
    }

    public String getInvalidCredentialError(){
        return loginPageLocators.invalidLoginError.getText();
    }


    public void login(String userName, String password) {
        loginPageLocators.userName.sendKeys(userName);
        loginPageLocators.password.sendKeys(password);
        loginPageLocators.submit.click();
    }



}
