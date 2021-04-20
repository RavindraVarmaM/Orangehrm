$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("projct.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM",
  "description": "",
  "id": "orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User successfully access",
  "description": "",
  "id": "orange-hrm;user-successfully-access",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is logins to OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User viewas homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "OHstepdef.user_is_logins_to_OrangeHRM_application()"
});
formatter.result({
  "duration": 8827488500,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_clicks_on_login()"
});
formatter.result({
  "duration": 5820761000,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_viewas_homepage()"
});
formatter.result({
  "duration": 2956084900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "pim functionalities",
  "description": "",
  "id": "orange-hrm;pim-functionalities",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is logins to OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User click on pim module",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user view report option",
  "keyword": "Then "
});
formatter.match({
  "location": "OHstepdef.user_is_logins_to_OrangeHRM_application()"
});
formatter.result({
  "duration": 6653894300,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_click_on_pim_module()"
});
formatter.result({
  "duration": 13323725700,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_view_report_option()"
});
formatter.result({
  "duration": 4619111800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should able to operate admin module",
  "description": "",
  "id": "orange-hrm;user-should-able-to-operate-admin-module",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is logins to OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user opens admin option",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user able to use userrole",
  "keyword": "Then "
});
formatter.match({
  "location": "OHstepdef.user_is_logins_to_OrangeHRM_application()"
});
formatter.result({
  "duration": 8773057800,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_opens_admin_option()"
});
formatter.result({
  "duration": 8750875900,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_able_to_use_userrole()"
});
formatter.result({
  "duration": 534427200,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "ESS supervisor should able view his subordinates details",
  "description": "",
  "id": "orange-hrm;ess-supervisor-should-able-view-his-subordinates-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "User is logins to OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "ESS supervior clicks ess",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "USer view on ESS details",
  "keyword": "Then "
});
formatter.match({
  "location": "OHstepdef.user_is_logins_to_OrangeHRM_application()"
});
formatter.result({
  "duration": 7552324800,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.ess_supervior_clicks_ess()"
});
formatter.result({
  "duration": 9169341300,
  "status": "passed"
});
formatter.match({
  "location": "OHstepdef.user_view_on_ESS_details()"
});
formatter.result({
  "duration": 60190000,
  "status": "passed"
});
});