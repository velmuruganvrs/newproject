$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium Wrokphase/PROJECT/BDDFrameTest/src/test/resources/Feature_File/dataprovider.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Test",
  "description": "",
  "id": "login-page-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 28,
  "name": "Login Page",
  "description": "",
  "id": "login-page-test;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@DataTableMap"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Open The Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Enter username and pssword",
  "rows": [
    {
      "cells": [
        "userName",
        "Password"
      ],
      "line": 31
    },
    {
      "cells": [
        "velmurugan",
        "9789679298"
      ],
      "line": 32
    },
    {
      "cells": [
        "VAISHNU",
        "9789679299"
      ],
      "line": 33
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Logout page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataProviderdatatable.Open_The_Browser()"
});
formatter.result({
  "duration": 171973375,
  "status": "passed"
});
formatter.match({
  "location": "DataProviderdatatable.entercredencial(DataTable)"
});
formatter.result({
  "duration": 4871437,
  "status": "passed"
});
formatter.match({
  "location": "DataProviderdatatable.teardown()"
});
formatter.result({
  "duration": 79791,
  "status": "passed"
});
});