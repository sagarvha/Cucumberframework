$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/workspace/cucumberframework/src/main/java/feature/Dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Deals",
  "description": "",
  "id": "free-crm-create-deals",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create New Deals Scenario",
  "description": "",
  "id": "free-crm-create-deals;free-crm-create-new-deals-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "sagarvhanamane093@gmail.com",
        "Viraj@3019"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "dealsmapstepdefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 12470287320,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapstepdefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 11978541,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapstepdefination.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 495366589,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapstepdefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 100949418,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapstepdefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 7162574,
  "status": "passed"
});
});