package automation.definitions;

import automation.actions.HomePageActions;
import automation.actions.LoginPageActions;
import automation.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {

    public LoginPageActions loginPageObject = new LoginPageActions();
    public HomePageActions homePageObject = new HomePageActions();

    @Given("user is on login page {string}")
    public void user_is_on_login_page(String url) {
        HelperClass.openPage(url);
    }

    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
            loginPageObject.login(username, password);
    }

    @Then("user should be login successfully and home page opens")
    public void user_should_be_login_successfully_and_home_page_opens() {
        homePageObject.getDashboardName();
    }

    @Then("user should be able to see error message {string}")
    public void user_should_be_able_to_see_error_message(String invalidErrorMessage) {
       loginPageObject.getInvalidCredentialError();
    }

    @Then("user should be able to see a message {string} below username field")
    public void user_should_be_able_to_see_a_message_below_username_field(String errorMassage) {
        loginPageObject.getMissingUserNameError();
    }

    @Then("user should be able to see a message {string} below password field")
    public void user_should_be_able_to_see_a_message_below_password_field(String string) {
        loginPageObject.getMisingPasswordError();
    }




}
