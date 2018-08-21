Feature: Login Functionality

  Scenario: User wants to login to website
    Given User is on the home page
    When user navigates to the sign in
    And click on the new customer
    And enters all the details
    Then registration successfull page is displayed
