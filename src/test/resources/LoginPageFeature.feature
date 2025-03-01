Feature: Login to HRM application
Background:
Given user is on login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  @validCredentials
  Scenario: login with valid credentials
    When user enters username as "Admin" and password as "admin123"
    Then user should be login successfully and home page opens

  @invalidCredentials
    Scenario Outline: login with invalid credentials
      When user enters username as "<username>" and password as "<password>"
      Then user should be able to see error message "<errorMassage>"
      Examples:
        | username | password | errorMassage        |  |
        | admin    | admin432 | Invalid credentials |  |
        | admint   | admin123 | Invalid credentials |  |
        | invalid  | invalid  | Invalid credentials |  |

  @blankCredentials @FailedTest
      Scenario: Login with blank user name
        When user enters username as "" and password as "admin123"
        Then user should be able to see a message "Required" below username field

  @blankCredentials @FailedTest
  Scenario: Login with blank password
    When user enters username as "Admin" and password as ""
    Then user should be able to see a message "Required" below password field

