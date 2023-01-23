Feature: Search and Place the order
Feature: No Way

@Offerspage
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart Landing page
When User searched with Shorthome <Name> and extract actual name of product
Then User Searched for <Name> shortname in offers page to check if product exist with same name
And validate product name in offers page matches with Landing page

Examples: 
| Name	|
| Tom		|
| Beet	|