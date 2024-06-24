Feature Create new account
  Scenario Outline: new account
    Given User login with "<username>" and "<password>"
    And Click on open new account page link
    When choose new account type
    And enter new account amount
    Then click on create new account button

    Examples: