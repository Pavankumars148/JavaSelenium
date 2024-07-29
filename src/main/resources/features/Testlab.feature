Feature: Starlab

  @all1
  Scenario: purchase a product from the cart
    Given the user launchss the application
    When user enters proper credentials
    Then user will add a product to cart
    Then user should purchase a product