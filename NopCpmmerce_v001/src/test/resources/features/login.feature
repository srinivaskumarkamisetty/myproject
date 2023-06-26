Feature: Login

Scenario: Verify email with invalid format
Given     User Should be in Homepage
When      User Should enter Invalid email Format
Then      Wrong email message should be visible
#And       Close Browser


Scenario: Verify email functionality leaving email as blank
Given     User Should be in Homepage
When      User leaving the Email text field as blank 
And       Click on Login button
Then      Please Enter your Email message should be visible
#And       Close Browser


Scenario: Verify Login button functionality withvalid data
Given     User Should be in Homepage
When      User Enter Email "admin@yourstore.com"
And       User Enter Password
|admin123|
|abc|
|admin|
And       Click on Login button
Then      Dashboard label should be displayed
#And       Close Browser


Scenario Outline: Verify Login button Functionality
Given User Should be in Homepage
When User Enter NopCommerce Email "<email>"
And User Enter NopCommerce Password "<password>"
And Click on Login button
Then Dashboard label should be displayed
#And Close Browser
Examples:
|email|password|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin|
|abcde@yourstore.com|admin|
|fghij@yourstore.com|admin|

