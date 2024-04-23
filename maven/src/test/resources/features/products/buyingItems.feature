@addToCart
Feature: Buy Some Items

  @additems
  Scenario: Adding Items to cart
    Given user is at products page
    When user adds items to cart	:
      | Sauce Labs Backpack     |
      | Sauce Labs Backpack     |
      | Sauce Labs Bolt T-Shirt |
    Then verify the cart items qty
    