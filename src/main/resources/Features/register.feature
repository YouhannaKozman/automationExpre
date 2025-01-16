Feature: user can register
  @smoke
  Scenario: valid register
    Given homepage directed user click on Signup Login
    When user enter Name and Email Adress
    And user fill his info
    Then user click on create account