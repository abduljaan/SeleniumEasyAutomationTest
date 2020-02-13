Feature: As a user I should be able to verify the  Single and Two Input field functionalities in Simple Form Demo Page 

#Author:mohdmhaque@gmail.com
#Date:09/16/2019
@smoke
Scenario: Verify Single and Double Input Field Functionalities 
	Given User Navigate to SeleniumEasy Test Home Page 
	When User Click on Input Forms hyperlink tab 
	Then User Click on  Simple form Demo Hyperlink Test 
	Then User Enter a message in the Enter message text box 
	And User Click on Show Message Button 
	Then User Validate the Message is been displayed in the Your Message section 
	Then User Enter a integer value in the Enter a text box 
	And User Enter 2nd integer value in the Enter b text box
	Then User Click on the Get Total button 
	Then User Validate the Total of a and b being displayed correctly 
	
	
