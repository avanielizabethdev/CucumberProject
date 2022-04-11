Feature: This feature would be used to design the login page of the application

  Background: Open the application
    Given I have opened the application in browser

  @Sanity
  Scenario: Validate the succesful login
    When I click on the Login link
    And I enter username
    And I enter password
    And I click on the login button
    Then I should be Landed on the Home Page

  @Regression
  Scenario: Validate the succesful login using test data
    When I click on the Login link
    And I enter username "abc@xyz.com"
    And I enter password "Test@123"
    And I click on the login button
    Then I should be Landed on the Home Page
@Regression @Rapid
  Scenario Outline: Validate the succesful login using multiple test data
    When I click on the Login link
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login button
    Then I should be Landed on the Home Page

    Examples: 
      | UserName     | Password |
      | abc@xyz.com  | Test@123 |
      | avani@xyz.co | Test@123 |

  Scenario: Validate the Negative login using test data
    When I click on the Login link
    And I enter username "abc@xyz.com"
    And I enter password "Test@123"
    And I click on the login button
    Then I should get the eroor message as "The email or password you have entered is invalid."
