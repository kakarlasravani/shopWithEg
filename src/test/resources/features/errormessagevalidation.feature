Feature:login feature

Scenario:verify user with valid credentials
Given user launches ShopwithEg site
When user clicks login button
And user clicks create account
And user enters credentials less than 2 characters
Then user gets error message
