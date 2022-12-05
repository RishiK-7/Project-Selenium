Feature: Login function test

Scenario: Login with valid credentials

Given user navigate to the application site
And user enters valid username and password
When user clicks on login button
Then login should be success

Scenario Outline: Login with invalid credentials

Given user navigate to the application site
And user enters Invalid "<username>" and "<password>"
When user clicks on login button
Then login should be fail

Examples:
|username    |password    |
|rishik7     |GreensAnna1 |
|GreensAnna1 |rishik7     |
|rishik7     |  rishik7   |



