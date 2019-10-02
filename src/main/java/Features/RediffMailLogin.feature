Feature: Login into Rediff Money 
#Without Examples Keyword
#Scenario: Rediffmail login testcase
#Given user is already on rediffmail login page
#When title of login page is Rediffmail
#Then user enters "babamohit1988@gmail.com" and "mohit@12345" on rediffmail
#Then user click on login button on rediffmail
#Then user is on rediffmail home page
#With Examples Keyword
#Scenario Outline: Rediffmail login testcase
#Given user is already on rediffmail login page
#When title of login page is Rediffmail
#Then user enters "<username>" and "<password>" on rediffmail
#Then user click on login button on rediffmail
#Then user is on rediffmail home page
#Examples:
#       | username | password |
#      | mohitqa@testgmail.com | testqa |
#     | babamohit1988@gmail.com | mohit@12345 |
#Scenario: Rediffmail login testcase
#Given user is already on rediffmail login page
#When title of login page is Rediffmail
#Then user enters "mohitqa" and "mohit@123" on rediffmail
#Then user enters username and password
#Then user click on login button on rediffmail

Scenario Outline: Logging into Rediff Money 
	Given I open <Browser> 
	And I goto loginURL 
	And I Login inside application 
		#|UserName               |Password   |
		|babamohit1988@gmail.com|mohit@12345|
	Then Login should be <Result> 
	
	Examples: 
		|Browser  |Result  |
		|CH      |Success |
		
		
Scenario: Verify previously added profile information 

	Given I am on dashboard and check user profile 
		|Customer Name   | Company      |
		|Mohit           | Infosys      |
		|Dev             | TCS          |
	And I select Infosys from Company list