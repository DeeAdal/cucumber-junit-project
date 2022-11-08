Feature: User surf to webpage to buy product

@adidas
  Scenario: User surf to webpage to buy product
    Given User go to demo online shop
    When User navigation through product categories: Phones, Laptops and Monitors
    And Navigate to Laptop → Sony vaio i5 and click on Add to cart. Accept pop up confirmation.
    And Navigate to Laptop → Dell i7 8gb and click on Add to cart. Accept pop up confirmation.
    And Navigate to Cart → Delete Dell i7 8gb from cart.
    And Click on Place order.
    And Fill in all web form fields.
    And Click on Purchase
    When Capture and log purchase Id and Amount.
    Then Assert purchase amount equals expected.
    And Click on Ok