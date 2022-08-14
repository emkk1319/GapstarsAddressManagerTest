$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify that the user able to login to the system successfully with correct username and correct password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Check Login is success",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "PageTitleOfThePageAfterLogin"
      ]
    },
    {
      "cells": [
        "View Data"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin@123"
      ]
    }
  ]
});
formatter.background({
  "name": "Below are the common steps for each scenario (login steps)",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://conxillium.github.io/AddressManager/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the user able to login to the system successfully with correct username and correct password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"admin\" and Password as \"admin@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Login is success",
  "rows": [
    {
      "cells": [
        "PageTitleOfThePageAfterLogin"
      ]
    },
    {
      "cells": [
        "View Data"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.check_login_is_success(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify that the user not able to login to the system with incorrect username and incorrect password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithIncorrectUsernameAndIncorrectPassword"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Error in login",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "abc1234"
      ]
    }
  ]
});
formatter.background({
  "name": "Below are the common steps for each scenario (login steps)",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://conxillium.github.io/AddressManager/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the user not able to login to the system with incorrect username and incorrect password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithIncorrectUsernameAndIncorrectPassword"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"abc\" and Password as \"abc1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Error in login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.login_error()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify that the user not able to login to the system with incorrect username and correct password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithIncorrectUsernameCorrectPassword"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Error in login",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "admin@123"
      ]
    }
  ]
});
formatter.background({
  "name": "Below are the common steps for each scenario (login steps)",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://conxillium.github.io/AddressManager/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the user not able to login to the system with incorrect username and correct password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithIncorrectUsernameCorrectPassword"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"abc\" and Password as \"admin@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Error in login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.login_error()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify that the user not able to login to the system with incorrect username and incorrect password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithCorrectUsernameIncorrectPassword"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Error in login",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "abc1234"
      ]
    }
  ]
});
formatter.background({
  "name": "Below are the common steps for each scenario (login steps)",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://conxillium.github.io/AddressManager/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the user not able to login to the system with incorrect username and incorrect password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithCorrectUsernameIncorrectPassword"
    }
  ]
});
formatter.step({
  "name": "User enters Username as \"admin\" and Password as \"abc1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Error in login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.login_error()"
});
formatter.result({
  "status": "passed"
});
});