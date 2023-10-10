Feature: Registiration Functionality

  Scenario: Registiration new user
    Given The user must navigates to the ParaBank website
    When The click the connection such as register button on the home page.
    Then The user must fill out the registration form by using XML file and click the register button
    And  The user must verify a successful registration process and "Your Account Was Created SuccessFully. You are now logged in." should see a message like.
