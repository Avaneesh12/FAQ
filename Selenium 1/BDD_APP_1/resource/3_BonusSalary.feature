Feature: Bonus Salary Functionality
Scenario: Bonus Salary Scenario
Given Company wants to give bonus to employees
And employees will enter their Designation, Number of Experiences in the company, Basic Salary
Then comapny will check the designation
And if Number of experience is less than 10 years and Designation = 'Manager'
Then Bonus will be 30% of basic Salary
Then Bonus given successfully to employees
And if Number of experience is less than 10 years and Designation = 'Senior Consultant'
Then Bonus will be 20% of basic Salary
Then Bonus given successfully to employees
And if Number of experience is greater than 10 years and Designation = 'Manager'
Then Bonus will be 40% of basic Salary
Then Bonus given successfully to employees
And if Number of experience is greater than 10 years and Designation = 'Senior Consultant'
Then Bonus will be 30% of basic Salary
Then Bonus given successfully to employees