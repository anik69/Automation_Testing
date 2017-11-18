$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "User Test Google Search page",
  "description": "",
  "id": "user-test-google-search-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5240352202,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Google Search page Test",
  "description": "",
  "id": "user-test-google-search-page;google-search-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"R2D2 R2D2\" into Search field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearch_StepDefinitions.user_is_on_Google_page()"
});
formatter.result({
  "duration": 2428260984,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R2D2 R2D2",
      "offset": 13
    }
  ],
  "location": "GoogleSearch_StepDefinitions.user_enters_into_Search_field(String)"
});
formatter.result({
  "duration": 2175545074,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch_StepDefinitions.user_Click_Search_button()"
});
formatter.result({
  "duration": 6446612460,
  "status": "passed"
});
});