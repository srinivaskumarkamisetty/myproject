$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NopCommercelogin.feature");
formatter.feature({
  "name": "NopCommerce Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login NopCommerce With Validata",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be in homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.login.user_should_be_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.login.user_enter_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.login.user_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on loginbutton",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.login.click_on_loginbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.login.homepage_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.login.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login NopCommerce With InValidata",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be in homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.login.user_should_be_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter InvalidEmail",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_enter_InvalidEmail()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)\" because \"this.driver\" is null\r\n\tat stepdefinations.Functions.user_enter_InvalidEmail(Functions.java:156)\r\n\tat ✽.User enter InvalidEmail(file:///D:/SeleniumPractice/Cucumber/src/test/resources/features/NopCommercelogin.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enter password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.login.user_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on loginbutton",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.login.click_on_loginbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login was unsuccessful. Please correct the errors and try again.No customer account found message should display.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.login_was_unsuccessful_Please_correct_the_errors_and_try_again_No_customer_account_found_message_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.login.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/registerpage.feature");
formatter.feature({
  "name": "Register Account in Nopconmmerce",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register NopCommerce with All fields with valid Data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.Functions.user_should_be_in_NopCommerce_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter all fields",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_Enter_all_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage label should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.homepage_label_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register NopCommerce with empty fields",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.Functions.user_should_be_in_NopCommerce_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login without entering any fields",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_click_on_login_without_entering_any_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error Messages should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.error_Messages_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register NopCommerce with only mandatory fields",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.Functions.user_should_be_in_NopCommerce_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User only mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_only_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage label should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.homepage_label_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Register NopCommerce with All fields with valid Data with multiple sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" and \"\u003cconfirmpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Register button",
  "keyword": "And "
});
formatter.step({
  "name": "Homepage label should be visible",
  "keyword": "Then "
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password",
        "confirmpassword"
      ]
    },
    {
      "cells": [
        "vasu",
        "kamisetty",
        "vasu321@gmail.com",
        "vasu1234",
        "vasu1234"
      ]
    },
    {
      "cells": [
        "vasu",
        "kamisetty",
        "vasu4321@gmail.com",
        "vasu12345",
        "vasu12345"
      ]
    },
    {
      "cells": [
        "sreevasu",
        "kamisetty",
        "vasu3210@gmail.com",
        "vasu1234",
        "vasu1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register NopCommerce with All fields with valid Data with multiple sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.Functions.user_should_be_in_NopCommerce_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"vasu\" and \"kamisetty\" and \"vasu321@gmail.com\" and \"vasu1234\" and \"vasu1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_enters_and_and_and_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage label should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.homepage_label_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register NopCommerce with All fields with valid Data with multiple sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.Functions.user_should_be_in_NopCommerce_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"vasu\" and \"kamisetty\" and \"vasu4321@gmail.com\" and \"vasu12345\" and \"vasu12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_enters_and_and_and_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage label should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.homepage_label_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register NopCommerce with All fields with valid Data with multiple sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be in NopCommerce page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.Functions.user_should_be_in_NopCommerce_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"sreevasu\" and \"kamisetty\" and \"vasu3210@gmail.com\" and \"vasu1234\" and \"vasu1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.Functions.user_enters_and_and_and_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage label should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.Functions.homepage_label_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.Functions.close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
});