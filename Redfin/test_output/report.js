$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Redfin.feature");
formatter.feature({
  "line": 1,
  "name": "Redfin Application",
  "description": "",
  "id": "redfin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Redfin Search",
  "description": "",
  "id": "redfin-application;verify-redfin-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Redfin Homepage for \"\u003cTestName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Validate Homepage with \"\u003cPageTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter \"\u003cCity\u003e\" In Search Box and press Enter",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "On Popup select \"\u003cPopupCity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate Real Estate Page as \"\u003cRealEstatePage\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "asserto Search Box has \"\u003ccityname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"\u003cMinPrice\u003e\" and \"\u003cMaxPrice\u003e\" are selected",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify all homes are from \"\u003cSearchResult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "redfin-application;verify-redfin-search;",
  "rows": [
    {
      "cells": [
        "TestName",
        "PageTitle",
        "City",
        "PopupCity",
        "RealEstatePage",
        "cityname",
        "MinPrice",
        "MaxPrice",
        "SearchResult"
      ],
      "line": 15,
      "id": "redfin-application;verify-redfin-search;;1"
    },
    {
      "cells": [
        "Test1",
        "Real Estate, Homes for Sale, MLS Listings, Agents",
        "Sunnyvale",
        "https://www.redfin.com/city/19457/CA/Sunnyvale",
        "Sunnyvale Homes for Sale: Sunnyvale, CA Real Estate",
        "Sunnyvale",
        "$800k",
        "$950k",
        "/CA/Sunnyvale/"
      ],
      "line": 16,
      "id": "redfin-application;verify-redfin-search;;2"
    },
    {
      "cells": [
        "Test2",
        "Real Estate, Homes for Sale, MLS Listings, Agents",
        "Sunnyvale",
        "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
        "Sunnyvale, Dallas, TX Homes for Sale \u0026 Real Estate",
        "Sunnyvale",
        "$600k",
        "$800k",
        "/TX/Dallas"
      ],
      "line": 17,
      "id": "redfin-application;verify-redfin-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9100614000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Redfin Search",
  "description": "",
  "id": "redfin-application;verify-redfin-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Redfin Homepage for \"Test1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Validate Homepage with \"Real Estate, Homes for Sale, MLS Listings, Agents\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter \"Sunnyvale\" In Search Box and press Enter",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "On Popup select \"https://www.redfin.com/city/19457/CA/Sunnyvale\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate Real Estate Page as \"Sunnyvale Homes for Sale: Sunnyvale, CA Real Estate\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "asserto Search Box has \"Sunnyvale\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"$800k\" and \"$950k\" are selected",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify all homes are from \"/CA/Sunnyvale/\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Test1",
      "offset": 32
    }
  ],
  "location": "RedfinStepDefinition.user_is_on_Redfin_Homepage_for(String)"
});
formatter.result({
  "duration": 1894887400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Real Estate, Homes for Sale, MLS Listings, Agents",
      "offset": 24
    }
  ],
  "location": "RedfinStepDefinition.validate_Homepage_with(String)"
});
formatter.result({
  "duration": 679710700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 7
    }
  ],
  "location": "RedfinStepDefinition.enter_In_Search_Box_and_press_Enter(String)"
});
formatter.result({
  "duration": 727121600,
  "status": "passed"
});
formatter.match({
  "location": "RedfinStepDefinition.validate_Popup()"
});
formatter.result({
  "duration": 295072300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/city/19457/CA/Sunnyvale",
      "offset": 17
    }
  ],
  "location": "RedfinStepDefinition.on_Popup_select(String)"
});
formatter.result({
  "duration": 1887166800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale Homes for Sale: Sunnyvale, CA Real Estate",
      "offset": 30
    }
  ],
  "location": "RedfinStepDefinition.validate_Real_Estate_Page_as(String)"
});
formatter.result({
  "duration": 2123711100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 24
    }
  ],
  "location": "RedfinStepDefinition.asserto_Search_Box_has(String)"
});
formatter.result({
  "duration": 242211900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$800k",
      "offset": 1
    },
    {
      "val": "$950k",
      "offset": 13
    }
  ],
  "location": "RedfinStepDefinition.and_are_selected(String,String)"
});
formatter.result({
  "duration": 3428203100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/CA/Sunnyvale/",
      "offset": 27
    }
  ],
  "location": "RedfinStepDefinition.verify_all_homes_are_from(String)"
});
formatter.result({
  "duration": 110997900,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat RedfinStepDefinition.verify_all_homes_are_from(RedfinStepDefinition.java:158)\r\n\tat ✽.Then Verify all homes are from \"/CA/Sunnyvale/\"(Redfin.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2149000800,
  "status": "passed"
});
formatter.before({
  "duration": 5347313100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Redfin Search",
  "description": "",
  "id": "redfin-application;verify-redfin-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Redfin Homepage for \"Test2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Validate Homepage with \"Real Estate, Homes for Sale, MLS Listings, Agents\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter \"Sunnyvale\" In Search Box and press Enter",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "On Popup select \"https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate Real Estate Page as \"Sunnyvale, Dallas, TX Homes for Sale \u0026 Real Estate\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "asserto Search Box has \"Sunnyvale\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"$600k\" and \"$800k\" are selected",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify all homes are from \"/TX/Dallas\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Test2",
      "offset": 32
    }
  ],
  "location": "RedfinStepDefinition.user_is_on_Redfin_Homepage_for(String)"
});
formatter.result({
  "duration": 1187223200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Real Estate, Homes for Sale, MLS Listings, Agents",
      "offset": 24
    }
  ],
  "location": "RedfinStepDefinition.validate_Homepage_with(String)"
});
formatter.result({
  "duration": 609891600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 7
    }
  ],
  "location": "RedfinStepDefinition.enter_In_Search_Box_and_press_Enter(String)"
});
formatter.result({
  "duration": 608258800,
  "status": "passed"
});
formatter.match({
  "location": "RedfinStepDefinition.validate_Popup()"
});
formatter.result({
  "duration": 285032200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
      "offset": 17
    }
  ],
  "location": "RedfinStepDefinition.on_Popup_select(String)"
});
formatter.result({
  "duration": 1297832400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale, Dallas, TX Homes for Sale \u0026 Real Estate",
      "offset": 30
    }
  ],
  "location": "RedfinStepDefinition.validate_Real_Estate_Page_as(String)"
});
formatter.result({
  "duration": 914311900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 24
    }
  ],
  "location": "RedfinStepDefinition.asserto_Search_Box_has(String)"
});
formatter.result({
  "duration": 656384100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$600k",
      "offset": 1
    },
    {
      "val": "$800k",
      "offset": 13
    }
  ],
  "location": "RedfinStepDefinition.and_are_selected(String,String)"
});
formatter.result({
  "duration": 3655406700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/TX/Dallas",
      "offset": 27
    }
  ],
  "location": "RedfinStepDefinition.verify_all_homes_are_from(String)"
});
formatter.result({
  "duration": 30038012200,
  "status": "passed"
});
formatter.after({
  "duration": 162549600,
  "status": "passed"
});
});