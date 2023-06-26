Feature: NopCommerce Login

Scenario: Login NopCommerce With Validata
Given User should be in homepage
When User enter Email
And User enter password
And click on loginbutton
Then Homepage should be displayed
And close browser


Scenario: Login NopCommerce With InValidata
Given User should be in homepage
When User enter InvalidEmail
And User enter password
And click on loginbutton
Then Login was unsuccessful. Please correct the errors and try again.No customer account found message should display.
And close browser
