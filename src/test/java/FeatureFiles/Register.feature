Feature: Registiration Functionality

  Background:
    Given The user must navigates to the ParaBank website
    When The click the connection such as register button on the home page.

  @Regression  @SmokeTest
  Scenario Outline: Registiration Form
    Then The user must fill out the registration form and use information that is not valid in this form.
      | firstName    |  | <fistname> |
      | lastName     |  | <lastname> |
      | address      |  | <adress>   |
      | city         |  | <city>     |
      | state        |  | <state>    |
      | zipcode      |  | <zipcode>  |
      | phone_Number |  | <phone>    |
      | ssn_code     |  | <ssn_Code> |
      | userName     |  | <usurName> |
      | password     |  | <password> |
      | confirm      |  | <confrim>  |

    And  After completing the registration form, the user must click on a button such as submit or register.
      | registerbutton |
    And  The user must verify a successful registration process and "Your Account Was Created SuccessFully. You are now logged in." should see a message like.
    Examples:
      | fistname | lastname | adress | city     | state    | zipcode | phone      | ssn_Code | usurName    | password    | confrim     |
      | Ahmet    | Mehmet   | Turkey | Istanbul | Bagcilar | 123456  | 0545454545 | 9876     | ahmet_ilkjh | ahmet_ilkjh | ahmet_ilkjh |
      | Ahmet1   | Mehmet1  | Fransa | Paris    | Nice     | 123458  | 0545454545 | 9879     | Ahmet1      | Ahmet1      | Ahmet1      |


