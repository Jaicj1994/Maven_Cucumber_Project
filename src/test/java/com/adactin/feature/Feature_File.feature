Feature: Application for Booking Hotel


Scenario Outline: User Login Page

Given user launch the Application

When user Enter the "<username>" in Username filed and "<password>" in Password Field

Then click On the Login Button and it will Navigate to Search Hotel Page

Examples:

|username|password|
|jai|Jai@123|
|Jaikumar|1234Jai|
|jaikumar267|Gouthamjai|

Scenario: Search the Hotel Location

When select The hotel Location

And select The Hotel which you want 

And select The Room type which you want

And select Then Number of rooms which you want 

And mention The Check in and Check out Date

And select The Adults And Children per Room

Then click On the Search Button it will Navigate to Select Hotel


Scenario: Select The Hotel

When click On the select filed to select the Hotel

Then click On the continue Button And it will Navigate to Book Hotel Page


Scenario: Provide the Details for Book the Hotel

When user Enter the First Name And Last Name 

And user Provide the Address details

And user Provide the Credit Card details And Credit Type And Expiry Date And Year And CVV Number

Then click On the Book Now Button it will Navigate to Booking Confimation Page


Scenario: Booking Confimation for user clarification 

When user Verify the given details

And click On the My Itinerary Button it will Navigate to Booked Itinerary Page



Scenario: Booked Itinerary Page

When user Can select the Booked Itinerary Details And user can select the Hotel

Then click On the Logout button it will shows like You have successfully logged out.

 

