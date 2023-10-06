Feature: Login Functionality
  Scenario: Login with success
    Given Navigate to website
    And Enter username and password and click login button
    Then I should login with successfully

    Scenario Outline: Login invalid combinations
      Given Navigate to website
      And Enter "<username>" as username and "<password>" as password and click login button
      Then User should see the error message
      Examples:
        | username | password       |
        |           |               |
        | qa   |  123456       |
        | admin     | alicabbar1234 |
        | asdsad*0  | asdasdasdad   |
