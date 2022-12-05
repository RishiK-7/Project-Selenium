Feature: Hotel search function test

Scenario: search hotel test 
Given user enters valid username and password
And user clicks on login button
When user enters hotel details
And click search button
Then select hotel screen should appear

Scenario Outline: date function test in search hotel
Given user enters valid username and password
And user clicks on login button
When user enters hotel details with incorrect "<datein>" and "<dateout>"
And click search button
Then date error should be shown

Examples:
|datein    | dateout   |
|05/03/2023| 01/04/2023|  #datein as after out 
|01/04/2023| 01/03/2023|  #month as after out
|01/03/2023| 01/04/2022|  #year as after out


