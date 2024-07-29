Feature: amazon

  @amazon
  Scenario: Order a pen
    Given launch Amazon
    When pen is in store
    Then add to cart
    Then open the cart