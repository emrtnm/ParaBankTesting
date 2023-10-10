Feature: Login Functionality

  Scenario: Login with success
    Given Navigate to website
    And Enter username and password and click login button
    Then I should login with successfully

    And Click  the buttons UpdateContactInfo
      | clickButton |

    And Clear and user informations UpdateContactlnfo
      | name    |
      | surName |
      | address |
      | city    |
      | state   |
      | zipcod  |
      | phone   |

    And  Write sendkeys user informations UpdateContactlnfo
      | firstname   | zaha          |
      | lastName    | cabbar        |
      | Address     | GS sporkulubu |
      | cty         | Istanbul      |
      | State       | Seyrantepe    |
      | zipcode     | 3452          |
      | phoneNumber | 0000001905    |

    And Click  the buttons UpdateContactInfo
      | updateButton |

    Then  Success message profile updated

    And Click  the buttons UpdateContactInfo
    | logout |

    Given Navigate to website
    And Enter username and password and click login button

    Then I should login with successfully

    Then Success message update verification

    And Click  the buttons UpdateContactInfo
      | logout |

  Scenario:Enter user informations  Negatif
    Given Navigate to website
    And Enter username and password and click login button
    Then I should login with successfully

    And Click  the buttons UpdateContactInfo
      | clickButton |

    And Clear and user informations UpdateContactlnfo
      | name    |
      | city    |
      | zipcod  |
    Then Warning Message required fields

    And Click  the buttons UpdateContactInfo
      | updateButton |

    Then  Empty message profile not updated
