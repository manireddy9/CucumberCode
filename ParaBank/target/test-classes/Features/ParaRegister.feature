Feature: Checking the Registration functionality

  Scenario: Successfully login with valid entires
  Given  User navigate to ParabankPage
    When  User Navigate to registeration Page
    And  user enters the required details
    And  user clicks the register
    Then  Register must be Succesful
