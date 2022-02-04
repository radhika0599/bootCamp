Feature: Methods

@get
Scenario: GET method
Given URL is given for get method
When get correct data
Then validate status code for get

@post
Scenario: POST method
Given URL is given for post method
When post correct data
Then validate status code for post

@put
Scenario: PUT method
Given URL is given for put method
When update correct data
Then validate status code for put

@delete
Scenario: Delete method
Given URL is given for delete method
When delete the data
Then validate status code for delete


