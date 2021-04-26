$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jijin/eclipse-workspace/RestAssuredBDDFramework/src/test/java/features/GetPost.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Manoj Kuruppath Rajan"
    }
  ],
  "line": 4,
  "name": "Feature for GetPost Requests and Response",
  "description": "Verify Post and GET operations using REST-assured methods",
  "id": "feature-for-getpost-requests-and-response",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Verify the Post Operation for Make Posts in jsonplaceholder",
  "description": "",
  "id": "feature-for-getpost-requests-and-response;verify-the-post-operation-for-make-posts-in-jsonplaceholder",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I perform post operation for \"/posts\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "/posts",
      "offset": 30
    }
  ],
  "location": "GetPostSteps.i_perform_post_operation_for(String)"
});
formatter.result({
  "duration": 2475745901,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify the Post Operation for Comments on Posts in jsonplaceholder",
  "description": "",
  "id": "feature-for-getpost-requests-and-response;verify-the-post-operation-for-comments-on-posts-in-jsonplaceholder",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I perform post operation for \"/posts\" in Comments on Posts",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "/posts",
      "offset": 30
    }
  ],
  "location": "GetPostSteps.i_perform_post_operation_for_in_Comments_on_Posts(String)"
});
formatter.result({
  "duration": 436112100,
  "status": "passed"
});
});