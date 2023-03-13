Feature: GTPL bank login 
@Login
Scenario Outline:

Given I navigate to GTPL home
When I enter "<userid>" into email field
And I enter "<password>" into password field
And I click login button
Then I am successfully logged in

 Examples:
 
 |userid     |password  |   
 |mngr480878 |atunAnA   |      
 |mngr480877 |atunAnA   |
@Smoke
Scenario Outline:

Given I successfully sign in
And I click new
And  I enter "<name>" into customer text field
And I choose female as gender
And I enter date of birth
And I enter "<address>" into address field
And I enter "<city>" into city text field
And I enter "<state>" into state text field
And I enter "<pin>" into pin text field
And I enter "<telephone>" into mobile number text field
And I enter "<email>" into email address text field
And I type "<passd>" into passcode text field
And I click submit button
Then I am succefully registered

Examples:

|name      |address                              |city                       |state                       |pin                |telephone                   |email             |passd           |
|Yana YANA |M40 Harpurhey Manchester             |Manchester                 |England                     |124500             |07485869021                 |Yana11@nqc.com    |Second@123      |           
 
 