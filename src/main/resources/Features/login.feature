
Feature: user can login
  @smoke
  Scenario: valid login
    Given homepage appear user click on Signup Login
    When user enter Email adress and password
    And user click on login button
    Then user name appear and user can login success

    Scenario Outline: Invalid login
      Given homepage appear user click on Signup Login
      When user enter "<Email>" adress and "<password>"
      And user click on login button


      Examples:
        | Email                 |           password      |
      |    qwdqcasc@gmail.com   |       asvasvasv5555     |
        |    scascwe  wsas@gmail.com   |       5555555555     |