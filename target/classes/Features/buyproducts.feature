Feature: I want to shop 
	I went to online shoping side and purchase product

@ShopOnEbey 
Scenario: Purchase product 
	Given I go to loginURL 
	And I enter mohitqa@gmail.com into userEmail field 
	When I add a shirt into cart 
	Then Cart item count should increase
	
	
	