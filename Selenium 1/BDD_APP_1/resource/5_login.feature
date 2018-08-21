
Feature: User Login Page Access

 Scenario: User want to access login page
   	Given User is on Login page
    When user enter 'avaneesh' as username and 'abc' as password
    Then 'Invalid Username' message should be displayed
    
    When user enter 'abc' as username and 'HelloWorld' as password
		Then 'inavlid Password' message must be displayed
  
  	When user enter 'avaneesh' as username and 'HelloWorld' as password
		Then Login should be successfully done and succesPage should open