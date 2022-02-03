Feature: second Negative scenario
@url
Scenario: Wrong url
Given API testing with negative scenario
When Url given is wrong
Then Validate reponse code received
And Store response in response object
