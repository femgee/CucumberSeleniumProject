Feature: Login 

Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User open url "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and password as "admin" 
	And Clicks on Login 
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser 
	
Scenario Outline: Login Data Driven 
	Given User Launch Chrome browser 
	When User open url "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "<Email>" and password as "<password>" 
	And Clicks on Login
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser
	
	Examples:
		| email | password | 
		| admin@yourstore.com  | admin |
		| admin2020@yourstore.com | admin123 |