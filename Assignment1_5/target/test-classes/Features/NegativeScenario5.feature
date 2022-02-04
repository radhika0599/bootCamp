Feature: Negative Scenario
@Negative
Scenario: Senario for negative test case for post
Given API given for foreign Exchange
When Post with incorrect information
Then Validate Response Code
And Store response code in response object 