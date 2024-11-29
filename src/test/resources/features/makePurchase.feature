Feature: Make a purchase

  @makeAPurchase

  Scenario: Make a purchase
    Given Dafiti was opened in the main page
    And product is searched
    And the product is added to cart
    When log in Dafiti
    Then see the purchase summary