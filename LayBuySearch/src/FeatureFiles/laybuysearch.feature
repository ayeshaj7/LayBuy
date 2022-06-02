Feature: Search in LayBuy
	As a user who likes to shop with LayBuy 
	I want to search the shop options in LayBuy web site
	So that I can plan the purchase

Acceptance Criteria
   - I will navigate to LayBuy 
   - I will search shops in LayBuy web site
   - I will provide search details
   - I will check the options given to me in LayBuy web site
   - I will open one of the shop tile
   
Background: 
	Given user has navigate to LayBuy
	
Scenario: Search LayBuy shops

Given user click and navigate to the "shops" page
When user search "Heart of Oxford" as the shop
Then user verify the number of directory tiles
And user clicks on a directory tile and verify new window with correct merchant website