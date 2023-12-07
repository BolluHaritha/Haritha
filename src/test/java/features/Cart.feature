Feature: Testing FirstCry page

	Scenario Outline: Testing Add To Cart Feature of FirstCry

		Given I open the browser and enter URL
		Then I click on Login link and enter the email id <email>
		Then I verify the <title> of the FirstCryPage
		Then I click on Footwear and click on Casualshoes	
		Then I click on Product on the page
		Then I click on Add to cart page
		Then I click on Cart page
		Then I click on Image


			Examples: 
      	|           email           |                                         title                                            | 
      	| "19082001.hairitha@gmail.com"  |"Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com"|  