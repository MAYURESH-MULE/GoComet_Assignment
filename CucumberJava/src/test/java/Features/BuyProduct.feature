Feature: Test Buying functionality
Scenario: Check if we can order products

Given browser is open
And user is on login page
When user clicks product
And user clicks on add that product
Then product is directed to Cart
And user can use Cart tab
And user can Place Order
And Fill the Orders and Place Order