$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Customers",
  "description": "",
  "id": "customers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Add new Customer",
  "description": "",
  "id": "customers;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User open url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Clicks on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User can view confirmation message \"The new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_Firefox_browser()"
});
formatter.result({
  "duration": 4743197400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 15
    }
  ],
  "location": "Steps.user_open_url(String)"
});
formatter.result({
  "duration": 6911428200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_Email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 266537300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_Login()"
});
formatter.result({
  "duration": 8333688000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 22735400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 3076244600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_customers_Menu_Item()"
});
formatter.result({
  "duration": 4734211300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 3948701200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "duration": 5465400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "duration": 6159136500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "duration": 3567026400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully",
      "offset": 36
    }
  ],
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "duration": 149660700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 718772600,
  "status": "passed"
});
});