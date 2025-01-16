
Feature: user can search and add product
  @smoke
  Scenario: valid search and product added
    Given user click on products buttons
    When user search on item and click search button
    And user add the item to cart
    Then user click on view cart button