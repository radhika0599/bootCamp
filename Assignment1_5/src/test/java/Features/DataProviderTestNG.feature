Feature: Data provider in testNG
@testng
Scenario Outline: Post method
Given Base URL is given for Post method
When data is given using data provider "<path>"
Then validate responses 
Examples:
|path|
|/api/users|
