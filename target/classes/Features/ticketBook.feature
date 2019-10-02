Feature: Book flight ticket

Background:

Given I live in london
And I want to go on holiday
And We are 3 adults
| Adult1 |Adult2 | Adult3|
| A |B | C|
| 20 |12 | 15|
| Agra |Kanpur | Lucknow|

@BookHotel
Scenario: I want to book flight ticket

And I want to book ticket on 10th May 2019 to 15th May 2019.
When I go to travel agent
Then He should to able to help me in the budget od 1000USD.
And He should also provide me option of cancel
But He should not ask for advance more than 300 USD. 



@BookFlight
Scenario Outline:: I want to book flight ticket

And I want to book flight to <Destination> on <ToDate> on portal.
And Return flight on <ToDate>
Examples:
|Destination  |FromDate       |ToDate       |
|"Hawai"      |"20/02/2019"   |"25/02/2019"|
|"USA"        |"12th Mar 2019"|"27th Mar 2019"|
|"Canada"     |"2th Oct 2019" |"09th Oct 2019"|