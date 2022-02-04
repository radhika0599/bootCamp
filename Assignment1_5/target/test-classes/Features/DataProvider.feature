Feature: Data provider 
@dataprovider
Scenario Outline: Passing data using SO to get method
Given Base URL is given
When path of get method "<path>"
Then Validate status code

Examples: 
|path|
|/api/users/2|
