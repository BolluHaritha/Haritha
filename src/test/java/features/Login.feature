Feature: Testing FirstCry page

	Scenario Outline: Testing Cart Feature of FirstCry
	
	Given I open the application
	Given Click on Login
	When I give the {string}
	When Click continue
	When Give the OTP and click Submit
	Then I go to the My Account then My Profile
	Then check for the {string}