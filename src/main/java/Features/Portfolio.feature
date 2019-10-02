Feature: Create portfolio then delete same portfolio 

Background: 
	Given I open CH 
	And I goto loginURL 
	And I Login inside application 
		|babamohit1988@gmail.com|mohit@12345|
		
@CreatePortfolio	
Scenario: Create Portfolio 
Given I am on portfolio screen
And I click on createPortFolio_id and wait for portFolioName_id
And I clear portFolioName_id
And I type PrimeQA123 in portFolioName_id field
And I click on portFolioSubmit_id
And I verify same portFolio



