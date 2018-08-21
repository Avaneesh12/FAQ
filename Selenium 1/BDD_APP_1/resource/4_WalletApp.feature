Feature: Wallet Application Functionality
Scenario: Wallet Application Scenario

Given user wants to create an account in the application
And user enter the choice
Then enters "choice = '1' " 
Then Ask the name of the User
Then Ask the Balance in the Wallet
Then Ask the mobile number of the user
Then Account Successfully created
#
#And if "choice = '2' " 
#Then Ask the mobile number of the user
#Then if "mobile number" is valid and exists in the account
#Then return the customer details in the wallet