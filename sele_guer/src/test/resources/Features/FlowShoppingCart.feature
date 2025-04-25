Feature: Product Search, Cart, and Checkout Flow

  As a user
  I want to search and filter products, add them to the cart, and complete a purchase
  So that I can shop easily and efficiently

  Background:
    Given the user is on the ShopSmart catalog page

  Scenario: Complete product search, add to cart, and checkout process
    When the user filters the results by name, category or price range
    And the user adds the product to the cart
    And the cart should show product with its price
    And the user proceeds to checkout
    Then the system should request a shipping address