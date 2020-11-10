$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("kayak.feature");
formatter.feature({
  "line": 1,
  "name": "Kayak Application",
  "description": "",
  "id": "kayak-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check Origin and Destination Details",
  "description": "",
  "id": "kayak-application;check-origin-and-destination-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User On Kayak Website \"\u003cTestName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"\u003cOrigin\u003e\" and \"\u003cDestination\u003e\" cities are entered",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"\u003cNearby Origin\u003e\" and \"\u003cNearby Destination\u003e\" airports are selected",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"\u003cDeparture\u003e\" and \"\u003cReturn\u003e\" dates are selected",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click Search And Validate SearchPage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Search Result \"\u003cN\u003e\" is selected",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Validate Origin and Destination",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "kayak-application;check-origin-and-destination-details;",
  "rows": [
    {
      "cells": [
        "TestName",
        "Origin",
        "Destination",
        "Nearby Origin",
        "Nearby Destination",
        "Departure",
        "Return",
        "N"
      ],
      "line": 13,
      "id": "kayak-application;check-origin-and-destination-details;;1"
    },
    {
      "cells": [
        "Test1",
        "MIA",
        "NYC",
        "FLL",
        "HPN",
        "10/20/2020",
        "10/30/2020",
        "3"
      ],
      "line": 14,
      "id": "kayak-application;check-origin-and-destination-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6981664900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Check Origin and Destination Details",
  "description": "",
  "id": "kayak-application;check-origin-and-destination-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User On Kayak Website \"Test1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"MIA\" and \"NYC\" cities are entered",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"FLL\" and \"HPN\" airports are selected",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"10/20/2020\" and \"10/30/2020\" dates are selected",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click Search And Validate SearchPage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Search Result \"3\" is selected",
  "matchedColumns": [
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Validate Origin and Destination",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Test1",
      "offset": 23
    }
  ],
  "location": "KayakStepDefinition.user_On_Kayak_Website(String)"
});
formatter.result({
  "duration": 3246556600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MIA",
      "offset": 1
    },
    {
      "val": "NYC",
      "offset": 11
    }
  ],
  "location": "KayakStepDefinition.and_cities_are_entered(String,String)"
});
formatter.result({
  "duration": 6167061700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FLL",
      "offset": 1
    },
    {
      "val": "HPN",
      "offset": 11
    }
  ],
  "location": "KayakStepDefinition.and_airports_are_selected(String,String)"
});
formatter.result({
  "duration": 324200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10/20/2020",
      "offset": 1
    },
    {
      "val": "10/30/2020",
      "offset": 18
    }
  ],
  "location": "KayakStepDefinition.and_dates_are_selected(String,String)"
});
formatter.result({
  "duration": 5221004000,
  "status": "passed"
});
formatter.match({
  "location": "KayakStepDefinition.click_Search_And_Validate_SearchPage()"
});
formatter.result({
  "duration": 144600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "KayakStepDefinition.search_Result_is_selected(String)"
});
formatter.result({
  "duration": 177600,
  "status": "passed"
});
formatter.match({
  "location": "KayakStepDefinition.validate_Origin_and_Destination()"
});
formatter.result({
  "duration": 97400,
  "status": "passed"
});
formatter.after({
  "duration": 349136400,
  "status": "passed"
});
});