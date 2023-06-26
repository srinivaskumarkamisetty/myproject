$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify email with invalid format",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should enter Invalid email Format",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_enter_Invalid_email_Format()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wrong email message should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.wrong_email_message_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify email functionality leaving email as blank",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User leaving the Email text field as blank",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_leaving_the_Email_text_field_as_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Please Enter your Email message should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.please_Enter_your_Email_message_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login button functionality withvalid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Email \"admin@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Password",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_Password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.dashboard_label_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify Login button Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enter NopCommerce Email \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Enter NopCommerce Password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "abcde@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "fghij@yourstore.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Login button Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Email \"admin@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.dashboard_label_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login button Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Email \"admin@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.dashboard_label_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login button Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Email \"admin@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.dashboard_label_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login button Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Email \"abcde@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.dashboard_label_should_be_displayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[normalize-space()\u003d\u0027Dashboard\u0027]\"}\n  (Session info: chrome\u003d113.0.5672.127)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [e5e2d4e770b437092bf2958b7806920e, findElement {using\u003dxpath, value\u003d//*[normalize-space()\u003d\u0027Dashboard\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:49209}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:49209/devtoo..., se:cdpVersion: 113.0.5672.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: e5e2d4e770b437092bf2958b7806920e\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat StepDefinations.Functions.dashboard_label_should_be_displayed(Functions.java:100)\r\n\tat ✽.Dashboard label should be displayed(file:///D:/SeleniumPractice/NopCpmmerce_v001/src/test/resources/features/login.feature:35)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login button Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Should be in Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Should_be_in_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Email \"fghij@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter NopCommerce Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.user_Enter_NopCommerce_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.Functions.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard label should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.Functions.dashboard_label_should_be_displayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[normalize-space()\u003d\u0027Dashboard\u0027]\"}\n  (Session info: chrome\u003d113.0.5672.127)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [6d13c7466565e64f3d6df6ce6df17044, findElement {using\u003dxpath, value\u003d//*[normalize-space()\u003d\u0027Dashboard\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:49229}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:49229/devtoo..., se:cdpVersion: 113.0.5672.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 6d13c7466565e64f3d6df6ce6df17044\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat StepDefinations.Functions.dashboard_label_should_be_displayed(Functions.java:100)\r\n\tat ✽.Dashboard label should be displayed(file:///D:/SeleniumPractice/NopCpmmerce_v001/src/test/resources/features/login.feature:35)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});