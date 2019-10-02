$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Features/RediffMailLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Rediff Money",
  "description": "",
  "id": "login-into-rediff-money",
  "keyword": "Feature"
});
formatter.before({
  "duration": 468969556,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Logging into Rediff Money",
  "description": "",
  "id": "login-into-rediff-money;logging-into-rediff-money;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "I open FF",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I goto loginURL",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I Login inside application",
  "rows": [
    {
      "comments": [
        {
          "line": 31,
          "value": "#|UserName               |Password   |"
        }
      ],
      "cells": [
        "babamohit1988@gmail.com",
        "mohit@12345"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Login should be Success",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FF",
      "offset": 7
    }
  ],
  "location": "RediffMailLoginStepDef.I_open_CH(String)"
});
formatter.result({
  "duration": 62751611797,
  "error_message": "org.openqa.selenium.WebDriverException: connection refused\nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027MOHIT-PC\u0027, ip: \u0027192.168.1.13\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: \r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$24(ProtocolHandshake.java:359)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:362)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:136)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:254)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:236)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:137)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:191)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:103)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:99)\r\n\tat WebConnectorUtil.WebConnector.initBrowser(WebConnector.java:127)\r\n\tat stepDefinations.RediffMailLoginStepDef.I_open_CH(RediffMailLoginStepDef.java:27)\r\n\tat ✽.Given I open FF(./src/main/java/Features/RediffMailLogin.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginURL",
      "offset": 7
    }
  ],
  "location": "RediffMailLoginStepDef.I_goto_loginURL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplicationSteps.I_Login_inside_application(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Success",
      "offset": 16
    }
  ],
  "location": "RediffMailLoginStepDef.Login_should_be_Success(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 901627312,
  "status": "passed"
});
formatter.before({
  "duration": 4037600,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify previously added profile information",
  "description": "",
  "id": "login-into-rediff-money;verify-previously-added-profile-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "I am on dashboard and check user profile",
  "rows": [
    {
      "cells": [
        "Customer Name",
        "Company"
      ],
      "line": 43
    },
    {
      "cells": [
        "Mohit",
        "Infosys"
      ],
      "line": 44
    },
    {
      "cells": [
        "Dev",
        "TCS"
      ],
      "line": 45
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I select Infosys from Company list",
  "keyword": "And "
});
formatter.match({
  "location": "RediffMailLoginStepDef.I_am_on_dashboard_and_check_user_profile(DataTable)"
});
formatter.result({
  "duration": 5350181,
  "status": "passed"
});
formatter.match({
  "location": "RediffMailLoginStepDef.I_select_Infosys_from_Company_list()"
});
formatter.result({
  "duration": 62526,
  "status": "passed"
});
formatter.after({
  "duration": 311191005,
  "status": "passed"
});
});