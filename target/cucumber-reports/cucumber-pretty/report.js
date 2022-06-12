$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("obssTestCase.feature");
formatter.feature({
  "line": 1,
  "name": "UI AUtomation Test Case",
  "description": "",
  "id": "ui-automation-test-case",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "OBSS test Case",
  "description": "",
  "id": "ui-automation-test-case;obss-test-case",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "open website with \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search text with \"\u003ctext\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "control footer",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "ui-automation-test-case;obss-test-case;",
  "rows": [
    {
      "cells": [
        "browser",
        "text"
      ],
      "line": 10,
      "id": "ui-automation-test-case;obss-test-case;;1"
    },
    {
      "cells": [
        "chrome",
        "Automation"
      ],
      "line": 11,
      "id": "ui-automation-test-case;obss-test-case;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "OBSS test Case",
  "description": "",
  "id": "ui-automation-test-case;obss-test-case;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "open website with \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search text with \"Automation\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "control footer",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 19
    }
  ],
  "location": "SearchStepDefinitions.open_site(String)"
});
formatter.result({
  "duration": 4278744000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation",
      "offset": 18
    }
  ],
  "location": "SearchStepDefinitions.searchText(String)"
});
formatter.result({
  "duration": 5013877800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.controlFooter()"
});
formatter.result({
  "duration": 166925800,
  "status": "passed"
});
});