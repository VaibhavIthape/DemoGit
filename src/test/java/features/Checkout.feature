Feature: Search and Place the order

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart Landing page
When User searched with Shorthome <Name> and extract actual name of product
And Added "3" items of the selected product to cart
Then User Proceed to checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples: 
| Name	|
| Tom		|

