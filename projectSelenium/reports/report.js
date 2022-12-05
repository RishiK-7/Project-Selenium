$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\searchHotel.feature");
formatter.feature({
  "name": "Hotel search function test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search hotel test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters hotel details",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelSteps.user_enters_hotel_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelSteps.click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select hotel screen should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelSteps.select_hotel_screen_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "date function test in search hotel",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user enters hotel details",
  "keyword": "When "
});
formatter.step({
  "name": "user enters hotel details with incorrect \"\u003cdatein\u003e\" and \"\u003cdateout\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click search button",
  "keyword": "When "
});
formatter.step({
  "name": "date error should be shown",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "datein",
        "dateout"
      ]
    },
    {
      "cells": [
        "01/01/2021",
        "01/01/2022"
      ]
    }
  ]
});
formatter.scenario({
  "name": "date function test in search hotel",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters hotel details",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelSteps.user_enters_hotel_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters hotel details with incorrect \"01/01/2021\" and \"01/01/2022\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelSteps.user_enters_hotel_details_with_incorrect_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelSteps.click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "date error should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelSteps.date_error_should_be_shown()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#checkin_span\"}\n  (Session info: chrome\u003d108.0.5359.71)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-7RU4KS3\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.71, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:49236}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: cc5b4b5305da907e9658f7831bb7c1f1\n*** Element info: {Using\u003did, value\u003dcheckin_span}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.SearchHotel.dateError(SearchHotel.java:105)\r\n\tat steps.SearchHotelSteps.date_error_should_be_shown(SearchHotelSteps.java:45)\r\n\tat ✽.date error should be shown(features\\searchHotel.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});