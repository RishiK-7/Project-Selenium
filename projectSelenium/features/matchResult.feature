Feature: match search results


#Background:
#Given user enters valid username and password
#And user clicks on login button
#When user enters hotel details
#And user click search button

@reg
Scenario: to match search result

Given user is on search result page
When user checks result with search inputs
Then details should be matched