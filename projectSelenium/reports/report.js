$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\matchResult.feature");
formatter.feature({
  "name": "match search results",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to match search result",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user is on search result page",
  "keyword": "Given "
});
formatter.match({
  "location": "MatchSteps.user_is_on_search_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks result with search inputs",
  "keyword": "When "
});
formatter.match({
  "location": "MatchSteps.user_checks_result_with_search_inputs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "details should be matched",
  "keyword": "Then "
});
formatter.match({
  "location": "MatchSteps.details_should_be_matched()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});