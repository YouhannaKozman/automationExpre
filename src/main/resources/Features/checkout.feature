
Feature: user can login
  @smok
  Scenario: valid login
    Given homepage appear user click on Signup Login
    When user enter Email adress and password
    And user click on login button
#    Then user name appear and user can login success
    Given user click on products buttons
    When user search on item and click search button
    And user add the item to cart
    Then user click on view cart button
    Given user can click on proceed to checkout
    When user can place order
    And user fill his card info
    Then user can click confirm order