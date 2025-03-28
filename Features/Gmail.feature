Feature: Gmail login

  Scenario: check whether login is successfull after entering valid credentials
    Given user should be registered
    When user enter valid username & password, click on login button
    Then login should be successfull
