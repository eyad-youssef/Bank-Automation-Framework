Feature Create new account



  Scenario Outline: new account
    Given User login with "<username>" and "<password>"
    And Click on open new account page link
    When choose new account type "<type>"
    And enter new account
    Then click on create new account button

    Examples:
      | username | password   | type    |
      | Tester   | Tester2024 | SAVINGS |

