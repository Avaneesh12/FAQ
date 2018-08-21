Feature: GitHub Functionality
Scenario: GitHub Scenario
Given user wants to open GitHub Account 'github.com'

When user opens Google Chrome
And will enter 'www.github.com' in address bar
Then display the home page of github

When  will click on login user
Then  enter the email and password

When the details are true
Then Login Successfull  

And display the home page of 'www.github.com'

When  will click on register user
Then will enter the email and password
Then Login Successfull  