Feature: Transfer Funds Functionality

  Background:  logın and newAccount
    Given Navigate to website
    And Enter username and password and click login button
    Then I should login with successfully
    Given Click open new account button from account services menu
    And Verify the page, account types existing in the options
    And Select one of the account types in the options
    And Verify the message of minimum deposit amount for the account at time of opening
    And Select one of the account from the options
    Then Click open new account button
    And Verify confirmation message and new account number

  Scenario:Transfer Funds
    Given The user must come to the transfer Funds transaction page
    When The user must complete the Transfer Fund transaction
    Then User must verify Transfer Fund transaction
    And The user must check that the account sent from the account appears as credit


