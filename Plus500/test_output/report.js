$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Plus500.feature");
formatter.feature({
  "line": 1,
  "name": "Plus500 Application",
  "description": "",
  "id": "plus500-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate The Price Range",
  "description": "",
  "id": "plus500-application;validate-the-price-range",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" entered",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Search for \"\u003cCurrency Pair\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Assert Buy Sell Prices within \"\u003cX\u003e\" and \"\u003cY\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "plus500-application;validate-the-price-range;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Currency Pair"
      ],
      "line": 13,
      "id": "plus500-application;validate-the-price-range;;1"
    },
    {
      "cells": [
        "cm.jnanesh@gmail.com",
        "plus500_jna",
        "GBP/USD",
        "1.2",
        "1.4"
      ],
      "line": 14,
      "id": "plus500-application;validate-the-price-range;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9693005800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate The Price Range",
  "description": "",
  "id": "plus500-application;validate-the-price-range;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"cm.jnanesh@gmail.com\" and \"plus500_jna\" entered",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Search for \"GBP/USD\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Assert Buy Sell Prices within \"\u003cX\u003e\" and \"\u003cY\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Plus500Steps.user_on_LoginPage()"
});
formatter.result({
  "duration": 11121836700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cm.jnanesh@gmail.com",
      "offset": 1
    },
    {
      "val": "plus500_jna",
      "offset": 28
    }
  ],
  "location": "Plus500Steps.and_entered(String,String)"
});
formatter.result({
  "duration": 529409100,
  "status": "passed"
});
formatter.match({
  "location": "Plus500Steps.login()"
});
formatter.result({
  "duration": 221153100,
  "status": "passed"
});
formatter.match({
  "location": "Plus500Steps.user_is_on_Homepage()"
});
formatter.result({
  "duration": 5020777600,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertTrue(Assert.java:45)\r\n\tat org.testng.Assert.assertTrue(Assert.java:55)\r\n\tat StepDefinitions.Plus500Steps.user_is_on_Homepage(Plus500Steps.java:98)\r\n\tat ✽.Given User is on Homepage(Plus500.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP/USD",
      "offset": 12
    }
  ],
  "location": "Plus500Steps.search_for(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cX\u003e",
      "offset": 31
    },
    {
      "val": "\u003cY\u003e",
      "offset": 41
    }
  ],
  "location": "Plus500Steps.assert_Buy_Sell_Prices_within_and(float,float)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1221070900,
  "status": "passed"
});
});