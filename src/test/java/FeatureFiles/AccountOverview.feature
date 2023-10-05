Feature: Account Overview
  Background: Login with success
    Given Navigate to website
    And   Enter username and password and click login button
    Then  I should login with successfully

 Scenario: To Check Account Overview
   Given Click to Account Overview
   And The user should be able to access the information
   And The user should be able to click an account number
   When The user able to see the filtered account activity list on a screen
   And The user should see information
   And The user should be able to click any process on the list
   And The customer must see the payment details
   Then Successing to see Transaction Details





