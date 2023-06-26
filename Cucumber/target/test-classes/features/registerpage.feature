Feature: Register Account in Nopconmmerce

Scenario: Register NopCommerce with All fields with valid Data
Given User should be in NopCommerce page
When User Enter all fields 
And Click on Register button
Then Homepage label should be visible
And Close The Browser

Scenario: Register NopCommerce with empty fields
Given User should be in NopCommerce page
When User click on login without entering any fields
Then Error Messages should be displayed
And Close The Browser

Scenario: Register NopCommerce with only mandatory fields 
Given User should be in NopCommerce page
When User only mandatory fields 
And Click on Register button
Then Homepage label should be visible
And Close The Browser

Scenario Outline: Register NopCommerce with All fields with valid Data with multiple sets of data
Given User should be in NopCommerce page
When User enters "<firstname>" and "<lastname>" and "<email>" and "<password>" and "<confirmpassword>"
And Click on Register button
Then Homepage label should be visible
And Close The Browser
Examples:
|firstname|lastname|email|password|confirmpassword|
|vasu|kamisetty|vasu321@gmail.com|vasu1234|vasu1234|
|vasu|kamisetty|vasu4321@gmail.com|vasu12345|vasu12345|
|sreevasu|kamisetty|vasu3210@gmail.com|vasu1234|vasu1234|

