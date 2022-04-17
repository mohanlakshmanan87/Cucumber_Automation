Feature: Dress Purchasing  And Order Booking  In Automation Practice  Application 




Background: Login Page

Given user Launch The  Application

When user Click SignIn Button 

And user Enter The Username in Username Textbox

And user Enter The Password in Password Textbox

Then user Click On The Login Button And It Navigate To The Dress Purchase Page



Scenario: Dress Purchase Page

When user Click The Dress Icon

And user Click The List 

And user Click Printed Dress

And user Click Addto Cart1

And user Click Continue Shopping

Then User Click Signout


Scenario: Tshirts Purchase Page

When user Click The Tshirts Icon

And user Click The List 

And user Click ShadedTshirt Dress

And user Click Addto Cart2

And user Click Cont Shopping

Then User Click Second Signout



Scenario: Women Purchase Page

When user Click The Women Icon

And user Click The List In Women

And user Click Fadedshorts Dress

And user Click Addto Cart3

And user Click Con Shop

And user navigate Back

And user Click Printed Summerdress Icon

And user Enter The Quantity in Text Box

And user Select The Size 

And user Select The Color

And user Click Addto Cart4

And user Click Cont Shop

And user Click View AllCart Icon

And user Click Proceed to Check

And user Again Click Proceed To Check

And user Click Terms Of Service

And user Click proceed to check

And user Click PayBank

And user Click Confirm Order

And user Click Back To Order

Then user Click Third Signout


