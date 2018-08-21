Feature: Conference Registration Functionality

@execute
  Scenario: User left first name field empty
    Given User is on the registration page
    When User left the first name field empty
    Then 'Please fill the First Name' message should be displayed
@execute
  Scenario: User left last name field empty
    Given User is on the registration page
    When User left the last name field empty
    Then 'Please fill the Last Name' message should be displayed
@execute
  Scenario: User left email empty
    Given User is on the registration page
    When User left the email field empty
    Then 'Please fill the Email' message should be displayed
@execute
  Scenario: User entered invalid email
    Given User is on the registration page
    When User entered the invalid email and proceed further
    Then 'Please enter valid Email Id.' message should be displayed
@execute
  Scenario: User left phone number field empty
    Given User is on the registration page
    When User left the phone number field empty
    Then 'Please fill the Contact No.' message should be displayed
@execute
  Scenario: User entered invalid phone number field
    Given User is on the registration page
    When User entered invalid phone number
    Then 'Please enter valid Contact no.' message should be displayed
@execute
  Scenario: User left people attending field empty
    Given User is on the registration page
    When User left the number of people attending conference field empty
    Then 'Please fill the Number of people attending' message should be displayed
@execute
  Scenario: User left building name field empty
    Given User is on the registration page
    When User left the building name field empty
    Then 'Please fill the Building & Room No' message should be displayed
@execute
  Scenario: User left area name field empty
    Given User is on the registration page
    When User left area name field empty
    Then 'Please fill the Area name' message should be displayed
@execute
  Scenario: User left city name field empty
    Given User is on the registration page
    When User left city name field empty
    Then 'Please select city' message should be displayed
@execute
  Scenario: User left state name field empty
    Given User is on the registration page
    When User left state name field empty
    Then 'Please select state' message should be displayed

@execute
  Scenario: User did not select the memebership status
    Given User is on the registration page
    When user did not select the membership status
    Then 'Please Select MemeberShip status' message should be displayed
@execute
  Scenario: User entered all the details correctly
    Given User is on the registration page
    When user entered all the details correctly
    Then 'Personal details are validated.' alert message should be displayed
    Then 'Payment Details' title will be verified
@execute
  Scenario: User left the card holder name field empty
    Given User is on the payment page
    When user left the card holder name field empty
    Then 'Please fill the Card holder name' message should be displayed
@execute
  Scenario: User left the debit card number field empty
    Given User is on the payment page
    When user left the debit card number field empty
    Then 'Please fill the Debit card Number' message should be displayed
@execute
  Scenario: User left the CVV number field empty
    Given User is on the payment page
    When user left the CVV number field empty
    Then 'Please fill the CVV' message should be displayed

@execute
  Scenario: User left the expiry month field empty
    Given User is on the payment page
    When user left the expiry month field empty
    Then 'Please fill expiration month' message should be displayed
@execute
  Scenario: User left the expiry year field empty
    Given User is on the payment page
    When user left the expiry year field empty
    Then 'Please fill expiration year' message should be displayed
@execute
  Scenario: User entered all the details on payment page
    Given User is on the payment page
    When user entered all the details
    Then 'Conference Room Booking successfully done!!!' alert message should be displayed
