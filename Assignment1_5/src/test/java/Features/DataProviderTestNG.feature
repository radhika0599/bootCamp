Feature: Data provider in testNG
@testng
Scenario Outline: Post method
Given Base URL is given for Post method
When data is given using data provider "<path>"
Then validate responses 
Examples:
|path|
|/api/users|

@get
Scenario: Get method
Given Base URL is given for get method
When values given using parameterization "<number>"
Then Do all the validations "<number>"
