$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/JPet_Project_CTS.feature");
formatter.feature({
  "line": 2,
  "name": "JPet Website",
  "description": "",
  "id": "jpet-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Jpetstore_feature"
    }
  ]
});
formatter.scenario({
  "line": 44,
  "name": "Sign out from the JPet Store Web Application.",
  "description": "",
  "id": "jpet-website;sign-out-from-the-jpet-store-web-application.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@TC_05_Signout_User_From_JPet_Web_Application"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "Open the JPet Web Application",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Click the Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Enter the Username, Password and Click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "If User is logged in then Click the Signout button",
  "keyword": "And "
});
formatter.match({
  "location": "SignoutUser_JPet.launch_the_Chrome_Browser()"
});
formatter.result({
  "duration": 42462345000,
  "status": "passed"
});
formatter.match({
  "location": "SignoutUser_JPet.open_the_JPet_Web_Application()"
});
formatter.result({
  "duration": 10239458000,
  "status": "passed"
});
formatter.match({
  "location": "SignoutUser_JPet.click_the_Login_button()"
});
formatter.result({
  "duration": 3981572400,
  "status": "passed"
});
formatter.match({
  "location": "SignoutUser_JPet.enter_the_Username_Password_and_Click_Login_button()"
});
formatter.result({
  "duration": 983174900,
  "status": "passed"
});
formatter.match({
  "location": "SignoutUser_JPet.if_User_is_logged_in_then_click_the_Signout_button()"
});
formatter.result({
  "duration": 1573970500,
  "status": "passed"
});
});