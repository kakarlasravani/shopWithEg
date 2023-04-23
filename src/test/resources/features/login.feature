Feature:login feature

Scenario:verify user getting error message for invalid credentials
Given user launches ShopWithEg site
When user clicks login button
And user enter blank message
Then user gets error message
And user gives invalid credentials
And user clicks signin button
Then user gets error message