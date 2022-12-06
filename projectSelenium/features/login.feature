@login
Feature: Login function test


@reg @smoke
Scenario: Login with valid credentials

Given user navigate to the application site
And user enters valid username and password
When user clicks on login button
Then login should be success

@neg
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


@neg
Scenario Outline: Login with blank credentials

Given user navigate to the application site
And user enters Invalid "<username>" and "<password>"
When user clicks on login button
Then login error should be shown

Examples:
|username    |password    |
|            |GreensAnna1 | #blank username
|GreensAnna1 |            | #blank password
|            |            | #blank username and password








